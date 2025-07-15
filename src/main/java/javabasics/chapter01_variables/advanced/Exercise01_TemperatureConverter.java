package main.java.javabasics.chapter01_variables.advanced;

/**
 * <h2>Chapter 1: 변수와 데이터 타입 - 심화</h2>
 * <h3>문제 1: 온도 변환기 (Temperature Converter)</h3>
 * 
 * <p><strong>목표:</strong> 기본 타입을 활용하여 실제 문제를 해결합니다.</p>
 * 
 * <h4>온도 변환 공식:</h4>
 * <div style="border: 2px solid #2196f3; border-radius: 8px; padding: 15px; background-color: #e3f2fd;">
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #bbdefb;">
 *       <th>변환</th>
 *       <th>공식</th>
 *       <th>예시</th>
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
 *   <h5>절대 영도 (Absolute Zero)</h5>
 *   <ul>
 *     <li>섭씨: <strong>-273.15°C</strong></li>
 *     <li>화씨: <strong>-459.67°F</strong></li>
 *     <li>켈빈: <strong>0K</strong></li>
 *   </ul>
 *   
 *   <h5>주요 온도 참고값</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #bbdefb;">
 *       <th>현상</th>
 *       <th>섭씨</th>
 *       <th>화씨</th>
 *       <th>켈빈</th>
 *     </tr>
 *     <tr>
 *       <td>물의 어는점</td>
 *       <td>0°C</td>
 *       <td>32°F</td>
 *       <td>273.15K</td>
 *     </tr>
 *     <tr>
 *       <td>물의 끓는점</td>
 *       <td>100°C</td>
 *       <td>212°F</td>
 *       <td>373.15K</td>
 *     </tr>
 *     <tr>
 *       <td>체온</td>
 *       <td>36.5°C</td>
 *       <td>97.7°F</td>
 *       <td>309.65K</td>
 *     </tr>
 *   </table>
 * </div>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>온도 변환 프로그램을 작성하세요</li>
 *   <li>섭씨, 화씨, 켈빈 간 변환을 구현하세요</li>
 *   <li>적절한 데이터 타입을 사용하고 정밀도를 처리하세요</li>
 * </ol>
 * 
 * <h4>구현 팁:</h4>
 * <ul>
 *   <li><code>double</code> 타입 사용으로 정밀도 확보</li>
 *   <li><code>final</code> 키워드로 상수 선언</li>
 *   <li>유효성 검사로 절대 영도 이하 온도 방지</li>
 * </ul>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise01_TemperatureConverter {
    public static void main(String[] args) {
        // TODO: Declare temperature variables
        // double celsius = 25.0;
        // double fahrenheit;
        // double kelvin;
        
        // TODO: Convert Celsius to Fahrenheit
        // fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        // TODO: Convert Celsius to Kelvin
        // kelvin = celsius + 273.15;
        
        // TODO: Create absolute zero constants
        // final double ABSOLUTE_ZERO_C = -273.15;
        // final double ABSOLUTE_ZERO_F = -459.67;
        // final double ABSOLUTE_ZERO_K = 0.0;
        
        // TODO: Check if temperature is valid (above absolute zero)
        // boolean isValidTemp = celsius >= ABSOLUTE_ZERO_C;
        
        // TODO: Display conversions with formatting
        // System.out.println("Temperature Conversions:");
        // System.out.println("Celsius: " + celsius + "°C");
        // System.out.println("Fahrenheit: " + fahrenheit + "°F");
        // System.out.println("Kelvin: " + kelvin + "K");
        // System.out.println("Is valid temperature? " + isValidTemp);
        
        // TODO: Extreme temperature examples
        // double waterBoilingC = 100.0;
        // double waterFreezingC = 0.0;
        // Calculate F and K for these
        
        // Expected output:
        // Temperature Conversions:
        // Celsius: 25.0°C
        // Fahrenheit: 77.0°F
        // Kelvin: 298.15K
        // Is valid temperature? true
        // 
        // Water boiling point: 100.0°C = 212.0°F = 373.15K
        // Water freezing point: 0.0°C = 32.0°F = 273.15K
    }
}