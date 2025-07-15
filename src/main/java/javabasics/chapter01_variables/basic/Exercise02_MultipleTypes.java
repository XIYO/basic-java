package javabasics.chapter01_variables.basic;

/**
 * <h1>🎯 문제명: 다양한 상자 만들기!</h1>
 * 
 * <h2>📋 문제 설명</h2>
 * <p>
 * 지난 시간에 정수를 담는 상자를 만들어 봤죠? 🎉<br>
 * 이번에는 <strong>여러 종류의 상자</strong>를 만들어볼 거예요!<br><br>
 * 
 * 마치 우리가 물건을 정리할 때 📦<br>
 * - 책은 책장에 📚
 * - 옷은 옷장에 👕
 * - 음식은 냉장고에 🍎<br>
 * 넣는 것처럼, Java에서도 데이터 종류에 맞는 상자를 사용해요!
 * </p>
 * 
 * <h2>📌 학습 목표</h2>
 * <div style="background-color: #e6f3ff; padding: 10px; border-radius: 5px;">
 *   <ul>
 *     <li>✅ 4가지 기본 데이터 타입 익히기</li>
 *     <li>✅ 각 타입에 맞는 값 넣기</li>
 *     <li>✅ 문자와 문자열의 차이 이해하기</li>
 *   </ul>
 * </div>
 * 
 * <h2>📝 상자 종류와 쓰임새</h2>
 * <table border="1" style="border-collapse: collapse; margin: 10px;">
 *   <tr style="background-color: #f0f8ff;">
 *     <th style="padding: 10px;">상자 타입</th>
 *     <th style="padding: 10px;">무엇을 담나요?</th>
 *     <th style="padding: 10px;">실생활 예시</th>
 *     <th style="padding: 10px;">코드 예시</th>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;"><code>int</code> 📦</td>
 *     <td style="padding: 10px;">정수 (소수점 ❌)</td>
 *     <td style="padding: 10px;">나이, 점수, 개수</td>
 *     <td style="padding: 10px;"><code>int age = 20;</code></td>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;"><code>double</code> 📐</td>
 *     <td style="padding: 10px;">실수 (소수점 ⭕)</td>
 *     <td style="padding: 10px;">가격, 키, 몸무게</td>
 *     <td style="padding: 10px;"><code>double height = 175.5;</code></td>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;"><code>char</code> 🔤</td>
 *     <td style="padding: 10px;">문자 1개</td>
 *     <td style="padding: 10px;">학점, 등급, 성별</td>
 *     <td style="padding: 10px;"><code>char grade = 'A';</code></td>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;"><code>boolean</code> 🔘</td>
 *     <td style="padding: 10px;">참/거짓</td>
 *     <td style="padding: 10px;">합격여부, 전원상태</td>
 *     <td style="padding: 10px;"><code>boolean isOn = true;</code></td>
 *   </tr>
 * </table>
 * 
 * <h2>💡 이번 문제에서 만들 상자들</h2>
 * <div style="background-color: #f0f8ff; padding: 15px; border-radius: 5px;">
 *   <ol>
 *     <li>📊 <strong>score</strong> : 시험 점수 100점을 담는 정수 상자</li>
 *     <li>💰 <strong>price</strong> : 상품 가격 19.99달러를 담는 실수 상자</li>
 *     <li>🎯 <strong>grade</strong> : 학점 'A'를 담는 문자 상자</li>
 *     <li>✅ <strong>isPassed</strong> : 합격했다(true)를 담는 논리 상자</li>
 *   </ol>
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
 * </div>
 * 
 * <h2>🎮 도전 과제</h2>
 * <p>아래 TODO 부분에 4개의 변수를 만들어보세요!</p>
 * 
 * @author Java 학습자
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise02_MultipleTypes {
    public static void main(String[] args) {
        /**
         * 🧑‍💻 여기에 4개의 상자를 만들어보세요!
         * 
         * 📝 작성 순서:
         */
        
        // 1️⃣ 시험 점수 100점을 담을 정수 상자
        int score = 100;        // 🎯 정수는 int!
        
        // 2️⃣ 상품 가격 19.99달러를 담을 실수 상자
        double price = 19.99;   // 💰 소수점이 있으면 double!
        
        // 3️⃣ 학점 'A'를 담을 문자 상자
        char grade = 'A';       // 🔤 문자 하나는 작은따옴표!
        
        // 4️⃣ 합격 여부 true를 담을 논리 상자
        boolean isPassed = true; // ✅ 참/거짓은 boolean!
        
        
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