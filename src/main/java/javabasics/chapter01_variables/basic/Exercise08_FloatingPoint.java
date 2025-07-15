package javabasics.chapter01_variables.basic;

/**
 * <h2>Chapter 1: 변수와 데이터 타입</h2>
 * <h3>문제 8: 부동소수점 정밀도 (Floating Point Precision)</h3>
 * 
 * <p><strong>목표:</strong> <code>float</code>와 <code>double</code>의 정밀도 차이를 이해합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * <div style="border: 2px solid #ff9800; border-radius: 8px; padding: 15px; background-color: #fff3e0;">
 *   <h5>float vs double 비교</h5>
 *   <table border="1" cellpadding="5">
 *     <tr style="background-color: #ffe0b2;">
 *       <th>특성</th>
 *       <th><code>float</code></th>
 *       <th><code>double</code></th>
 *     </tr>
 *     <tr>
 *       <td>크기</td>
 *       <td>4 bytes (32 bits)</td>
 *       <td>8 bytes (64 bits)</td>
 *     </tr>
 *     <tr>
 *       <td>정밀도</td>
 *       <td>약 7자리</td>
 *       <td>약 15자리</td>
 *     </tr>
 *     <tr>
 *       <td>범위</td>
 *       <td>±3.4×10<sup>-38</sup> ~ ±3.4×10<sup>38</sup></td>
 *       <td>±1.7×10<sup>-308</sup> ~ ±1.7×10<sup>308</sup></td>
 *     </tr>
 *     <tr>
 *       <td>리터럴</td>
 *       <td><code>3.14f</code> (f 접미사 필수)</td>
 *       <td><code>3.14</code> (기본값)</td>
 *     </tr>
 *   </table>
 *   
 *   <h5>사용 시 주의사항</h5>
 *   <ul>
 *     <li><strong>정밀도 손실:</strong> 너무 많은 소수 자리는 반올림됨</li>
 *     <li><strong>비교 연산:</strong> 부동소수점은 정확한 비교 어려움</li>
 *     <li><strong>금융 계산:</strong> <code>BigDecimal</code> 사용 권장</li>
 *   </ul>
 *   
 *   <h5>선택 기준</h5>
 *   <ul>
 *     <li><code>float</code>: 메모리 절약이 중요하고 정밀도가 덜 중요한 경우</li>
 *     <li><code>double</code>: 일반적인 실수 연산 (기본 권장)</li>
 *   </ul>
 * </div>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li><code>float</code>와 <code>double</code> 변수를 선언하세요</li>
 *   <li><code>float</code>와 <code>double</code> 간의 정밀도를 비교하세요</li>
 *   <li>각 타입을 언제 사용해야 하는지 이해하세요</li>
 * </ol>
 * 
 * <h4>힌트:</h4>
 * <ul>
 *   <li><code>float</code>는 <code>f</code> 접미사 사용</li>
 *   <li><code>double</code>은 소수의 기본 타입</li>
 * </ul>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise08_FloatingPoint {
    public static void main(String[] args) {
        // TODO: Declare float and double for PI
        // float piFloat = 3.14159265358979323846f;
        // double piDouble = 3.14159265358979323846;
        
        // TODO: Decimal calculations
        // float priceFloat = 19.99f;
        // double priceDouble = 19.99;
        // float taxFloat = priceFloat * 0.08f;
        // double taxDouble = priceDouble * 0.08;
        
        // TODO: Division precision test
        // float divFloat = 10f / 3f;
        // double divDouble = 10.0 / 3.0;
        
        // TODO: Very small numbers
        // float smallFloat = 0.0000001f;
        // double smallDouble = 0.0000001;
        
        // Print comparisons
        // System.out.println("Float PI: " + piFloat);
        // System.out.println("Double PI: " + piDouble);
        // System.out.println("Float division 10/3: " + divFloat);
        // System.out.println("Double division 10/3: " + divDouble);
        // System.out.println("Float tax: " + taxFloat);
        // System.out.println("Double tax: " + taxDouble);
        
        // Expected output:
        // Float PI: 3.1415927
        // Double PI: 3.141592653589793
        // Float division 10/3: 3.3333333
        // Double division 10/3: 3.3333333333333335
        // Float tax: 1.5992
        // Double tax: 1.5992
    }
}