package main.java.javabasics.chapter04_conditions.basic;

/**
 * <h3>Chapter 4 - 조건문</h3>
 * <h3>문제 5: 논리 연산자와 조건문 (Logical Operators)</h3>
 * 
 * <h3>📚 학습 목표</h3>
 * <ul>
 *   <li>&&(AND), ||(OR) 논리 연산자를 조건문에서 사용하는 방법을 학습합니다</li>
 *   <li>복수의 조건을 효율적으로 결합하는 방법을 이해합니다</li>
 *   <li>논리 연산자의 우선순위와 평가 순서를 파악합니다</li>
 * </ul>
 * 
 * <h3>📝 문제 설명</h3>
 * <p>날씨 정보를 바탕으로 외출 시 준비사항을 판단하는 프로그램을 작성합니다.</p>
 * <p>다음 두 가지를 판단해야 합니다:</p>
 * <ol>
 *   <li><b>좋은 날씨 여부</b>: 온도가 적절한 범위(20~30도)에 있는지 확인</li>
 *   <li><b>우산 필요 여부</b>: 비나 눈이 오는지 확인</li>
 * </ol>
 * 
 * <h3>🛠️ 구현 지시사항</h3>
 * <ol>
 *   <li>온도가 20도 이상 <b>그리고(AND)</b> 30도 이하이면 isNiceWeather를 true로 설정하세요</li>
 *   <li>비가 오거나 <b>또는(OR)</b> 눈이 오면 needUmbrella를 true로 설정하세요</li>
 *   <li>각 논리 연산자의 특성을 활용하여 조건문을 작성하세요</li>
 * </ol>
 * 
 * <h3>💡 코드 작성 힌트</h3>
 * <ul>
 *   <li><code>&&</code> (AND): 두 조건이 <b>모두</b> true일 때만 true</li>
 *   <li><code>||</code> (OR): 두 조건 중 <b>하나라도</b> true이면 true</li>
 *   <li>연산자 우선순위: 관계 연산자(>=, <=) → 논리 연산자(&&, ||)</li>
 * </ul>
 * 
 * <h3>📌 예제 코드 패턴</h3>
 * <pre>
 * // AND 연산자 사용 예
 * if (조건1 && 조건2) {
 *     // 두 조건 모두 참일 때 실행
 * }
 * 
 * // OR 연산자 사용 예
 * if (조건1 || 조건2) {
 *     // 둘 중 하나라도 참이면 실행
 * }
 * </pre>
 * 
 * <h3>⚡ 논리 연산자 진리표</h3>
 * <table border="1">
 *   <tr>
 *     <th>A</th><th>B</th><th>A && B</th><th>A || B</th>
 *   </tr>
 *   <tr>
 *     <td>true</td><td>true</td><td>true</td><td>true</td>
 *   </tr>
 *   <tr>
 *     <td>true</td><td>false</td><td>false</td><td>true</td>
 *   </tr>
 *   <tr>
 *     <td>false</td><td>true</td><td>false</td><td>true</td>
 *   </tr>
 *   <tr>
 *     <td>false</td><td>false</td><td>false</td><td>false</td>
 *   </tr>
 * </table>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise05_LogicalOperators {
    public static void main(String[] args) {
        int temperature = 25;
        boolean isRaining = false;
        boolean isSnowing = true;
        
        boolean isNiceWeather = false;
        boolean needUmbrella = false;
        
        // TODO: 논리 연산자를 사용하여 조건을 작성하세요
        // 1. isNiceWeather 설정 (온도가 20 이상 30 이하)
        
        
        
        // 2. needUmbrella 설정 (비가 오거나 눈이 올 때)
        
        
        
        // 아래 코드는 수정하지 마세요
        System.out.println("온도: " + temperature);
        System.out.println("좋은 날씨: " + isNiceWeather);
        System.out.println("비 내림: " + isRaining);
        System.out.println("눈 내림: " + isSnowing);
        System.out.println("우산 필요: " + needUmbrella);
        
        // 예상 출력:
        // 온도: 25
        // 좋은 날씨: true
        // 비 내림: false
        // 눈 내림: true
        // 우산 필요: true
    }
}