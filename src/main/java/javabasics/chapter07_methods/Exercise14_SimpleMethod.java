package main.java.javabasics.chapter07_methods;

/**
 * <h3>🎯 문제명: 나만의 계산기 만들기 - 메서드!</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 지금까지는 모든 코드를 main 메서드 안에 작성했죠? 🤔<br>
 * 만약 덧셈을 100번 해야 한다면... 같은 코드를 100번 쓸까요? 😱<br><br>
 * 
 * 이제 <b>메서드(Method)</b>를 배워볼 거예요! 🎉<br>
 * 메서드는 <b>자주 사용하는 기능을 따로 만들어두는 것</b>이에요.<br>
 * 마치 전자레인지의 "1분 돌리기" 버튼처럼요! 🍕
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ 메서드가 무엇인지 이해하기</li>
 *     <li>✅ 간단한 메서드 만들기</li>
 *     <li>✅ 메서드 호출하고 결과 받기</li>
 *   </ul>
 * 
 * 
 * <h3>📝 메서드의 구조</h3>
 * 
 *   <pre>
 *   public static int add(int a, int b) {
 *   ──────────── ─── ─── ──────────────
 *        ①        ②   ③       ④
 *   
 *       return a + b;  // ⑤ 결과 돌려주기
 *   }
 *   
 *   ① 공개 설정 (지금은 그냥 쓰세요)
 *   ② 결과 타입 (int = 정수를 돌려줌)
 *   ③ 메서드 이름 (우리가 정함)
 *   ④ 받을 값들 (재료)
 *   ⑤ 계산 결과 반환
 *   </pre>
 * 
 * 
 * <h3>🍕 메서드를 요리 레시피로 생각해보세요!</h3>
 * <table border="1">
 *   <tr>
 *     <th>요리</th>
 *     <th>프로그래밍</th>
 *   </tr>
 *   <tr>
 *     <td>레시피 이름: 라면 끓이기</td>
 *     <td>메서드 이름: add</td>
 *   </tr>
 *   <tr>
 *     <td>재료: 라면, 물</td>
 *     <td>매개변수: int a, int b</td>
 *   </tr>
 *   <tr>
 *     <td>요리 과정</td>
 *     <td>메서드 본문 { }</td>
 *   </tr>
 *   <tr>
 *     <td>완성된 라면</td>
 *     <td>return 결과값</td>
 *   </tr>
 * </table>
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
 *       <td><code>public static add(int a, int b)</code></td>
 *       <td><code>public static int add(int a, int b)</code></td>
 *       <td>반환 타입을 써주세요!</td>
 *     </tr>
 *     <tr>
 *       <td><code>return a + b</code></td>
 *       <td><code>return a + b;</code></td>
 *       <td>세미콜론 잊지 마세요!</td>
 *     </tr>
 *     <tr>
 *       <td><code>add(5, 3);</code></td>
 *       <td><code>int result = add(5, 3);</code></td>
 *       <td>결과를 변수에 저장!</td>
 *     </tr>
 *   </table>
 * 
 * 
 * <h3>🎮 도전 과제</h3>
 * <p>두 숫자를 받아서 더한 결과를 돌려주는 add 메서드를 만들어보세요!</p>
 */
public class Exercise14_SimpleMethod {
    /**
     * 🧑‍💻 여기에 add 메서드를 작성하세요!
     * 
     * 📝 작성 방법:
     * public static int add(int a, int b) {
     *     return a + b;
     * }
     */
    
    // TODO: 여기에 add 메서드를 작성하세요
    // 힌트: public static int add(int a, int b)로 시작하세요
    // 힌트: 메서드 안에서 a + b의 결과를 return하세요
    
    
    
    
    public static void main(String[] args) {
        /**
         * 🖥️ 메서드 사용하기 (호출하기)
         * 이제 우리가 만든 add 메서드를 사용해볼게요!
         */
        
        // 첫 번째 덧셈: 5 + 3
        int result = add(5, 3);  // 🔥 add 메서드 호출!
        System.out.println("5 + 3 = " + result);
        
        // 두 번째 덧셈: 10 + 20
        result = add(10, 20);  // 🔥 같은 메서드를 또 사용!
        System.out.println("10 + 20 = " + result);
        
        /**
         * 📋 예상 결과
         * ┌─────────────────────────┐
         * │ 5 + 3 = 8               │
         * │ 10 + 20 = 30            │
         * └─────────────────────────┘
         * 
         * 💡 메서드의 장점:
         * - 같은 기능을 여러 번 사용 가능
         * - 코드를 깔끔하게 정리
         * - 수정이 필요하면 한 곳만 고치면 됨
         * 
         * 🚀 추가 연습:
         * - subtract 메서드 만들기 (빼기)
         * - multiply 메서드 만들기 (곱하기)
         * - isEven 메서드 만들기 (짝수 판별)
         */
    }
}