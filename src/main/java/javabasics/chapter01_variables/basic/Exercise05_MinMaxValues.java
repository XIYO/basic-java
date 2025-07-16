package main.java.javabasics.chapter01_variables.basic;

/**
 * <h3>Chapter 1 - 변수와 데이터 타입</h3>
 * <h3>문제 5: 기본 타입의 범위 (Primitive Type Ranges)</h3>
 * 
 * <p><b>목표:</b> 숫자형 기본 타입의 최소값과 최대값을 이해하고, 오버플로우/언더플로우 현상을 학습합니다.</p>
 * 
 * <h4>학습 내용: 래퍼 클래스(Wrapper Classes)와 타입 범위</h4>
 * 
 * <h5>1. 래퍼 클래스란?</h5>
 * <ul>
 *   <li>기본 타입을 객체로 다루기 위한 클래스</li>
 *   <li>각 기본 타입마다 대응하는 래퍼 클래스 존재</li>
 * </ul>
 * 
 * <table border="1" cellpadding="5">
 *   <tr>
 *     <th>기본 타입</th>
 *     <th>래퍼 클래스</th>
 *     <th>주요 상수</th>
 *   </tr>
 *   <tr>
 *     <td><code>byte</code></td>
 *     <td><code>Byte</code></td>
 *     <td><code>MIN_VALUE</code>, <code>MAX_VALUE</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>short</code></td>
 *     <td><code>Short</code></td>
 *     <td><code>MIN_VALUE</code>, <code>MAX_VALUE</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>int</code></td>
 *     <td><code>Integer</code></td>
 *     <td><code>MIN_VALUE</code>, <code>MAX_VALUE</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>long</code></td>
 *     <td><code>Long</code></td>
 *     <td><code>MIN_VALUE</code>, <code>MAX_VALUE</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>float</code></td>
 *     <td><code>Float</code></td>
 *     <td><code>MIN_VALUE</code>, <code>MAX_VALUE</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>double</code></td>
 *     <td><code>Double</code></td>
 *     <td><code>MIN_VALUE</code>, <code>MAX_VALUE</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>char</code></td>
 *     <td><code>Character</code></td>
 *     <td><code>MIN_VALUE</code>, <code>MAX_VALUE</code></td>
 *   </tr>
 *   <tr>
 *     <td><code>boolean</code></td>
 *     <td><code>Boolean</code></td>
 *     <td><code>TRUE</code>, <code>FALSE</code></td>
 *   </tr>
 * </table>
 * 
 * <h5>2. MIN_VALUE와 MAX_VALUE</h5>
 * <ul>
 *   <li>각 래퍼 클래스의 정적 상수</li>
 *   <li>해당 타입이 표현할 수 있는 최소/최대값</li>
 * </ul>
 * 
 * <h5>3. 오버플로우(Overflow)와 언더플로우(Underflow)</h5>
 * 
 *   <ul>
 *     <li><b>오버플로우:</b> 최대값을 초과하면 최소값으로 순환</li>
 *     <li><b>언더플로우:</b> 최소값 미만이면 최대값으로 순환</li>
 *     <li>예: <code>byte 127 + 1 = -128</code> (오버플로우)</li>
 *   </ul>
 * 
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>래퍼 클래스를 사용해 <code>MIN_VALUE</code>와 <code>MAX_VALUE</code>에 접근하세요</li>
 *   <li>각 숫자형 기본 타입의 범위를 출력하세요</li>
 *   <li>오버플로우와 언더플로우가 발생하는 경우를 테스트하세요</li>
 * </ol>
 * 
 * <h4>힌트:</h4>
 * <ul>
 *   <li>래퍼 클래스명.<code>MIN_VALUE</code>, 래퍼 클래스명.<code>MAX_VALUE</code> 사용</li>
 *   <li><code>int</code>는 <code>Integer</code> 클래스 사용 (<code>Int</code>가 아님!)</li>
 * </ul>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise05_MinMaxValues {
    public static void main(String[] args) {
        // TODO: 각 숫자형 타입의 최소값과 최대값 출력
        
        // byte 범위 출력
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        // 참고: byte는 1바이트(8비트)로 2^8 = 256개 값 표현 (-128 ~ 127)
        
        // TODO: short 범위 출력
        // 힌트: Short.MIN_VALUE, Short.MAX_VALUE 사용
        // 참고: short는 2바이트(16비트)로 2^16 = 65,536개 값 표현
        // 여기에 short 범위를 출력하는 코드를 작성하세요
        
        // TODO: int 범위 출력
        // 힌트: Integer.MIN_VALUE, Integer.MAX_VALUE 사용 (Int 아님!)
        // 참고: int는 4바이트(32비트)로 약 43억개 값 표현
        // 여기에 int 범위를 출력하는 코드를 작성하세요
        
        // TODO: long 범위 출력
        // 힌트: Long.MIN_VALUE, Long.MAX_VALUE 사용
        // 참고: long은 8바이트(64비트)로 엄청나게 큰 범위 표현
        // 여기에 long 범위를 출력하는 코드를 작성하세요
        
        // TODO: float 범위 출력
        // 힌트: Float.MIN_VALUE는 0에 가장 가까운 양수값
        // 실제 최소값은 -Float.MAX_VALUE
        // 여기에 float 범위를 출력하는 코드를 작성하세요
        
        // TODO: double 범위 출력
        // 힌트: Double.MIN_VALUE도 0에 가장 가까운 양수값
        // 실제 최소값은 -Double.MAX_VALUE
        // 여기에 double 범위를 출력하는 코드를 작성하세요
        
        // TODO: 오버플로우 테스트 - 최대값을 초과하면 어떻게 될까요?
        // byte 오버플로우 예제: Byte.MAX_VALUE에 1을 더하기
        byte overflowByte = (byte)(Byte.MAX_VALUE + 1);
        System.out.println("\nByte 오버플로우: " + Byte.MAX_VALUE + " + 1 = " + overflowByte);
        // 설명: 127 + 1 = -128 (최대값 초과시 최소값으로 순환)
        
        // TODO: 언더플로우 테스트 - 최소값 미만이면 어떻게 될까요?
        // byte 언더플로우 예제: Byte.MIN_VALUE에서 1을 빼기
        // 여기에 언더플로우 코드를 작성하세요
        // 힌트: byte underflowByte = (byte)(Byte.MIN_VALUE - 1);
        // System.out.println("Byte 언더플로우: " + Byte.MIN_VALUE + " - 1 = " + underflowByte);
        
        // TODO: int 오버플로우도 테스트해보세요
        // int 최대값에 1을 더하면?
        // 여기에 int 오버플로우 코드를 작성하세요
        
        // 예상 출력:
        // byte range: -128 to 127
        // short range: -32768 to 32767
        // int range: -2147483648 to 2147483647
        // long range: -9223372036854775808 to 9223372036854775807
        // float range: 1.4E-45 to 3.4028235E38
        // double range: 4.9E-324 to 1.7976931348623157E308
        // 
        // Byte 오버플로우: 127 + 1 = -128
        // Byte 언더플로우: -128 - 1 = 127
        
        // 🎯 추가 학습:
        // 1. 왜 byte의 범위가 -128 ~ 127일까? (2의 보수 표현법)
        // 2. float와 double의 MIN_VALUE가 음수가 아닌 이유는?
        // 3. 실무에서 오버플로우를 방지하는 방법은?
        
        // ⚠️ 주의사항:
        // 1. 연산 결과가 범위를 초과할 수 있는지 항상 확인
        // 2. 특히 반복문에서 카운터 오버플로우 주의
        // 3. 금융 계산에서는 BigDecimal 사용 권장
        // 4. 시스템 시간 계산시 long 타입 사용
    }
}