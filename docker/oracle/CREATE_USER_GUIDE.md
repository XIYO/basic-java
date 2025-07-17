# Oracle 사용자 생성 및 접속 가이드

## 🚨 SYSTEM 계정으로 작업하면 안 되는 이유

### SYSTEM 계정의 문제점:
1. **관리자 권한**: 시스템 중요 테이블들과 섞임
2. **보안 위험**: 모든 권한을 가진 계정으로 일반 작업 수행
3. **실무와 차이**: 실제 개발에서는 절대 사용하지 않음
4. **테이블 관리 어려움**: 시스템 테이블과 내 테이블이 섞여서 관리 복잡

## 🎯 올바른 방법: 개발용 사용자 생성

### 1단계: SYSTEM 계정으로 접속하여 새 사용자 생성

```sql
-- 1. 개발용 사용자 생성
CREATE USER student IDENTIFIED BY student123;

-- 2. 기본 접속 권한 부여
GRANT CONNECT TO student;

-- 3. 리소스 사용 권한 부여 (테이블, 인덱스 등 생성 가능)
GRANT RESOURCE TO student;

-- 4. 테이블스페이스 사용 권한 부여
GRANT UNLIMITED TABLESPACE TO student;

-- 5. 추가 유용한 권한들
GRANT CREATE VIEW TO student;
GRANT CREATE SEQUENCE TO student;
GRANT CREATE PROCEDURE TO student;

-- 6. 사용자 생성 확인
SELECT username FROM all_users WHERE username = 'STUDENT';
```

### 2단계: 새 사용자로 접속 설정

#### SQL Developer에서 새 접속 만들기:
| 항목 | 값 |
|------|-----|
| **Name** | Student Local |
| **Username** | student |
| **Password** | student123 |
| **Hostname** | localhost |
| **Port** | 1521 |
| **Service name** | FREEPDB1 |

#### IntelliJ에서 새 접속 만들기:
1. Database 창에서 **+** → **Data Source** → **Oracle**
2. 접속 정보 입력:
   - **Name**: Student Local
   - **User**: student
   - **Password**: student123
   - **Host**: localhost
   - **Port**: 1521
   - **Database**: FREEPDB1

### 3단계: 새 사용자로 접속 후 테이블 생성

```sql
-- 현재 사용자 확인 (STUDENT가 나와야 함)
SELECT USER FROM DUAL;

-- 이제 안전하게 테이블 생성
CREATE TABLE students (
    student_id NUMBER(10) PRIMARY KEY,
    name VARCHAR2(50) NOT NULL,
    email VARCHAR2(100) UNIQUE,
    age NUMBER(3),
    major VARCHAR2(50),
    enrollment_date DATE DEFAULT SYSDATE
);

-- 테이블 생성 확인
SELECT table_name FROM user_tables;
```

## 🔧 추가 사용자 생성 (팀 작업용)

```sql
-- SYSTEM 계정에서 실행

-- 개발팀용 사용자들 생성
CREATE USER dev1 IDENTIFIED BY dev123;
CREATE USER dev2 IDENTIFIED BY dev123;
CREATE USER tester IDENTIFIED BY test123;

-- 모든 개발 사용자에게 기본 권한 부여
GRANT CONNECT, RESOURCE, UNLIMITED TABLESPACE TO dev1, dev2, tester;

-- 개발 사용자들끼리 테이블 공유 권한
GRANT SELECT, INSERT, UPDATE, DELETE ON student.students TO dev1, dev2, tester;
```

## 🎯 권한 관리

### 기본 권한 확인:
```sql
-- 내가 가진 권한 확인
SELECT * FROM user_role_privs;
SELECT * FROM user_sys_privs;

-- 내가 접근할 수 있는 테이블 확인
SELECT * FROM user_tables;
```

### 다른 사용자 테이블에 접근:
```sql
-- student 사용자의 테이블을 다른 사용자가 보려면
-- SYSTEM 계정에서 권한 부여 필요
GRANT SELECT ON student.students TO dev1;

-- 이후 dev1 사용자는 다음과 같이 접근
SELECT * FROM student.students;
```

## 📁 스키마 구조 이해

### Oracle의 스키마 = 사용자 개념:
```
FREEPDB1 (데이터베이스)
├── SYSTEM (스키마/사용자)
│   ├── 시스템 테이블들
│   └── (여기에 일반 테이블 만들면 안됨!)
├── STUDENT (스키마/사용자)  ← 우리가 사용할 곳
│   ├── STUDENTS 테이블
│   ├── SUBJECTS 테이블
│   └── GRADES 테이블
├── DEV1 (스키마/사용자)
└── DEV2 (스키마/사용자)
```

## 🛠️ 사용자 관리 명령어

### 사용자 정보 조회:
```sql
-- SYSTEM 계정에서 실행

-- 모든 사용자 목록
SELECT username, created FROM all_users ORDER BY username;

-- 특정 사용자의 권한 확인
SELECT * FROM dba_role_privs WHERE grantee = 'STUDENT';
SELECT * FROM dba_sys_privs WHERE grantee = 'STUDENT';
```

### 사용자 삭제 (필요시):
```sql
-- SYSTEM 계정에서 실행
-- 주의: 사용자의 모든 테이블과 데이터가 함께 삭제됨!

DROP USER student CASCADE;
```

## 💡 실무 베스트 프랙티스

### 1. 환경별 사용자 구분:
```sql
-- 개발 환경
CREATE USER app_dev IDENTIFIED BY dev123;

-- 테스트 환경  
CREATE USER app_test IDENTIFIED BY test123;

-- 운영 환경
CREATE USER app_prod IDENTIFIED BY 복잡한비밀번호;
```

### 2. 역할(Role) 기반 권한 관리:
```sql
-- 개발자 역할 생성
CREATE ROLE developer;
GRANT CONNECT, RESOURCE TO developer;
GRANT CREATE VIEW, CREATE PROCEDURE TO developer;

-- 사용자에게 역할 부여
GRANT developer TO student, dev1, dev2;
```

### 3. 테이블스페이스 할당량 제한:
```sql
-- 무제한 대신 적절한 크기 제한
ALTER USER student QUOTA 100M ON USERS;
```

## 🎯 다음 단계

1. **SYSTEM 계정으로 student 사용자 생성**
2. **student 계정으로 새 접속 설정**  
3. **student 계정에서 모든 SQL 예제 실행**
4. **깔끔한 스키마 관리 경험하기**

이제 실무와 같은 방식으로 Oracle Database를 사용할 수 있습니다!