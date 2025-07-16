package main.java.javabasics.chapter05_loops.applied;

/**
 * <h3>Chapter 5 - 반복문 (Loops)</h3>
 * <h3>응용 문제 4: 숫자 피라미드</h3>
 * 
 * <h4>문제 설명</h4>
 * <p>숫자 피라미드는 중첩 반복문의 활용을 익히기 위한 고전적인 프로그래밍 문제입니다.
 * 이 문제는 반복문의 제어, 패턴 인식, 그리고 공간적 사고력을 동시에 요구합니다.
 * 특히 다중 반복문을 조합하여 복잡한 출력 패턴을 만드는 능력을 기를 수 있습니다.</p>
 * 
 * <h4>학습 목표</h4>
 * <ul>
 *   <li>다중 중첩 반복문의 효과적인 사용법 익히기</li>
 *   <li>출력 형식화와 정렬 기법 학습하기</li>
 *   <li>패턴 분석과 구현 능력 향상시키기</li>
 * </ul>
 * 
 * <h4>문제 요구사항</h4>
 * <ul>
 *   <li>5층 높이의 숫자 피라미드를 출력하세요</li>
 *   <li>각 층은 중앙 정렬되어야 합니다</li>
 *   <li>각 층의 숫자는 1부터 층 번호까지 증가한 후 다시 1까지 감소합니다</li>
 *   <li>숫자 사이에 공백 없이 연속해서 출력하세요</li>
 * </ul>
 * 
 * <h4>출력 패턴 분석</h4>
 * <table border="1">
 *   <tr>
 *     <th>층</th>
 *     <th>공백 수</th>
 *     <th>숫자 패턴</th>
 *     <th>총 문자 수</th>
 *   </tr>
 *   <tr>
 *     <td>1</td>
 *     <td>4</td>
 *     <td>1</td>
 *     <td>1</td>
 *   </tr>
 *   <tr>
 *     <td>2</td>
 *     <td>3</td>
 *     <td>121</td>
 *     <td>3</td>
 *   </tr>
 *   <tr>
 *     <td>3</td>
 *     <td>2</td>
 *     <td>12321</td>
 *     <td>5</td>
 *   </tr>
 *   <tr>
 *     <td>4</td>
 *     <td>1</td>
 *     <td>1234321</td>
 *     <td>7</td>
 *   </tr>
 *   <tr>
 *     <td>5</td>
 *     <td>0</td>
 *     <td>123454321</td>
 *     <td>9</td>
 *   </tr>
 * </table>
 * 
 * <h4>구현 알고리즘</h4>
 * <ol>
 *   <li><b>외부 반복문:</b> 각 층을 순회 (i = 1부터 height까지)</li>
 *   <li><b>공백 출력:</b> (height - i)개의 공백 출력</li>
 *   <li><b>증가 부분:</b> 1부터 i까지 숫자 출력</li>
 *   <li><b>감소 부분:</b> (i-1)부터 1까지 숫자 출력</li>
 *   <li><b>줄바꿈:</b> 각 층 출력 후 줄바꿈</li>
 * </ol>
 * 
 * <h4>힌트 및 도움말</h4>
 * <ul>
 *   <li>공백 출력: <code>for(int j = 0; j < height - i; j++) System.out.print(" ");</code></li>
 *   <li>증가 부분: <code>for(int j = 1; j <= i; j++) System.out.print(j);</code></li>
 *   <li>감소 부분: <code>for(int j = i - 1; j >= 1; j--) System.out.print(j);</code></li>
 *   <li>각 반복문의 시작과 끝 조건을 신중히 설정하세요</li>
 * </ul>
 * 
 * <h4>변형 문제</h4>
 * <ul>
 *   <li><b>알파벳 피라미드:</b> 숫자 대신 알파벳 사용</li>
 *   <li><b>역 피라미드:</b> 아래에서 위로 갈수록 넓어지는 형태</li>
 *   <li><b>다이아몬드:</b> 피라미드 + 역피라미드 조합</li>
 *   <li><b>속이 빈 피라미드:</b> 테두리만 출력</li>
 * </ul>
 * 
 * <h4>실무 응용</h4>
 * <ul>
 *   <li>콘솔 기반 UI 설계</li>
 *   <li>ASCII 아트 생성</li>
 *   <li>보고서 형식화</li>
 *   <li>게임 맵 생성</li>
 * </ul>
 */
public class Exercise04_NumberPyramid {
    public static void main(String[] args) {
        int height = 5;
        
        // TODO: 숫자 피라미드를 출력하는 코드를 작성하세요
        
        
        
        
        // 예상 출력:
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321
    }
}