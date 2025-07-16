package main.java.javabasics.chapter05_loops.basic;

/**
 * <h3>Chapter 5 - 반복문 (Loops)</h3>
 * <h3>기초 문제 4: do-while문 기초</h3>
 * 
 * <h4>문제 설명</h4>
 * <p>do-while문은 조건 검사를 반복문의 끝에서 수행하는 특별한 형태의 반복문입니다.
 * 이로 인해 반복문의 내용이 <b>최소 한 번은 반드시 실행</b>된다는 특징을 가집니다.
 * 사용자 입력을 받거나 메뉴를 표시하는 등의 상황에서 유용하게 사용됩니다.</p>
 * 
 * <h4>학습 목표</h4>
 * <ul>
 *   <li>do-while문의 구조와 실행 순서 이해하기</li>
 *   <li>while문과 do-while문의 차이점 파악하기</li>
 *   <li>최소 한 번 실행이 보장되어야 하는 상황 인식하기</li>
 * </ul>
 * 
 * <h4>문제 요구사항</h4>
 * <ul>
 *   <li>do-while문을 사용하여 3의 배수를 출력하세요</li>
 *   <li>3부터 시작하여 30까지의 3의 배수를 출력하세요</li>
 *   <li>각 숫자는 새로운 줄에 출력되어야 합니다</li>
 * </ul>
 * 
 * <h4>힌트 및 도움말</h4>
 * <ul>
 *   <li>do-while문의 기본 구조: <code>do { 반복할 코드 } while(조건);</code></li>
 *   <li>초기값: <code>int i = 3;</code>로 시작</li>
 *   <li>증가 방법: <code>i += 3</code> 또는 <code>i = i + 3</code></li>
 *   <li>종료 조건: <code>i <= 30</code></li>
 *   <li>세미콜론(;)을 while(조건) 뒤에 반드시 붙여야 합니다!</li>
 * </ul>
 * 
 * <h4>while문과 do-while문의 차이</h4>
 * <table border="1">
 *   <tr>
 *     <th>특징</th>
 *     <th>while문</th>
 *     <th>do-while문</th>
 *   </tr>
 *   <tr>
 *     <td>조건 검사 시점</td>
 *     <td>반복 시작 전</td>
 *     <td>반복 실행 후</td>
 *   </tr>
 *   <tr>
 *     <td>최소 실행 횟수</td>
 *     <td>0번 (조건이 거짓이면)</td>
 *     <td>1번 (항상)</td>
 *   </tr>
 * </table>
 * 
 * <h4>IntelliJ 팁</h4>
 * <ul>
 *   <li><kbd>do</kbd> 입력 후 <kbd>Tab</kbd>키: do-while문 템플릿 자동 생성</li>
 *   <li><kbd>Ctrl+/</kbd>: 선택한 줄 주석 처리/해제</li>
 * </ul>
 */
public class Exercise04_DoWhileLoop {
    public static void main(String[] args) {
        // TODO: 3의 배수를 출력하는 do-while문을 작성하세요
        
        
        
        
        // 예상 출력:
        // 3
        // 6
        // 9
        // 12
        // 15
        // 18
        // 21
        // 24
        // 27
        // 30
    }
}