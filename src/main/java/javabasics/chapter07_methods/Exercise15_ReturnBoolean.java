package javabasics.chapter07_methods;

/**
 * Chapter 7 - 메서드
 * 문제 15: boolean 반환 메서드
 * 
 * 목표: 조건을 검사하고 boolean을 반환하는 메서드를 작성합니다.
 * 
 * 지시사항:
 * 1. isAdult라는 메서드를 작성하세요
 * 2. 나이를 매개변수로 받아서 18세 이상이면 true, 아니면 false를 반환하세요
 * 
 * 힌트:
 * - 메서드 선언: public static boolean isAdult(int age)
 * - 조건식의 결과를 바로 반환할 수 있습니다
 * - return age >= 18;
 */
public class Exercise15_ReturnBoolean {
    // TODO: 성인 여부를 판별하는 isAdult 메서드를 작성하세요
    
    
    
    
    public static void main(String[] args) {
        // 아래 코드는 수정하지 마세요
        System.out.println("20살은 성인인가? " + isAdult(20));
        System.out.println("15살은 성인인가? " + isAdult(15));
        System.out.println("18살은 성인인가? " + isAdult(18));
        
        // 예상 출력:
        // 20살은 성인인가? true
        // 15살은 성인인가? false
        // 18살은 성인인가? true
    }
}