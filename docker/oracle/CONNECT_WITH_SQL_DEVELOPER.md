# SQL Developer로 Oracle Database 접속하기

## ✅ 시작하기 전에

필요한 것들:
- ✓ SQL Developer 설치 완료 ([설치 가이드](./INSTALL_SQL_DEVELOPER.md))
- ✓ Oracle Database 실행 중 ([Docker 가이드](./README.md))

## 📌 접속 정보

다음 정보를 사용하여 접속합니다:

| 항목 | 값 |
|------|------|
| **호스트** | localhost |
| **포트** | 1521 |
| **서비스명** | FREEPDB1 |
| **사용자명** | SYSTEM |
| **비밀번호** | oracle123 |

## 🔧 접속 설정하기

### 1단계: SQL Developer 실행
- **Windows**: 시작 메뉴 → "SQL Developer" 검색
- **Mac**: Launchpad 또는 Applications 폴더

### 2단계: 새 접속 만들기

1. **접속 창 열기**
   - 왼쪽 **Connections** 패널에서 초록색 **+** 버튼 클릭
   - 또는 메뉴: **File → New → Database Connection**

2. **접속 정보 입력**

다음 정보를 입력합니다:

| 항목 | 입력값 | 설명 |
|------|--------|------|
| **Name** | Oracle Local | 접속 이름 (원하는 이름으로 변경 가능) |
| **Username** | SYSTEM | 데이터베이스 사용자명 |
| **Password** | oracle123 | 설정한 비밀번호 |
| **Save Password** | 체크 | 비밀번호 저장 (선택사항) |
| **Connection Type** | Basic | 기본 연결 방식 |
| **Hostname** | localhost | 데이터베이스 서버 주소 |
| **Port** | 1521 | 데이터베이스 포트 |
| **Service name** | 선택 후 FREEPDB1 입력 | SID 대신 Service name 선택 |

### 3단계: 연결 테스트

1. **Test** 버튼 클릭
2. "Status: Success" 메시지 확인
3. 성공하면 **Connect** 버튼 클릭

### 4단계: 연결 확인

연결이 성공하면:
- 왼쪽 Connections 패널에 "Oracle Local" 접속이 추가됨
- SQL Worksheet가 자동으로 열림
- 이제 SQL 명령어를 실행할 수 있습니다

## 🎆 첫 번째 SQL 실행해보기

### 1. 현재 사용자 확인
```sql
-- SQL Worksheet에 입력
SELECT USER FROM DUAL;
```
실행 방법: 
- 명령어 선택 후 **Ctrl+Enter** (Windows) 
- 명령어 선택 후 **Cmd+Enter** (Mac)
- 또는 상단의 실행 버튼(초록색 삼각형) 클릭

### 2. 현재 날짜와 시간 확인
```sql
SELECT SYSDATE FROM DUAL;
```

### 3. 데이터베이스 버전 확인
```sql
SELECT * FROM V$VERSION;
```

## ❓ 문제 해결

### "IO Error: The Network Adapter could not establish the connection" 오류

1. Docker 컨테이너가 실행 중인지 확인:
```bash
docker ps
```

2. Oracle Database가 준비되었는지 확인:
```bash
docker logs oracle-db | grep "DATABASE IS READY TO USE"
```

3. 포트가 올바른지 확인 (기본: 1521)

### "ORA-01017: invalid username/password" 오류

1. 사용자명과 비밀번호를 다시 확인
2. 대소문자 구분 확인 (SYSTEM은 대문자)
3. Docker 실행 시 설정한 비밀번호와 일치하는지 확인

### "ORA-12514: TNS:listener does not currently know of service" 오류

1. Service name을 FREEPDB1로 정확히 입력했는지 확인
2. SID가 아닌 Service name을 선택했는지 확인

## ⌨️ 유용한 단축키

| 기능 | Windows | Mac |
|------|---------|-----|
| SQL 실행 | Ctrl + Enter | Cmd + Enter |
| 스크립트 실행 | F5 | F5 |
| 자동 완성 | Ctrl + Space | Ctrl + Space |
| 주석 처리 | Ctrl + / | Cmd + / |
| 대문자 변환 | Ctrl + Quote | Cmd + Quote |
| 형식 정리 | Ctrl + F7 | Cmd + F7 |

## 🎯 다음 단계

축하합니다! Oracle Database에 성공적으로 접속했습니다.

다음을 해보세요:
- 테이블 생성 및 데이터 입력 연습
- SQL 쿼리 작성 연습
- [IntelliJ Ultimate로 접속하기](./CONNECT_WITH_INTELLIJ.md) (다른 방법)