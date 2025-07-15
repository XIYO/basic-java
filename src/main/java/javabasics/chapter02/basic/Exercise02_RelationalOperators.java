package main.java.javabasics.chapter02.basic;

/**
 * Chapter 02 - 연산자 (Operators)
 * 연습문제 2: 관계(비교) 연산자 완벽 가이드
 * 
 * <h3>학습 목표:</h3>
 * <ul>
 *   <li>여섯 가지 관계 연산자 (==, !=, >, <, >=, <=) 완벽 이해</li>
 *   <li>숫자, 문자, 실수 비교의 차이점 학습</li>
 *   <li>boolean 결과값의 활용법 익히기</li>
 *   <li>복합 조건식 만들기</li>
 * </ul>
 * 
 * <h3>관계 연산자 종류:</h3>
 * <pre>
 * ==  : 같다 (equal to)
 * !=  : 같지 않다 (not equal to)
 * >   : 크다 (greater than)
 * <   : 작다 (less than)
 * >=  : 크거나 같다 (greater than or equal to)
 * <=  : 작거나 같다 (less than or equal to)
 * </pre>
 * 
 * <h3>🔍 주의사항:</h3>
 * - 모든 관계 연산자는 boolean 값(true/false)을 반환합니다
 * - 문자열 비교는 == 대신 equals() 메서드 사용
 * - 실수 비교 시 부동소수점 오차 주의
 * 
 * @author 자바 기초 학습
 * @version 1.0
 * @since Chapter 02
 */
public class Exercise02_RelationalOperators {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 문제 2-1: 정수 값 비교하기
         * ==========================================
         * 세 개의 정수를 사용한 다양한 비교 연산
         * 
         * [실습 시나리오]
         * - 같은 값 비교 (num1과 num3)
         * - 다른 값 비교 (num1과 num2)
         * - 크기 비교 (크다, 작다, 크거나 같다, 작거나 같다)
         * 
         * 💡 TIP: 비교 연산자는 조건문(if)에서 자주 사용됩니다
         */
        int num1 = 10;  // 첫 번째 숫자
        int num2 = 20;  // 두 번째 숫자 (다른 값)
        int num3 = 10;  // 세 번째 숫자 (num1과 같은 값)
        
        // 각종 관계 연산자 테스트
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 == num3 : " + (num1 == num3));
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 > num2 : " + (num1 > num2));
        System.out.println("num1 < num2 : " + (num1 < num2));
        System.out.println("num1 >= num3 : " + (num1 >= num3));
        System.out.println("num2 <= num3 : " + (num2 <= num3));
        
        /*
         * ==========================================
         * 문제 2-2: 문자(char) 비교의 비밀
         * ==========================================
         * 문자는 내부적으로 ASCII/유니코드 값으로 저장
         * 
         * [ASCII 코드 값]
         * - 'A' = 65
         * - 'B' = 66
         * - 'a' = 97
         * 
         * [비교 규칙]
         * - 대문자 < 소문자 (ASCII 값 기준)
         * - 'A' < 'B' < ... < 'Z' < 'a' < 'b' < ... < 'z'
         * 
         * 📌 실용 예시: 알파벳 정렬, 대소문자 구분
         */
        char ch1 = 'A';  // 대문자 A (ASCII: 65)
        char ch2 = 'B';  // 대문자 B (ASCII: 66)
        char ch3 = 'a';  // 소문자 a (ASCII: 97)
        
        // 문자 비교 연산
        System.out.println("\nch1 < ch2 : " + (ch1 < ch2));
        System.out.println("ch1 < ch3 : " + (ch1 < ch3));
        System.out.println("ch2 == 'B' : " + (ch2 == 'B'));
        
        /*
         * ==========================================
         * 문제 2-3: 실수(double) 비교
         * ==========================================
         * 실수 비교의 특징과 주의사항
         * 
         * [특징]
         * - 10.5와 10.50은 수학적으로 같은 값
         * - 소수점 이하 자리수 비교 가능
         * 
         * ⚠️ 주의: 부동소수점 오차
         * - 0.1 + 0.2 == 0.3 은 false일 수 있음
         * - 정확한 비교가 필요하면 허용 오차 범위 설정
         * 
         * 💡 TIP: 금액 계산은 BigDecimal 클래스 사용 권장
         */
        double d1 = 10.5;   // 10.5
        double d2 = 10.50;  // 10.50 (수학적으로 10.5와 동일)
        double d3 = 10.51;  // 10.51
        
        // 실수 비교 연산
        System.out.println("\nd1 == d2 : " + (d1 == d2));
        System.out.println("d1 < d3 : " + (d1 < d3));
        
        /*
         * ==========================================
         * 문제 2-4: 실전 예제 - 성적 평가 시스템
         * ==========================================
         * 관계 연산자를 활용한 조건 판단
         * 
         * [학점 기준]
         * - 90점 이상: A학점
         * - 80점 이상: B학점
         * - 70점 이상: C학점
         * 
         * [복합 조건]
         * - && (AND): 모든 조건이 참일 때 true
         * - || (OR): 하나라도 참이면 true
         * 
         * 🎓 응용: 장학금 지급 조건, 합격/불합격 판정 등
         */
        int score = 85;  // 학생의 시험 점수
        
        // 각종 조건 판단
        System.out.println("\n점수가 90점 이상인가? " + (score >= 90));
        System.out.println("점수가 80점 이상인가? " + (score >= 80));
        System.out.println("점수가 70점과 90점 사이인가? " + (score > 70 && score < 90));
    }
}