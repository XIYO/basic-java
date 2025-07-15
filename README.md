# Java 기초 문법 학습 프로그램

이 프로젝트는 Java 초보자를 위한 기초 문법 학습 문제집입니다. 각 문제는 독립적인 Java 클래스 파일로 제공되며, 학습자는 빈 부분을 채워 프로그램을 완성하는 방식으로 학습합니다.

## 프로젝트 구조

```
src/main/java/javabasics/
├── Main.java                    # 메인 프로그램 (문제 목록 표시)
├── chapter01_variables/         # Chapter 1: 변수와 데이터 타입
├── chapter02/                   # Chapter 2: 연산자
│   ├── basic/                   # 기본 연산자 문제
│   └── advanced/                # 응용 연산자 문제
├── chapter03_strings/           # Chapter 3: 문자열
├── chapter04_conditions/        # Chapter 4: 조건문
├── chapter05_loops/             # Chapter 5: 반복문
├── chapter06_arrays/            # Chapter 6: 배열
├── chapter07_methods/           # Chapter 7: 메서드
└── solutions/                   # 문제 해답 (참고용)
```

## 📚 문제 목록

### Chapter 01 - 변수와 데이터 타입
- Exercise01_IntegerVariable.java - 정수 변수 선언
- Exercise02_MultipleTypes.java - 여러 타입의 변수 선언
- Exercise03_TypeConversion.java - 타입 변환

### Chapter 02 - 연산자
#### 📘 기본 (Basic)
- Exercise04_BasicArithmetic.java - 기본 산술 연산 (TODO 형식)
- Exercise05_Remainder.java - 나머지 연산 (TODO 형식)
- Problem01_ArithmeticOperators.java - 산술 연산자 종합 (+, -, *, /, %)
- Problem02_RelationalOperators.java - 관계 연산자 (==, !=, >, <, >=, <=)
- Problem03_LogicalOperators.java - 논리 연산자 (&&, ||, !)
- Problem04_AssignmentOperators.java - 대입 연산자 (=, +=, -=, *=, /=, %=)
- Problem05_IncrementDecrement.java - 증감 연산자 (++, --)

#### 📙 응용 (Advanced)
- Problem01_BitwiseOperators.java - 비트 연산자 (&, |, ^, ~, <<, >>, >>>)
- Problem02_TernaryOperator.java - 삼항 연산자 (조건 ? 참 : 거짓)
- Problem03_ComplexExpressions.java - 복합 표현식과 연산자 우선순위
- Problem04_OperatorPitfalls.java - 연산자 사용 시 주의사항
- Problem05_RealWorldApplications.java - 실전 응용 예제

### Chapter 03 - 문자열
#### 📘 기본 (Basic)
- Exercise01_StringDeclaration.java - 문자열 선언과 초기화
- Exercise02_StringConcatenation.java - 문자열 연결
- Exercise03_StringLength.java - 문자열 길이
- Exercise04_StringEquals.java - 문자열 비교 (equals)
- Exercise05_CharAt.java - 문자 추출 (charAt)

#### 📙 응용 (Advanced)
- Exercise01_Substring.java - 부분 문자열 추출
- Exercise02_StringReplace.java - 문자열 치환
- Exercise03_StringContains.java - 문자열 포함 확인
- Exercise04_StringTrim.java - 공백 제거와 대소문자 변환
- Exercise05_StringSplit.java - 문자열 분리

### Chapter 04 - 조건문
- Exercise08_IfStatement.java - if문 기초
- Exercise09_EvenOdd.java - 짝수 홀수 판별

### Chapter 05 - 반복문
- Exercise10_ForLoop.java - for문 기초
- Exercise11_SumNumbers.java - 숫자의 합 구하기

### Chapter 06 - 배열
- Exercise12_ArrayDeclaration.java - 배열 선언과 초기화
- Exercise13_ArraySum.java - 배열 요소의 합

### Chapter 07 - 메서드
- Exercise14_SimpleMethod.java - 간단한 메서드 작성
- Exercise15_ReturnBoolean.java - boolean 반환 메서드

## 사용 방법

1. 각 Exercise 파일을 열어 문제를 확인합니다.
2. TODO 주석이 있는 부분에 코드를 작성합니다.
3. 파일을 실행하여 예상 출력과 일치하는지 확인합니다.
4. 막히는 부분이 있으면 힌트를 참고합니다.
5. 필요시 solutions 폴더의 해답을 참고합니다.

## 컴파일 및 실행

```bash
# 컴파일
javac -d out src/main/java/javabasics/*.java src/main/java/javabasics/exercises/*/*.java

# 메인 프로그램 실행
java -cp out javabasics.Main

# 특정 문제 실행 (예: Exercise01)
java -cp out javabasics.exercises.variables.Exercise01_IntegerVariable
```

## 학습 팁

1. 각 문제의 힌트를 단계별로 읽어보세요.
2. 코드를 작성한 후 반드시 실행해서 결과를 확인하세요.
3. 에러가 발생하면 에러 메시지를 잘 읽어보세요.
4. 문제를 해결한 후에는 다른 방법으로도 시도해보세요.