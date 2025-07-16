# Oracle Database Docker 실행 가이드

## Oracle Database 공식 이미지 정보

Oracle은 Docker Hub에 공식 이미지를 제공하지 않습니다. 대신 다음 방법을 사용합니다:

1. **Oracle Container Registry** (공식)
2. **GitHub에서 빌드**
3. **Oracle Database Free** (23ai, 무료 버전) - 추천

## Oracle Database Free 23ai 설치 및 실행

### 1. 이미지 다운로드

```bash
# Oracle Container Registry에서 직접 Pull (로그인 없이 가능)
docker pull container-registry.oracle.com/database/free:latest
```

### 2. 컨테이너 실행

```bash
# 기본 실행 (패스워드 설정)
docker run -d \
  --name oracle-db \
  -p 1521:1521 \
  -p 5500:5500 \
  -e ORACLE_PWD=oracle123 \
  container-registry.oracle.com/database/free:latest

# 데이터 영구 저장을 위한 볼륨 마운트
docker run -d \
  --name oracle-db-volume \
  -p 1521:1521 \
  -p 5500:5500 \
  -e ORACLE_PWD=oracle123 \
  -v oracle-data:/opt/oracle/oradata \
  container-registry.oracle.com/database/free:latest
```

### 3. 데이터베이스 접속 정보

- **호스트**: localhost
- **포트**: 1521
- **SID**: FREE
- **Service Name**: FREEPDB1 (Pluggable Database)
- **사용자**: 
  - SYSTEM / oracle123
  - SYS / oracle123 (as SYSDBA)
- **EM Express URL**: https://localhost:5500/em

### 4. DataGrip 접속 설정

1. New Data Source → Oracle 선택
2. 접속 정보 입력:
   - Host: localhost
   - Port: 1521
   - Service name: FREEPDB1
   - User: SYSTEM
   - Password: oracle123
3. Test Connection으로 연결 확인

### 5. SQL*Plus로 접속

```bash
# 컨테이너 내부에서 SQL*Plus 실행
docker exec -it oracle-db sqlplus system/oracle123@FREEPDB1

# 또는 SYS 권한으로 접속
docker exec -it oracle-db sqlplus sys/oracle123@FREEPDB1 as sysdba
```

### 6. 유용한 명령어

```bash
# 로그 확인
docker logs oracle-db

# 데이터베이스 상태 확인
docker exec oracle-db lsnrctl status

# 컨테이너 중지/시작
docker stop oracle-db
docker start oracle-db

# 패스워드 변경
docker exec oracle-db ./setPassword.sh <new_password>
```

### 7. 환경 변수 옵션

```bash
docker run -d \
  --name oracle-custom \
  -p 1521:1521 \
  -e ORACLE_PWD=mypassword \
  -e ORACLE_CHARACTERSET=AL32UTF8 \
  -e ENABLE_ARCHIVELOG=true \
  container-registry.oracle.com/database/free:latest
```

### 8. 초기 설정 대기

첫 실행 시 데이터베이스 초기화에 몇 분이 소요됩니다:

```bash
# 실시간 로그 확인
docker logs -f oracle-db

# 다음 메시지가 나타나면 접속 가능:
# DATABASE IS READY TO USE!
```

### 9. 컨테이너 관리

```bash
# 컨테이너 목록 확인
docker ps -a | grep oracle

# 컨테이너 삭제 (데이터도 삭제됨)
docker rm -f oracle-db

# 볼륨 확인
docker volume ls

# 볼륨 삭제 (데이터 영구 삭제)
docker volume rm oracle-data
```

### 10. 문제 해결

```bash
# 컨테이너가 시작되지 않을 때
docker logs oracle-db

# 포트가 이미 사용 중일 때
docker run -d --name oracle-db -p 1522:1521 -p 5501:5500 ...

# 메모리 부족 시 (최소 2GB 필요)
docker run -d --name oracle-db --memory="3g" ...

# Apple Silicon (M1/M2) Mac에서 실행 시
docker run -d --platform linux/amd64 --name oracle-db ...
```

## Oracle Database Express Edition (XE) 대안

더 가벼운 버전이 필요한 경우:

```bash
# Oracle XE 21c (커뮤니티 이미지)
docker pull gvenzl/oracle-xe:21-slim

# 실행
docker run -d \
  --name oracle-xe \
  -p 1521:1521 \
  -e ORACLE_PASSWORD=oracle123 \
  gvenzl/oracle-xe:21-slim
```

XE 접속 정보:
- Service Name: XEPDB1
- 사용자: SYSTEM / oracle123

## 주의사항

- Oracle Database Free는 CPU 2개, 메모리 2GB 제한이 있습니다
- 상용 환경에서는 적절한 라이센스가 필요합니다
- 컨테이너 재시작 시 데이터 유지를 위해 볼륨 마운트를 권장합니다