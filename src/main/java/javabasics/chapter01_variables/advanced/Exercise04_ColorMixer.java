package main.java.javabasics.chapter01_variables.advanced;

/**
 * <h3>Chapter 1: 변수와 데이터 타입 - 심화</h3>
 * <h3>문제 4: RGB 색상 믹서 (RGB Color Mixer)</h3>
 * 
 * <p><b>목표:</b> 기본 타입을 사용하여 색상 값을 다루는 방법을 학습합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * 
 *   <h5>RGB 색상 시스템</h5>
 *   <ul>
 *     <li><b>R(Red):</b> 빨강 (0-255)</li>
 *     <li><b>G(Green):</b> 초록 (0-255)</li>
 *     <li><b>B(Blue):</b> 파랑 (0-255)</li>
 *     <li>각 채널은 8비트 (1바이트)로 표현</li>
 *   </ul>
 *   
 *   <h5>기본 색상표</h5>
 *   <table border="1" cellpadding="5">
 *     <tr>
 *       <th>색상</th>
 *       <th>R</th>
 *       <th>G</th>
 *       <th>B</th>
 *       <th>16진수</th>
 *       <th>미리보기</th>
 *     </tr>
 *     <tr>
 *       <td>빨강</td>
 *       <td>255</td>
 *       <td>0</td>
 *       <td>0</td>
 *       <td>#FF0000</td>
 *       <td></td>
 *     </tr>
 *     <tr>
 *       <td>초록</td>
 *       <td>0</td>
 *       <td>255</td>
 *       <td>0</td>
 *       <td>#00FF00</td>
 *       <td></td>
 *     </tr>
 *     <tr>
 *       <td>파랑</td>
 *       <td>0</td>
 *       <td>0</td>
 *       <td>255</td>
 *       <td>#0000FF</td>
 *       <td></td>
 *     </tr>
 *     <tr>
 *       <td>흰색</td>
 *       <td>255</td>
 *       <td>255</td>
 *       <td>255</td>
 *       <td>#FFFFFF</td>
 *       <td></td>
 *     </tr>
 *     <tr>
 *       <td>검정</td>
 *       <td>0</td>
 *       <td>0</td>
 *       <td>0</td>
 *       <td>#000000</td>
 *       <td></td>
 *     </tr>
 *   </table>
 *   
 *   <h5>색상 혼합 공식</h5>
 *   <ul>
 *     <li><b>평균 혼합:</b> <code>새로운 R = (R1 + R2) / 2</code></li>
 *     <li><b>가중 혼합:</b> <code>새로운 R = R1 × 비율1 + R2 × 비율2</code></li>
 *   </ul>
 *   
 *   <h5>색상 표현 방법</h5>
 *   <ol>
 *     <li><b>24비트 RGB:</b> R(8bit) + G(8bit) + B(8bit)</li>
 *     <li><b>32비트 ARGB:</b> Alpha(8bit) + RGB(24bit)</li>
 *     <li><b>16진수 표현:</b> #RRGGBB (예: #FF7F50)</li>
 *   </ol>
 *   
 *   <h5>비트 연산으로 색상 패킹</h5>
 *   <pre>
 * int packedColor = (R &lt;&lt; 16) | (G &lt;&lt; 8) | B;
 * // R을 16비트 왼쪽으로 이동: 0xRR0000
 * // G을 8비트 왼쪽으로 이동:  0x00GG00
 * // B는 그대로:               0x0000BB
 * // OR 연산으로 합치기:       0xRRGGBB
 *   </pre>
 * 
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
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise04_ColorMixer {
    public static void main(String[] args) {
        // TODO: 기본 색상 정의하기
        // 빨강 (Primary Red)
        // 여기에 빨강색 RGB 값을 정의하는 코드를 작성하세요
        int red1_r = 0, red1_g = 0, red1_b = 0; // TODO: 255, 0, 0으로 변경하세요
        
        // 파랑 (Primary Blue)
        // 여기에 파란색 RGB 값을 정의하는 코드를 작성하세요
        int blue1_r = 0, blue1_g = 0, blue1_b = 0; // TODO: 0, 0, 255로 변경하세요
        
        // 초록 (Primary Green)
        // 여기에 초록색 RGB 값을 정의하는 코드를 작성하세요
        int green1_r = 0, green1_g = 0, green1_b = 0; // TODO: 0, 255, 0으로 변경하세요
        
        // TODO: 일반적인 색상 정의하기
        // 흰색 (White)
        int white_r = 0, white_g = 0, white_b = 0; // TODO: 255, 255, 255로 변경하세요
        
        // 검정 (Black)
        int black_r = 1, black_g = 1, black_b = 1; // TODO: 0, 0, 0으로 변경하세요
        
        // TODO: 색상 혼합하기 (RGB 값의 평균)
        // 보라색 = 빨강 + 파랑
        // 여기에 빨강과 파랑을 혼합하여 보라색을 만드는 코드를 작성하세요
        int purple_r = 0; // TODO: (red1_r + blue1_r) / 2로 변경하세요
        int purple_g = 0; // TODO: (red1_g + blue1_g) / 2로 변경하세요
        int purple_b = 0; // TODO: (red1_b + blue1_b) / 2로 변경하세요
        
        // TODO: 사용자 정의 색상 만들기
        // 산호색 (Coral)
        int coral_r = 0, coral_g = 0, coral_b = 0; // TODO: 255, 127, 80으로 변경하세요
        
        // TODO: RGB를 하나의 int로 포장하기 (32비트 색상)
        // 여기에 비트 연산을 사용하여 RGB를 하나의 정수로 포장하는 코드를 작성하세요
        int packedPurple = 0; // TODO: (purple_r << 16) | (purple_g << 8) | purple_b로 변경하세요
        int packedCoral = 0; // TODO: (coral_r << 16) | (coral_g << 8) | coral_b로 변경하세요
        
        // TODO: 16진수 문자열로 변환하기
        // 여기에 포장된 색상을 16진수 문자열로 변환하는 코드를 작성하세요
        String purpleHex = "#000000"; // TODO: String.format("#%06X", packedPurple)로 변경하세요
        String coralHex = "#000000"; // TODO: String.format("#%06X", packedCoral)로 변경하세요
        
        // TODO: 밝기 계산하기 (RGB의 평균)
        // 여기에 보라색의 밝기를 계산하는 코드를 작성하세요
        int purpleBrightness = 0; // TODO: (purple_r + purple_g + purple_b) / 3으로 변경하세요
        // 여기에 어두운 색인지 확인하는 코드를 작성하세요
        boolean isDarkColor = false; // TODO: purpleBrightness < 128로 변경하세요
        
        // 결과 출력
        System.out.println("===== Color Mixer =====");
        System.out.println("Red: RGB(" + red1_r + ", " + red1_g + ", " + red1_b + ")");
        System.out.println("Blue: RGB(" + blue1_r + ", " + blue1_g + ", " + blue1_b + ")");
        System.out.println("\nMixed Color (Purple):");
        System.out.println("RGB(" + purple_r + ", " + purple_g + ", " + purple_b + ")");
        System.out.println("Hex: " + purpleHex);
        System.out.println("Brightness: " + purpleBrightness);
        System.out.println("Is dark color? " + isDarkColor);
        System.out.println("\nCoral Color:");
        System.out.println("RGB(" + coral_r + ", " + coral_g + ", " + coral_b + ")");
        System.out.println("Hex: " + coralHex);
        
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