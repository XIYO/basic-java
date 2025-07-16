package main.java.javabasics.chapter01_variables.basic;

/**
 * <h3>🎯 문제명: 다양한 상자 만들기!</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 지난 시간에 정수를 담는 상자를 만들어 봤죠? 🎉<br>
 * 이번에는 <b>여러 종류의 상자</b>를 만들어볼 거예요!<br><br>
 * 
 * 마치 우리가 물건을 정리할 때 📦<br>
 * - 책은 책장에 📚
 * - 옷은 옷장에 👕
 * - 음식은 냉장고에 🍎<br>
 * 넣는 것처럼, Java에서도 데이터 종류에 맞는 상자를 사용해요!
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ 4가지 기본 데이터 타입 익히기</li>
 *     <li>✅ 각 타입에 맞는 값 넣기</li>
 *     <li>✅ 문자와 문자열의 차이 이해하기</li>
 *   </ul>
 * 
 * 
 * <h3>📝 상자 종류와 쓰임새</h3>
 * <table border="1">
 *   <tr>
 *     <th>상자 타입</th>
 *     <th>무엇을 담나요?</th>
 *     <th>실생활 예시</th>
 *     <th>코드 예시</th>
 *   </tr>
 *   <tr>
 *     <td><code>int</code> 📦</td>
 *     <td>정수 (소수점 ❌)</td>
 *     <td>나이, 점수, 개수</td>
 *     <td><code>int age = 20;</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>double</code> 📐</td>
 *     <td>실수 (소수점 ⭕)</td>
 *     <td>가격, 키, 몸무게</td>
 *     <td><code>double height = 175.5;</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>char</code> 🔤</td>
 *     <td>문자 1개</td>
 *     <td>학점, 등급, 성별</td>
 *     <td><code>char grade = 'A';</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>boolean</code> 🔘</td>
 *     <td>참/거짓</td>
 *     <td>합격여부, 전원상태</td>
 *     <td><code>boolean isOn = true;</code></td>
 *   </tr>
 * </table>
 * 
 * <h3>💡 이번 문제에서 만들 상자들</h3>
 * 
 *   <ol>
 *     <li>📊 <b>score</b> : 시험 점수 100점을 담는 정수 상자</li>
 *     <li>💰 <b>price</b> : 상품 가격 19.99달러를 담는 실수 상자</li>
 *     <li>🎯 <b>grade</b> : 학점 'A'를 담는 문자 상자</li>
 *     <li>✅ <b>isPassed</b> : 합격했다(true)를 담는 논리 상자</li>
 *   </ol>
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
 *       <td><code>char grade = "A";</code></td>
 *       <td><code>char grade = 'A';</code></td>
 *       <td>char는 작은따옴표 사용!</td>
 *     </tr>
 *     <tr>
 *       <td><code>boolean isPassed = "true";</code></td>
 *       <td><code>boolean isPassed = true;</code></td>
 *       <td>boolean은 따옴표 없이!</td>
 *     </tr>
 *     <tr>
 *       <td><code>int price = 19.99;</code></td>
 *       <td><code>double price = 19.99;</code></td>
 *       <td>소수점은 double로!</td>
 *     </tr>
 *   </table>
 * 
 * 
 * <h3>🎮 도전 과제</h3>
 * <p>아래 TODO 부분에 4개의 변수를 만들어보세요!</p>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise02_MultipleTypes {
    public static void main(String[] args) {
        /**
         * 🧑‍💻 여기에 4개의 상자를 만들어보세요!
         * 
         * 📝 작성 순서:
         */
        
        // 1️⃣ 시험 점수 100점을 담을 정수 상자
        // TODO: int 타입의 score 변수를 선언하고 100을 저장하세요.
        
        // 2️⃣ 상품 가격 19.99달러를 담을 실수 상자
        // TODO: double 타입의 price 변수를 선언하고 19.99를 저장하세요.
        
        // 3️⃣ 학점 'A'를 담을 문자 상자
        // TODO: char 타입의 grade 변수를 선언하고 'A'를 저장하세요. (작은따옴표 사용!)
        
        // 4️⃣ 합격 여부 true를 담을 논리 상자
        // TODO: boolean 타입의 isPassed 변수를 선언하고 true를 저장하세요.
        
        
        /**
         * 🖥️ 결과 확인하기
         * 만든 상자들의 내용을 확인해봐요!
         */
        System.out.println("점수: " + score);
        System.out.println("가격: " + price);
        System.out.println("학점: " + grade);
        System.out.println("합격 여부: " + isPassed);
        
        /**
         * 📋 예상 결과
         * ┌──────────────────────┐
         * │ 점수: 100            │
         * │ 가격: 19.99          │
         * │ 학점: A              │
         * │ 합격 여부: true      │
         * └──────────────────────┘
         * 
         * 💡 추가 연습하기:
         * - score를 85로 바꿔보세요
         * - price를 9.99로 바꿔보세요
         * - grade를 'B'로 바꿔보세요
         * - isPassed를 false로 바꿔보세요
         * 
         * 🤔 생각해보기:
         * - int에 3.14를 넣으면 어떻게 될까요?
         * - char에 "AB"를 넣으면 어떻게 될까요?
         */
    }
}