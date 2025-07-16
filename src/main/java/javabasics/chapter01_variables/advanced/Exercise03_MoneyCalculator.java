package main.java.javabasics.chapter01_variables.advanced;

/**
 * <h3>Chapter 1: 변수와 데이터 타입 - 심화</h3>
 * <h3>문제 3: 정밀한 금액 계산기 (Money Calculator with Precision)</h3>
 * 
 * <p><b>목표:</b> 금전 계산을 정밀하게 처리하는 방법을 학습합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * 
 *   <h5>금전 계산의 주의사항</h5>
 *   <ul>
 *     <li><b>부동소수점 정밀도 문제:</b> <code>0.1 + 0.2 ≠ 0.3</code></li>
 *     <li><b>반올림 처리:</b> 통화는 보통 소수점 2자리까지 표시</li>
 *     <li><b>실무 권장사항:</b> <code>BigDecimal</code> 사용</li>
 *   </ul>
 *   
 *   <h5>계산 순서</h5>
 *   <ol>
 *     <li>소계 (Subtotal) = 상품 가격 합계</li>
 *     <li>할인 금액 = 소계 × (할인율 / 100)</li>
 *     <li>할인 후 금액 = 소계 - 할인 금액</li>
 *     <li>세금 = 할인 후 금액 × (세율 / 100)</li>
 *     <li>총액 = 할인 후 금액 + 세금</li>
 *   </ol>
 *   
 *   <h5>반올림 방법</h5>
 *   <table border="1" cellpadding="5">
 *     <tr>
 *       <th>방법</th>
 *       <th>코드</th>
 *       <th>설명</th>
 *     </tr>
 *     <tr>
 *       <td>소수점 2자리</td>
 *       <td><code>Math.round(value * 100.0) / 100.0</code></td>
 *       <td>센트 단위 반올림</td>
 *     </tr>
 *     <tr>
 *       <td>정수</td>
 *       <td><code>Math.round(value)</code></td>
 *       <td>원 단위 반올림</td>
 *     </tr>
 *     <tr>
 *       <td>올림</td>
 *       <td><code>Math.ceil(value)</code></td>
 *       <td>항상 위로 반올림</td>
 *     </tr>
 *     <tr>
 *       <td>버림</td>
 *       <td><code>Math.floor(value)</code></td>
 *       <td>항상 아래로 반올림</td>
 *     </tr>
 *   </table>
 *   
 *   <h5>환율 계산</h5>
 *   <ul>
 *     <li>환율: 1 USD = 1,320.50 KRW (예시)</li>
 *     <li>원화 금액 = 달러 금액 × 환율</li>
 *     <li>환전 수수료 고려 필요</li>
 *   </ul>
 * 
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>가격, 세금, 할인을 계산하세요</li>
 *   <li>통화 정밀도 문제를 처리하세요</li>
 *   <li>금액을 적절히 반올림하세요</li>
 * </ol>
 * 
 * <h4>참고:</h4>
 * <p><b>주의:</b> 실제 애플리케이션에서는 금전 계산에 <code>BigDecimal</code>을 사용하세요!</p>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise03_MoneyCalculator {
    public static void main(String[] args) {
        // TODO: 상품 가격 설정하기
        // 여기에 노트북, 마우스, 키보드 가격을 설정하는 코드를 작성하세요
        double laptopPrice = 0.0; // TODO: 1299.99로 변경하세요
        double mousePrice = 0.0; // TODO: 29.99로 변경하세요
        double keyboardPrice = 0.0; // TODO: 89.99로 변경하세요
        
        // TODO: 소계 계산하기
        // 여기에 세 상품의 총 가격을 계산하는 코드를 작성하세요
        double subtotal = 0.0; // TODO: laptopPrice + mousePrice + keyboardPrice로 변경하세요
        
        // TODO: 할인 적용하기
        double discountPercent = 15.0;  // 15% 할인
        // 여기에 할인 금액을 계산하는 코드를 작성하세요
        double discountAmount = 0.0; // TODO: subtotal * (discountPercent / 100)로 변경하세요
        // 여기에 할인 후 금액을 계산하는 코드를 작성하세요
        double afterDiscount = 0.0; // TODO: subtotal - discountAmount로 변경하세요
        
        // TODO: 세금 계산하기
        double taxRate = 8.25;  // 8.25% 세금
        // 여기에 세금 금액을 계산하는 코드를 작성하세요
        double taxAmount = 0.0; // TODO: afterDiscount * (taxRate / 100)로 변경하세요
        // 여기에 총액을 계산하는 코드를 작성하세요
        double total = 0.0; // TODO: afterDiscount + taxAmount로 변경하세요
        
        // TODO: 환율 변환하기
        double usdToKrw = 1320.50;  // 1 USD = 1320.50 KRW
        // 여기에 원화 금액을 계산하는 코드를 작성하세요
        double totalInKrw = 0.0; // TODO: total * usdToKrw로 변경하세요
        
        // TODO: 소수점 2자리로 반올림하기
        // 여기에 총액을 소수점 2자리로 반올림하는 코드를 작성하세요
        double roundedTotal = 0.0; // TODO: Math.round(total * 100.0) / 100.0으로 변경하세요
        
        // TODO: 고객이 구매 가능한지 확인하기
        double customerBudget = 1500.00;
        // 여기에 고객의 예산이 총액 이상인지 확인하는 코드를 작성하세요
        boolean canAfford = false; // TODO: customerBudget >= total로 변경하세요
        
        // 영수증 출력
        System.out.println("===== Shopping Receipt =====");
        System.out.println("Laptop: $" + laptopPrice);
        System.out.println("Mouse: $" + mousePrice);
        System.out.println("Keyboard: $" + keyboardPrice);
        System.out.println("------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Discount (" + discountPercent + "%): -$" + Math.round(discountAmount * 100.0) / 100.0);
        System.out.println("After discount: $" + Math.round(afterDiscount * 100.0) / 100.0);
        System.out.println("Tax (" + taxRate + "%): +$" + Math.round(taxAmount * 100.0) / 100.0);
        System.out.println("========================");
        System.out.println("Total: $" + roundedTotal);
        System.out.println("Total in KRW: ₩" + Math.round(totalInKrw));
        System.out.println("\nBudget: $" + customerBudget);
        System.out.println("Can afford? " + canAfford);
        
        // Expected output:
        // ===== Shopping Receipt =====
        // Laptop: $1299.99
        // Mouse: $29.99
        // Keyboard: $89.99
        // ------------------------
        // Subtotal: $1419.97
        // Discount (15.0%): -$213.0
        // After discount: $1206.97
        // Tax (8.25%): +$99.58
        // ========================
        // Total: $1306.55
        // Total in KRW: ₩1725799
        // 
        // Budget: $1500.0
        // Can afford? true
    }
}