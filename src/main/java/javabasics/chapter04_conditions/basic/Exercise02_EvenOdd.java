package main.java.javabasics.chapter04_conditions.basic;

/**
 * <h3>🎯 문제명: 짝수? 홀수? - 숫자의 비밀 풀어보기!</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 이번에는 숫자가 <b>짝수</b>인지 <b>홀수</b>인지 판별하는 프로그램을 만들어 볼 거예요! 🤔<br>
 * 짝수는 2로 나누어 떨어지는 수(2, 4, 6, 8...)이고,<br>
 * 홀수는 2로 나누면 나머지가 1이 남는 수(1, 3, 5, 7...)예요!<br><br>
 * 
 * 여기서는 <b>if-else문</b>을 사용해서 "만약 ~라면... 아니면..."의 로직을 구현해 볼 거예요! 🎉
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ <b>if-else문</b>의 기본 구조 이해하기</li>
 *     <li>✅ <b>나머지 연산자(%)</b> 사용법 배우기</li>
 *     <li>✅ 조건에 따라 다른 메시지 출력하기</li>
 *   </ul>
 * 
 * 
 * <h3>📝 기초 개념</h3>
 * <table border="1">
 *   <tr>
 *     <th>용어</th>
 *     <th>쉬운 설명</th>
 *     <th>예시</th>
 *   </tr>
 *   <tr>
 *     <td><code>%</code></td>
 *     <td>나머지를 구하는 연산자</td>
 *     <td><code>7 % 2 = 1</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>짝수</code></td>
 *     <td>2로 나누어 떨어지는 수</td>
 *     <td><code>2, 4, 6, 8...</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>홀수</code></td>
 *     <td>2로 나누면 1이 남는 수</td>
 *     <td><code>1, 3, 5, 7...</code></td>
 *   </tr>
 * </table>
 * 
 * <h3>💡 나머지 연산자(%) 이해하기</h3>
 * 
 *   <table border="1">
 *     <tr>
 *       <th>계산식</th>
 *       <th>결과</th>
 *       <th>설명</th>
 *     </tr>
 *     <tr>
 *       <td><code>8 % 2</code></td>
 *       <td><code>0</code></td>
 *       <td>8 ÷ 2 = 4, 나머지 0 → 짝수! ✅</td>
 *     </tr>
 *     <tr>
 *       <td><code>7 % 2</code></td>
 *       <td><code>1</code></td>
 *       <td>7 ÷ 2 = 3, 나머지 1 → 홀수! 🔢</td>
 *     </tr>
 *     <tr>
 *       <td><code>15 % 3</code></td>
 *       <td><code>0</code></td>
 *       <td>15 ÷ 3 = 5, 나머지 0</td>
 *     </tr>
 *   </table>
 * 
 * 
 * <h3>📚 if-else문 구조</h3>
 * 
 *   <pre>
 *   if (조건식) {
 *       // 조건이 참(true)일 때 실행할 코드
 *   } else {
 *       // 조건이 거짓(false)일 때 실행할 코드
 *   }
 *   </pre>
 *   <p>
 *   👉 <b>예시:</b> "비가 오면 우산을 쓰고, 안 오면 선글라스를 쓴다"
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
 *       <td><code>if (number / 2 == 0)</code></td>
 *       <td><code>if (number % 2 == 0)</code></td>
 *       <td>나눐셈(/)์ด 아니라 나머지(%)!</td>
 *     </tr>
 *     <tr>
 *       <td><code>if (number % 2 = 0)</code></td>
 *       <td><code>if (number % 2 == 0)</code></td>
 *       <td>비교는 ==, 대입은 =!</td>
 *     </tr>
 *   </table>
 * 
 * 
 * <h3>🎮 도전 과제</h3>
 * <p>아래 TODO 부분에 짝수/홀수 판별 조건을 완성해보세요!</p>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise02_EvenOdd {
    public static void main(String[] args) {
        int number = 7;
        
        /**
         * 🧑‍💻 여기에 코드를 작성하세요!
         * 
         * 📝 작성할 내용:
         * - number를 2로 나눈 나머지가 0인지 확인
         * - 짝수면 "짝수입니다" 출력
         * - 홀수면 "홀수입니다" 출력
         * 
         * 💡 힌트: number % 2 == 0
         */
        
        // TODO: if 괄호 안에 짝수 판별 조건을 작성하세요
        if (/* 여기에 조건을 작성하세요 */) {
            System.out.println(number + "은(는) 짝수입니다");
        } else {
            System.out.println(number + "은(는) 홀수입니다");
        }
        
        /**
         * 🖥️ 결과 확인하기
         */
        
        /**
         * 📋 예상 결과
         * ┌─────────────────┐
         * │ 7은(는) 홀수입니다 │
         * └─────────────────┘
         * 
         * 💡 추가 연습하기:
         * - number 값을 8, 10, 15 등으로 바꿔서 테스트해보세요
         * - 3의 배수 판별: number % 3 == 0
         * - 5의 배수 판별: number % 5 == 0
         * - 10의 배수 판별: number % 10 == 0
         * 
         * 🎆 재미있는 응용:
         * - 주사위 눈 구하기: (int)(Math.random() * 6) + 1
         * - 요일 구하기: dayNumber % 7
         */
    }
}