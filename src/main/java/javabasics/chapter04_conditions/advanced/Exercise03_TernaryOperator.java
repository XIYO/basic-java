package main.java.javabasics.chapter04_conditions.advanced;

/**
 * Chapter 4 - 조건문 (응용)
 * 문제 3: 삼항 연산자
 * 
 * 목표: 간단한 조건을 삼항 연산자로 표현하는 방법을 학습합니다.
 * 
 * 지시사항:
 * 1. 삼항 연산자를 사용하여 다음을 구현하세요:
 *    - isAdult: age가 18 이상이면 true
 *    - discount: isMember가 true면 0.1, false면 0
 *    - message: score가 60 이상이면 "합격", 아니면 "불합격"
 * 
 * 힌트:
 * - 삼항 연산자: 조건 ? 참일때값 : 거짓일때값
 * - 중첩된 삼항 연산자도 가능하지만 가독성을 고려하세요
 */
public class Exercise03_TernaryOperator {
    public static void main(String[] args) {
        int age = 20;
        boolean isMember = true;
        int score = 75;
        
        // TODO: 삼항 연산자를 사용하여 값을 설정하세요
        // 힌트: 조건 ? 참일때값 : 거짓일때값 형식을 사용하세요
        boolean isAdult = ???;  // age가 18 이상인지 확인
        
        
        double discount = ???;  // 회원이면 0.1(10% 할인), 아니면 0
        
        
        String message = ???;  // score가 60점 이상이면 "합격", 아니면 "불합격"
        
        
        // 아래 코드는 수정하지 마세요
        System.out.println("나이: " + age + ", 성인: " + isAdult);
        System.out.println("회원: " + isMember + ", 할인율: " + (discount * 100) + "%");
        System.out.println("점수: " + score + ", 결과: " + message);
        
        // 예상 출력:
        // 나이: 20, 성인: true
        // 회원: true, 할인율: 10.0%
        // 점수: 75, 결과: 합격
    }
}