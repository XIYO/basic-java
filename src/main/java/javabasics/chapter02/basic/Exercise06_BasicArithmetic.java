package javabasics.chapter02.basic;

/**
 * Chapter 02 - 연산자 (Operators)
 * 연습문제 6: 기본 산술 연산 실습
 * 
 * <h3>🎯 학습 목표:</h3>
 * <ul>
 *   <li>4가지 기본 산술 연산자(+, -, *, /) 사용법 익히기</li>
 *   <li>정수 타입 간의 연산 결과 이해하기</li>
 *   <li>정수 나눗셈의 특징 파악하기</li>
 * </ul>
 * 
 * <h3>📝 문제 설명:</h3>
 * <p>두 정수 a(10)와 b(3)에 대해 4가지 기본 산술 연산을 수행하세요.</p>
 * 
 * <h3>✅ 수행할 작업:</h3>
 * <ol>
 *   <li><b>덧셈(+)</b>: a와 b의 합을 구하세요 (10 + 3 = 13)</li>
 *   <li><b>뺄셈(-)</b>: a에서 b를 뺀 차를 구하세요 (10 - 3 = 7)</li>
 *   <li><b>곱셈(*)</b>: a와 b의 곱을 구하세요 (10 × 3 = 30)</li>
 *   <li><b>나눗셈(/)</b>: a를 b로 나눈 몫을 구하세요 (10 ÷ 3 = 3)</li>
 * </ol>
 * 
 * <h3>💡 힌트:</h3>
 * <table border="1">
 *   <tr><th>연산</th><th>연산자</th><th>예시</th><th>설명</th></tr>
 *   <tr><td>덧셈</td><td>+</td><td>a + b</td><td>두 값을 더함</td></tr>
 *   <tr><td>뺄셈</td><td>-</td><td>a - b</td><td>첫 번째 값에서 두 번째 값을 뺌</td></tr>
 *   <tr><td>곱셈</td><td>*</td><td>a * b</td><td>두 값을 곱함</td></tr>
 *   <tr><td>나눗셈</td><td>/</td><td>a / b</td><td>첫 번째 값을 두 번째 값으로 나눔</td></tr>
 * </table>
 * 
 * <h3>⚠️ 주의사항:</h3>
 * <ul>
 *   <li>정수 나눗셈은 소수점을 버립니다 (10 ÷ 3 = 3.333... → 3)</li>
 *   <li>나머지는 % 연산자로 구할 수 있습니다 (다음 문제에서 학습)</li>
 * </ul>
 * 
 * <h3>🔍 예상 출력:</h3>
 * <pre>
 * 합: 13
 * 차: 7
 * 곱: 30
 * 몫: 3
 * </pre>
 * 
 * @author 자바 기초 학습
 * @version 1.0
 * @since Chapter 02
 */
public class Exercise06_BasicArithmetic {
    public static void main(String[] args) {
        /*
         * 주어진 변수:
         * a = 10, b = 3
         * 이 두 변수를 사용하여 아래의 연산을 수행하세요
         */
        int a = 10;
        int b = 3;
        
        /*
         * ==========================================
         * TODO: 아래 변수들에 올바른 연산 결과를 할당하세요
         * ==========================================
         * 예시: int sum = a + b;
         */
        int sum = 0;        // TODO: a와 b의 합 (덧셈 연산자 사용)
        int difference = 0; // TODO: a에서 b를 뺀 값 (뺄셈 연산자 사용)
        int product = 0;    // TODO: a와 b의 곱 (곱셈 연산자 사용)
        int quotient = 0;   // TODO: a를 b로 나눈 몫 (나눗셈 연산자 사용)
        
        /*
         * ==========================================
         * 아래 출력 코드는 수정하지 마세요
         * ==========================================
         */
        System.out.println("합: " + sum);
        System.out.println("차: " + difference);
        System.out.println("곱: " + product);
        System.out.println("몫: " + quotient);
        
        /*
         * 예상 출력:
         * 합: 13
         * 차: 7
         * 곱: 30
         * 몫: 3
         */
    }
}