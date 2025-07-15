package main.java.javabasics.chapter02.basic;

/**
 * Chapter 02 - 연산자 (Operators)
 * 연습문제 7: 나머지 연산 실습
 * 
 * <h3>🎯 학습 목표:</h3>
 * <ul>
 *   <li>나머지 연산자(%) 사용법 마스터</li>
 *   <li>나머지 연산의 개념과 활용 방법 이해</li>
 *   <li>나눗셈과 나머지의 관계 파악</li>
 * </ul>
 * 
 * <h3>📝 문제 설명:</h3>
 * <p>정수 number(17)를 divisor(5)로 나눈 나머지를 구하세요.</p>
 * 
 * <h3>📚 개념 설명:</h3>
 * <p><b>나머지 연산이란?</b></p>
 * <ul>
 *   <li>나눗셈 후 남은 값을 구하는 연산</li>
 *   <li>예: 17 ÷ 5 = 3 나머지 2</li>
 *   <li>17 = 5 × 3 + <b>2</b> (여기서 2가 나머지)</li>
 * </ul>
 * 
 * <h3>💡 힌트:</h3>
 * <table border="1">
 *   <tr><th>연산</th><th>연산자</th><th>예시</th><th>결과</th></tr>
 *   <tr><td>나머지</td><td>%</td><td>7 % 3</td><td>1</td></tr>
 *   <tr><td>나머지</td><td>%</td><td>10 % 4</td><td>2</td></tr>
 *   <tr><td>나머지</td><td>%</td><td>15 % 5</td><td>0</td></tr>
 * </table>
 * 
 * <h3>🔧 실무 활용 예시:</h3>
 * <ul>
 *   <li><b>홀짝 판별</b>: n % 2 == 0 (짝수), n % 2 == 1 (홀수)</li>
 *   <li><b>배수 판별</b>: n % 3 == 0 (3의 배수)</li>
 *   <li><b>순환 처리</b>: index % arrayLength (배열 순환)</li>
 *   <li><b>시간 계산</b>: 초를 분/초로 변환</li>
 * </ul>
 * 
 * <h3>✅ 수행할 작업:</h3>
 * <ol>
 *   <li>17을 5로 나눈 나머지를 계산하세요</li>
 *   <li>계산 과정: 17 = 5 × 3 + 2</li>
 *   <li>따라서 나머지는 2입니다</li>
 * </ol>
 * 
 * <h3>🔍 예상 출력:</h3>
 * <pre>
 * 17을 5로 나눈 나머지: 2
 * </pre>
 * 
 * @author 자바 기초 학습
 * @version 1.0
 * @since Chapter 02
 */
public class Exercise07_Remainder {
    public static void main(String[] args) {
        /*
         * 주어진 변수:
         * number = 17 (나누어질 수)
         * divisor = 5 (나누는 수)
         */
        int number = 17;
        int divisor = 5;
        
        /*
         * ==========================================
         * TODO: 나머지 연산을 수행하세요
         * ==========================================
         * 나머지 연산자(%)를 사용하여
         * number를 divisor로 나눈 나머지를 구하세요
         */
        int remainder = 0; // TODO: number % divisor
        
        /*
         * ==========================================
         * 아래 출력 코드는 수정하지 마세요
         * ==========================================
         */
        System.out.println(number + "을 " + divisor + "로 나눈 나머지: " + remainder);
        
        /*
         * 예상 출력: 17을 5로 나눈 나머지: 2
         * 
         * 추가 학습:
         * - 17 / 5 = 3 (몫)
         * - 17 % 5 = 2 (나머지)
         * - 검증: 5 × 3 + 2 = 17 ✓
         */
    }
}