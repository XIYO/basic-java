package javabasics.chapter02.basic;

/**
 * Chapter 02 - 연산자 (Operators)
 * 문제 5: 증감 연산자 완벽 이해하기
 * 
 * <h3>학습 목표:</h3>
 * <ul>
 *   <li>전위 증감 연산자(++x, --x)의 동작 원리 이해</li>
 *   <li>후위 증감 연산자(x++, x--)의 동작 원리 이해</li>
 *   <li>복잡한 표현식에서의 증감 연산자 활용</li>
 *   <li>실무에서 자주 사용되는 패턴 학습</li>
 * </ul>
 * 
 * <h3>증감 연산자 종류:</h3>
 * <table border="1">
 *   <tr><th>연산자</th><th>이름</th><th>동작</th><th>예시</th></tr>
 *   <tr><td>++x</td><td>전위 증가</td><td>먼저 증가, 그 다음 사용</td><td>int a = 5; int b = ++a; (a=6, b=6)</td></tr>
 *   <tr><td>x++</td><td>후위 증가</td><td>먼저 사용, 그 다음 증가</td><td>int a = 5; int b = a++; (a=6, b=5)</td></tr>
 *   <tr><td>--x</td><td>전위 감소</td><td>먼저 감소, 그 다음 사용</td><td>int a = 5; int b = --a; (a=4, b=4)</td></tr>
 *   <tr><td>x--</td><td>후위 감소</td><td>먼저 사용, 그 다음 감소</td><td>int a = 5; int b = a--; (a=4, b=5)</td></tr>
 * </table>
 * 
 * <h3>⚠️ 주의사항:</h3>
 * <ul>
 *   <li>한 표현식에서 같은 변수를 여러 번 증감시키면 예측하기 어려움</li>
 *   <li>복잡한 표현식보다는 명확한 코드 작성 권장</li>
 *   <li>디버깅이 어려울 수 있으므로 단순하게 사용</li>
 * </ul>
 * 
 * @author 자바 기초 학습
 * @version 1.0
 * @since Chapter 02
 */
public class Problem05_IncrementDecrement {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 문제 5-1: 후위 증가 연산자 (Post-increment)
         * ==========================================
         * x++ : 현재 값을 먼저 사용한 후, 값을 1 증가
         * 
         * [동작 순서]
         * 1. a의 현재 값(5)을 사용
         * 2. 그 다음 a를 1 증가시킴
         * 
         * 📌 실생활 예시: 배열 인덱스 접근, 반복문 카운터
         */
        int a = 5;
        System.out.println("초기값 a = " + a);
        System.out.println("a++ = " + a++);  // 먼저 사용 후 증가
        System.out.println("a = " + a);
        
        /*
         * ==========================================
         * 문제 5-2: 전위 증가 연산자 (Pre-increment)
         * ==========================================
         * ++x : 값을 먼저 1 증가시킨 후, 증가된 값을 사용
         * 
         * [동작 순서]
         * 1. b를 1 증가시킴 (5 → 6)
         * 2. 증가된 값(6)을 사용
         * 
         * 💡 TIP: 즉시 증가된 값이 필요할 때 사용
         */
        int b = 5;
        System.out.println("\n초기값 b = " + b);
        System.out.println("++b = " + ++b);  // 먼저 증가 후 사용
        System.out.println("b = " + b);
        
        /*
         * ==========================================
         * 문제 5-3: 후위 감소 연산자 (Post-decrement)
         * ==========================================
         * x-- : 현재 값을 먼저 사용한 후, 값을 1 감소
         * 
         * [동작 순서]
         * 1. c의 현재 값(10)을 사용
         * 2. 그 다음 c를 1 감소시킴
         * 
         * 📌 실생활 예시: 카운트다운, 역순 반복
         */
        int c = 10;
        System.out.println("\n초기값 c = " + c);
        System.out.println("c-- = " + c--);  // 먼저 사용 후 감소
        System.out.println("c = " + c);
        
        /*
         * ==========================================
         * 문제 5-4: 전위 감소 연산자 (Pre-decrement)
         * ==========================================
         * --x : 값을 먼저 1 감소시킨 후, 감소된 값을 사용
         * 
         * [동작 순서]
         * 1. d를 1 감소시킴 (10 → 9)
         * 2. 감소된 값(9)을 사용
         * 
         * 💡 TIP: 즉시 감소된 값이 필요할 때 사용
         */
        int d = 10;
        System.out.println("\n초기값 d = " + d);
        System.out.println("--d = " + --d);  // 먼저 감소 후 사용
        System.out.println("d = " + d);
        
        /*
         * ==========================================
         * 문제 5-5: 복잡한 표현식에서의 증감 연산자
         * ==========================================
         * 하나의 식에 여러 증감 연산자가 포함된 경우
         * 
         * [계산 과정]
         * x++ + ++y
         * = 5 + 11  (현재 x=5 사용, y는 먼저 11로 증가)
         * = 16
         * 결과 후: x=6, y=11
         * 
         * ⚠️ 주의: 가독성을 위해 복잡한 식은 피하세요
         * 💡 권장: 증감 연산을 분리하여 명확하게 표현
         */
        int x = 5;
        int y = 10;
        int result = x++ + ++y;
        System.out.println("\nx = 5, y = 10");
        System.out.println("x++ + ++y = " + result);
        System.out.println("x = " + x + ", y = " + y);
        
        /*
         * ==========================================
         * 문제 5-6: 증감 연산자 연습 문제
         * ==========================================
         * 전위와 후위의 차이를 명확히 이해하기
         * 
         * [계산 비교]
         * p++ * 2 = 3 * 2 = 6  (p는 나중에 4가 됨)
         * ++q * 2 = 4 * 2 = 8  (q는 먼저 4가 됨)
         * 
         * 🎓 학습 포인트:
         * - 후위: "사용 후 증가"
         * - 전위: "증가 후 사용"
         */
        int p = 3;
        int q = 3;
        int r1 = p++ * 2;  // p를 사용하고 나서 증가
        int r2 = ++q * 2;  // q를 증가시키고 나서 사용
        
        System.out.println("\np = 3, q = 3");
        System.out.println("p++ * 2 = " + r1 + ", p = " + p);
        System.out.println("++q * 2 = " + r2 + ", q = " + q);
        
        /*
         * ==========================================
         * 문제 5-7: 반복문에서의 증감 연산자
         * ==========================================
         * 증감 연산자의 실용적인 활용 예시
         * 
         * [카운트다운 동작]
         * 1. count(5) 출력 → count는 4가 됨
         * 2. count(4) 출력 → count는 3이 됨
         * 3. count(3) 출력 → count는 2가 됨
         * 4. count(2) 출력 → count는 1이 됨
         * 5. count(1) 출력 → count는 0이 됨
         * 6. count가 0이므로 반복 종료
         * 
         * 📌 활용: 타이머, 카운트다운, 역순 반복
         */
        System.out.println("\n카운트다운:");
        int count = 5;
        while (count > 0) {
            System.out.println(count--);
        }
        
        /*
         * ==========================================
         * 문제 5-8: 배열 인덱스와 증감 연산자
         * ==========================================
         * 배열 순회 시 증감 연산자의 활용
         * 
         * [동작 과정]
         * 1. arr[index++] = arr[0] = 10 출력, index는 1로 증가
         * 2. arr[++index] = index를 2로 만들고 arr[2] = 30 출력
         * 3. 최종 index = 2
         * 
         * ⚠️ 주의: 배열 범위를 벗어나지 않도록 주의
         * 💡 TIP: 복잡한 인덱스 연산은 분리하여 사용
         * 
         * 📈 실무 패턴: 
         * - while(index < arr.length) arr[index++]
         * - for(int i = 0; i < arr.length; i++)
         */
        int[] arr = {10, 20, 30, 40, 50};
        int index = 0;
        
        System.out.println("\n배열 요소 출력:");
        System.out.println("arr[index++] = " + arr[index++]);  // arr[0] 출력 후 index는 1
        System.out.println("arr[++index] = " + arr[++index]);  // index를 2로 만들고 arr[2] 출력
        System.out.println("현재 index = " + index);
    }
}