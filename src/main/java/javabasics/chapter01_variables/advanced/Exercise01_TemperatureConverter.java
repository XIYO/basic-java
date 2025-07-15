package javabasics.chapter01_variables.advanced;

/**
 * <h1>🎯 문제명: 온도 변환 마법사 되기! 🌡️</h1>
 * 
 * <h2>📋 문제 설명</h2>
 * <p>
 * 안녕하세요! 오늘은 여러분이 <strong>온도 변환 마법사</strong>가 되어볼 거예요! ✨<br>
 * 세계 여행을 할 때, 각 나라마다 온도를 다르게 표현하죠?<br><br>
 * 
 * 🇺🇸 미국: 화씨(Fahrenheit, °F)<br>
 * 🇺🇳 한국/유럽: 섭씨(Celsius, °C)<br>
 * 🧪 과학자들: 켈빈(Kelvin, K)<br><br>
 * 
 * 이번 실습에서는 이 세 가지 온도를 서로 변환하는 프로그램을 만들어볼 거예요!
 * </p>
 * 
 * <h2>📌 학습 목표</h2>
 * <div style="background-color: #e6f3ff; padding: 10px; border-radius: 5px;">
 *   <ul>
 *     <li>✅ 실생활에서 사용하는 프로그램 만들기</li>
 *     <li>✅ <code>double</code> 타입으로 정확한 계산하기</li>
 *     <li>✅ <code>final</code> 키워드로 상수 만들기</li>
 *     <li>✅ 논리 연산으로 유효성 검사하기</li>
 *   </ul>
 * </div>
 * 
 * <h2>📝 온도 변환 비법 대공개!</h2>
 * <div style="border: 2px solid #2196f3; border-radius: 8px; padding: 15px; background-color: #e3f2fd;">
 *   <h3>🧮 변환 공식 비법서</h3>
 *   <table border="1" cellpadding="10" style="border-collapse: collapse;">
 *     <tr style="background-color: #bbdefb;">
 *       <th>🔄 변환</th>
 *       <th>📈 마법 공식</th>
 *       <th>💡 예시</th>
 *     </tr>
 *     <tr>
 *       <td>섭씨 → 화씨</td>
 *       <td><code style="background-color: #fffacd;">(C × 9/5) + 32</code></td>
 *       <td>25°C = 77°F</td>
 *     </tr>
 *     <tr>
 *       <td>섭씨 → 켈빈</td>
 *       <td><code style="background-color: #fffacd;">C + 273.15</code></td>
 *       <td>25°C = 298.15K</td>
 *     </tr>
 *     <tr>
 *       <td>화씨 → 섭씨</td>
 *       <td><code style="background-color: #fffacd;">(F - 32) × 5/9</code></td>
 *       <td>77°F = 25°C</td>
 *     </tr>
 *   </table>
 *   
 *   <h3>❄️ 절대 영도 - 우주에서 가장 추운 온도!</h3>
 *   <div style="background-color: #f0f8ff; padding: 10px; margin: 10px 0;">
 *     <p>🥶 <strong>절대 영도</strong>란? 이보다 더 차가워질 수 없는 온도예요!</p>
 *     <ul>
 *       <li>🌡️ 섭씨: <strong>-273.15°C</strong></li>
 *       <li>🌡️ 화씨: <strong>-459.67°F</strong></li>
 *       <li>🌡️ 켈빈: <strong>0K</strong></li>
 *     </ul>
 *   </div>
 *   
 *   <h3>🌍 일상 생활 온도 비교</h3>
 *   <table border="1" cellpadding="10" style="border-collapse: collapse;">
 *     <tr style="background-color: #bbdefb;">
 *       <th>🌡️ 상황</th>
 *       <th>섭씨</th>
 *       <th>화씨</th>
 *       <th>켈빈</th>
 *     </tr>
 *     <tr>
 *       <td>🧊 물이 언다</td>
 *       <td>0°C</td>
 *       <td>32°F</td>
 *       <td>273.15K</td>
 *     </tr>
 *     <tr>
 *       <td>💨 물이 끓는다</td>
 *       <td>100°C</td>
 *       <td>212°F</td>
 *       <td>373.15K</td>
 *     </tr>
 *     <tr>
 *       <td>🤒 정상 체온</td>
 *       <td>36.5°C</td>
 *       <td>97.7°F</td>
 *       <td>309.65K</td>
 *     </tr>
 *     <tr>
 *       <td>🇺🇸 비틸커스비치</td>
 *       <td>38°C</td>
 *       <td>100°F</td>
 *       <td>311K</td>
 *     </tr>
 *   </table>
 * </div>
 * 
 * <h2>🎮 도전 과제</h2>
 * <div style="background-color: #f0f8ff; padding: 15px; border-radius: 5px;">
 *   <h3>📝 미션 설명</h3>
 *   <ol>
 *     <li>🌡️ 25°C를 화씨와 켈빈으로 변환하기</li>
 *     <li>🧊 물의 어는점과 끓는점 변환하기</li>
 *     <li>❄️ 절대 영도 상수 만들기</li>
 *     <li>✅ 온도가 유효한지 검사하기</li>
 *   </ol>
 * </div>
 * 
 * <h2>💡 히어로 팁</h2>
 * <div style="background-color: #ffe4e1; padding: 10px; border-radius: 5px;">
 *   <ul>
 *     <li>🎯 <strong>double 타입</strong>을 써야 소수점 계산이 정확해요!</li>
 *     <li>🔒 <strong>final</strong> 키워드를 사용하면 값을 못 바꿔요! (상수)</li>
 *     <li>🤔 9/5라고 쓰면 정수 나눗셈! 9.0/5.0이라고 써야 해요!</li>
 *     <li>📏 변수명은 의미 있게! celsius, fahrenheit, kelvin</li>
 *   </ul>
 * </div>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise01_TemperatureConverter {
    public static void main(String[] args) {
        /**
         * 🧑‍💻 코드 작성 시작!
         */
        
        // 1️⃣ 섭씨 온도 변수 만들기
        double celsius = 25.0;      // 🌡️ 오늘의 날씨 (소수점 주의!)
        double fahrenheit;          // 🇺🇸 화씨 결과를 담을 상자
        double kelvin;              // 🧪 켈빈 결과를 담을 상자
        
        // 2️⃣ 섭씨 → 화씨 변환 마법!
        fahrenheit = (celsius * 9.0 / 5.0) + 32;    // ✨ 공식 적용!
        
        // 3️⃣ 섭씨 → 켈빈 변환 마법!
        kelvin = celsius + 273.15;                  // ✨ 간단한 마법!
        
        // 4️⃣ 절대 영도 상수 만들기 (바꿀 수 없는 값!)
        final double ABSOLUTE_ZERO_C = -273.15;     // ❄️ 섭씨 절대 영도
        final double ABSOLUTE_ZERO_F = -459.67;     // ❄️ 화씨 절대 영도
        final double ABSOLUTE_ZERO_K = 0.0;         // ❄️ 켈빈 절대 영도
        
        // 5️⃣ 온도가 가능한지 검사! (절대 영도보다 높아야 함)
        boolean isValidTemp = celsius >= ABSOLUTE_ZERO_C;  // ✅ true/false
        
        // 6️⃣ 결과 출력하기
        System.out.println("🌡️ === 온도 변환 결과 === 🌡️");
        System.out.println("섭씨: " + celsius + "°C");
        System.out.println("화씨: " + fahrenheit + "°F");
        System.out.println("켈빈: " + kelvin + "K");
        System.out.println("유효한 온도인가요? " + isValidTemp);
        
        // 7️⃣ 추가 도전! 물의 특별한 온도들
        System.out.println("\n💧 === 물의 특별한 온도들 === 💧");
        
        double waterBoilingC = 100.0;   // 물이 끓는 온도
        double waterFreezingC = 0.0;    // 물이 어는 온도
        
        // 물의 끓는점 변환
        double waterBoilingF = (waterBoilingC * 9.0 / 5.0) + 32;
        double waterBoilingK = waterBoilingC + 273.15;
        
        // 물의 어는점 변환
        double waterFreezingF = (waterFreezingC * 9.0 / 5.0) + 32;
        double waterFreezingK = waterFreezingC + 273.15;
        
        System.out.println("물의 끓는점: " + waterBoilingC + "°C = " + 
                          waterBoilingF + "°F = " + waterBoilingK + "K");
        System.out.println("물의 어는점: " + waterFreezingC + "°C = " + 
                          waterFreezingF + "°F = " + waterFreezingK + "K");
        
        /**
         * 📋 예상 결과
         * ┌──────────────────────────────────────────────────┐
         * │ 🌡️ === 온도 변환 결과 === 🌡️                    │
         * │ 섭씨: 25.0°C                                     │
         * │ 화씨: 77.0°F                                     │
         * │ 켈빈: 298.15K                                    │
         * │ 유효한 온도인가요? true                           │
         * │                                                  │
         * │ 💧 === 물의 특별한 온도들 === 💧                   │
         * │ 물의 끓는점: 100.0°C = 212.0°F = 373.15K       │
         * │ 물의 어는점: 0.0°C = 32.0°F = 273.15K           │
         * └──────────────────────────────────────────────────┘
         * 
         * 💡 추가 도전:
         * - 사용자가 온도를 입력받게 해보세요 (Scanner 사용)
         * - 화씨 → 섭씨 변환도 구현해보세요
         * - 절대 영도보다 낮은 온도를 입력하면 경고 메시지 출력
         */
    }
}