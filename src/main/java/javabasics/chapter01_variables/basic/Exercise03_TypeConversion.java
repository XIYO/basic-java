package javabasics.chapter01_variables.basic;

/**
 * <h2>Chapter 1 - 변수와 데이터 타입</h2>
 * <h3>문제 3: 타입 변환 (Type Conversion)</h3>
 * 
 * <p><strong>목표:</strong> 형변환(Type Casting)을 이해하고 활용할 수 있습니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * <div style="border: 2px solid #4CAF50; border-radius: 8px; padding: 15px; background-color: #f5f5f5;">
 *   <h5 style="color: #2E7D32;">📚 타입 변환 (Type Conversion)</h5>
 *   
 *   <h6>1. 자동 형변환 (Implicit/Widening Conversion)</h6>
 *   <ul>
 *     <li>작은 타입 → 큰 타입으로 자동 변환</li>
 *     <li>데이터 손실이 없어 안전함</li>
 *     <li>예: <code>byte</code> → <code>short</code> → <code>int</code> → <code>long</code> → <code>float</code> → <code>double</code></li>
 *   </ul>
 *   
 *   <h6>2. 강제 형변환 (Explicit/Narrowing Conversion)</h6>
 *   <ul>
 *     <li>큰 타입 → 작은 타입으로 변환</li>
 *     <li>데이터 손실 가능성이 있어 명시적 캐스팅 필요</li>
 *     <li>문법: <code>(타입명) 변수</code></li>
 *   </ul>
 *   
 *   <h6>3. 형변환 규칙</h6>
 *   <table border="1" cellpadding="5" style="margin-top: 10px;">
 *     <tr style="background-color: #e8f5e9;">
 *       <th>변환 유형</th>
 *       <th>설명</th>
 *       <th>예시</th>
 *     </tr>
 *     <tr>
 *       <td>정수 → 실수</td>
 *       <td>자동 변환</td>
 *       <td><code>int</code> → <code>double</code></td>
 *     </tr>
 *     <tr>
 *       <td>실수 → 정수</td>
 *       <td>강제 변환 필요, 소수점 이하 버림</td>
 *       <td><code>(int) 3.14</code> → <code>3</code></td>
 *     </tr>
 *     <tr>
 *       <td><code>boolean</code></td>
 *       <td>다른 타입으로 변환 불가</td>
 *       <td>-</td>
 *     </tr>
 *   </table>
 * </div>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li><code>doubleValue</code>를 정수형으로 변환하여 <code>intValue</code>에 저장하세요</li>
 *   <li><code>intNumber</code>를 실수형으로 변환하여 <code>doubleNumber</code>에 저장하세요</li>
 * </ol>
 * 
 * <h4>힌트:</h4>
 * <ul>
 *   <li><code>double</code>을 <code>int</code>로 변환: <code>(int)</code> 사용</li>
 *   <li><code>int</code>를 <code>double</code>로 변환: 자동 변환되지만 명시적으로 <code>(double)</code> 사용 가능</li>
 * </ul>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise03_TypeConversion {
    public static void main(String[] args) {
        double doubleValue = 3.14;
        int intNumber = 42;
        
        // TODO: doubleValue를 정수형으로 변환
        // 실수를 정수로 변환할 때는 소수점 이하가 버려집니다
        // 예시: (int) 3.14 → 3
        // 예시: (int) 3.99 → 3 (반올림 X, 버림 O)
        int intValue = // ???
        
        // TODO: intNumber를 실수형으로 변환
        // 정수를 실수로 변환할 때는 .0이 추가됩니다
        // 예시: (double) 42 → 42.0
        // 참고: int → double은 자동 변환되므로 캐스팅 없이도 가능
        double doubleNumber = // ???
        
        // 아래 코드는 수정하지 마세요
        System.out.println("3.14를 정수로 변환: " + intValue);
        System.out.println("42를 실수로 변환: " + doubleNumber);
        
        // 예상 출력:
        // 3.14를 정수로 변환: 3
        // 42를 실수로 변환: 42.0
        
        // 🎯 추가 학습:
        // 다음과 같은 형변환도 시도해보세요:
        // - char를 int로 변환 (문자의 유니코드 값)
        // - int를 char로 변환 (유니코드를 문자로)
        // - byte 오버플로우 테스트: (byte) 200은 어떤 값이 될까요?
        
        // ⚠️ 주의사항:
        // 1. 큰 타입을 작은 타입으로 변환할 때 데이터 손실 주의
        // 2. 음수를 unsigned 타입으로 변환할 때 예상치 못한 결과 발생 가능
        // 3. 실수 연산 후 정수 변환 시 정밀도 손실 고려
    }
}