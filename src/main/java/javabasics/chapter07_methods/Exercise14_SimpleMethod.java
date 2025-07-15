package main.java.javabasics.chapter07_methods;

/**
 * Chapter 7 - 메서드
 * 문제 14: 간단한 메서드 작성
 * 
 * 목표: 두 수를 더하는 메서드를 작성합니다.
 * 
 * 지시사항:
 * 1. add라는 이름의 메서드를 작성하세요
 * 2. 두 개의 정수 매개변수를 받아서 합을 반환하세요
 * 
 * 힌트:
 * - 메서드 선언: public static int add(int a, int b)
 * - return 키워드로 결과를 반환합니다
 */
public class Exercise14_SimpleMethod {
    // TODO: 두 수를 더하는 add 메서드를 작성하세요
    
    
    
    
    public static void main(String[] args) {
        // 아래 코드는 수정하지 마세요
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);
        
        result = add(10, 20);
        System.out.println("10 + 20 = " + result);
        
        // 예상 출력:
        // 5 + 3 = 8
        // 10 + 20 = 30
    }
}