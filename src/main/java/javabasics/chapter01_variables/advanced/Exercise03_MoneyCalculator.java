package main.java.javabasics.chapter01_variables.advanced;

/**
 * <h2>Chapter 1: 변수와 데이터 타입 - 심화</h2>
 * <h3>문제 3: 정밀한 금액 계산기 (Money Calculator with Precision)</h3>
 * 
 * <p><strong>목표:</strong> 금전 계산을 정밀하게 처리하는 방법을 학습합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * <div style="border: 2px solid #4caf50; border-radius: 8px; padding: 15px; background-color: #e8f5e9;">
 *   <h5>금전 계산의 주의사항</h5>
 *   <ul>
 *     <li><strong>부동소수점 정밀도 문제:</strong> <code>0.1 + 0.2 ≠ 0.3</code></li>
 *     <li><strong>반올림 처리:</strong> 통화는 보통 소수점 2자리까지 표시</li>
 *     <li><strong>실무 권장사항:</strong> <code>BigDecimal</code> 사용</li>
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
 *     <tr style="background-color: #c8e6c9;">
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
 * </div>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>가격, 세금, 할인을 계산하세요</li>
 *   <li>통화 정밀도 문제를 처리하세요</li>
 *   <li>금액을 적절히 반올림하세요</li>
 * </ol>
 * 
 * <h4>참고:</h4>
 * <p style="color: #d32f2f;"><strong>주의:</strong> 실제 애플리케이션에서는 금전 계산에 <code>BigDecimal</code>을 사용하세요!</p>
 * 
 * @author Task Master AI
 * @version 1.0
 * @since 2024-01-01
 */
public class Exercise03_MoneyCalculator {
    public static void main(String[] args) {
        // TODO: Product prices
        // double laptopPrice = 1299.99;
        // double mousePrice = 29.99;
        // double keyboardPrice = 89.99;
        
        // TODO: Calculate subtotal
        // double subtotal = laptopPrice + mousePrice + keyboardPrice;
        
        // TODO: Apply discount
        // double discountPercent = 15.0;  // 15% discount
        // double discountAmount = subtotal * (discountPercent / 100);
        // double afterDiscount = subtotal - discountAmount;
        
        // TODO: Calculate tax
        // double taxRate = 8.25;  // 8.25% tax
        // double taxAmount = afterDiscount * (taxRate / 100);
        // double total = afterDiscount + taxAmount;
        
        // TODO: Currency conversion
        // double usdToKrw = 1320.50;  // 1 USD = 1320.50 KRW
        // double totalInKrw = total * usdToKrw;
        
        // TODO: Round to 2 decimal places for display
        // double roundedTotal = Math.round(total * 100.0) / 100.0;
        
        // TODO: Check if customer can afford
        // double customerBudget = 1500.00;
        // boolean canAfford = customerBudget >= total;
        
        // Display receipt
        // System.out.println("===== Shopping Receipt =====");
        // System.out.println("Laptop: $" + laptopPrice);
        // System.out.println("Mouse: $" + mousePrice);
        // System.out.println("Keyboard: $" + keyboardPrice);
        // System.out.println("------------------------");
        // System.out.println("Subtotal: $" + subtotal);
        // System.out.println("Discount (" + discountPercent + "%): -$" + Math.round(discountAmount * 100.0) / 100.0);
        // System.out.println("After discount: $" + Math.round(afterDiscount * 100.0) / 100.0);
        // System.out.println("Tax (" + taxRate + "%): +$" + Math.round(taxAmount * 100.0) / 100.0);
        // System.out.println("========================");
        // System.out.println("Total: $" + roundedTotal);
        // System.out.println("Total in KRW: ₩" + Math.round(totalInKrw));
        // System.out.println("\nBudget: $" + customerBudget);
        // System.out.println("Can afford? " + canAfford);
        
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