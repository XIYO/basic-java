# Oracle Database 완전 설정 쿼리

## 🎯 단계별 실행 가이드

### 1단계: SYSTEM 계정으로 접속하여 새 사용자 생성

**SYSTEM 계정 접속 정보**:
- 사용자명: `SYSTEM`
- 비밀번호: `oracle123`
- 서비스명: `FREEPDB1`

**실행할 SQL**:
```sql
-- 1. 현재 접속 확인
SELECT USER FROM DUAL;
SELECT NAME FROM V$DATABASE;

-- 2. 새 사용자 생성
CREATE USER student IDENTIFIED BY student123;

-- 3. 기본 권한 부여
GRANT CONNECT TO student;
GRANT RESOURCE TO student;
GRANT CREATE SESSION TO student;
GRANT CREATE TABLE TO student;
GRANT CREATE VIEW TO student;
GRANT CREATE SEQUENCE TO student;
GRANT CREATE PROCEDURE TO student;
GRANT CREATE TRIGGER TO student;
GRANT UNLIMITED TABLESPACE TO student;

-- 4. 사용자 생성 확인
SELECT username, created FROM all_users WHERE username = 'STUDENT';

-- 5. 부여된 권한 확인
SELECT * FROM dba_role_privs WHERE grantee = 'STUDENT';
SELECT * FROM dba_sys_privs WHERE grantee = 'STUDENT';
```

### 2단계: student 계정으로 접속 설정

**새 접속 정보**:
| 항목 | 값 |
|------|-----|
| **Name** | Student Local |
| **Username** | student |
| **Password** | student123 |
| **Hostname** | localhost |
| **Port** | 1521 |
| **Service name** | FREEPDB1 |

### 3단계: student 계정으로 접속 후 실행

**접속 확인 쿼리**:
```sql
-- 1. 현재 사용자 확인 (STUDENT가 나와야 함)
SELECT USER FROM DUAL;

-- 2. 현재 스키마 확인
SELECT SYS_CONTEXT('USERENV', 'CURRENT_SCHEMA') FROM DUAL;

-- 3. 내 테이블 목록 (처음에는 비어있음)
SELECT table_name FROM user_tables;

-- 4. 내가 가진 권한 확인
SELECT * FROM user_role_privs;
SELECT * FROM user_sys_privs WHERE privilege LIKE '%CREATE%';
```

### 4단계: 테이블 생성 및 데이터 입력

```sql
-- 1. 학생 테이블 생성
CREATE TABLE students (
    student_id NUMBER(10) PRIMARY KEY,
    name VARCHAR2(50) NOT NULL,
    email VARCHAR2(100) UNIQUE,
    age NUMBER(3) CHECK (age >= 0 AND age <= 150),
    major VARCHAR2(50),
    enrollment_date DATE DEFAULT SYSDATE,
    gpa NUMBER(3,2) CHECK (gpa >= 0.0 AND gpa <= 4.0)
);

-- 2. 과목 테이블 생성
CREATE TABLE subjects (
    subject_id NUMBER(10) PRIMARY KEY,
    subject_name VARCHAR2(100) NOT NULL,
    credits NUMBER(2) CHECK (credits > 0),
    professor VARCHAR2(50),
    department VARCHAR2(50)
);

-- 3. 성적 테이블 생성
CREATE TABLE grades (
    grade_id NUMBER(10) PRIMARY KEY,
    student_id NUMBER(10) NOT NULL,
    subject_id NUMBER(10) NOT NULL,
    score NUMBER(3) CHECK (score >= 0 AND score <= 100),
    letter_grade CHAR(2),
    semester VARCHAR2(20),
    grade_date DATE DEFAULT SYSDATE,
    FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE,
    FOREIGN KEY (subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE
);

-- 4. 시퀀스 생성 (자동 ID 생성용)
CREATE SEQUENCE student_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE subject_seq START WITH 100 INCREMENT BY 1;
CREATE SEQUENCE grade_seq START WITH 1000 INCREMENT BY 1;

-- 5. 테이블 생성 확인
SELECT table_name, created FROM user_tables ORDER BY created;

-- 6. 테이블 구조 확인
DESCRIBE students;
DESCRIBE subjects;
DESCRIBE grades;
```

### 5단계: 샘플 데이터 입력

```sql
-- 1. 학생 데이터 입력
INSERT INTO students (student_id, name, email, age, major, gpa) VALUES 
(student_seq.NEXTVAL, '김철수', 'kim.cs@university.edu', 20, '컴퓨터공학', 3.75);

INSERT INTO students (student_id, name, email, age, major, gpa) VALUES 
(student_seq.NEXTVAL, '이영희', 'lee.yh@university.edu', 22, '경영학', 3.92);

INSERT INTO students (student_id, name, email, age, major, gpa) VALUES 
(student_seq.NEXTVAL, '박민수', 'park.ms@university.edu', 21, '수학', 3.45);

INSERT INTO students (student_id, name, email, age, major, gpa) VALUES 
(student_seq.NEXTVAL, '정수진', 'jung.sj@university.edu', 19, '영문학', 3.88);

INSERT INTO students (student_id, name, email, age, major, gpa) VALUES 
(student_seq.NEXTVAL, '최영호', 'choi.yh@university.edu', 23, '물리학', 3.23);

-- 2. 과목 데이터 입력
INSERT INTO subjects (subject_id, subject_name, credits, professor, department) VALUES 
(subject_seq.NEXTVAL, '데이터베이스', 3, '김교수', '컴퓨터공학');

INSERT INTO subjects (subject_id, subject_name, credits, professor, department) VALUES 
(subject_seq.NEXTVAL, '자바프로그래밍', 3, '이교수', '컴퓨터공학');

INSERT INTO subjects (subject_id, subject_name, credits, professor, department) VALUES 
(subject_seq.NEXTVAL, '웹개발', 2, '박교수', '컴퓨터공학');

INSERT INTO subjects (subject_id, subject_name, credits, professor, department) VALUES 
(subject_seq.NEXTVAL, '경영학원론', 3, '정교수', '경영학');

INSERT INTO subjects (subject_id, subject_name, credits, professor, department) VALUES 
(subject_seq.NEXTVAL, '미적분학', 3, '최교수', '수학');

-- 3. 성적 데이터 입력
INSERT INTO grades (grade_id, student_id, subject_id, score, letter_grade, semester) VALUES 
(grade_seq.NEXTVAL, 1, 100, 85, 'B+', '2024-1');

INSERT INTO grades (grade_id, student_id, subject_id, score, letter_grade, semester) VALUES 
(grade_seq.NEXTVAL, 1, 101, 92, 'A-', '2024-1');

INSERT INTO grades (grade_id, student_id, subject_id, score, letter_grade, semester) VALUES 
(grade_seq.NEXTVAL, 2, 100, 78, 'C+', '2024-1');

INSERT INTO grades (grade_id, student_id, subject_id, score, letter_grade, semester) VALUES 
(grade_seq.NEXTVAL, 2, 103, 95, 'A', '2024-1');

INSERT INTO grades (grade_id, student_id, subject_id, score, letter_grade, semester) VALUES 
(grade_seq.NEXTVAL, 3, 104, 88, 'B+', '2024-1');

-- 4. 변경사항 저장
COMMIT;

-- 5. 데이터 입력 확인
SELECT COUNT(*) as student_count FROM students;
SELECT COUNT(*) as subject_count FROM subjects;
SELECT COUNT(*) as grade_count FROM grades;
```

### 6단계: 데이터 조회 및 확인

```sql
-- 1. 모든 학생 정보 조회
SELECT * FROM students ORDER BY student_id;

-- 2. 모든 과목 정보 조회
SELECT * FROM subjects ORDER BY subject_id;

-- 3. 모든 성적 정보 조회
SELECT * FROM grades ORDER BY grade_id;

-- 4. 학생별 성적 조회 (JOIN 사용)
SELECT 
    s.name as student_name,
    s.major,
    sub.subject_name,
    g.score,
    g.letter_grade,
    g.semester
FROM students s
JOIN grades g ON s.student_id = g.student_id
JOIN subjects sub ON g.subject_id = sub.subject_id
ORDER BY s.name, sub.subject_name;

-- 5. 전공별 평균 GPA
SELECT 
    major,
    AVG(gpa) as average_gpa,
    COUNT(*) as student_count
FROM students
GROUP BY major
ORDER BY average_gpa DESC;

-- 6. 과목별 평균 점수
SELECT 
    sub.subject_name,
    sub.professor,
    AVG(g.score) as average_score,
    COUNT(g.grade_id) as student_count
FROM subjects sub
LEFT JOIN grades g ON sub.subject_id = g.subject_id
GROUP BY sub.subject_id, sub.subject_name, sub.professor
ORDER BY average_score DESC;

-- 7. 학생별 총 이수 학점
SELECT 
    s.name,
    s.major,
    SUM(sub.credits) as total_credits
FROM students s
JOIN grades g ON s.student_id = g.student_id
JOIN subjects sub ON g.subject_id = sub.subject_id
GROUP BY s.student_id, s.name, s.major
ORDER BY total_credits DESC;
```

### 7단계: 테이블 위치 확인

```sql
-- 1. 내가 소유한 테이블 목록
SELECT table_name, created FROM user_tables ORDER BY table_name;

-- 2. 테이블이 속한 스키마 확인
SELECT 
    owner,
    table_name,
    tablespace_name
FROM all_tables 
WHERE owner = 'STUDENT'
ORDER BY table_name;

-- 3. 테이블 컬럼 정보
SELECT 
    table_name,
    column_name,
    data_type,
    nullable
FROM user_tab_columns 
WHERE table_name IN ('STUDENTS', 'SUBJECTS', 'GRADES')
ORDER BY table_name, column_id;

-- 4. 인덱스 정보
SELECT 
    table_name,
    index_name,
    uniqueness
FROM user_indexes
ORDER BY table_name;

-- 5. 제약조건 정보
SELECT 
    table_name,
    constraint_name,
    constraint_type,
    status
FROM user_constraints
WHERE table_name IN ('STUDENTS', 'SUBJECTS', 'GRADES')
ORDER BY table_name;
```

## 🎯 실행 순서 요약

1. **SYSTEM 계정으로 접속** → 1단계 SQL 실행
2. **새 접속 생성** (student/student123)
3. **student 계정으로 접속** → 3단계 이후 모든 SQL 실행
4. **결과 확인** → IntelliJ Database 창에서 STUDENT 스키마 확인

## 💡 확인 포인트

- ✅ `SELECT USER FROM DUAL;` 결과가 `STUDENT`인지 확인
- ✅ `SELECT COUNT(*) FROM user_tables;` 결과가 `3`인지 확인
- ✅ IntelliJ Database 창에서 STUDENT → Tables에 3개 테이블 확인
- ✅ 모든 JOIN 쿼리가 정상 작동하는지 확인

이제 완전한 Oracle Database 환경이 구축되었습니다! 🎉