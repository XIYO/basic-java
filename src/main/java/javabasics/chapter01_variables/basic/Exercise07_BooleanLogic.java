package main.java.javabasics.chapter01_variables.basic;

/**
 * <h3>Chapter 1: 변수와 데이터 타입</h3>
 * <h3>문제 7: 논리형 타입과 논리 연산 (Boolean Type and Logic)</h3>
 * 
 * <p><b>목표:</b> <code>boolean</code> 타입과 논리 연산을 이해합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * 
 *   <h5>boolean 타입</h5>
 *   <ul>
 *     <li>오직 <code>true</code> 또는 <code>false</code> 두 가지 값만 가능</li>
 *     <li>조건문과 반복문에서 주로 사용</li>
 *     <li>다른 타입으로 변환 불가</li>
 *   </ul>
 *   
 *   <h5>비교 연산자</h5>
 *   <table border="1" cellpadding="5">
 *     <tr>
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
 *     <tr>
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
 * 
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
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise07_BooleanLogic {
    public static void main(String[] args) {
        // TODO: 직접 boolean 값 선언하기
        // 여기에 isJavaFun에 true를, isHard에 false를 할당하는 코드를 작성하세요
        boolean isJavaFun = false; // TODO: true로 변경하세요
        boolean isHard = true; // TODO: false로 변경하세요
        
        // TODO: 비교 연산으로 boolean 값 만들기
        int age = 20;
        // 여기에 age가 18 이상인지 확인하는 isAdult 변수를 만드는 코드를 작성하세요
        boolean isAdult = false; // TODO: age >= 18로 변경하세요
        // 여기에 age가 13 이상 19 이하인지 확인하는 isTeen 변수를 만드는 코드를 작성하세요
        boolean isTeen = false; // TODO: age >= 13 && age <= 19로 변경하세요
        
        // TODO: 논리 연산자 사용하기
        boolean isCriminal = false; // 범죄자 여부
        boolean isRestricted = true; // 제한 여부
        // 여기에 성인이고 범죄자가 아니면 투표 가능한 canVote 변수를 만드는 코드를 작성하세요
        boolean canVote = false; // TODO: isAdult && !isCriminal로 변경하세요
        // 여기에 미성년자이거나 제한이 있으면 허가 필요한 needPermission 변수를 만드는 코드를 작성하세요
        boolean needPermission = false; // TODO: !isAdult || isRestricted로 변경하세요
        
        // TODO: boolean 표현식 테스트하기
        int score = 85;
        // 여기에 점수가 60 이상이면 통과를 나타내는 passed 변수를 만드는 코드를 작성하세요
        boolean passed = false; // TODO: score >= 60으로 변경하세요
        // 여기에 점수가 90 이상이면 우수를 나타내는 excellent 변수를 만드는 코드를 작성하세요
        boolean excellent = false; // TODO: score >= 90으로 변경하세요
        // 여기에 통과했지만 우수가 아니면 양호를 나타내는 goodGrade 변수를 만드는 코드를 작성하세요
        boolean goodGrade = false; // TODO: passed && !excellent로 변경하세요
        
        // 결과 출력
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is adult? " + isAdult);
        System.out.println("Is teen? " + isTeen);
        System.out.println("Passed? " + passed);
        System.out.println("Good grade? " + goodGrade);
        
        // Expected output:
        // Is Java fun? true
        // Is adult? true
        // Is teen? false
        // Passed? true
        // Good grade? true
    }
}