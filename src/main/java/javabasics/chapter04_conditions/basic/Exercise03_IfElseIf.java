package main.java.javabasics.chapter04_conditions.basic;

/**
 * <h3>🎯 문제명: 학점 계산기 - 나의 성적은 무엇일까?</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 이번에는 여러 개의 조건을 순차적으로 검사하는 <b>if-else if-else문</b>을 배워볼 거예요! 🎓<br>
 * 주어진 점수에 따라 학점(A, B, C, D, F)을 부여하는 프로그램을 만들어 볼게요.<br><br>
 * 
 * 이 구조는 "만약 ~라면... 아니면 만약 ~라면... 아니면..."처럼<br>
 * 여러 가지 경우를 순서대로 확인해야 할 때 사용해요! 🤔
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ <b>if-else if-else</b> 구문의 기본 구조 이해하기</li>
 *     <li>✅ 여러 조건을 <b>순차적으로</b> 검사하는 방법 배우기</li>
 *     <li>✅ 점수 범위로 학점 결정하기</li>
 *   </ul>
 * 
 * 
 * <h3>📊 학점 기준표</h3>
 * <table border="1">
 *   <tr>
 *     <th>점수 범위</th>
 *     <th>학점</th>
 *     <th>이모지</th>
 *   </tr>
 *   <tr>
 *     <td>90점 이상</td>
 *     <td><b>A</b></td>
 *     <td>🎆</td>
 *   </tr>
 *   <tr>
 *     <td>80점 이상 ~ 90점 미만</td>
 *     <td><b>B</b></td>
 *     <td>😊</td>
 *   </tr>
 *   <tr>
 *     <td>70점 이상 ~ 80점 미만</td>
 *     <td><b>C</b></td>
 *     <td>🙂</td>
 *   </tr>
 *   <tr>
 *     <td>60점 이상 ~ 70점 미만</td>
 *     <td><b>D</b></td>
 *     <td>😐</td>
 *   </tr>
 *   <tr>
 *     <td>60점 미만</td>
 *     <td><b>F</b></td>
 *     <td>😟</td>
 *   </tr>
 * </table>
 * 
 * <h3>📚 if-else if-else 구조</h3>
 * 
 *   <pre>
 *   if (조건 1) {
 *       // 조건 1이 참일 때 실행
 *   } else if (조건 2) {
 *       // 조건 1이 거짓이고 조건 2가 참일 때 실행
 *   } else if (조건 3) {
 *       // 조건 1, 2가 거짓이고 조건 3이 참일 때 실행
 *   } else {
 *       // 모든 조건이 거짓일 때 실행
 *   }
 *   </pre>
 * 
 * 
 * <h3>💡 따라하기 쉬운 단계</h3>
 * 
 *   <ol>
 *     <li><b>90점 이상 검사:</b> <code>if (score >= 90)</code></li>
 *     <li><b>80점 이상 검사:</b> <code>else if (score >= 80)</code></li>
 *     <li><b>70점 이상 검사:</b> <code>else if (score >= 70)</code></li>
 *     <li><b>60점 이상 검사:</b> <code>else if (score >= 60)</code></li>
 *     <li><b>그 외의 경우:</b> <code>else</code></li>
 *   </ol>
 *   <p>
 *   👉 <b>중요:</b> 반드시 <span>높은 점수부터</span> 검사해야 해요!
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
 *       <td><pre>if (score >= 60) {
  grade = "D";
} else if (score >= 90) {
  grade = "A";
}</pre></td>
 *       <td><pre>if (score >= 90) {
  grade = "A";
} else if (score >= 60) {
  grade = "D";
}</pre></td>
 *       <td>낮은 점수를 먼저 검사하면<br>90점도 D가 되어버려요!</td>
 *     </tr>
 *   </table>
 * 
 * 
 * <h3>🎮 도전 과제</h3>
 * <p>아래 TODO 부분에 학점 계산 코드를 작성해보세요!</p>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise03_IfElseIf {
    public static void main(String[] args) {
        int score = 85;
        String grade;
        
        /**
         * 🧑‍💻 여기에 코드를 작성하세요!
         * 
         * 📝 작성할 내용:
         * 1️⃣ 90점 이상 → grade = "A"
         * 2️⃣ 80점 이상 → grade = "B"
         * 3️⃣ 70점 이상 → grade = "C"
         * 4️⃣ 60점 이상 → grade = "D"
         * 5️⃣ 그 외 → grade = "F"
         * 
         * 💡 힌트: 높은 점수부터 검사하세요!
         */
        
        // TODO: 여기에 if-else if-else 문을 작성하세요
        
        
        
        
        
        
        /**
         * 🖥️ 결과 확인하기
         */
        System.out.println("점수: " + score);
        System.out.println("학점: " + grade);
        
        /**
         * 📋 예상 결과
         * ┌─────────────────┐
         * │ 점수: 85        │
         * │ 학점: B         │
         * └─────────────────┘
         * 
         * 💡 추가 연습하기:
         * - score를 95, 77, 65, 55 등으로 바꿔서 테스트해보세요
         * - 경계값(90, 80, 70, 60)도 테스트해보세요
         * - +, - 등급도 추가해보세요 (예: 95점 이상 A+)
         */
    }
}