package main.java.javabasics.chapter02_operators.basic;

/**
 * <h3>🎯 문제명: 비교하기의 달인 되기!</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 안녕하세요! 오늘은 두 가지를 <b>비교</b>하는 방법을 배워볼 거예요! 🤔<br>
 * 우리가 일상에서 "이게 더 크네", "둘이 같네" 하고 비교하는 것처럼,<br>
 * Java에서도 숫자나 문자를 비교할 수 있어요!<br><br>
 * 
 * 예를 들어:<br>
 * - 내 점수가 80점보다 높은가? ✅<br>
 * - 두 비밀번호가 같은가? 🔐<br>
 * - 오늘이 금요일인가? 📅<br>
 * 이런 비교를 프로그램으로 만들어볼 거예요!
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ 6가지 비교 연산자 마스터하기 (<code>==</code>, <code>!=</code>, <code>></code>, <code><</code>, <code>>=</code>, <code><=</code>)</li>
 *     <li>✅ <b>true</b>와 <b>false</b> 이해하기</li>
 *     <li>✅ 숫자, 문자 비교하는 방법 배우기</li>
 *     <li>✅ 여러 조건을 합쳐서 사용하기</li>
 *   </ul>
 * 
 * 
 * <h3>📝 기초 개념</h3>
 * <table border="1">
 *   <tr>
 *     <th>연산자</th>
 *     <th>읽는 법</th>
 *     <th>쉬운 설명</th>
 *     <th>예시</th>
 *   </tr>
 *   <tr>
 *     <td><code>==</code></td>
 *     <td>같다</td>
 *     <td>두 값이 똑같은지 확인</td>
 *     <td><code>5 == 5</code> → true</td>
 *   </tr>
 *   <tr>
 *     <td><code>!=</code></td>
 *     <td>다르다</td>
 *     <td>두 값이 다른지 확인</td>
 *     <td><code>5 != 3</code> → true</td>
 *   </tr>
 *   <tr>
 *     <td><code>></code></td>
 *     <td>크다</td>
 *     <td>왼쪽이 오른쪽보다 큰지</td>
 *     <td><code>10 > 5</code> → true</td>
 *   </tr>
 *   <tr>
 *     <td><code><</code></td>
 *     <td>작다</td>
 *     <td>왼쪽이 오른쪽보다 작은지</td>
 *     <td><code>3 < 7</code> → true</td>
 *   </tr>
 *   <tr>
 *     <td><code>>=</code></td>
 *     <td>크거나 같다</td>
 *     <td>왼쪽이 오른쪽보다 크거나 같은지</td>
 *     <td><code>5 >= 5</code> → true</td>
 *   </tr>
 *   <tr>
 *     <td><code><=</code></td>
 *     <td>작거나 같다</td>
 *     <td>왼쪽이 오른쪽보다 작거나 같은지</td>
 *     <td><code>3 <= 5</code> → true</td>
 *   </tr>
 * </table>
 * 
 * <h3>💡 따라하기 쉬운 단계</h3>
 * 
 *   <ol>
 *     <li><b>변수 만들기:</b> 비교할 숫자들을 준비하세요</li>
 *     <li><b>비교하기:</b> 연산자를 사용해서 비교하세요</li>
 *     <li><b>결과 확인:</b> true 또는 false가 나와요</li>
 *     <li><b>활용하기:</b> 조건문에서 사용할 수 있어요!</li>
 *   </ol>
 *   <p>
 *   👉 <b>기억하세요:</b> 비교의 결과는 항상 <code>true</code> 또는 <code>false</code>예요!
 *   </p>
 * 
 * 
 * <h3>⚠️ 초보자가 자주하는 실수</h3>
 * 
 *   <table>
 *     <tr>
 *       <th>❌ 잘못된 예</th>
 *       <th>✅ 올바른 예</th>
 *       <th>💭 설명</th>
 *     </tr>
 *     <tr>
 *       <td><code>5 = 5</code></td>
 *       <td><code>5 == 5</code></td>
 *       <td>비교할 때는 == 두 개!</td>
 *     </tr>
 *     <tr>
 *       <td><code>5 =< 10</code></td>
 *       <td><code>5 <= 10</code></td>
 *       <td>작거나 같다는 <=</td>
 *     </tr>
 *     <tr>
 *       <td><code>"hello" == "hello"</code></td>
 *       <td><code>"hello".equals("hello")</code></td>
 *       <td>문자열은 equals()로!</td>
 *     </tr>
 *   </table>
 * 
 * 
 * <h3>🎮 도전 과제</h3>
 * <p>아래 TODO 부분에 코드를 작성해보세요!</p>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise02_RelationalOperators {
    public static void main(String[] args) {
        /**
         * 🧑‍💻 여기에 코드를 작성하세요!
         * 
         * 📝 작성 방법:
         * 1️⃣ 비교할 숫자들을 변수에 저장하세요
         * 2️⃣ 각 비교 연산자로 비교해보세요
         * 3️⃣ 결과를 출력해서 true/false를 확인하세요
         */
        
        // 🎯 단계 1: 정수 값 비교하기
        System.out.println("=== 🔢 정수 비교하기 ===");
        
        // TODO: 세 개의 정수 변수를 선언하세요
        // int num1 = 10;  // 첫 번째 숫자
        // int num2 = 20;  // 두 번째 숫자 (다른 값)
        // int num3 = 10;  // 세 번째 숫자 (num1과 같은 값)
        
        // TODO: 여러 가지 비교 연산자를 사용하여 비교 결과를 출력하세요
        // System.out.println("num1 == num2 : " + (여기에 비교 연산));
        // System.out.println("num1 == num3 : " + ???);
        // System.out.println("num1 != num2 : " + ???);
        // System.out.println("num1 > num2 : " + ???);
        // System.out.println("num1 < num2 : " + ???);
        // System.out.println("num1 >= num3 : " + ???);
        // System.out.println("num2 <= num3 : " + ???);
        
        
        // 🎯 단계 2: 문자(char) 비교하기
        System.out.println("\n=== 🔤 문자 비교하기 ===");
        /**
         * 💡 문자 비교의 비밀:
         * 컴퓨터는 문자를 숫자로 저장해요!
         * 'A' = 65, 'B' = 66, 'a' = 97
         * 그래서 'A' < 'B' < 'a' 순서예요!
         */
        
        // TODO: 세 개의 문자 변수를 선언하세요
        // char ch1 = 'A';  // 대문자 A (ASCII: 65)
        // char ch2 = 'B';  // 대문자 B (ASCII: 66)
        // char ch3 = 'a';  // 소문자 a (ASCII: 97)
        
        // TODO: 문자들을 비교하여 결과를 출력하세요
        // System.out.println("\nch1 < ch2 : " + ???);
        // System.out.println("ch1 < ch3 : " + ???);
        // System.out.println("ch2 == 'B' : " + ???);
        
        
        // 🎯 단계 3: 실수(double) 비교하기
        System.out.println("\n=== 🔢 실수 비교하기 ===");
        /**
         * 💡 실수 비교 팁:
         * 10.5와 10.50은 같은 값이에요!
         * 소수점 아래 숫자도 정확히 비교해요
         */
        
        // TODO: 세 개의 실수 변수를 선언하세요
        // double d1 = 10.5;   // 10.5
        // double d2 = 10.50;  // 10.50 (수학적으로 10.5와 동일)
        // double d3 = 10.51;  // 10.51
        
        // TODO: 실수들을 비교하여 결과를 출력하세요
        // System.out.println("\nd1 == d2 : " + ???);
        // System.out.println("d1 < d3 : " + ???);
        
        
        // 🎯 단계 4: 실전 예제 - 시험 점수 확인하기
        System.out.println("\n=== 📝 성적 확인하기 ===");
        /**
         * 💡 실제 활용 예시:
         * 시험 점수를 확인해서 학점을 매기는 프로그램!
         * 90점 이상 = A, 80점 이상 = B, 70점 이상 = C
         */
        
        // TODO: 학생의 시험 점수 변수를 선언하세요 (85점으로 설정)
        // int score = 85;
        
        // TODO: 점수가 기준을 넘는지 확인하는 비교 연산을 완성하세요
        // System.out.println("\n점수가 90점 이상인가? " + ???);
        // System.out.println("점수가 80점 이상인가? " + ???);
        // System.out.println("점수가 70점과 90점 사이인가? " + (??? && ???));
        
        /**
         * 📋 예상 결과
         * ┌─────────────────────────────────┐
         * │ === 🔢 정수 비교하기 ===         │
         * │ num1 == num2 : false           │
         * │ num1 == num3 : true            │
         * │ num1 != num2 : true            │
         * │ num1 > num2 : false            │
         * │ num1 < num2 : true             │
         * │ num1 >= num3 : true            │
         * │ num2 <= num3 : false           │
         * │                                │
         * │ === 🔤 문자 비교하기 ===         │
         * │ ch1 < ch2 : true               │
         * │ ch1 < ch3 : true               │
         * │ ch2 == 'B' : true              │
         * │                                │
         * │ === 🔢 실수 비교하기 ===         │
         * │ d1 == d2 : true                │
         * │ d1 < d3 : true                 │
         * │                                │
         * │ === 📝 성적 확인하기 ===         │
         * │ 점수가 90점 이상인가? false      │
         * │ 점수가 80점 이상인가? true       │
         * │ 점수가 70점과 90점 사이인가? true │
         * └─────────────────────────────────┘
         * 
         * 💡 추가 연습하기:
         * - 다른 점수로도 테스트해보세요
         * - 60점 미만은 F학점 조건도 만들어보세요
         * - 여러 조건을 합쳐서 복잡한 조건도 만들어보세요!
         */
    }
}