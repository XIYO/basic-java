package main.java.javabasics.chapter05_loops.basic;

/**
 * <h2>Chapter 5 - 반복문 (Loops)</h2>
 * <h3>기초 문제 5: 중첩 반복문</h3>
 * 
 * <h4>문제 설명</h4>
 * <p>중첩 반복문(Nested Loops)은 반복문 안에 또 다른 반복문을 포함하는 구조입니다.
 * 2차원 배열 처리, 패턴 출력, 구구단 등 행과 열을 가진 데이터를 다룰 때 필수적입니다.
 * 이 문제에서는 중첩 for문을 사용하여 간단한 도형 패턴을 그려봅니다.</p>
 * 
 * <h4>학습 목표</h4>
 * <ul>
 *   <li>중첩 반복문의 동작 원리 이해하기</li>
 *   <li>외부 루프와 내부 루프의 관계 파악하기</li>
 *   <li>반복문을 이용한 패턴 생성 방법 학습하기</li>
 * </ul>
 * 
 * <h4>문제 요구사항</h4>
 * <ul>
 *   <li>중첩 for문을 사용하여 직각삼각형 모양의 별(*) 패턴을 출력하세요</li>
 *   <li>총 5줄로 구성된 삼각형을 만드세요</li>
 *   <li>각 줄의 별 개수는 줄 번호와 같아야 합니다 (1줄: 1개, 2줄: 2개...)</li>
 * </ul>
 * 
 * <h4>힌트 및 도움말</h4>
 * <ul>
 *   <li>외부 for문: 줄 수를 제어 (<code>for(int i = 1; i <= 5; i++)</code>)</li>
 *   <li>내부 for문: 각 줄의 별 개수를 제어 (<code>for(int j = 1; j <= i; j++)</code>)</li>
 *   <li><code>System.out.print("*")</code>로 별을 같은 줄에 출력</li>
 *   <li>각 줄이 끝나면 <code>System.out.println()</code>으로 줄바꿈</li>
 * </ul>
 * 
 * <h4>중첩 반복문 실행 과정</h4>
 * <pre>
 * i=1: j=1        → *
 * i=2: j=1,2      → **
 * i=3: j=1,2,3    → ***
 * i=4: j=1,2,3,4  → ****
 * i=5: j=1,2,3,4,5→ *****
 * </pre>
 * 
 * <h4>응용 아이디어</h4>
 * <ul>
 *   <li>역삼각형 패턴: 내부 루프 조건을 <code>j <= 6-i</code>로 변경</li>
 *   <li>숫자 패턴: 별 대신 <code>j</code>값을 출력</li>
 *   <li>정사각형 패턴: 내부 루프 조건을 고정값으로 설정</li>
 * </ul>
 * 
 * <h4>IntelliJ 팁</h4>
 * <ul>
 *   <li><kbd>fori</kbd> 입력 후 <kbd>Tab</kbd>키: for문 인덱스 템플릿</li>
 *   <li><kbd>Ctrl+D</kbd>: 현재 줄 복사 (중첩 for문 작성 시 유용)</li>
 *   <li>디버거의 Step Over(<kbd>F8</kbd>)로 중첩 루프 실행 과정 추적</li>
 * </ul>
 */
public class Problem05_NestedLoops {
    public static void main(String[] args) {
        // TODO: 별 삼각형을 출력하는 중첩 for문을 작성하세요
        
        
        
        
        // 예상 출력:
        // *
        // **
        // ***
        // ****
        // *****
    }
}