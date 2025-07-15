package javabasics.chapter01_variables.basic;

/**
 * <h2>Chapter 1 - 변수와 데이터 타입</h2>
 * <h3>문제 2: 여러 타입의 변수 선언</h3>
 * 
 * <p><strong>목표:</strong> 다양한 데이터 타입의 변수를 선언하고 초기화하는 방법을 학습합니다.</p>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li><code>score</code>라는 정수형 변수를 선언하고 <code>100</code>으로 초기화하세요</li>
 *   <li><code>price</code>라는 실수형 변수를 선언하고 <code>19.99</code>로 초기화하세요</li>
 *   <li><code>grade</code>라는 문자형 변수를 선언하고 <code>'A'</code>로 초기화하세요</li>
 *   <li><code>isPassed</code>라는 논리형 변수를 선언하고 <code>true</code>로 초기화하세요</li>
 * </ol>
 * 
 * <h4>힌트:</h4>
 * <ul>
 *   <li>정수: <code>int</code>, 실수: <code>double</code>, 문자: <code>char</code>, 논리값: <code>boolean</code></li>
 *   <li>문자는 작은따옴표(<code>''</code>)를 사용합니다</li>
 * </ul>
 * 
 * <h4>학습 내용:</h4>
 * <table border="1" cellpadding="5">
 *   <tr style="background-color: #f0f0f0;">
 *     <th>타입</th>
 *     <th>크기</th>
 *     <th>설명</th>
 *   </tr>
 *   <tr>
 *     <td><code>int</code></td>
 *     <td>32비트</td>
 *     <td>정수형 (약 ±21억 범위)</td>
 *   </tr>
 *   <tr>
 *     <td><code>double</code></td>
 *     <td>64비트</td>
 *     <td>실수형 (소수점 15~16자리 정밀도)</td>
 *   </tr>
 *   <tr>
 *     <td><code>char</code></td>
 *     <td>16비트</td>
 *     <td>문자형 (유니코드 문자 1개)</td>
 *   </tr>
 *   <tr>
 *     <td><code>boolean</code></td>
 *     <td>1비트</td>
 *     <td>논리형 (<code>true</code> 또는 <code>false</code>만 가능)</td>
 *   </tr>
 * </table>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise02_MultipleTypes {
    public static void main(String[] args) {
        /*
         * TODO: 아래 변수들을 선언하고 초기화하세요
         * 
         * 1. score - 정수 100을 저장
         *    예: int score = 100;
         * 
         * 2. price - 실수 19.99를 저장
         *    예: double price = 19.99;
         * 
         * 3. grade - 문자 'A'를 저장
         *    예: char grade = 'A';
         *    주의: 작은따옴표 사용!
         * 
         * 4. isPassed - 논리값 true를 저장
         *    예: boolean isPassed = true;
         */
        
        
        
        
        
        // 아래 코드는 수정하지 마세요
        System.out.println("점수: " + score);
        System.out.println("가격: " + price);
        System.out.println("학점: " + grade);
        System.out.println("합격 여부: " + isPassed);
        
        /*
         * 예상 출력:
         * 점수: 100
         * 가격: 19.99
         * 학점: A
         * 합격 여부: true
         * 
         * 주의사항:
         * - double 타입은 소수점을 그대로 사용 (f 붙이지 않음)
         * - char 타입은 반드시 작은따옴표 사용
         * - boolean은 true/false만 가능 (대소문자 구분)
         */
    }
}