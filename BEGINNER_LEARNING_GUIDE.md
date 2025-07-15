# 🎯 Java 초보자를 위한 학습 가이드

## 📚 목차
1. [시작하기 전에](#시작하기-전에)
2. [학습 로드맵](#학습-로드맵)
3. [챕터별 학습 가이드](#챕터별-학습-가이드)
4. [학습 팁](#학습-팁)
5. [자주 하는 실수](#자주-하는-실수)
6. [추가 학습 자료](#추가-학습-자료)

---

## 🌟 시작하기 전에

### 이 교재의 특징
- 🎨 **시각적 학습**: HTML 형식의 JavaDoc 주석으로 한눈에 이해
- 🎮 **단계별 학습**: 기초(Basic) → 심화(Advanced) 순서로 진행
- 💡 **실습 중심**: 실제로 코드를 작성하며 배우기
- 🤝 **친근한 설명**: 전문 용어 대신 일상적인 비유 사용

### 준비물
- ☕ Java JDK 8 이상
- 💻 IntelliJ IDEA 또는 Eclipse
- 📝 메모장 (중요한 내용 정리용)
- 🎯 열정과 끈기!

---

## 🗺️ 학습 로드맵

### 🏃‍♂️ 입문자 코스 (1-2주)
```
Chapter 1: 변수와 데이터 타입 (3일)
    ↓
Chapter 2: 연산자 (2일)
    ↓
Chapter 3: 문자열 (2일)
    ↓
Chapter 4: 조건문 (3일)
    ↓
Chapter 5: 반복문 (4일)
```

### 🚀 초급자 코스 (3-4주)
```
Chapter 6: 배열 (1주)
    ↓
Chapter 7: 메서드 (1주)
    ↓
Chapter 8: 클래스와 객체 (2주)
```

---

## 📖 챕터별 학습 가이드

### Chapter 1: 변수와 데이터 타입 📦
**"데이터를 담는 상자 만들기"**

#### 🎯 학습 목표
- 변수가 무엇인지 이해하기
- 4가지 기본 데이터 타입 마스터하기
- 변수 선언과 초기화 방법 익히기

#### 📝 핵심 개념
| 타입 | 용도 | 예시 |
|------|------|------|
| `int` | 정수 | 나이, 점수, 개수 |
| `double` | 실수 | 키, 몸무게, 가격 |
| `char` | 문자 1개 | 학점, 성별 |
| `boolean` | 참/거짓 | 합격여부, 전원상태 |

#### 🏃‍♂️ 학습 순서
1. **Basic 문제 1-8**: 각 타입별로 하나씩 연습
2. **Advanced 문제 1-5**: 실생활 예제로 응용

#### 💡 학습 팁
```java
// 좋은 변수명 예시
int studentAge = 20;        // ✅ 의미가 명확
double productPrice = 19.99; // ✅ 카멜케이스 사용

// 피해야 할 변수명
int a = 20;                 // ❌ 의미 불명확
double PRICE = 19.99;       // ❌ 대문자만 사용
```

---

### Chapter 2: 연산자 ➕➖✖️➗
**"계산하고 비교하기"**

#### 🎯 학습 목표
- 산술 연산자로 계산하기
- 비교 연산자로 크기 비교하기
- 논리 연산자로 조건 결합하기

#### 📝 핵심 개념
| 연산자 종류 | 기호 | 설명 |
|------------|------|------|
| 산술 | `+ - * / %` | 사칙연산과 나머지 |
| 비교 | `> < >= <= == !=` | 크기와 같음 비교 |
| 논리 | `&& || !` | AND, OR, NOT |
| 증감 | `++ --` | 1씩 증가/감소 |

#### 🚨 주의사항
```java
// 정수 나눗셈 주의!
int result1 = 5 / 2;     // 결과: 2 (소수점 버림)
double result2 = 5.0 / 2; // 결과: 2.5 (정확한 계산)

// == vs equals()
int a = 5;
int b = 5;
a == b;  // ✅ 기본 타입은 == 사용

String s1 = "hello";
String s2 = "hello";
s1.equals(s2); // ✅ 문자열은 equals() 사용
```

---

### Chapter 3: 문자열 🔤
**"텍스트 다루기"**

#### 🎯 학습 목표
- String 클래스 사용법 익히기
- 문자열 조작 메서드 활용하기
- 문자와 문자열의 차이 이해하기

#### 📝 자주 사용하는 메서드
```java
String text = "Hello, World!";

// 길이 구하기
int length = text.length();           // 13

// 대소문자 변환
String upper = text.toUpperCase();    // "HELLO, WORLD!"
String lower = text.toLowerCase();    // "hello, world!"

// 부분 문자열
String sub = text.substring(0, 5);    // "Hello"

// 문자열 찾기
int index = text.indexOf("World");    // 7

// 문자열 교체
String replaced = text.replace("World", "Java"); // "Hello, Java!"
```

---

### Chapter 4: 조건문 🚦
**"상황에 따라 다르게 행동하기"**

#### 🎯 학습 목표
- if-else로 조건 분기하기
- switch로 다중 선택하기
- 중첩 조건문 이해하기

#### 📝 조건문 패턴
```java
// 1. 단순 조건
if (score >= 60) {
    System.out.println("합격!");
}

// 2. 양자택일
if (age >= 19) {
    System.out.println("성인");
} else {
    System.out.println("미성년자");
}

// 3. 다중 조건
if (score >= 90) {
    grade = 'A';
} else if (score >= 80) {
    grade = 'B';
} else if (score >= 70) {
    grade = 'C';
} else {
    grade = 'F';
}

// 4. switch 문
switch (day) {
    case 1: System.out.println("월요일"); break;
    case 2: System.out.println("화요일"); break;
    // ...
    default: System.out.println("잘못된 요일");
}
```

---

### Chapter 5: 반복문 🔄
**"반복 작업 자동화하기"**

#### 🎯 학습 목표
- for문으로 정해진 횟수 반복하기
- while문으로 조건 반복하기
- 중첩 반복문 활용하기

#### 📝 반복문 선택 가이드
| 상황 | 추천 반복문 | 예시 |
|------|------------|------|
| 횟수가 정해진 경우 | `for` | 1부터 10까지 출력 |
| 조건이 중요한 경우 | `while` | 사용자가 'q' 입력할 때까지 |
| 최소 1번은 실행 | `do-while` | 메뉴 선택 |

#### 💡 반복문 팁
```java
// 1부터 10까지 합계 구하기
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;  // sum = sum + i
}

// 무한 루프 주의!
while (true) {
    // 반드시 탈출 조건 필요
    if (조건) {
        break;  // 루프 탈출
    }
}
```

---

## 💡 학습 팁

### 1. 에러 메시지 읽는 법
```java
// 컴파일 에러 예시
int age  // ❌ Error: ';' expected
         // 해결: 세미콜론 추가 → int age;

String name = 123;  // ❌ Error: incompatible types
                   // 해결: 타입 맞추기 → String name = "123";
```

### 2. 디버깅 방법
```java
// 중간 결과 출력하기
int result = 0;
for (int i = 1; i <= 5; i++) {
    result += i;
    System.out.println("i=" + i + ", result=" + result);  // 디버깅용
}
```

### 3. 코드 작성 순서
1. **주석으로 할 일 정리**
2. **변수 선언**
3. **로직 구현**
4. **테스트 및 수정**

---

## ⚠️ 자주 하는 실수

### 1. 세미콜론 누락
```java
int age = 20   // ❌ 세미콜론 없음
int age = 20;  // ✅ 올바른 코드
```

### 2. 대소문자 구분
```java
String name = "홍길동";
system.out.println(name);  // ❌ system (소문자)
System.out.println(name);  // ✅ System (대문자)
```

### 3. == vs equals()
```java
String s1 = "hello";
String s2 = new String("hello");
s1 == s2;        // ❌ false (주소 비교)
s1.equals(s2);   // ✅ true (내용 비교)
```

### 4. 정수 나눗셈
```java
double result = 5 / 2;     // ❌ 2.0 (정수 나눗셈)
double result = 5.0 / 2;   // ✅ 2.5 (실수 나눗셈)
```

### 5. 배열 인덱스
```java
int[] numbers = {10, 20, 30};
numbers[3];  // ❌ ArrayIndexOutOfBoundsException
numbers[2];  // ✅ 30 (인덱스는 0부터)
```

---

## 📚 추가 학습 자료

### 📖 추천 도서
- **Java의 정석** - 남궁성
- **이것이 자바다** - 신용권
- **Head First Java** - Kathy Sierra

### 🎥 온라인 강의
- **생활코딩 Java**: 무료 기초 강의
- **인프런**: 다양한 Java 강의
- **Codecademy**: 인터랙티브 학습

### 💻 연습 사이트
- **백준 온라인 저지**: 단계별 문제
- **프로그래머스**: 코딩테스트 연습
- **HackerRank**: 영어로 된 문제

### 🔧 유용한 도구
- **IntelliJ IDEA**: 강력한 자동완성
- **Eclipse**: 무료 IDE
- **Visual Studio Code**: 가벼운 에디터

---

## 🎯 학습 체크리스트

### Chapter 1 완료 체크 ✅
- [ ] 4가지 기본 타입 이해
- [ ] 변수 선언과 초기화
- [ ] 타입 변환 이해
- [ ] 상수(final) 사용법

### Chapter 2 완료 체크 ✅
- [ ] 산술 연산자 5개
- [ ] 비교 연산자 6개
- [ ] 논리 연산자 3개
- [ ] 증감 연산자 사용

### Chapter 3 완료 체크 ✅
- [ ] String 기본 메서드 5개
- [ ] 문자열 연결 방법
- [ ] 문자와 문자열 차이
- [ ] StringBuilder 사용

### Chapter 4 완료 체크 ✅
- [ ] if-else 문
- [ ] else if 사용
- [ ] switch 문
- [ ] 삼항 연산자

### Chapter 5 완료 체크 ✅
- [ ] for 문
- [ ] while 문
- [ ] do-while 문
- [ ] break와 continue

---

## 🌈 마무리 메시지

프로그래밍을 배우는 것은 새로운 언어를 배우는 것과 같습니다. 
처음에는 어렵고 낯설지만, 꾸준히 연습하면 자연스럽게 익숙해집니다.

**기억하세요!**
- 🐢 천천히 가도 괜찮아요
- 🔁 반복이 실력을 만들어요
- ❓ 모르는 건 당연해요
- 💪 포기하지 마세요!

**Happy Coding! 🎉**