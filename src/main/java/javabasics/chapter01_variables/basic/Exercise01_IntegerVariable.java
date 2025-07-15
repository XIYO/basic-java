package javabasics.chapter01_variables.basic;

/**
 * <h1>🎯 문제명: 나의 첫 번째 변수 만들기!</h1>
 * 
 * <h2>📋 문제 설명</h2>
 * <p>
 * 안녕하세요! Java 프로그래밍의 첫 걸음을 축하합니다! 🎉<br>
 * 이번 문제에서는 <strong>변수(variable)</strong>라는 것을 만들어볼 거예요.<br><br>
 * 
 * 변수를 <strong>상자</strong>라고 생각해보세요! 📦<br>
 * 이 상자에는 우리가 원하는 값을 넣어두고, 필요할 때마다 꺼내 쓸 수 있어요.<br>
 * 지금은 나이를 담을 상자를 만들어 볼까요?
 * </p>
 * 
 * <h2>📌 학습 목표</h2>
 * <div style="background-color: #e6f3ff; padding: 10px; border-radius: 5px;">
 *   <ul>
 *     <li>✅ <strong>변수</strong>가 무엇인지 이해하기</li>
 *     <li>✅ <strong>int</strong> 타입으로 정수 저장하기</li>
 *     <li>✅ 변수에 값을 넣는 방법 배우기</li>
 *   </ul>
 * </div>
 * 
 * <h2>📝 기초 개념</h2>
 * <table border="1" style="border-collapse: collapse; margin: 10px;">
 *   <tr style="background-color: #f0f8ff;">
 *     <th style="padding: 10px;">용어</th>
 *     <th style="padding: 10px;">쉬운 설명</th>
 *     <th style="padding: 10px;">예시</th>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;"><code>int</code></td>
 *     <td style="padding: 10px;">정수(소수점 없는 숫자)를 담는 상자 종류</td>
 *     <td style="padding: 10px;"><code>10, -5, 0, 2024</code></td>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;"><code>변수명</code></td>
 *     <td style="padding: 10px;">상자에 붙이는 이름표</td>
 *     <td style="padding: 10px;"><code>age, score, year</code></td>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;"><code>=</code></td>
 *     <td style="padding: 10px;">상자에 값을 넣는다는 뜻</td>
 *     <td style="padding: 10px;"><code>age = 25</code></td>
 *   </tr>
 * </table>
 * 
 * <h2>💡 따라하기 쉬운 단계</h2>
 * <div style="background-color: #f0f8ff; padding: 15px; border-radius: 5px;">
 *   <ol>
 *     <li><strong>상자 종류 정하기:</strong> <code>int</code> 라고 쓰세요</li>
 *     <li><strong>이름표 붙이기:</strong> <code>age</code> 라고 쓰세요</li>
 *     <li><strong>값 넣기:</strong> <code>= 25</code> 라고 쓰세요</li>
 *     <li><strong>마침표 찍기:</strong> <code>;</code> (세미콜론)으로 끝내세요</li>
 *   </ol>
 *   <p style="margin-top: 10px;">
 *   👉 <strong>완성:</strong> <code style="background-color: #fffacd; padding: 2px;">int age = 25;</code>
 *   </p>
 * </div>
 * 
 * <h2>⚠️ 초보자가 자주하는 실수</h2>
 * <div style="background-color: #ffe4e1; padding: 10px; border-radius: 5px;">
 *   <table>
 *     <tr>
 *       <th>❌ 잘못된 예</th>
 *       <th>✅ 올바른 예</th>
 *       <th>💭 설명</th>
 *     </tr>
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
 * </div>
 * 
 * <h2>🎮 도전 과제</h2>
 * <p>아래 TODO 부분에 코드를 작성해보세요!</p>
 * 
 * @author Java 학습자
 * @version 1.0
 * @since 2024-01-01
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
        
        int age = 25;  // 🎉 축하해요! 첫 변수를 만들었어요!

        
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