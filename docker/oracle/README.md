# Oracle Linux Docker 실행 가이드

## 1. Docker 이미지 정보
- **이미지**: oraclelinux:8.10
- **버전**: Oracle Linux 8.10
- **공식 저장소**: https://hub.docker.com/_/oraclelinux (Oracle 공식 이미지)

## 2. Docker 이미지 다운로드

### 이미지 다운로드 (Pull)
```bash
# 특정 버전 다운로드
docker pull oraclelinux:8.10

# 최신 버전 다운로드
docker pull oraclelinux:latest

# 다른 버전들 (예시)
docker pull oraclelinux:9
docker pull oraclelinux:8-slim
docker pull oraclelinux:7-slim
```

### 다운로드된 이미지 확인
```bash
# 로컬에 있는 모든 이미지 목록
docker images

# Oracle Linux 이미지만 필터링
docker images | grep oraclelinux
```

### 이미지 상세 정보 확인
```bash
docker inspect oraclelinux:8.10
```

### 이미지 삭제
```bash
docker rmi oraclelinux:8.10
```

## 3. 컨테이너 실행 방법

### 기본 실행 (일회성)
```bash
docker run -it -p 1521:1521 --name oracle-linux oraclelinux:8.10 /bin/bash
```

### 패스워드를 설정하여 실행
```bash
# 컨테이너 실행과 동시에 root 패스워드 설정
docker run -d -p 2222:22 --name oracle-linux-pwd oraclelinux:8.10 /bin/bash -c "echo 'root:oracle123' | chpasswd && tail -f /dev/null"

# 또는 환경변수를 사용한 방법
docker run -d -p 2222:22 --name oracle-linux-env -e ROOT_PASSWORD=oracle123 oraclelinux:8.10 /bin/bash -c 'echo "root:$ROOT_PASSWORD" | chpasswd && tail -f /dev/null'
```

### 백그라운드 실행 (지속적)
```bash
docker run -d --name oracle-linux-bg oraclelinux:8.10 tail -f /dev/null
```

### 실행 중인 컨테이너 접속
```bash
docker exec -it oracle-linux-bg /bin/bash
```

## 4. 접속 정보

### 기본 사용자
- **사용자**: root (기본)
- **패스워드**: 없음 (Docker 컨테이너는 기본적으로 root로 접속)

### 새 사용자 생성 (옵션)
```bash
# 컨테이너 내부에서 실행
useradd -m -s /bin/bash oracle
passwd oracle  # 패스워드 설정
```

## 5. 유용한 Docker 명령어

### 컨테이너 목록 확인
```bash
docker ps        # 실행 중인 컨테이너
docker ps -a     # 모든 컨테이너
```

### 컨테이너 시작/중지
```bash
docker start oracle-linux-bg
docker stop oracle-linux-bg
```

### 컨테이너 삭제
```bash
docker rm oracle-linux-bg
```

### 로그 확인
```bash
docker logs oracle-linux-bg
```

## 6. 볼륨 마운트 (데이터 공유)

로컬 디렉토리와 컨테이너 간 파일 공유:
```bash
docker run -d --name oracle-linux-volume \
  -v $(pwd)/shared:/mnt/shared \
  oraclelinux:8.10 tail -f /dev/null
```

## 7. 네트워크 포트 설정

특정 포트를 열어야 하는 경우:
```bash
docker run -d --name oracle-linux-net \
  -p 8080:80 \
  -p 2222:22 \
  oraclelinux:8.10 tail -f /dev/null
```

## 8. SSH 설정 (선택사항)

컨테이너에 SSH로 접속하려면:
```bash
# 컨테이너 내부에서
yum install -y openssh-server
ssh-keygen -A
echo 'PermitRootLogin yes' >> /etc/ssh/sshd_config
/usr/sbin/sshd
```

## 9. 주의사항

- Oracle Linux 컨테이너는 최소 설치 버전으로 많은 패키지가 포함되어 있지 않습니다
- 필요한 패키지는 `yum install` 명령으로 설치해야 합니다
- 컨테이너를 중지하면 설치한 내용이 사라집니다 (영구 저장을 위해서는 Docker 이미지 커밋 필요)

## 10. 이미지 커밋 (변경사항 저장)

```bash
docker commit oracle-linux-bg my-oracle-linux:custom
```

---

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
# 기본 실행 (패스워드 자동 생성)
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

### 8. 주의사항

- 첫 실행 시 데이터베이스 초기화에 몇 분이 소요됩니다
- `docker logs oracle-db`로 진행 상황을 확인할 수 있습니다
- "DATABASE IS READY TO USE!" 메시지가 나타나면 접속 가능합니다
- Oracle Database Free는 CPU 2개, 메모리 2GB 제한이 있습니다

### 9. 문제 해결

```bash
# 컨테이너가 시작되지 않을 때
docker logs oracle-db

# 포트가 이미 사용 중일 때
docker run -d --name oracle-db -p 1522:1521 -p 5501:5500 ...

# 메모리 부족 시 (최소 2GB 필요)
docker run -d --name oracle-db --memory="3g" ...
```