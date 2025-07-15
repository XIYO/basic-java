package javabasics.chapter05_loops.applied;

/**
 * <h2>Chapter 5 - 반복문 (Loops)</h2>
 * <h3>응용 문제 1: 팩토리얼 계산</h3>
 * 
 * <h4>문제 설명</h4>
 * <p>팩토리얼(Factorial)은 1부터 어떤 양의 정수 n까지의 모든 정수를 곱한 값입니다.
 * 수학적으로 n!로 표기하며, 순열과 조합, 확률 계산 등에서 자주 사용됩니다.
 * 이 문제에서는 반복문을 사용하여 팩토리얼을 계산하는 알고리즘을 구현합니다.</p>
 * 
 * <h4>학습 목표</h4>
 * <ul>
 *   <li>반복문을 사용한 누적 곱셈 구현하기</li>
 *   <li>큰 수를 다루기 위한 자료형 선택 이해하기</li>
 *   <li>수학적 개념을 프로그래밍으로 구현하는 능력 기르기</li>
 * </ul>
 * 
 * <h4>문제 요구사항</h4>
 * <ul>
 *   <li>주어진 숫자(number)의 팩토리얼을 계산하세요</li>
 *   <li>반복문(for 또는 while)을 사용하여 구현하세요</li>
 *   <li>결과는 factorial 변수에 저장하세요</li>
 * </ul>
 * 
 * <h4>팩토리얼 예시</h4>
 * <table border="1">
 *   <tr><th>n</th><th>n!</th><th>계산 과정</th></tr>
 *   <tr><td>0</td><td>1</td><td>정의에 의해 1</td></tr>
 *   <tr><td>1</td><td>1</td><td>1</td></tr>
 *   <tr><td>3</td><td>6</td><td>3 × 2 × 1</td></tr>
 *   <tr><td>5</td><td>120</td><td>5 × 4 × 3 × 2 × 1</td></tr>
 * </table>
 * 
 * <h4>힌트 및 도움말</h4>
 * <ul>
 *   <li>for문 사용: <code>for(int i = 1; i <= number; i++)</code></li>
 *   <li>while문 사용: 카운터를 number부터 1까지 감소시키는 방법도 가능</li>
 *   <li>누적 곱셈: <code>factorial = factorial * i</code> 또는 <code>factorial *= i</code></li>
 *   <li>factorial 변수는 이미 1로 초기화되어 있습니다</li>
 * </ul>
 * 
 * <h4>주의사항</h4>
 * <ul>
 *   <li><strong>오버플로우 주의:</strong> 팩토리얼은 매우 빠르게 커집니다 (20! = 2,432,902,008,176,640,000)</li>
 *   <li>long 타입을 사용하여 더 큰 수를 처리할 수 있습니다</li>
 *   <li>0! = 1 이라는 수학적 정의를 기억하세요</li>
 * </ul>
 * 
 * <h4>실무 응용</h4>
 * <ul>
 *   <li>순열/조합 계산 (nPr = n!/(n-r)!)</li>
 *   <li>확률 문제 해결</li>
 *   <li>알고리즘 시간 복잡도 분석</li>
 * </ul>
 */
public class Problem01_Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;  // long 타입 사용 (큰 수를 위해)
        
        // TODO: number의 팩토리얼을 계산하세요
        
        
        
        // 아래 코드는 수정하지 마세요
        System.out.println(number + "! = " + factorial);
        
        // 예상 출력: 5! = 120
    }
}