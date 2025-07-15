package main.java.javabasics.chapter05_loops.applied;

/**
 * <h2>Chapter 5 - 반복문 (Loops)</h2>
 * <h3>응용 문제 2: 소수 찾기</h3>
 * 
 * <h4>문제 설명</h4>
 * <p>소수(Prime Number)는 1과 자기 자신으로만 나누어지는 1보다 큰 자연수입니다.
 * 소수는 암호학, 컴퓨터 보안, 수학적 알고리즘 등 다양한 분야에서 중요하게 사용됩니다.
 * 이 문제에서는 중첩 반복문을 활용하여 주어진 범위 내의 모든 소수를 찾아봅니다.</p>
 * 
 * <h4>학습 목표</h4>
 * <ul>
 *   <li>중첩 반복문을 활용한 복잡한 조건 검사 구현하기</li>
 *   <li>플래그 변수(boolean)를 사용한 상태 관리 학습하기</li>
 *   <li>효율적인 알고리즘 설계 능력 기르기</li>
 * </ul>
 * 
 * <h4>문제 요구사항</h4>
 * <ul>
 *   <li>2부터 50까지의 수 중에서 소수를 모두 찾아 출력하세요</li>
 *   <li>소수들은 한 줄에 공백으로 구분하여 출력하세요</li>
 *   <li>중첩 반복문을 사용하여 구현하세요</li>
 * </ul>
 * 
 * <h4>소수 판별 알고리즘</h4>
 * <ol>
 *   <li>검사할 수 n을 선택 (2부터 50까지)</li>
 *   <li>n이 소수라고 가정 (isPrime = true)</li>
 *   <li>2부터 n-1까지의 수로 n을 나누어봄</li>
 *   <li>하나라도 나누어떨어지면 소수가 아님 (isPrime = false)</li>
 *   <li>isPrime이 true로 남아있으면 소수</li>
 * </ol>
 * 
 * <h4>힌트 및 도움말</h4>
 * <ul>
 *   <li>외부 반복문: <code>for(int i = 2; i <= 50; i++)</code></li>
 *   <li>내부 반복문: <code>for(int j = 2; j < i; j++)</code></li>
 *   <li>나누어떨어지는지 확인: <code>if(i % j == 0)</code></li>
 *   <li>플래그 변수 사용: <code>boolean isPrime = true;</code></li>
 *   <li>소수 출력: <code>System.out.print(i + " ");</code></li>
 * </ul>
 * 
 * <h4>최적화 아이디어</h4>
 * <ul>
 *   <li><strong>제곱근까지만 검사:</strong> n의 약수는 √n을 기준으로 대칭이므로 <code>j <= Math.sqrt(i)</code>까지만 검사</li>
 *   <li><strong>짝수 제외:</strong> 2를 제외한 모든 짝수는 소수가 아니므로 홀수만 검사</li>
 *   <li><strong>에라토스테네스의 체:</strong> 더 효율적인 소수 찾기 알고리즘</li>
 * </ul>
 * 
 * <h4>실무 응용</h4>
 * <ul>
 *   <li>RSA 암호화에서 큰 소수 생성</li>
 *   <li>해시 테이블 크기 결정</li>
 *   <li>난수 생성기 설계</li>
 * </ul>
 */
public class Problem02_PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("2부터 50까지의 소수:");
        
        // TODO: 소수를 찾아 출력하는 코드를 작성하세요
        
        
        
        
        // 예상 출력:
        // 2부터 50까지의 소수:
        // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
    }
}