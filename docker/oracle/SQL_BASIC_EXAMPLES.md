# Oracle Database 기본 SQL 예제

## 🎯 올바른 방법: 개발용 사용자 생성하기

### ⚠️ SYSTEM 계정을 사용하면 안 되는 이유:
1. **관리자 계정**: 시스템 중요 테이블들과 섞임
2. **보안 위험**: 실무에서는 절대 사용 금지
3. **테이블 관리 어려움**: 시스템 테이블과 내 테이블이 섞임

### 🔧 1단계: SYSTEM 계정으로 새 사용자 생성

**SYSTEM 계정에 접속하여** 다음 SQL을 실행합니다:

```sql
-- 개발용 사용자 생성
CREATE USER student IDENTIFIED BY student123;

-- 기본 권한 부여
GRANT CONNECT, RESOURCE TO student;
GRANT UNLIMITED TABLESPACE TO student;
GRANT CREATE VIEW, CREATE SEQUENCE, CREATE PROCEDURE TO student;

-- 사용자 생성 확인
SELECT username FROM all_users WHERE username = 'STUDENT';
```

### 🔑 2단계: 새 사용자로 접속 설정

#### SQL Developer에서:
| 항목 | 값 |
|------|-----|
| **Name** | Student Local |
| **Username** | student |
| **Password** | student123 |
| **Hostname** | localhost |
| **Port** | 1521 |
| **Service name** | FREEPDB1 |

#### IntelliJ에서:
1. Database 창 → **+** → **Data Source** → **Oracle**
2. 위와 동일한 정보로 접속 설정

### ✅ 3단계: student 계정으로 접속 확인

```sql
-- 현재 사용자 확인 (STUDENT가 나와야 함)
SELECT USER FROM DUAL;

-- 내 테이블 목록 확인 (처음에는 비어있음)
SELECT table_name FROM user_tables;
```

> 💡 **이제부터 모든 SQL 예제는 student 계정에서 실행합니다!**

## 📚 기본 SQL 예제

### 1. 테이블 생성 (CREATE)

#### 학생 테이블 만들기
```sql
-- 학생 테이블 생성
CREATE TABLE students (
    student_id NUMBER(10) PRIMARY KEY,
    name VARCHAR2(50) NOT NULL,
    email VARCHAR2(100) UNIQUE,
    age NUMBER(3),
    major VARCHAR2(50),
    enrollment_date DATE DEFAULT SYSDATE
);
```

#### 과목 테이블 만들기
```sql
-- 과목 테이블 생성
CREATE TABLE subjects (
    subject_id NUMBER(10) PRIMARY KEY,
    subject_name VARCHAR2(100) NOT NULL,
    credits NUMBER(2),
    professor VARCHAR2(50)
);
```

### 2. 데이터 입력 (INSERT)

#### 학생 데이터 입력
```sql
-- 학생 데이터 입력
INSERT INTO students (student_id, name, email, age, major) VALUES 
(1, '김철수', 'kim@example.com', 20, '컴퓨터공학');

INSERT INTO students (student_id, name, email, age, major) VALUES 
(2, '이영희', 'lee@example.com', 22, '경영학');

INSERT INTO students (student_id, name, email, age, major) VALUES 
(3, '박민수', 'park@example.com', 21, '수학');

-- 여러 행 한번에 입력 (Oracle 23c 이상)
INSERT ALL
    INTO students (student_id, name, email, age, major) VALUES (4, '정수진', 'jung@example.com', 19, '영문학')
    INTO students (student_id, name, email, age, major) VALUES (5, '최영호', 'choi@example.com', 23, '물리학')
SELECT * FROM dual;

-- 변경사항 저장
COMMIT;
```

#### 과목 데이터 입력
```sql
-- 과목 데이터 입력
INSERT INTO subjects (subject_id, subject_name, credits, professor) VALUES 
(101, '데이터베이스', 3, '김교수');

INSERT INTO subjects (subject_id, subject_name, credits, professor) VALUES 
(102, '자바프로그래밍', 3, '이교수');

INSERT INTO subjects (subject_id, subject_name, credits, professor) VALUES 
(103, '웹개발', 2, '박교수');

COMMIT;
```

### 3. 데이터 조회 (SELECT)

#### 기본 조회
```sql
-- 모든 학생 조회
SELECT * FROM students;

-- 특정 컬럼만 조회
SELECT name, email, major FROM students;

-- 조건부 조회
SELECT * FROM students WHERE age >= 21;

-- 특정 전공 학생 조회
SELECT * FROM students WHERE major = '컴퓨터공학';
```

#### 정렬과 제한
```sql
-- 나이순 정렬 (오름차순)
SELECT * FROM students ORDER BY age;

-- 나이순 정렬 (내림차순)
SELECT * FROM students ORDER BY age DESC;

-- 이름순 정렬
SELECT * FROM students ORDER BY name;

-- 상위 3명만 조회
SELECT * FROM students WHERE ROWNUM <= 3;
```

#### 패턴 검색
```sql
-- 이름에 '김'이 포함된 학생
SELECT * FROM students WHERE name LIKE '%김%';

-- 이메일이 'gmail'로 끝나는 학생
SELECT * FROM students WHERE email LIKE '%gmail.com';

-- 전공이 '학'으로 끝나는 학생
SELECT * FROM students WHERE major LIKE '%학';
```

#### 집계 함수
```sql
-- 전체 학생 수
SELECT COUNT(*) FROM students;

-- 평균 나이
SELECT AVG(age) FROM students;

-- 최대, 최소 나이
SELECT MAX(age), MIN(age) FROM students;

-- 전공별 학생 수
SELECT major, COUNT(*) FROM students GROUP BY major;
```

### 4. 데이터 수정 (UPDATE)

```sql
-- 특정 학생의 나이 수정
UPDATE students 
SET age = 21 
WHERE student_id = 1;

-- 특정 학생의 이메일과 전공 수정
UPDATE students 
SET email = 'kim.new@example.com', major = '소프트웨어공학'
WHERE student_id = 1;

-- 모든 컴퓨터공학 학생의 전공명 변경
UPDATE students 
SET major = 'IT공학'
WHERE major = '컴퓨터공학';

-- 변경사항 확인
SELECT * FROM students WHERE student_id = 1;

COMMIT;
```

### 5. 데이터 삭제 (DELETE)

```sql
-- 특정 학생 삭제
DELETE FROM students WHERE student_id = 5;

-- 조건부 삭제 (나이가 25 이상인 학생)
DELETE FROM students WHERE age >= 25;

-- 특정 전공 학생 모두 삭제
DELETE FROM students WHERE major = '물리학';

-- 변경사항 확인
SELECT * FROM students;

COMMIT;
```

## 🔍 고급 조회 예제

### JOIN 예제

#### 성적 테이블 추가 생성
```sql
-- 성적 테이블 생성
CREATE TABLE grades (
    grade_id NUMBER(10) PRIMARY KEY,
    student_id NUMBER(10),
    subject_id NUMBER(10),
    score NUMBER(3),
    grade_date DATE DEFAULT SYSDATE,
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (subject_id) REFERENCES subjects(subject_id)
);

-- 성적 데이터 입력
INSERT INTO grades (grade_id, student_id, subject_id, score) VALUES (1, 1, 101, 85);
INSERT INTO grades (grade_id, student_id, subject_id, score) VALUES (2, 1, 102, 90);
INSERT INTO grades (grade_id, student_id, subject_id, score) VALUES (3, 2, 101, 78);
INSERT INTO grades (grade_id, student_id, subject_id, score) VALUES (4, 2, 103, 92);
INSERT INTO grades (grade_id, student_id, subject_id, score) VALUES (5, 3, 102, 88);

COMMIT;
```

#### JOIN 조회
```sql
-- 학생 이름과 성적 함께 조회
SELECT s.name, sub.subject_name, g.score
FROM students s
JOIN grades g ON s.student_id = g.student_id
JOIN subjects sub ON g.subject_id = sub.subject_id;

-- 특정 학생의 모든 성적
SELECT s.name, sub.subject_name, g.score
FROM students s
JOIN grades g ON s.student_id = g.student_id
JOIN subjects sub ON g.subject_id = sub.subject_id
WHERE s.name = '김철수';

-- 과목별 평균 점수
SELECT sub.subject_name, AVG(g.score) as average_score
FROM subjects sub
JOIN grades g ON sub.subject_id = g.subject_id
GROUP BY sub.subject_name;
```

## 🛠️ 유용한 시스템 조회

```sql
-- 내가 생성한 테이블 목록
SELECT table_name FROM user_tables;

-- 테이블 구조 확인
DESCRIBE students;

-- 테이블 컬럼 정보
SELECT column_name, data_type, nullable 
FROM user_tab_columns 
WHERE table_name = 'STUDENTS';

-- 현재 시간
SELECT SYSDATE FROM dual;

-- 데이터베이스 버전
SELECT * FROM v$version;
```

## 🧹 정리 작업

```sql
-- 테이블 삭제 (외래키 관계 순서 주의)
DROP TABLE grades;
DROP TABLE subjects;
DROP TABLE students;
```

## 💡 주의사항

1. **대소문자 구분**: Oracle은 기본적으로 대소문자를 구분하지 않지만, 문자열 비교 시에는 구분
2. **COMMIT**: 데이터 변경 후 반드시 `COMMIT` 실행
3. **ROLLBACK**: 실수한 경우 `ROLLBACK`으로 되돌리기
4. **날짜 형식**: Oracle의 기본 날짜 형식은 'DD-MON-YY'

## 🎯 다음 단계

- PL/SQL 프로시저 학습
- 인덱스 생성과 성능 최적화
- 뷰(View) 생성과 활용
- 트랜잭션 관리