package main.java.javabasics.chapter01_variables.basic;

/**
 * 🎯 문제명: 나의 첫 번째 변수 만들기!
 * 
 * <h3>📋 문제 설명</h3>
 * 안녕하세요! Java 프로그래밍의 첫 걸음을 축하합니다! 🎉<br>
 * 이번 문제에서는 <b>변수(variable)</b>라는 것을 만들어볼 거예요.
 * <p>
 * 변수를 <b>상자</b>라고 생각해보세요! 📦<br>
 * 이 상자에는 우리가 원하는 값을 넣어두고, 필요할 때마다 꺼내 쓸 수 있어요.<br>
 * 지금은 나이를 담을 상자를 만들어 볼까요?
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * <ul>
 *   <li>✅ <b>변수</b>가 무엇인지 이해하기</li>
 *   <li>✅ <b>int</b> 타입으로 정수 저장하기</li>
 *   <li>✅ 변수에 값을 넣는 방법 배우기</li>
 * </ul>
 * 
 * <h3>📝 기초 개념</h3>
 * <table border="1">
 *   <tr>
 *     <th>용어</th>
 *     <th>쉬운 설명</th>
 *     <th>예시</th>
 *   </tr>
 *   <tr>
 *     <td><code>int</code></td>
 *     <td>정수(소수점 없는 숫자)를 담는 상자 종류</td>
 *     <td><code>10, -5, 0, 2024</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>변수명</code></td>
 *     <td>상자에 붙이는 이름표</td>
 *     <td><code>age, score, year</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>=</code></td>
 *     <td>상자에 값을 넣는다는 뜻</td>
 *     <td><code>age = 25</code></td>
 *   </tr>
 * </table>
 * 
 * <h3>💡 따라하기 쉬운 단계</h3>
 * <ol>
 *   <li><b>상자 종류 정하기:</b> <code>int</code> 라고 쓰세요</li>
 *   <li><b>이름표 붙이기:</b> <code>age</code> 라고 쓰세요</li>
 *   <li><b>값 넣기:</b> <code>= 25</code> 라고 쓰세요</li>
 *   <li><b>마침표 찍기:</b> <code>;</code> (세미콜론)으로 끝내세요</li>
 * </ol>
 * <p>
 * 👉 <b>완성:</b> <code>int age = 25;</code>
 * </p>
 * 
 * <h3>⚠️ 초보자가 자주하는 실수</h3>
 * <table border="1">
 *   <tr>
 *     <th>❌ 잘못된 예</th>
 *     <th>✅ 올바른 예</th>
 *     <th>💭 설명</th>
 *   </tr>
 *     <tr>
 *       <td><code>int age = 25</code></td>
 *       <td><code>int age = 25;</code></td>
 *       <td>세미콜론(;)을 꼭 붙여주세요!</td>
 *     </tr>
 *     <tr>
 *       <td><code>Int age = 25;</code></td>
 *       <td><code>int age = 25;</code></td>
 *       <td>int는 소문자로 써야 해요!</td>
 *     </tr>
 *     <tr>
 *       <td><code>int Age = 25;</code></td>
 *       <td><code>int age = 25;</code></td>
 *       <td>변수명은 소문자로 시작해요!</td>
 *     </tr>
 *   </table>
 * 
 * <h3>🎮 도전 과제</h3>
 * 아래 TODO 부분에 코드를 작성해보세요!
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise01_IntegerVariable {
    public static void main(String[] args) {
        /**
         * 🧑‍💻 여기에 코드를 작성하세요!
         * 
         * 📝 작성 방법:
         * 1️⃣ int     (정수를 담을 상자 종류)
         * 2️⃣ age     (상자 이름)
         * 3️⃣ =       (넣는다)
         * 4️⃣ 25      (나이 값)
         * 5️⃣ ;       (문장 끝!)
         */
        
        // TODO: 여기에 int 타입의 age 변수를 선언하고 25를 저장하세요.

        
        /**
         * 🖥️ 결과 확인하기
         * 아래 코드가 여러분이 만든 변수를 화면에 출력해줄 거예요!
         */
        System.out.println("나이: " + age);
        
        /**
         * 📋 예상 결과
         * ┌─────────────────┐
         * │ 나이: 25        │
         * └─────────────────┘
         * 
         * 💡 추가 연습하기:
         * - age 값을 30으로 바꿔보세요
         * - year라는 변수를 만들어 2024를 넣어보세요
         * - score라는 변수를 만들어 100을 넣어보세요
         */
    }
}