# 테이블이 어디에 만들어졌는지 확인하기

## 🔍 테이블 생성 확인 방법

### 1. 내가 만든 테이블 목록 보기
```sql
-- 현재 사용자(SYSTEM)가 소유한 모든 테이블 조회
SELECT table_name FROM user_tables;
```

### 2. 테이블이 있는지 직접 확인
```sql
-- STUDENTS 테이블이 있는지 확인
SELECT table_name FROM user_tables WHERE table_name = 'STUDENTS';
```

### 3. 테이블 구조 확인
```sql
-- STUDENTS 테이블의 컬럼 정보 보기
DESCRIBE students;

-- 또는
DESC students;
```

### 4. 테이블에 데이터가 있는지 확인
```sql
-- 테이블의 데이터 개수 확인
SELECT COUNT(*) FROM students;

-- 테이블 내용 보기 (데이터가 있다면)
SELECT * FROM students;
```

## 🗂️ IntelliJ/DataGrip에서 확인하는 방법

### 방법 1: Database 창에서 확인
1. **Database** 창 열기 (우측 또는 View → Tool Windows → Database)
2. 접속된 Oracle 데이터소스 펼치기
3. **Oracle Local** → **FREEPDB1** → **Schemas** 펼치기
4. **SYSTEM** 스키마 펼치기
5. **Tables** 폴더에서 `STUDENTS` 테이블 확인

### 방법 2: 새로고침 하기
- Database 창에서 **새로고침** 버튼 클릭 (Ctrl+F5)
- 또는 접속 우클릭 → **Refresh**

## 🎯 자주 발생하는 문제와 해결

### 문제 1: 테이블이 안 보여요!
**해결책**:
```sql
-- 1. 정말 만들어졌는지 확인
SELECT table_name FROM user_tables WHERE table_name = 'STUDENTS';

-- 2. 대소문자 확인 (Oracle은 대문자로 저장)
SELECT table_name FROM user_tables WHERE table_name LIKE '%STUDENT%';

-- 3. 모든 테이블 목록 보기
SELECT table_name FROM user_tables ORDER BY table_name;
```

### 문제 2: IntelliJ에서 안 보여요!
**해결책**:
1. Database 창에서 **새로고침** (Ctrl+F5)
2. SYSTEM 스키마가 펼쳐져 있는지 확인
3. Tables 폴더 확인

### 문제 3: 테이블 생성이 실패했어요!
**해결책**:
```sql
-- 오류 메시지 확인하고 다시 생성
DROP TABLE students; -- 이미 있다면 삭제 후
CREATE TABLE students (
    student_id NUMBER(10) PRIMARY KEY,
    name VARCHAR2(50) NOT NULL,
    email VARCHAR2(100) UNIQUE,
    age NUMBER(3),
    major VARCHAR2(50),
    enrollment_date DATE DEFAULT SYSDATE
);
```

## 📍 테이블이 저장되는 위치

### Oracle Database에서의 위치
- **스키마**: SYSTEM
- **데이터베이스**: FREEPDB1 (Pluggable Database)
- **테이블스페이스**: SYSTEM 또는 USERS

### 물리적 저장 위치 (참고용)
Docker 컨테이너 내부의 `/opt/oracle/oradata` 디렉토리에 데이터 파일로 저장됩니다.

## 🔧 유용한 확인 명령어

```sql
-- 현재 접속한 사용자 확인
SELECT USER FROM DUAL;

-- 현재 데이터베이스 확인
SELECT NAME FROM V$DATABASE;

-- 테이블 상세 정보
SELECT table_name, tablespace_name, status 
FROM user_tables 
WHERE table_name = 'STUDENTS';

-- 테이블의 컬럼 정보
SELECT column_name, data_type, nullable, data_default 
FROM user_tab_columns 
WHERE table_name = 'STUDENTS'
ORDER BY column_id;
```

## 💡 팁

1. **Oracle은 대소문자를 구분하지 않지만**, 내부적으로는 **대문자로 저장**합니다
2. **IntelliJ에서 새로고침**을 자주 해주세요
3. **SQL 실행 후 결과를 확인**하는 습관을 기르세요
4. **COMMIT**을 잊지 마세요 (테이블 생성은 자동 커밋되지만 데이터 변경은 수동 커밋 필요)