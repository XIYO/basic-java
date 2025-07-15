package main.java.javabasics.chapter01_variables.advanced;

/**
 * <h2>Chapter 1: 변수와 데이터 타입 - 심화</h2>
 * <h3>문제 4: RGB 색상 믹서 (RGB Color Mixer)</h3>
 * 
 * <p><strong>목표:</strong> 기본 타입을 사용하여 색상 값을 다루는 방법을 학습합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * <div style="border: 2px solid #e91e63; border-radius: 8px; padding: 15px; background-color: #fce4ec;">
 *   <h5>RGB 색상 시스템</h5>
 *   <ul>
 *     <li><strong>R(Red):</strong> 빨강 (0-255)</li>
 *     <li><strong>G(Green):</strong> 초록 (0-255)</li>
 *     <li><strong>B(Blue):</strong> 파랑 (0-255)</li>
 *     <li>각 채널은 8비트 (1바이트)로 표현</li>
 *   </ul>
 *   
 *   <h5>기본 색상표</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #f8bbd0;">
 *       <th>색상</th>
 *       <th>R</th>
 *       <th>G</th>
 *       <th>B</th>
 *       <th>16진수</th>
 *       <th style="width: 50px;">미리보기</th>
 *     </tr>
 *     <tr>
 *       <td>빨강</td>
 *       <td>255</td>
 *       <td>0</td>
 *       <td>0</td>
 *       <td>#FF0000</td>
 *       <td style="background-color: #FF0000;"></td>
 *     </tr>
 *     <tr>
 *       <td>초록</td>
 *       <td>0</td>
 *       <td>255</td>
 *       <td>0</td>
 *       <td>#00FF00</td>
 *       <td style="background-color: #00FF00;"></td>
 *     </tr>
 *     <tr>
 *       <td>파랑</td>
 *       <td>0</td>
 *       <td>0</td>
 *       <td>255</td>
 *       <td>#0000FF</td>
 *       <td style="background-color: #0000FF;"></td>
 *     </tr>
 *     <tr>
 *       <td>흰색</td>
 *       <td>255</td>
 *       <td>255</td>
 *       <td>255</td>
 *       <td>#FFFFFF</td>
 *       <td style="background-color: #FFFFFF;"></td>
 *     </tr>
 *     <tr>
 *       <td>검정</td>
 *       <td>0</td>
 *       <td>0</td>
 *       <td>0</td>
 *       <td>#000000</td>
 *       <td style="background-color: #000000;"></td>
 *     </tr>
 *   </table>
 *   
 *   <h5>색상 혼합 공식</h5>
 *   <ul>
 *     <li><strong>평균 혼합:</strong> <code>새로운 R = (R1 + R2) / 2</code></li>
 *     <li><strong>가중 혼합:</strong> <code>새로운 R = R1 × 비율1 + R2 × 비율2</code></li>
 *   </ul>
 *   
 *   <h5>색상 표현 방법</h5>
 *   <ol>
 *     <li><strong>24비트 RGB:</strong> R(8bit) + G(8bit) + B(8bit)</li>
 *     <li><strong>32비트 ARGB:</strong> Alpha(8bit) + RGB(24bit)</li>
 *     <li><strong>16진수 표현:</strong> #RRGGBB (예: #FF7F50)</li>
 *   </ol>
 *   
 *   <h5>비트 연산으로 색상 패킹</h5>
 *   <pre style="background-color: #f5f5f5; padding: 10px;">
 * int packedColor = (R &lt;&lt; 16) | (G &lt;&lt; 8) | B;
 * // R을 16비트 왼쪽으로 이동: 0xRR0000
 * // G을 8비트 왼쪽으로 이동:  0x00GG00
 * // B는 그대로:               0x0000BB
 * // OR 연산으로 합치기:       0xRRGGBB
 *   </pre>
 * </div>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>RGB 값을 사용하여 색상을 표현하세요</li>
 *   <li>RGB 구성요소를 평균내어 색상을 혼합하세요</li>
 *   <li>RGB를 16진수 색상 코드로 변환하세요</li>
 * </ol>
 * 
 * <h4>구현 팁:</h4>
 * <ul>
 *   <li>RGB 각 값은 0-255 범위 유지</li>
 *   <li><code>String.format("#%06X", color)</code>로 16진수 변환</li>
 *   <li>밝기 = (R + G + B) / 3</li>
 * </ul>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise04_ColorMixer {
    public static void main(String[] args) {
        // TODO: Define primary colors
        // Primary Red
        // int red1_r = 255, red1_g = 0, red1_b = 0;
        
        // Primary Blue
        // int blue1_r = 0, blue1_g = 0, blue1_b = 255;
        
        // Primary Green
        // int green1_r = 0, green1_g = 255, green1_b = 0;
        
        // TODO: Define some common colors
        // White
        // int white_r = 255, white_g = 255, white_b = 255;
        
        // Black
        // int black_r = 0, black_g = 0, black_b = 0;
        
        // TODO: Mix colors (average RGB values)
        // Purple = Red + Blue
        // int purple_r = (red1_r + blue1_r) / 2;
        // int purple_g = (red1_g + blue1_g) / 2;
        // int purple_b = (red1_b + blue1_b) / 2;
        
        // TODO: Create custom color
        // Coral color
        // int coral_r = 255, coral_g = 127, coral_b = 80;
        
        // TODO: Pack RGB into single int (32-bit color)
        // int packedPurple = (purple_r << 16) | (purple_g << 8) | purple_b;
        // int packedCoral = (coral_r << 16) | (coral_g << 8) | coral_b;
        
        // TODO: Convert to hex string
        // String purpleHex = String.format("#%06X", packedPurple);
        // String coralHex = String.format("#%06X", packedCoral);
        
        // TODO: Brightness calculation (average of RGB)
        // int purpleBrightness = (purple_r + purple_g + purple_b) / 3;
        // boolean isDarkColor = purpleBrightness < 128;
        
        // Display results
        // System.out.println("===== Color Mixer =====");
        // System.out.println("Red: RGB(" + red1_r + ", " + red1_g + ", " + red1_b + ")");
        // System.out.println("Blue: RGB(" + blue1_r + ", " + blue1_g + ", " + blue1_b + ")");
        // System.out.println("\nMixed Color (Purple):");
        // System.out.println("RGB(" + purple_r + ", " + purple_g + ", " + purple_b + ")");
        // System.out.println("Hex: " + purpleHex);
        // System.out.println("Brightness: " + purpleBrightness);
        // System.out.println("Is dark color? " + isDarkColor);
        // System.out.println("\nCoral Color:");
        // System.out.println("RGB(" + coral_r + ", " + coral_g + ", " + coral_b + ")");
        // System.out.println("Hex: " + coralHex);
        
        // Expected output:
        // ===== Color Mixer =====
        // Red: RGB(255, 0, 0)
        // Blue: RGB(0, 0, 255)
        // 
        // Mixed Color (Purple):
        // RGB(127, 0, 127)
        // Hex: #7F007F
        // Brightness: 84
        // Is dark color? true
        // 
        // Coral Color:
        // RGB(255, 127, 80)
        // Hex: #FF7F50
    }
}