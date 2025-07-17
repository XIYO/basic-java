# IntelliJ IDEA Ultimate로 Oracle Database 접속하기

## ✅ 시작하기 전에

필요한 것들:
- ✓ IntelliJ IDEA Ultimate 버전 (Community Edition은 지원 안 함)
- ✓ Oracle Database 실행 중 ([Docker 가이드](./README.md))

## 🚀 IntelliJ의 장점

IntelliJ IDEA Ultimate에는 **DataGrip** 기능이 내장되어 있어:
- 별도 프로그램 설치 불필요
- 코드와 데이터베이스를 한 곳에서 관리
- 강력한 자동 완성 기능

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

### 1단계: Database 창 열기

다음 중 하나의 방법으로 Database 창을 엽니다:
- 메뉴: **View → Tool Windows → Database**
- 단축키: 
  - Windows: `Alt + Shift + D` 
  - Mac: `Cmd + Shift + D`
- 화면 우측의 **Database** 탭 클릭

### 2단계: 새 데이터 소스 추가

1. **데이터 소스 추가**
   - Database 창에서 **+** 버튼 클릭
   - **Data Source → Oracle** 선택

2. **접속 정보 입력**

**General** 탭에서 다음 정보를 입력합니다:

| 항목 | 입력값 | 설명 |
|------|--------|------|
| **Name** | Oracle Local | 접속 이름 (원하는 이름으로 변경 가능) |
| **Host** | localhost | 데이터베이스 서버 주소 |
| **Port** | 1521 | 데이터베이스 포트 |
| **Database** | FREEPDB1 | Service name (SID 아님) |
| **User** | SYSTEM | 데이터베이스 사용자명 |
| **Password** | oracle123 | 설정한 비밀번호 |

3. **드라이버 다운로드**

1. 하단에 "Download missing driver files" 링크가 나타나면 클릭
2. 자동으로 Oracle JDBC 드라이버가 다운로드됩니다
3. 다운로드 완료까지 잠시 대기

### 3단계: 연결 테스트

1. **Test Connection** 버튼 클릭
2. "Successful" 메시지 확인
3. **OK** 버튼 클릭하여 저장

### 4단계: 데이터베이스 탐색

연결이 성공하면 Database 창에서:
- Oracle Local 접속이 추가됨
- 펼치면 스키마, 테이블, 뷰 등을 탐색 가능
- 더블클릭으로 콘솔 창 열기 가능

## 📝 SQL 실행하기

### 1. 콘솔 창 열기

다음 중 하나의 방법으로 SQL 콘솔을 엽니다:
- Database 창에서 접속 우클릭 → **Open Query Console**
- 접속 선택 후 `Ctrl+Shift+F10` (Windows) 또는 `Cmd+Shift+F10` (Mac)

### 2. SQL 실행 예제

```sql
-- 현재 사용자 확인
SELECT USER FROM DUAL;

-- 현재 날짜와 시간
SELECT SYSDATE FROM DUAL;

-- 테이블 목록 조회
SELECT table_name FROM user_tables;

-- 데이터베이스 버전 확인
SELECT * FROM V$VERSION;
```

### 3. 실행 방법
- 전체 실행: `Ctrl+Enter` (Windows) / `Cmd+Enter` (Mac)
- 선택 영역 실행: 텍스트 선택 후 같은 단축키
- 실행 버튼: 에디터 상단의 초록색 화살표 클릭

## ✨ IntelliJ Database 도구의 장점

### 1. 자동 완성 기능
- 테이블명, 컬럼명 자동 완성
- SQL 구문 자동 완성
- `Ctrl+Space`로 수동 호출 가능

### 2. 테이블 편집기
- GUI로 테이블 데이터 직접 편집
- 테이블 더블클릭으로 데이터 조회
- 셀 더블클릭으로 값 편집

### 3. 다이어그램 기능
- 테이블 관계도 자동 생성
- Database 창에서 스키마 우클릭 → **Diagrams → Show Visualization**

### 4. 데이터 내보내기/가져오기
- 테이블 우클릭 → **Import/Export Data**
- CSV, JSON, XML 등 다양한 형식 지원

## ⌨️ 유용한 단축키

| 기능 | Windows | Mac |
|------|---------|-----|
| SQL 실행 | Ctrl + Enter | Cmd + Enter |
| 자동 완성 | Ctrl + Space | Cmd + Space |
| 콘솔 열기 | Ctrl + Shift + F10 | Cmd + Shift + F10 |
| 주석 처리 | Ctrl + / | Cmd + / |
| 코드 포맷팅 | Ctrl + Alt + L | Cmd + Alt + L |
| 테이블 데이터 새로고침 | Ctrl + F5 | Cmd + F5 |

## ❓ 문제 해결

### "Connection refused" 오류

1. Docker 컨테이너 실행 확인:
```bash
docker ps | grep oracle
```

2. 포트 매핑 확인:
```bash
docker port oracle-db
```

### "Missing Driver" 오류

1. **Download missing driver files** 링크 클릭
2. 인터넷 연결 확인
3. IntelliJ 재시작 후 재시도

### 한글 깨짐 문제

1. Data Source 설정에서 **Advanced** 탭 클릭
2. **VM options**에 다음 추가:
```
-Dfile.encoding=UTF-8
-Duser.language=ko
-Duser.country=KR
```

## 🚀 추가 기능

### 1. SQL 파일로 작업하기
- 프로젝트에 `.sql` 파일 생성
- 파일 상단에서 데이터 소스 선택
- SQL 작성 및 실행

### 2. 데이터베이스 객체 생성
- Database 창에서 스키마 우클릭
- **New → Table/View/Procedure** 등 선택
- GUI로 편리하게 생성

### 3. 실행 계획 확인
- SQL 작성 후 **Explain Plan** 버튼 클릭
- 쿼리 성능 분석 가능

## 🎯 다음 단계

축하합니다! IntelliJ로 Oracle Database에 성공적으로 접속했습니다.

다음을 해보세요:
- Java 프로젝트와 데이터베이스 연동
- JPA/Hibernate 설정
- Spring Boot와 데이터베이스 연동