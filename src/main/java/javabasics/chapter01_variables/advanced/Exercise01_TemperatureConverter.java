package main.java.javabasics.chapter01_variables.advanced;

/**
 * <h3>🎯 문제명: 온도 변환 마법사 되기! 🌡️</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 안녕하세요! 오늘은 여러분이 <b>온도 변환 마법사</b>가 되어볼 거예요! ✨<br>
 * 세계 여행을 할 때, 각 나라마다 온도를 다르게 표현하죠?<br><br>
 * 
 * 🇺🇸 미국: 화씨(Fahrenheit, °F)<br>
 * 🇺🇳 한국/유럽: 섭씨(Celsius, °C)<br>
 * 🧪 과학자들: 켈빈(Kelvin, K)<br><br>
 * 
 * 이번 실습에서는 이 세 가지 온도를 서로 변환하는 프로그램을 만들어볼 거예요!
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ 실생활에서 사용하는 프로그램 만들기</li>
 *     <li>✅ <code>double</code> 타입으로 정확한 계산하기</li>
 *     <li>✅ <code>final</code> 키워드로 상수 만들기</li>
 *     <li>✅ 논리 연산으로 유효성 검사하기</li>
 *   </ul>
 * 
 * 
 * <h3>📝 온도 변환 비법 대공개!</h3>
 * 
 *   <h3>🧮 변환 공식 비법서</h3>
 *   <table border="1" cellpadding="10">
 *     <tr>
 *       <th>🔄 변환</th>
 *       <th>📈 마법 공식</th>
 *       <th>💡 예시</th>
 *     </tr>
 *     <tr>
 *       <td>섭씨 → 화씨</td>
 *       <td><code>(C × 9/5) + 32</code></td>
 *       <td>25°C = 77°F</td>
 *     </tr>
 *     <tr>
 *       <td>섭씨 → 켈빈</td>
 *       <td><code>C + 273.15</code></td>
 *       <td>25°C = 298.15K</td>
 *     </tr>
 *     <tr>
 *       <td>화씨 → 섭씨</td>
 *       <td><code>(F - 32) × 5/9</code></td>
 *       <td>77°F = 25°C</td>
 *     </tr>
 *   </table>
 *   
 *   <h3>❄️ 절대 영도 - 우주에서 가장 추운 온도!</h3>
 *   
 *     <p>🥶 <b>절대 영도</b>란? 이보다 더 차가워질 수 없는 온도예요!</p>
 *     <ul>
 *       <li>🌡️ 섭씨: <b>-273.15°C</b></li>
 *       <li>🌡️ 화씨: <b>-459.67°F</b></li>
 *       <li>🌡️ 켈빈: <b>0K</b></li>
 *     </ul>
 *   
 *   
 *   <h3>🌍 일상 생활 온도 비교</h3>
 *   <table border="1" cellpadding="10">
 *     <tr>
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
 * 
 * 
 * <h3>🎮 도전 과제</h3>
 * 
 *   <h3>📝 미션 설명</h3>
 *   <ol>
 *     <li>🌡️ 25°C를 화씨와 켈빈으로 변환하기</li>
 *     <li>🧊 물의 어는점과 끓는점 변환하기</li>
 *     <li>❄️ 절대 영도 상수 만들기</li>
 *     <li>✅ 온도가 유효한지 검사하기</li>
 *   </ol>
 * 
 * 
 * <h3>💡 히어로 팁</h3>
 * 
 *   <ul>
 *     <li>🎯 <b>double 타입</b>을 써야 소수점 계산이 정확해요!</li>
 *     <li>🔒 <b>final</b> 키워드를 사용하면 값을 못 바꿔요! (상수)</li>
 *     <li>🤔 9/5라고 쓰면 정수 나눗셈! 9.0/5.0이라고 써야 해요!</li>
 *     <li>📏 변수명은 의미 있게! celsius, fahrenheit, kelvin</li>
 *   </ul>
 * 
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
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
        // TODO: celsius를 화씨로 변환하는 코드를 작성하세요
        // 힌트: (celsius * 9.0 / 5.0) + 32
        fahrenheit = 0.0; // 여기에 변환 공식을 작성하세요
        
        // 3️⃣ 섭씨 → 켈빈 변환 마법!
        // TODO: celsius를 켈빈으로 변환하는 코드를 작성하세요
        // 힌트: celsius + 273.15
        kelvin = 0.0; // 여기에 변환 공식을 작성하세요
        
        // 4️⃣ 절대 영도 상수 만들기 (바꿀 수 없는 값!)
        // TODO: 절대 영도 상수를 선언하세요 (final 키워드 사용)
        final double ABSOLUTE_ZERO_C = 0.0; // TODO: -273.15로 변경하세요
        final double ABSOLUTE_ZERO_F = 0.0; // TODO: -459.67로 변경하세요
        final double ABSOLUTE_ZERO_K = 1.0; // TODO: 0.0으로 변경하세요
        
        // 5️⃣ 온도가 가능한지 검사! (절대 영도보다 높아야 함)
        // TODO: celsius가 절대 영도보다 크거나 같은지 확인하는 코드를 작성하세요
        boolean isValidTemp = false; // TODO: celsius >= ABSOLUTE_ZERO_C로 변경하세요
        
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
        
        // TODO: 물의 끓는점을 화씨와 켈빈으로 변환하는 코드를 작성하세요
        double waterBoilingF = 0.0; // TODO: (waterBoilingC * 9.0 / 5.0) + 32로 변경하세요
        double waterBoilingK = 0.0; // TODO: waterBoilingC + 273.15로 변경하세요
        
        // TODO: 물의 어는점을 화씨와 켈빈으로 변환하는 코드를 작성하세요
        double waterFreezingF = 0.0; // TODO: (waterFreezingC * 9.0 / 5.0) + 32로 변경하세요
        double waterFreezingK = 0.0; // TODO: waterFreezingC + 273.15로 변경하세요
        
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