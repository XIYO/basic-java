package main.java.javabasics.chapter05_loops.basic;

/**
 * <h3>🔄 문제명: while문으로 거꾸로 세기!</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 지금까지 <b>for문</b>을 배웠죠? 이번엔 <b>while문</b>을 배워볼게요! 🎆<br>
 * while문은 "언제까지 반복할지 모를 때" 사용해요.<br><br>
 * 
 * 예를 들어, "사탕이 다 떨어질 때까지 먹기" 같은 경우죠! 🍬<br>
 * 지금은 10부터 1까지 거꾸로 세어볼 거예요.<br>
 * 로켓 발사 카운트다운처럼요! 10, 9, 8... 🚀
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ <b>while문</b>의 기본 구조 이해하기</li>
 *     <li>✅ 조건식을 사용한 반복 제어</li>
 *     <li>✅ 무한 루프 방지하는 방법 익히기</li>
 *   </ul>
 * 
 * 
 * <h3>📝 기초 개념</h3>
 * <table border="1">
 *   <tr>
 *     <th>구성 요소</th>
 *     <th>쉬운 설명</th>
 *     <th>예시</th>
 *   </tr>
 *   <tr>
 *     <td><code>while문</code></td>
 *     <td>조건이 참일 동안 반복</td>
 *     <td><code>while(조건) { }</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>조건식</code></td>
 *     <td>참/거짓을 판단하는 식</td>
 *     <td><code>i >= 1</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>감소 연산</code></td>
 *     <td>1씩 빼기</td>
 *     <td><code>i--</code></td>
 *   </tr>
 * </table>
 * 
 * <h3>💡 따라하기 쉬운 단계</h3>
 * 
 *   <ol>
 *     <li><b>시작값 준비:</b> <code>int i = 10;</code> (10부터 시작)</li>
 *     <li><b>while문 작성:</b> <code>while(i >= 1)</code> (1 이상일 동안)</li>
 *     <li><b>중괄호 열기:</b> <code>{</code></li>
 *     <li><b>출력하기:</b> <code>System.out.println(i);</code></li>
 *     <li><b>감소시키기:</b> <code>i--;</code> ⚠️ 중요!</li>
 *     <li><b>중괄호 닫기:</b> <code>}</code></li>
 *   </ol>
 *   <p>
 *   👉 <b>전체 코드:</b>
 *   <pre>
 * int i = 10;
 * while(i >= 1) {
 *     System.out.println(i);
 *     i--;  // 이게 없으면 무한 루프!
 * }</pre>
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
 *       <td><code>while(i >= 1) {<br>&nbsp;&nbsp;println(i);<br>}</code></td>
 *       <td><code>while(i >= 1) {<br>&nbsp;&nbsp;println(i);<br>&nbsp;&nbsp;i--;<br>}</code></td>
 *       <td>i--를 빼먹으면 무한 루프! 😱</td>
 *     </tr>
 *     <tr>
 *       <td><code>while(int i = 10; i >= 1)</code></td>
 *       <td><code>int i = 10;<br>while(i >= 1)</code></td>
 *       <td>변수 선언은 while 밖에서!</td>
 *     </tr>
 *     <tr>
 *       <td><code>while(i <= 10)</code></td>
 *       <td><code>while(i >= 1)</code></td>
 *       <td>10부터 1까지니까 >= 사용!</td>
 *     </tr>
 *   </table>
 * 
 * 
 * <h3>🎮 도전 과제</h3>
 * <p>while문을 사용하여 10부터 1까지 거꾸로 출력하세요!</p>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise03_WhileLoop {
    public static void main(String[] args) {
        /**
         * 🧑‍💻 여기에 코드를 작성하세요!
         * 
         * 📝 작성 순서:
         * 1️⃣ int i = 10;     // 시작 숫자
         * 2️⃣ while(i >= 1) { // 1 이상일 동안
         * 3️⃣     System.out.println(i);
         * 4️⃣     i--;         // 꼭 필요!
         * 5️⃣ }
         */
        
        // TODO: 여기에 while문을 작성하세요
        
        
        
        /**
         * 📋 예상 결과
         * ┌─────────────────┐
         * │ 10              │
         * │ 9               │
         * │ 8               │
         * │ 7               │
         * │ 6               │
         * │ 5               │
         * │ 4               │
         * │ 3               │
         * │ 2               │
         * │ 1               │
         * └─────────────────┘
         * 
         * 💡 추가 연습하기:
         * - 20부터 1까지 출력해보세요
         * - 짝수만 출력해보세요 (힌트: if문 사용)
         * - 2씩 감소하며 출력해보세요 (i -= 2)
         */
    }
}