package javabasics.chapter01_variables.advanced;

/**
 * <h2>Chapter 1: 변수와 데이터 타입 - 심화</h2>
 * <h3>문제 5: 데이터 압축 시뮬레이션 (Data Compression Simulation)</h3>
 * 
 * <p><strong>목표:</strong> 여러 값을 더 작은 데이터 타입에 압축하여 저장하는 방법을 학습합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * <div style="border: 2px solid #3f51b5; border-radius: 8px; padding: 15px; background-color: #e8eaf6;">
 *   <h5>비트 플래그 (Bit Flags)</h5>
 *   <ul>
 *     <li>1바이트(8비트)에 8개의 boolean 값 저장 가능</li>
 *     <li>각 비트가 하나의 상태를 나타냄</li>
 *     <li>메모리 효율성: 8바이트 → 1바이트 (87.5% 절약)</li>
 *   </ul>
 *   
 *   <h5>비트 플래그 예시</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #c5cae9;">
 *       <th>비트 위치</th>
 *       <th>값</th>
 *       <th>의미</th>
 *       <th>비트 마스크</th>
 *     </tr>
 *     <tr>
 *       <td>비트 0</td>
 *       <td>1</td>
 *       <td>isAlive</td>
 *       <td><code>1 &lt;&lt; 0</code> = 0x01</td>
 *     </tr>
 *     <tr>
 *       <td>비트 1</td>
 *       <td>1</td>
 *       <td>hasWeapon</td>
 *       <td><code>1 &lt;&lt; 1</code> = 0x02</td>
 *     </tr>
 *     <tr>
 *       <td>비트 2</td>
 *       <td>0</td>
 *       <td>hasShield</td>
 *       <td><code>1 &lt;&lt; 2</code> = 0x04</td>
 *     </tr>
 *     <tr>
 *       <td>비트 3</td>
 *       <td>0</td>
 *       <td>isPoisoned</td>
 *       <td><code>1 &lt;&lt; 3</code> = 0x08</td>
 *     </tr>
 *     <tr>
 *       <td>비트 4</td>
 *       <td>1</td>
 *       <td>isInvisible</td>
 *       <td><code>1 &lt;&lt; 4</code> = 0x10</td>
 *     </tr>
 *     <tr>
 *       <td colspan="4">결과: <code>01010011</code> = 83</td>
 *     </tr>
 *   </table>
 *   
 *   <h5>날짜 압축 (Date Packing)</h5>
 *   <pre style="background-color: #f5f5f5; padding: 10px;">
 * 날짜 구성요소:
 * - 연도: 11비트 (0-2047 범위)
 * - 월: 4비트 (1-12 범위)  
 * - 일: 5비트 (1-31 범위)
 * 
 * 압축 형식: YYYYYYYYYYY MMMM DDDDD (총 20비트)
 * 
 * 압축: packedDate = (year &lt;&lt; 9) | (month &lt;&lt; 5) | day
 * 
 * 해제: year = (packedDate &gt;&gt; 9) &amp; 0x7FF
 *      month = (packedDate &gt;&gt; 5) &amp; 0xF
 *      day = packedDate &amp; 0x1F
 *   </pre>
 *   
 *   <h5>비트 연산 기법</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #c5cae9;">
 *       <th>연산</th>
 *       <th>코드</th>
 *       <th>설명</th>
 *     </tr>
 *     <tr>
 *       <td>비트 설정</td>
 *       <td><code>flags |= (1 &lt;&lt; n)</code></td>
 *       <td>n번째 비트를 1로 설정</td>
 *     </tr>
 *     <tr>
 *       <td>비트 해제</td>
 *       <td><code>flags &amp;= ~(1 &lt;&lt; n)</code></td>
 *       <td>n번째 비트를 0으로 설정</td>
 *     </tr>
 *     <tr>
 *       <td>비트 확인</td>
 *       <td><code>(flags &amp; (1 &lt;&lt; n)) != 0</code></td>
 *       <td>n번째 비트가 1인지 확인</td>
 *     </tr>
 *     <tr>
 *       <td>비트 토글</td>
 *       <td><code>flags ^= (1 &lt;&lt; n)</code></td>
 *       <td>n번째 비트 반전</td>
 *     </tr>
 *   </table>
 *   
 *   <h5>실제 활용 분야</h5>
 *   <ul>
 *     <li><strong>네트워크 프로토콜:</strong> 헤더 정보 압축</li>
 *     <li><strong>파일 포맷:</strong> 메타데이터 저장</li>
 *     <li><strong>임베디드 시스템:</strong> 메모리 제한 환경</li>
 *     <li><strong>게임 개발:</strong> 상태 플래그 관리</li>
 *   </ul>
 * </div>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>여러 boolean 플래그를 하나의 byte에 압축하세요</li>
 *   <li>날짜 구성요소를 하나의 int에 저장하세요</li>
 *   <li>데이터 저장을 위한 비트 조작을 이해하세요</li>
 * </ol>
 * 
 * <h4>구현 팁:</h4>
 * <ul>
 *   <li>비트 설정: <code>|=</code> 연산자 사용</li>
 *   <li>비트 확인: <code>&amp;</code> 연산자와 마스크 사용</li>
 *   <li>비트 추출: 시프트와 마스크 조합</li>
 * </ul>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise05_DataCompression {
    public static void main(String[] args) {
        // TODO: Pack 8 boolean flags into a single byte
        // Game character status flags
        // boolean isAlive = true;        // bit 0
        // boolean hasWeapon = true;      // bit 1
        // boolean hasShield = false;     // bit 2
        // boolean isPoisoned = false;    // bit 3
        // boolean isInvisible = true;    // bit 4
        // boolean canFly = false;        // bit 5
        // boolean hasMagic = true;       // bit 6
        // boolean isBoss = false;        // bit 7
        
        // Pack into byte using bit operations
        // byte statusFlags = 0;
        // if (isAlive) statusFlags |= (1 << 0);
        // if (hasWeapon) statusFlags |= (1 << 1);
        // if (hasShield) statusFlags |= (1 << 2);
        // if (isPoisoned) statusFlags |= (1 << 3);
        // if (isInvisible) statusFlags |= (1 << 4);
        // if (canFly) statusFlags |= (1 << 5);
        // if (hasMagic) statusFlags |= (1 << 6);
        // if (isBoss) statusFlags |= (1 << 7);
        
        // TODO: Pack date into single int (year, month, day)
        // Date: 2024-03-15
        // int year = 2024;  // Uses 11 bits (0-2047)
        // int month = 3;    // Uses 4 bits (1-12)
        // int day = 15;     // Uses 5 bits (1-31)
        
        // Pack: YYYYYYYYYYY MMMM DDDDD (total 20 bits, fits in int)
        // int packedDate = (year << 9) | (month << 5) | day;
        
        // TODO: Pack RGB color into single int (with alpha)
        // ARGB format: AAAAAAAA RRRRRRRR GGGGGGGG BBBBBBBB
        // int alpha = 255;  // Fully opaque
        // int red = 200;
        // int green = 100;
        // int blue = 50;
        // int packedColor = (alpha << 24) | (red << 16) | (green << 8) | blue;
        
        // TODO: Unpack the data
        // Unpack status flags
        // boolean unpackedAlive = (statusFlags & (1 << 0)) != 0;
        // boolean unpackedWeapon = (statusFlags & (1 << 1)) != 0;
        // boolean unpackedInvisible = (statusFlags & (1 << 4)) != 0;
        
        // Unpack date
        // int unpackedYear = (packedDate >> 9) & 0x7FF;  // 11 bits
        // int unpackedMonth = (packedDate >> 5) & 0xF;   // 4 bits
        // int unpackedDay = packedDate & 0x1F;           // 5 bits
        
        // Display results
        // System.out.println("===== Data Compression =====");
        // System.out.println("\nStatus Flags:");
        // System.out.println("Packed byte value: " + statusFlags);
        // System.out.println("Binary: " + String.format("%8s", Integer.toBinaryString(statusFlags & 0xFF)).replace(' ', '0'));
        // System.out.println("Unpacked - Alive: " + unpackedAlive);
        // System.out.println("Unpacked - Has Weapon: " + unpackedWeapon);
        // System.out.println("Unpacked - Invisible: " + unpackedInvisible);
        
        // System.out.println("\nPacked Date:");
        // System.out.println("Original: " + year + "-" + month + "-" + day);
        // System.out.println("Packed int: " + packedDate);
        // System.out.println("Unpacked: " + unpackedYear + "-" + unpackedMonth + "-" + unpackedDay);
        
        // System.out.println("\nMemory Saved:");
        // System.out.println("8 booleans (8 bytes) -> 1 byte: " + (8-1) + " bytes saved");
        // System.out.println("3 ints for date (12 bytes) -> 1 int (4 bytes): " + (12-4) + " bytes saved");
        
        // Expected output:
        // ===== Data Compression =====
        // 
        // Status Flags:
        // Packed byte value: 83
        // Binary: 01010011
        // Unpacked - Alive: true
        // Unpacked - Has Weapon: true
        // Unpacked - Invisible: true
        // 
        // Packed Date:
        // Original: 2024-3-15
        // Packed int: 1036559
        // Unpacked: 2024-3-15
        // 
        // Memory Saved:
        // 8 booleans (8 bytes) -> 1 byte: 7 bytes saved
        // 3 ints for date (12 bytes) -> 1 int (4 bytes): 8 bytes saved
    }
}