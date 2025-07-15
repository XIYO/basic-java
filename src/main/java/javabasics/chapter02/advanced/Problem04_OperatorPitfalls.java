package javabasics.chapter02.advanced;

/**
 * Chapter 02 - 연산자 (Operators) - 고급
 * 문제 4: 연산자 사용 시 주의사항과 함정
 * 
 * <h3>학습 목표:</h3>
 * <ul>
 *   <li>연산자 사용 시 흔히 발생하는 실수와 함정 인식</li>
 *   <li>정수 나눗셈, 부동소수점 비교의 문제점 이해</li>
 *   <li>오버플로우, 언더플로우 현상 파악</li>
 *   <li>안전한 코딩 관행과 예외 처리 방법 습득</li>
 * </ul>
 * 
 * <h3>주요 함정들:</h3>
 * <table border="1">
 *   <tr><th>함정</th><th>문제점</th><th>해결책</th></tr>
 *   <tr><td>정수 나눗셈</td><td>소수점 손실</td><td>형변환 후 나눗셈</td></tr>
 *   <tr><td>부동소수점 비교</td><td>정밀도 오차</td><td>허용 오차 범위 사용</td></tr>
 *   <tr><td>오버플로우</td><td>예상치 못한 값</td><td>범위 검사, long 사용</td></tr>
 *   <tr><td>0으로 나누기</td><td>예외 발생</td><td>사전 검사</td></tr>
 *   <tr><td>연산자 우선순위</td><td>의도와 다른 결과</td><td>괄호 사용</td></tr>
 * </table>
 * 
 * <h3>⚠️ 중요 경고:</h3>
 * <ul>
 *   <li>부동소수점 숫자는 == 로 비교하지 말 것</li>
 *   <li>정수 연산 시 오버플로우 가능성 항상 고려</li>
 *   <li>복잡한 증감 연산자 표현식은 피할 것</li>
 *   <li>null 체크는 항상 단락 평가 활용</li>
 * </ul>
 * 
 * <h3>🛡️ 방어적 프로그래밍:</h3>
 * <ul>
 *   <li>예상 가능한 모든 예외 상황 처리</li>
 *   <li>명확한 의도를 표현하는 코드 작성</li>
 *   <li>테스트 케이스로 경계값 검증</li>
 *   <li>코드 리뷰를 통한 잠재적 문제 발견</li>
 * </ul>
 * 
 * @author 자바 기초 학습
 * @version 1.0
 * @since Chapter 02 Advanced
 */
public class Problem04_OperatorPitfalls {
    public static void main(String[] args) {
        // 문제 4-1: 정수 나눗셈의 함정
        System.out.println("=== 정수 나눗셈 주의사항 ===");
        int a = 5;
        int b = 2;
        double result1 = a / b;  // 정수 나눗셈 후 double로 변환
        double result2 = (double) a / b;  // double로 변환 후 나눗셈
        
        System.out.println("5 / 2 = " + result1);  // 2.0
        System.out.println("(double) 5 / 2 = " + result2);  // 2.5
        
        // 문제 4-2: 부동소수점 비교의 함정
        System.out.println("\n=== 부동소수점 비교 주의사항 ===");
        double d1 = 0.1 + 0.2;
        double d2 = 0.3;
        
        System.out.println("0.1 + 0.2 = " + d1);
        System.out.println("0.3 = " + d2);
        System.out.println("0.1 + 0.2 == 0.3 ? " + (d1 == d2));  // false!
        
        // 올바른 비교 방법
        double epsilon = 0.000001;
        boolean isEqual = Math.abs(d1 - d2) < epsilon;
        System.out.println("올바른 비교 결과: " + isEqual);
        
        // 문제 4-3: 오버플로우와 언더플로우
        System.out.println("\n=== 오버플로우 주의사항 ===");
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE = " + maxInt);
        System.out.println("Integer.MAX_VALUE + 1 = " + (maxInt + 1));  // 오버플로우!
        
        // 문제 4-4: 나누기 0 예외
        System.out.println("\n=== 0으로 나누기 주의사항 ===");
        try {
            int x = 10;
            int y = 0;
            // int result = x / y;  // ArithmeticException 발생
            System.out.println("정수를 0으로 나누면 예외 발생");
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
        
        // 부동소수점은 예외 대신 특수값 반환
        double dx = 10.0;
        double dy = 0.0;
        double result3 = dx / dy;
        System.out.println("10.0 / 0.0 = " + result3);  // Infinity
        
        // 문제 4-5: 단락 평가 활용
        System.out.println("\n=== 단락 평가 활용 ===");
        String str = null;
        // 올바른 방법: null 체크를 먼저
        boolean safe = str != null && str.length() > 0;
        System.out.println("안전한 null 체크: " + safe);
        
        // 문제 4-6: 연산자 우선순위 실수
        System.out.println("\n=== 연산자 우선순위 실수 ===");
        int val = 10;
        boolean wrong = val > 5 && val < 20 || val == 100;  // && 가 || 보다 우선
        boolean correct = (val > 5 && val < 20) || val == 100;  // 명확한 의도
        
        System.out.println("우선순위 혼동 가능: " + wrong);
        System.out.println("괄호로 명확히: " + correct);
        
        // 문제 4-7: 증감 연산자 부작용
        System.out.println("\n=== 증감 연산자 부작용 ===");
        int i = 5;
        int confusing = i++ + ++i + i++;  // 이런 코드는 피해야 함
        System.out.println("혼란스러운 표현식 결과: " + confusing);
        System.out.println("최종 i 값: " + i);
        
        // 문제 4-8: 비트 연산자와 논리 연산자 혼동
        System.out.println("\n=== 비트 vs 논리 연산자 ===");
        int p = 5;  // 0101
        int q = 3;  // 0011
        
        System.out.println("p & q = " + (p & q));    // 비트 AND: 1
        System.out.println("p && q 는 boolean 타입에만 사용 가능");
        
        // 문제 4-9: 문자열 연결 시 주의사항
        System.out.println("\n=== 문자열 연결 주의사항 ===");
        System.out.println("1 + 2 + \"3\" = " + (1 + 2 + "3"));    // "33"
        System.out.println("\"1\" + 2 + 3 = " + ("1" + 2 + 3));    // "123"
        
        // 문제 4-10: 형변환의 우선순위
        System.out.println("\n=== 형변환 우선순위 ===");
        int n1 = 10;
        int n2 = 3;
        double wrong2 = (double) (n1 / n2);  // 정수 나눗셈 후 형변환
        double right = (double) n1 / n2;     // 형변환 후 나눗셈
        
        System.out.println("잘못된 형변환: " + wrong2);  // 3.0
        System.out.println("올바른 형변환: " + right);   // 3.333...
    }
}