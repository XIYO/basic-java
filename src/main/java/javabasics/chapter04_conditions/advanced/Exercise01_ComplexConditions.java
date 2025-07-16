package main.java.javabasics.chapter04_conditions.advanced;

/**
 * Chapter 4 - 조건문 (응용)
 * 문제 1: 복잡한 조건 처리
 * 
 * 목표: 여러 조건을 조합하여 복잡한 비즈니스 로직을 구현합니다.
 * 
 * 지시사항:
 * 1. 회원 등급을 결정하는 프로그램을 작성하세요
 * 2. 조건:
 *    - 구매금액 100만원 이상 & 가입기간 2년 이상: PLATINUM
 *    - 구매금액 50만원 이상 & 가입기간 1년 이상: GOLD
 *    - 구매금액 20만원 이상 또는 가입기간 6개월 이상: SILVER
 *    - 그 외: BRONZE
 * 
 * 힌트:
 * - 복잡한 조건은 괄호를 사용하여 명확히 구분하세요
 * - 가장 엄격한 조건부터 검사하세요
 */
public class Exercise01_ComplexConditions {
    public static void main(String[] args) {
        int purchaseAmount = 600000;  // 60만원
        int membershipMonths = 18;    // 18개월
        String memberGrade = "";
        
        // TODO: 회원 등급을 결정하는 조건문을 작성하세요
        // 힌트1: if-else if-else 구조를 사용하세요
        // 힌트2: PLATINUM 조건부터 시작해서 점점 느슨한 조건으로 내려가세요
        // 힌트3: AND(&&)와 OR(||) 연산자를 적절히 사용하세요
        
        
        
        
        
        
        
        
        
        
        // 아래 코드는 수정하지 마세요
        System.out.println("구매금액: " + purchaseAmount + "원");
        System.out.println("가입기간: " + membershipMonths + "개월");
        System.out.println("회원등급: " + memberGrade);
        
        // 예상 출력:
        // 구매금액: 600000원
        // 가입기간: 18개월
        // 회원등급: GOLD
    }
}