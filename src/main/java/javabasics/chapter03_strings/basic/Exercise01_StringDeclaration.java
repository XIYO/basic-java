package javabasics.chapter03_strings.basic;

/**
 * <h1>🎯 문제명: 나의 첫 문자열 만들기!</h1>
 * 
 * <h2>📋 문제 설명</h2>
 * <p>
 * 안녕하세요! 이제 <strong>문자열(String)</strong>을 배워볼 차례예요! 🎉<br>
 * 지금까지 숫자를 담는 상자(int, double)를 만들어봤죠?<br>
 * 이번에는 <strong>글자를 담는 상자</strong>를 만들어볼 거예요!<br><br>
 * 
 * 📝 문자열이란?<br>
 * - 여러 글자를 하나로 묶은 것<br>
 * - "안녕하세요", "Hello", "123" 모두 문자열이에요!<br>
 * - 큰따옴표(" ")로 감싸서 만들어요
 * </p>
 * 
 * <h2>📌 학습 목표</h2>
 * <div style="background-color: #e6f3ff; padding: 10px; border-radius: 5px;">
 *   <ul>
 *     <li>✅ String 타입으로 문자열 저장하기</li>
 *     <li>✅ 큰따옴표(" ") 사용법 익히기</li>
 *     <li>✅ 문자열 출력하기</li>
 *   </ul>
 * </div>
 * 
 * <h2>📝 기초 개념</h2>
 * <table border="1" style="border-collapse: collapse; margin: 10px;">
 *   <tr style="background-color: #f0f8ff;">
 *     <th style="padding: 10px;">구분</th>
 *     <th style="padding: 10px;">설명</th>
 *     <th style="padding: 10px;">예시</th>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;"><code>String</code></td>
 *     <td style="padding: 10px;">문자열을 담는 타입</td>
 *     <td style="padding: 10px;"><code>String name = "홍길동";</code></td>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;">큰따옴표 " "</td>
 *     <td style="padding: 10px;">문자열을 감싸는 기호</td>
 *     <td style="padding: 10px;"><code>"Hello World"</code></td>
 *   </tr>
 *   <tr>
 *     <td style="padding: 10px;">작은따옴표 ' '</td>
 *     <td style="padding: 10px;">문자 1개만 (char용)</td>
 *     <td style="padding: 10px;"><code>'A', 'ㄱ', '1'</code></td>
 *   </tr>
 * </table>
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
 *       <td><code>String name = '홍길동';</code></td>
 *       <td><code>String name = "홍길동";</code></td>
 *       <td>문자열은 큰따옴표!</td>
 *     </tr>
 *     <tr>
 *       <td><code>string name = "홍길동";</code></td>
 *       <td><code>String name = "홍길동";</code></td>
 *       <td>String의 S는 대문자!</td>
 *     </tr>
 *     <tr>
 *       <td><code>String name = 홍길동;</code></td>
 *       <td><code>String name = "홍길동";</code></td>
 *       <td>따옴표를 꼭 써주세요!</td>
 *     </tr>
 *   </table>
 * </div>
 * 
 * <h2>🎮 도전 과제</h2>
 * <p>아래 TODO 부분에 코드를 작성해보세요!</p>
 */
public class Exercise01_StringDeclaration {
    public static void main(String[] args) {
        /**
         * 🧑‍💻 여기에 코드를 작성하세요!
         * 
         * 📝 작성 순서:
         * 1️⃣ String    (문자열 타입)
         * 2️⃣ greeting  (변수 이름)
         * 3️⃣ =         (넣는다)
         * 4️⃣ "Hello, Java!" (인사말)
         * 5️⃣ ;         (문장 끝!)
         */
        
        // 첫 번째 문자열 변수 만들기
        String greeting = "Hello, Java!";  // 🎉 첫 문자열 완성!
        
        // 두 번째 문자열 변수 만들기 (여러분의 이름)
        String name = "홍길동";  // 🙋 여기에 본인 이름을 넣어주세요!
        
        
        /**
         * 🖥️ 결과 확인하기
         * 아래 코드가 여러분이 만든 문자열을 출력해줄 거예요!
         */
        System.out.println(greeting);
        System.out.println("My name is " + name);
        
        /**
         * 📋 예상 결과
         * ┌─────────────────────────┐
         * │ Hello, Java!            │
         * │ My name is 홍길동       │
         * └─────────────────────────┘
         * 
         * 💡 배운 내용:
         * - String으로 문자열 변수 만들기
         * - 큰따옴표(" ")로 문자열 감싸기
         * - + 기호로 문자열 연결하기
         * 
         * 🚀 추가 연습:
         * - 좋아하는 음식을 담는 변수 만들기
         * - 사는 도시를 담는 변수 만들기
         * - 여러 문자열을 + 로 연결해보기
         */
    }
}