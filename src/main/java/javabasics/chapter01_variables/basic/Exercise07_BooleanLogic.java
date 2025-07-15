package javabasics.chapter01_variables.basic;

/**
 * <h2>Chapter 1: 변수와 데이터 타입</h2>
 * <h3>문제 7: 논리형 타입과 논리 연산 (Boolean Type and Logic)</h3>
 * 
 * <p><strong>목표:</strong> <code>boolean</code> 타입과 논리 연산을 이해합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * <div style="border: 2px solid #009688; border-radius: 8px; padding: 15px; background-color: #e0f2f1;">
 *   <h5>boolean 타입</h5>
 *   <ul>
 *     <li>오직 <code>true</code> 또는 <code>false</code> 두 가지 값만 가능</li>
 *     <li>조건문과 반복문에서 주로 사용</li>
 *     <li>다른 타입으로 변환 불가</li>
 *   </ul>
 *   
 *   <h5>비교 연산자</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #b2dfdb;">
 *       <th>연산자</th>
 *       <th>의미</th>
 *       <th>예시</th>
 *     </tr>
 *     <tr>
 *       <td><code>==</code></td>
 *       <td>같다</td>
 *       <td><code>a == b</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>!=</code></td>
 *       <td>같지 않다</td>
 *       <td><code>a != b</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>&gt;</code></td>
 *       <td>크다</td>
 *       <td><code>a &gt; b</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>&gt;=</code></td>
 *       <td>크거나 같다</td>
 *       <td><code>a &gt;= b</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>&lt;</code></td>
 *       <td>작다</td>
 *       <td><code>a &lt; b</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>&lt;=</code></td>
 *       <td>작거나 같다</td>
 *       <td><code>a &lt;= b</code></td>
 *     </tr>
 *   </table>
 *   
 *   <h5>논리 연산자</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #b2dfdb;">
 *       <th>연산자</th>
 *       <th>의미</th>
 *       <th>설명</th>
 *     </tr>
 *     <tr>
 *       <td><code>&amp;&amp;</code></td>
 *       <td>AND</td>
 *       <td>둘 다 true일 때만 true</td>
 *     </tr>
 *     <tr>
 *       <td><code>||</code></td>
 *       <td>OR</td>
 *       <td>하나라도 true면 true</td>
 *     </tr>
 *     <tr>
 *       <td><code>!</code></td>
 *       <td>NOT</td>
 *       <td>true는 false로, false는 true로</td>
 *     </tr>
 *   </table>
 * </div>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>다양한 값으로 <code>boolean</code> 변수를 선언하세요</li>
 *   <li>비교 연산자를 사용하여 <code>boolean</code> 값을 생성하세요</li>
 *   <li>논리 연산자(<code>&amp;&amp;</code>, <code>||</code>, <code>!</code>)로 <code>boolean</code>을 조합하세요</li>
 * </ol>
 * 
 * <h4>힌트:</h4>
 * <ul>
 *   <li><code>boolean</code>은 오직 <code>true</code> 또는 <code>false</code>만 가능</li>
 *   <li>비교 연산의 결과는 항상 <code>boolean</code></li>
 * </ul>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise07_BooleanLogic {
    public static void main(String[] args) {
        // TODO: Declare direct boolean values
        // boolean isJavaFun = true;
        // boolean isHard = false;
        
        // TODO: Create booleans from comparisons
        // int age = 20;
        // boolean isAdult = age >= 18;
        // boolean isTeen = age >= 13 && age <= 19;
        
        // TODO: Use logical operators
        // boolean canVote = isAdult && !isCriminal;
        // boolean needPermission = !isAdult || isRestricted;
        
        // TODO: Test boolean expressions
        // int score = 85;
        // boolean passed = score >= 60;
        // boolean excellent = score >= 90;
        // boolean goodGrade = passed && !excellent;
        
        // Print results
        // System.out.println("Is Java fun? " + isJavaFun);
        // System.out.println("Is adult? " + isAdult);
        // System.out.println("Is teen? " + isTeen);
        // System.out.println("Passed? " + passed);
        // System.out.println("Good grade? " + goodGrade);
        
        // Expected output:
        // Is Java fun? true
        // Is adult? true
        // Is teen? false
        // Passed? true
        // Good grade? true
    }
}