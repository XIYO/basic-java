package main.java.javabasics.chapter04_conditions.basic;

/**
 * <h3>🎯 문제명: 나의 첫 번째 if문 - 투표 가능 나이 확인하기!</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 안녕하세요! 오늘은 프로그래밍의 핵심인 <b>조건문</b>을 배워볼 거예요! 🎉<br>
 * 조건문은 컴퓨터가 <b>판단</b>을 할 수 있게 해주는 마법 같은 도구예요.<br><br>
 * 
 * 이번 문제에서는 투표 가능한 나이인지 확인하는 프로그램을 만들어 볼 거예요!<br>
 * 우리나라에서는 만 18세 이상이면 투표를 할 수 있답니다. 🗳️
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ <b>if문</b>의 기본 구조 이해하기</li>
 *     <li>✅ <b>조건식</b> 작성하는 방법 배우기</li>
 *     <li>✅ 조건에 따라 변수 값 바꾸기</li>
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
 *     <td><code>if문</code></td>
 *     <td>"만약 ~라면"을 코드로 표현</td>
 *     <td><code>if (나이 >= 18)</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>조건식</code></td>
 *     <td>참(true) 또는 거짓(false)을 판단하는 식</td>
 *     <td><code>age >= 18</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>비교 연산자</code></td>
 *     <td>두 값을 비교하는 기호</td>
 *     <td><code>>=, >, <=, <, ==, !=</code></td>
 *   </tr>
 * </table>
 * 
 * <h3>💡 따라하기 쉬운 단계</h3>
 * 
 *   <ol>
 *     <li><b>조건 생각하기:</b> "나이가 18 이상인가?"를 확인해야 합니다</li>
 *     <li><b>if문 시작하기:</b> if 키워드로 시작합니다</li>
 *     <li><b>조건식 쓰기:</b> 괄호 안에 나이가 18 이상인지 비교하는 조건식을 넣습니다</li>
 *     <li><b>중괄호 열기:</b> 조건이 참일 때 실행할 코드를 중괄호로 감쌉니다</li>
 *     <li><b>실행할 코드:</b> canVote 변수를 true로 변경합니다</li>
 *     <li><b>중괄호 닫기:</b> 실행할 코드 작성이 끝나면 중괄호를 닫습니다</li>
 *   </ol>
 * 
 * 
 * <h3>📊 비교 연산자 정리</h3>
 * <table border="1">
 *   <tr>
 *     <th>연산자</th>
 *     <th>의미</th>
 *     <th>예시</th>
 *     <th>결과</th>
 *   </tr>
 *   <tr>
 *     <td><code>>=</code></td>
 *     <td>크거나 같다</td>
 *     <td><code>20 >= 18</code></td>
 *     <td>true ✅</td>
 *   </tr>
 *   <tr>
 *     <td><code>></code></td>
 *     <td>크다</td>
 *     <td><code>20 > 20</code></td>
 *     <td>false ❌</td>
 *   </tr>
 *   <tr>
 *     <td><code>==</code></td>
 *     <td>같다</td>
 *     <td><code>18 == 18</code></td>
 *     <td>true ✅</td>
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
 *       <td><code>if age >= 18</code></td>
 *       <td><code>if (age >= 18)</code></td>
 *       <td>조건식은 괄호로 감싸야 해요!</td>
 *     </tr>
 *     <tr>
 *       <td><code>if (age = 18)</code></td>
 *       <td><code>if (age == 18)</code></td>
 *       <td>비교는 ==, 대입은 = 입니다!</td>
 *     </tr>
 *     <tr>
 *       <td><code>if (age >= 18);</code></td>
 *       <td><code>if (age >= 18) {</code></td>
 *       <td>if문 뒤에는 세미콜론 없어요!</td>
 *     </tr>
 *   </table>
 * 
 * 
 * <h3>🎮 도전 과제</h3>
 * <p>아래 TODO 부분에 if문을 작성해보세요!</p>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise01_IfStatement {
    public static void main(String[] args) {
        int age = 20;
        boolean canVote = false;
        
        /**
         * 🧑‍💻 여기에 코드를 작성하세요!
         * 
         * 📝 작성할 내용:
         * - age가 18 이상인지 확인하는 if문
         * - 조건이 참이면 canVote를 true로 변경
         * 
         * 💡 힌트: if 키워드 뒤에 괄호를 열고, age가 18 이상인지 비교하는 조건식을 작성하세요
         */
        
        // TODO: 여기에 if문을 작성하세요
        // 힌트: age가 18 이상이면 canVote를 true로 설정하는 if문을 작성하세요
        
        
        
        /**
         * 🖥️ 결과 확인하기
         * 아래 코드가 여러분의 조건문 결과를 출력해줄 거예요!
         */
        System.out.println("나이: " + age);
        System.out.println("투표 가능: " + canVote);
        
        /**
         * 📋 예상 결과
         * ┌─────────────────┐
         * │ 나이: 20        │
         * │ 투표 가능: true  │
         * └─────────────────┘
         * 
         * 💡 추가 연습하기:
         * - age 값을 17로 바꿔서 결과를 확인해보세요
         * - age 값을 정확히 18로 설정해서 테스트해보세요
         * - 다른 조건들도 만들어보세요 (예: 65세 이상 노인 할인)
         * 
         * 🎯 IntelliJ 단축키 팁:
         * • 코드 자동완성: Ctrl+Space (Win/Linux) / Cmd+Space (Mac)
         * • 코드 실행: Shift+F10 (Win/Linux) / Ctrl+R (Mac)
         * • 코드 포맷팅: Ctrl+Alt+L (Win/Linux) / Cmd+Option+L (Mac)
         */
    }
}