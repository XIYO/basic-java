# Oracle Database 초보자 가이드

이 가이드는 Oracle Database를 처음 사용하는 분들을 위한 단계별 안내서입니다.

## 📚 학습 경로

1. **Oracle Database 설치** (이 문서)
   - Docker를 이용한 간편한 설치
   - 복잡한 설정 없이 바로 시작

2. **데이터베이스 접속 도구 설치**
   - [SQL Developer 설치](./INSTALL_SQL_DEVELOPER.md) - Oracle 공식 도구
   - 또는 IntelliJ IDEA Ultimate 사용 (이미 있다면)

3. **데이터베이스 접속하기**
   - [SQL Developer로 접속](./CONNECT_WITH_SQL_DEVELOPER.md)
   - [IntelliJ Ultimate로 접속](./CONNECT_WITH_INTELLIJ.md)

4. **SQL 기초 학습하기**
   - [기본 SQL 예제 모음](./SQL_BASIC_EXAMPLES.md) - 테이블 생성, 조회, 수정, 삭제

## 🚀 Oracle Database 설치하기

Docker를 사용하면 복잡한 설치 과정 없이 Oracle Database를 쉽게 시작할 수 있습니다.

### 1단계: Docker 설치 확인

먼저 Docker가 설치되어 있는지 확인합니다:

```bash
docker --version
```

Docker가 없다면 [Docker Desktop](https://www.docker.com/products/docker-desktop/) 설치가 필요합니다.

### 2단계: Oracle Database 이미지 다운로드

터미널(Terminal) 또는 명령 프롬프트(CMD)를 열고 다음 명령어를 실행합니다:

```bash
docker pull container-registry.oracle.com/database/free:latest
```

> 💡 **참고**: 다운로드에 5-10분 정도 소요됩니다.

### 3단계: Oracle Database 실행

다음 명령어로 Oracle Database를 시작합니다:

```bash
docker run -d \
  --name oracle-db \
  -p 1521:1521 \
  -p 5500:5500 \
  -e ORACLE_PWD=oracle123 \
  -v oracle-data:/opt/oracle/oradata \
  container-registry.oracle.com/database/free:latest
```

> 📝 **명령어 설명**:
> - `--name oracle-db`: 컨테이너 이름을 'oracle-db'로 지정
> - `-p 1521:1521`: 데이터베이스 접속 포트
> - `-e ORACLE_PWD=oracle123`: 관리자 비밀번호 설정
> - `-v oracle-data:/opt/oracle/oradata`: 데이터 영구 저장

### 4단계: 설치 완료 확인

데이터베이스가 준비되었는지 확인합니다:

```bash
docker logs oracle-db | grep "DATABASE IS READY TO USE"
```

위 메시지가 보이면 설치가 완료된 것입니다! (첫 실행 시 5-10분 소요)

## 📋 접속 정보

데이터베이스에 접속할 때 필요한 정보입니다:

| 항목 | 값 | 설명 |
|------|-----|------|
| **호스트** | localhost | 접속 주소 |
| **포트** | 1521 | 접속 포트 |
| **서비스명** | FREEPDB1 | 데이터베이스 이름 |
| **사용자명** | SYSTEM | 관리자 계정 |
| **비밀번호** | oracle123 | 위에서 설정한 비밀번호 |

## 🔧 다음 단계

이제 Oracle Database가 설치되었습니다! 다음 단계로 진행하세요:

1. **접속 도구 설치하기**
   - [SQL Developer 설치 가이드](./INSTALL_SQL_DEVELOPER.md) - 추천!
   - IntelliJ IDEA Ultimate가 있다면 별도 설치 불필요

2. **데이터베이스에 접속하기**
   - [SQL Developer로 접속하기](./CONNECT_WITH_SQL_DEVELOPER.md)
   - [IntelliJ Ultimate로 접속하기](./CONNECT_WITH_INTELLIJ.md)

3. **개발용 사용자 생성하기** ⭐ 중요!
   - [사용자 생성 가이드](./CREATE_USER_GUIDE.md) - SYSTEM 계정 사용 문제점 및 해결

4. **SQL 기초 학습하기**
   - [기본 SQL 예제 모음](./SQL_BASIC_EXAMPLES.md) - 개발용 사용자로 안전하게 학습

## 🛠️ 유용한 Docker 명령어

### 기본 관리 명령어

```bash
# 실행 중인 컨테이너 확인
docker ps

# 컨테이너 중지
docker stop oracle-db

# 컨테이너 시작
docker start oracle-db

# 로그 확인
docker logs oracle-db
```

### SQL*Plus로 직접 접속 (고급)

```bash
# 컨테이너 내부에서 SQL*Plus 실행
docker exec -it oracle-db sqlplus system/oracle123@FREEPDB1
```

## ❓ 자주 묻는 질문

### Q: 설치가 오래 걸려요
**A**: 첫 실행 시 데이터베이스 초기화에 5-10분이 필요합니다. `docker logs -f oracle-db`로 진행 상황을 확인할 수 있습니다.

### Q: 컴퓨터를 재시작했더니 데이터가 사라졌어요
**A**: 위 명령어에 `-v oracle-data:/opt/oracle/oradata`가 포함되어 있다면 데이터는 보존됩니다. `docker start oracle-db`로 다시 시작하세요.

### Q: 포트가 이미 사용 중이라고 나와요
**A**: 다른 포트를 사용하세요:
```bash
docker run -d \
  --name oracle-db \
  -p 1522:1521 \
  -p 5501:5500 \
  -e ORACLE_PWD=oracle123 \
  -v oracle-data:/opt/oracle/oradata \
  container-registry.oracle.com/database/free:latest
```
그리고 접속할 때 포트를 1522로 변경하세요.

### Q: Mac M1/M2에서 실행이 안돼요
**A**: Oracle Database Free 23.6 이상은 Apple Silicon을 지원합니다. 최신 버전을 사용하세요.

## 📚 추가 학습 자료

- [Oracle SQL 기초 학습](https://www.oracle.com/database/technologies/appdev/sql.html)
- [Oracle Live SQL](https://livesql.oracle.com/) - 브라우저에서 SQL 연습
- [Oracle Database 공식 문서](https://docs.oracle.com/en/database/)

## ⚠️ 주의사항

- 이 설치 방법은 학습 및 개발 목적입니다
- 실제 서비스에는 적절한 라이센스가 필요합니다
- Oracle Database Free는 리소스 제한이 있습니다 (CPU 2개, 메모리 2GB)