package main.java.javabasics.chapter02_operators.basic;

/**
 * Chapter 02 - 연산자 (Operators)
 * 연습문제 3: 논리 연산자 마스터하기
 * 
 * <h3>학습 목표:</h3>
 * <ul>
 *   <li>논리 연산자 3가지 (&&, ||, !) 완벽 이해</li>
 *   <li>복합 조건문 작성 능력 향상</li>
 *   <li>단락 평가(Short-circuit evaluation) 개념 학습</li>
 *   <li>논리 연산자 우선순위 파악</li>
 * </ul>
 * 
 * <h3>논리 연산자 종류:</h3>
 * <pre>
 * &&  : AND 연산자 (둘 다 true일 때만 true)
 * ||  : OR 연산자 (하나라도 true면 true)
 * !   : NOT 연산자 (true ↔ false 반전)
 * </pre>
 * 
 * <h3>연산자 우선순위:</h3>
 * <ol>
 *   <li>! (NOT)</li>
 *   <li>&& (AND)</li>
 *   <li>|| (OR)</li>
 * </ol>
 * 
 * <h3>💡 중요 개념 - 단락 평가:</h3>
 * <p>논리 연산자는 왼쪽부터 평가하며, 결과가 확정되면 나머지는 평가하지 않습니다.</p>
 * <ul>
 *   <li>&& : 왼쪽이 false면 오른쪽 평가 안함</li>
 *   <li>|| : 왼쪽이 true면 오른쪽 평가 안함</li>
 * </ul>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise03_LogicalOperators {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 문제 3-1: AND 연산자 (&&) 기본 활용
         * ==========================================
         * 두 조건이 모두 참일 때만 true를 반환
         * 
         * [AND 연산자 진리표]
         * true  && true  = true
         * true  && false = false
         * false && true  = false
         * false && false = false
         * 
         * 📌 실생활 예시: 비가 오고(AND) 우산이 있어야 우산을 쓸 수 있음
         */
        // TODO: 두 개의 boolean 변수를 선언하세요
        // boolean isRaining = true;
        // boolean hasUmbrella = false;
        
        // TODO: 비가 오고(AND) 우산이 있는 경우를 판단하는 논리식을 완성하세요
        // System.out.println("비가 오고 우산이 있나요? " + ???);
        
        /*
         * ==========================================
         * 문제 3-2: OR 연산자 (||) 기본 활용
         * ==========================================
         * 두 조건 중 하나라도 참이면 true를 반환
         * 
         * [OR 연산자 진리표]
         * true  || true  = true
         * true  || false = true
         * false || true  = true
         * false || false = false
         * 
         * 📌 실생활 예시: 차나(OR) 자전거 중 하나만 있어도 이동 가능
         */
        // TODO: 두 개의 boolean 변수를 선언하세요
        // boolean hasCar = false;
        // boolean hasBicycle = true;
        
        // TODO: 차나(OR) 자전거 중 하나라도 있는지 판단하는 논리식을 완성하세요
        // System.out.println("차나 자전거가 있나요? " + ???);
        
        /*
         * ==========================================
         * 문제 3-3: NOT 연산자 (!) 활용
         * ==========================================
         * boolean 값을 반전시킴 (true ↔ false)
         * 
         * [NOT 연산자 진리표]
         * !true  = false
         * !false = true
         * 
         * 💡 TIP: 조건을 반대로 만들 때 유용
         * 📌 실생활 예시: "주말이 아니다" = "평일이다"
         */
        // TODO: boolean 변수를 선언하세요
        // boolean isWeekend = false;
        
        // TODO: 주말이 아닌지(NOT) 판단하는 논리식을 완성하세요
        // System.out.println("평일인가요? " + ???);
        
        /*
         * ==========================================
         * 문제 3-4: 복합 조건 - 운전 가능 여부 판단
         * ==========================================
         * 여러 조건을 논리 연산자로 결합
         * 
         * [운전 가능 조건]
         * 1. 18세 이상 (법적 운전 가능 나이)
         * 2. 운전면허 보유
         * 3. 자동차 보험 가입
         * 
         * ⚠️ 모든 조건을 만족해야 함 (AND 연산)
         * 
         * 💡 TIP: 복잡한 조건은 변수로 분리하면 가독성 향상
         */
        // TODO: 필요한 변수들을 선언하세요
        // int age = 25;
        // boolean hasLicense = true;
        // boolean isInsured = true;
        
        // TODO: 18세 이상이고, 면허가 있고, 보험에 가입했는지 모두 확인하는 복합 조건을 작성하세요
        // boolean canDrive = ???;
        // System.out.println("\n운전할 수 있나요? " + canDrive);
        
        /*
         * ==========================================
         * 문제 3-5: 복잡한 논리 연산 - 과목 통과 여부
         * ==========================================
         * AND와 OR를 함께 사용하는 복합 조건
         * 
         * [통과 조건]
         * 방법 1: 점수 70점 이상 AND 출석
         * 방법 2: 숙제 제출 (특별 구제)
         * 
         * [계산 순서]
         * (score >= 70 && attended) || submittedHomework
         * = (75 >= 70 && true) || false
         * = (true && true) || false
         * = true || false
         * = true
         * 
         * 🎓 학습 포인트: 괄호로 연산 순서를 명확히!
         */
        // TODO: 필요한 변수들을 선언하세요
        // int score = 75;
        // boolean attended = true;
        // boolean submittedHomework = false;
        
        // TODO: (점수가 70 이상이고 출석했거나) 또는 (숙제를 제출했는지) 판단하는 복합 조건을 작성하세요
        // boolean passed = ???;
        // System.out.println("통과했나요? " + passed);
        
        /*
         * ==========================================
         * 문제 3-6: 단락 평가 (Short-circuit evaluation)
         * ==========================================
         * 논리 연산자의 효율적인 평가 방식
         * 
         * [단락 평가란?]
         * - && : 왼쪽이 false면 오른쪽 평가 안함
         * - || : 왼쪽이 true면 오른쪽 평가 안함
         * 
         * [이 예제의 중요성]
         * - y가 0일 때 x/y는 ArithmeticException 발생
         * - (y != 0)이 false이므로 && 뒤는 실행 안됨
         * - 결과: 에러 없이 false 반환
         * 
         * ⚠️ 주의: 조건 순서가 중요합니다!
         * 💡 활용: null 체크, 배열 범위 체크 등
         */
        // TODO: 두 개의 정수 변수를 선언하세요
        // int x = 5;
        // int y = 0;
        
        // TODO: y가 0일 때 나누기 연산을 피하는 안전한 조건을 작성하세요
        // 힌트: y가 0이 아닌지 먼저 확인해야 합니다
        // boolean result = ???;
        // System.out.println("\n안전한 나누기 결과: " + result);
        
        /*
         * ==========================================
         * 문제 3-7: 논리 연산자 우선순위
         * ==========================================
         * 연산자 우선순위에 따른 결과 차이 이해
         * 
         * [우선순위 (높음 → 낮음)]
         * 1. ! (NOT)
         * 2. && (AND)
         * 3. || (OR)
         * 
         * [계산 과정 비교]
         * 식1: a || b && c
         *     = a || (b && c)    // &&가 먼저
         *     = true || (false && true)
         *     = true || false
         *     = true
         * 
         * 식2: (a || b) && c
         *     = (true || false) && true
         *     = true && true
         *     = true
         * 
         * 🔍 결론: 괄호로 우선순위를 명시하면 실수 방지!
         */
        // TODO: 세 개의 boolean 변수를 선언하세요
        // boolean a = true;
        // boolean b = false;
        // boolean c = true;
        
        // TODO: 아래 주석을 해제하고 연산자 우선순위를 확인하세요
        // System.out.println("\na || b && c = " + ???);
        // System.out.println("(a || b) && c = " + ???);
    }
}