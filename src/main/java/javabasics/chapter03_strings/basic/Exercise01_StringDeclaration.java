package javabasics.chapter03_strings.basic;

/**
 * Chapter 3 - 문자열 (기본)
 * 문제 1: 문자열 선언과 초기화
 * 
 * ■ 학습 목표
 * - String 타입의 변수를 선언하고 초기화하는 방법을 익힙니다.
 * - 문자열 리터럴(literal)의 사용법을 이해합니다.
 * 
 * ■ 배경 지식
 * - String은 Java의 참조 타입(Reference Type)입니다.
 * - 문자열은 불변(immutable) 객체로, 한 번 생성되면 변경할 수 없습니다.
 * - 문자열 리터럴은 큰따옴표("")로 감싸서 표현합니다.
 * 
 * ■ 주의사항
 * - 작은따옴표('')는 문자(char) 타입에 사용되므로 문자열에는 사용할 수 없습니다.
 * - String은 대문자 S로 시작합니다 (원시 타입이 아닌 클래스이기 때문).
 * 
 * ■ 구현 지시사항
 * 1. greeting이라는 이름의 String 변수를 선언하고 "Hello, Java!"로 초기화하세요.
 * 2. name이라는 이름의 String 변수를 선언하고 본인의 이름으로 초기화하세요.
 * 
 * ■ 예제 코드
 * String message = "Welcome!";  // 문자열 변수 선언과 동시에 초기화
 * String city;                   // 문자열 변수 선언만
 * city = "Seoul";               // 나중에 값 할당
 */
public class Exercise01_StringDeclaration {
    public static void main(String[] args) {
        // TODO: greeting 변수를 선언하고 "Hello, Java!"로 초기화하세요
        // String 타입의 변수를 선언하고, 큰따옴표로 감싼 문자열을 할당합니다.
        // 예시: String 변수명 = "문자열값";
        
        
        // TODO: name 변수를 선언하고 본인의 이름으로 초기화하세요
        // 본인의 이름을 큰따옴표로 감싸서 String 변수에 저장합니다.
        // 한글 이름도 가능합니다. 예: "홍길동"
        
        
        // 아래 코드는 수정하지 마세요
        System.out.println(greeting);
        System.out.println("My name is " + name);
        
        // ■ 예상 출력 결과
        // Hello, Java!
        // My name is [본인이름]
        // 
        // ■ 출력 설명
        // - println() 메서드는 문자열을 출력하고 줄바꿈을 합니다.
        // - + 연산자로 문자열을 연결할 수 있습니다.
    }
}