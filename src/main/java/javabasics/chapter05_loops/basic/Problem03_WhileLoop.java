package javabasics.chapter05_loops.basic;

/**
 * <h2>Chapter 5 - 반복문 (Loops)</h2>
 * <h3>기초 문제 3: while문 기초</h3>
 * 
 * <h4>문제 설명</h4>
 * <p>while문은 조건이 참인 동안 계속 반복을 수행하는 반복문입니다.
 * for문과 달리 반복 횟수를 미리 알 수 없거나, 특정 조건이 만족될 때까지 
 * 반복해야 하는 경우에 유용합니다.</p>
 * 
 * <h4>학습 목표</h4>
 * <ul>
 *   <li>while문의 기본 구조 이해하기</li>
 *   <li>반복 조건의 설정과 변경 방법 학습하기</li>
 *   <li>무한 루프를 방지하는 방법 익히기</li>
 * </ul>
 * 
 * <h4>문제 요구사항</h4>
 * <ul>
 *   <li>while문을 사용하여 10부터 1까지 역순으로 출력하세요</li>
 *   <li>각 숫자는 새로운 줄에 출력되어야 합니다</li>
 *   <li>for문이 아닌 while문을 반드시 사용하세요</li>
 * </ul>
 * 
 * <h4>힌트 및 도움말</h4>
 * <ul>
 *   <li>while문의 기본 구조: <code>while(조건) { 반복할 코드 }</code></li>
 *   <li>카운터 변수를 while문 밖에서 먼저 선언하세요 (예: <code>int i = 10;</code>)</li>
 *   <li>반복문 내에서 카운터를 감소시키는 것을 잊지 마세요 (<code>i--</code>)</li>
 *   <li>조건식 예시: <code>i >= 1</code> 또는 <code>i > 0</code></li>
 * </ul>
 * 
 * <h4>주의사항</h4>
 * <p><strong>무한 루프 주의!</strong> 카운터를 감소시키지 않으면 조건이 계속 참이 되어 
 * 프로그램이 멈추지 않습니다.</p>
 * 
 * <h4>IntelliJ 팁</h4>
 * <ul>
 *   <li><kbd>while</kbd> 입력 후 <kbd>Tab</kbd>키: while문 템플릿 자동 생성</li>
 *   <li><kbd>Shift+F6</kbd>: 변수명 일괄 변경</li>
 * </ul>
 */
public class Problem03_WhileLoop {
    public static void main(String[] args) {
        // TODO: 10부터 1까지 출력하는 while문을 작성하세요
        
        
        
        
        // 예상 출력:
        // 10
        // 9
        // 8
        // 7
        // 6
        // 5
        // 4
        // 3
        // 2
        // 1
    }
}