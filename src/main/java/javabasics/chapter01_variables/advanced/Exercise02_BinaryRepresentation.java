package main.java.javabasics.chapter01_variables.advanced;

/**
 * <h2>Chapter 1: 변수와 데이터 타입 - 심화</h2>
 * <h3>문제 2: 진법과 비트 연산 (Binary and Hexadecimal Representation)</h3>
 * 
 * <p><strong>목표:</strong> 기본 타입이 메모리에 저장되는 방식을 이해합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * <div style="border: 2px solid #795548; border-radius: 8px; padding: 15px; background-color: #efebe9;">
 *   <h5>숫자 표현 방식</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #d7ccc8;">
 *       <th>진법</th>
 *       <th>접두사</th>
 *       <th>예시 (42)</th>
 *       <th>설명</th>
 *     </tr>
 *     <tr>
 *       <td>10진법</td>
 *       <td>없음</td>
 *       <td><code>42</code></td>
 *       <td>일반적인 숫자</td>
 *     </tr>
 *     <tr>
 *       <td>2진법</td>
 *       <td><code>0b</code></td>
 *       <td><code>0b101010</code></td>
 *       <td>비트 단위 표현</td>
 *     </tr>
 *     <tr>
 *       <td>16진법</td>
 *       <td><code>0x</code></td>
 *       <td><code>0x2A</code></td>
 *       <td>메모리 주소, 색상값</td>
 *     </tr>
 *     <tr>
 *       <td>8진법</td>
 *       <td><code>0</code></td>
 *       <td><code>052</code></td>
 *       <td>파일 권한 등</td>
 *     </tr>
 *   </table>
 *   
 *   <h5>비트 연산자</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #d7ccc8;">
 *       <th>연산자</th>
 *       <th>이름</th>
 *       <th>설명</th>
 *       <th>예시</th>
 *     </tr>
 *     <tr>
 *       <td><code>&amp;</code></td>
 *       <td>AND</td>
 *       <td>둘 다 1일 때 1</td>
 *       <td><code>1100 &amp; 1010 = 1000</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>|</code></td>
 *       <td>OR</td>
 *       <td>하나라도 1이면 1</td>
 *       <td><code>1100 | 1010 = 1110</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>^</code></td>
 *       <td>XOR</td>
 *       <td>서로 다르면 1</td>
 *       <td><code>1100 ^ 1010 = 0110</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>~</code></td>
 *       <td>NOT</td>
 *       <td>비트 반전</td>
 *       <td><code>~1100 = ...11110011</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>&lt;&lt;</code></td>
 *       <td>Left Shift</td>
 *       <td>왼쪽으로 이동 (×2)</td>
 *       <td><code>1000 &lt;&lt; 2 = 100000</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>&gt;&gt;</code></td>
 *       <td>Right Shift</td>
 *       <td>오른쪽으로 이동 (÷2)</td>
 *       <td><code>1000 &gt;&gt; 2 = 10</code></td>
 *     </tr>
 *   </table>
 *   
 *   <h5>2의 보수 (Two's Complement)</h5>
 *   <ul>
 *     <li>음수 표현 방식</li>
 *     <li>비트 반전 후 1 더하기</li>
 *     <li>예: <code>-1 = ~0 + 1 = 11111111</code></li>
 *   </ul>
 * </div>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>2진법과 16진법 리터럴을 사용하세요</li>
 *   <li>비트 연산을 수행하세요</li>
 *   <li>음수의 2의 보수 표현을 이해하세요</li>
 * </ol>
 * 
 * <h4>힌트:</h4>
 * <ul>
 *   <li>2진법 접두사: <code>0b</code></li>
 *   <li>16진법 접두사: <code>0x</code></li>
 *   <li><code>Integer.toBinaryString()</code>으로 2진 문자열 확인</li>
 * </ul>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise02_BinaryRepresentation {
    public static void main(String[] args) {
        // TODO: Declare integers using different number systems
        // int decimal = 42;
        // int binary = 0b101010;  // 42 in binary
        // int hex = 0x2A;         // 42 in hexadecimal
        // int octal = 052;        // 42 in octal
        
        // TODO: Compare values
        // System.out.println("Decimal: " + decimal);
        // System.out.println("Binary: " + binary);
        // System.out.println("Hex: " + hex);
        // System.out.println("Octal: " + octal);
        // System.out.println("All equal? " + (decimal == binary && binary == hex && hex == octal));
        
        // TODO: Bitwise operations
        // int a = 0b1100;  // 12
        // int b = 0b1010;  // 10
        // int andResult = a & b;  // AND
        // int orResult = a | b;   // OR
        // int xorResult = a ^ b;  // XOR
        // int notResult = ~a;     // NOT
        
        // TODO: Bit shifting
        // int original = 8;  // 0b1000
        // int leftShift = original << 2;   // Multiply by 4
        // int rightShift = original >> 2;  // Divide by 4
        
        // TODO: Display binary representation
        // System.out.println("\nBitwise Operations:");
        // System.out.println(a + " & " + b + " = " + andResult);
        // System.out.println(a + " | " + b + " = " + orResult);
        // System.out.println(a + " ^ " + b + " = " + xorResult);
        // System.out.println("~" + a + " = " + notResult);
        
        // TODO: Show binary strings
        // System.out.println("\nBinary representations:");
        // System.out.println("8 in binary: " + Integer.toBinaryString(original));
        // System.out.println("8 << 2 = " + leftShift + " (binary: " + Integer.toBinaryString(leftShift) + ")");
        // System.out.println("8 >> 2 = " + rightShift + " (binary: " + Integer.toBinaryString(rightShift) + ")");
        
        // Expected output:
        // Decimal: 42
        // Binary: 42
        // Hex: 42
        // Octal: 42
        // All equal? true
        // 
        // Bitwise Operations:
        // 12 & 10 = 8
        // 12 | 10 = 14
        // 12 ^ 10 = 6
        // ~12 = -13
        // 
        // Binary representations:
        // 8 in binary: 1000
        // 8 << 2 = 32 (binary: 100000)
        // 8 >> 2 = 2 (binary: 10)
    }
}