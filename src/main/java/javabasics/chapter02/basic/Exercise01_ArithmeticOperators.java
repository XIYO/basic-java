package javabasics.chapter02.basic;

/**
 * 문제 01: 산술 연산자 마스터하기
 * 
 * <h3>학습 목표:</h3>
 * <ul>
 *   <li>기본 산술 연산자 5가지 (+, -, *, /, %)의 사용법을 완전히 익힙니다</li>
 *   <li>정수 연산과 실수 연산의 차이점을 명확히 이해합니다</li>
 *   <li>연산자 우선순위와 괄호의 역할을 학습합니다</li>
 * </ul>
 * 
 * <h3>지시사항:</h3>
 * <ol>
 *   <li>두 정수 변수를 선언하고 모든 산술 연산을 수행하세요</li>
 *   <li>정수와 실수 나눗셈의 차이를 비교해보세요</li>
 *   <li>복합 연산식에서 연산자 우선순위를 확인하세요</li>
 *   <li>괄호를 사용하여 연산 순서를 변경해보세요</li>
 * </ol>
 * 
 * <h3>힌트:</h3>
 * <ul>
 *   <li>💡 정수 나눗셈은 소수점을 버립니다 (10 / 3 = 3)</li>
 *   <li>💡 나머지 연산자(%)는 홀수/짝수 판별에 유용합니다</li>
 *   <li>💡 IntelliJ 팁: Ctrl+D (Windows) / Cmd+D (Mac)로 현재 줄을 복사할 수 있습니다</li>
 * </ul>
 * 
 * <h3>주의사항:</h3>
 * <ul>
 *   <li>⚠️ 0으로 나누기는 런타임 에러를 발생시킵니다</li>
 *   <li>⚠️ 정수 오버플로우에 주의하세요 (int 범위: -2,147,483,648 ~ 2,147,483,647)</li>
 * </ul>
 * 
 * <h3>예상 출력:</h3>
 * <pre>
 * === 기본 산술 연산 ===
 * 10 + 3 = 13
 * 10 - 3 = 7
 * 10 * 3 = 30
 * 10 / 3 = 3
 * 10 % 3 = 1
 * 
 * === 실수 나눗셈 ===
 * 10.0 / 3.0 = 3.3333333333333335
 * 
 * === 연산자 우선순위 ===
 * 10 + 20 * 3 - 5 / 2 = 68
 * (10 + 20) * (3 - 5) / 2 = -30
 * </pre>
 * 
 * <h3>보너스 도전과제:</h3>
 * <p>🎯 계산기 프로그램을 만들어보세요. 두 숫자와 연산자를 입력받아 결과를 출력하는 프로그램을 작성해보세요.</p>
 * 
 * @author 자바기초교육
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise01_ArithmeticOperators {
    public static void main(String[] args) {
        // TODO: 여기에 코드를 작성하세요
        // 힌트: 단계별로 차근차근 구현해보세요
        
        // 1단계: 두 정수 변수 선언하고 기본 산술 연산 수행
        System.out.println("=== 기본 산술 연산 ===");
        int a = 10;
        int b = 3;
        
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        
        // 2단계: 실수 나눗셈으로 정확한 결과 확인
        System.out.println("\n=== 실수 나눗셈 ===");
        double x = 10.0;
        double y = 3.0;
        System.out.println(x + " / " + y + " = " + (x / y));
        
        // 3단계: 연산자 우선순위 테스트
        System.out.println("\n=== 연산자 우선순위 ===");
        int result1 = 10 + 20 * 3 - 5 / 2;
        System.out.println("10 + 20 * 3 - 5 / 2 = " + result1);
        
        // 4단계: 괄호로 연산 순서 변경
        int result2 = (10 + 20) * (3 - 5) / 2;
        System.out.println("(10 + 20) * (3 - 5) / 2 = " + result2);
    }
}

/* 참고 자료:
 * - Java 연산자 문서: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 * - 연산자 우선순위: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 */