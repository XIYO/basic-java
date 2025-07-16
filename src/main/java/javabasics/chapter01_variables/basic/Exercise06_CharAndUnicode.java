package main.java.javabasics.chapter01_variables.basic;

/**
 * <h3>Chapter 1: 변수와 데이터 타입</h3>
 * <h3>문제 6: 문자 타입과 유니코드 (Character Type and Unicode)</h3>
 * 
 * <p><b>목표:</b> <code>char</code> 타입과 유니코드의 관계를 이해합니다.</p>
 * 
 * <h4>학습 내용:</h4>
 * 
 *   <h5>char 타입의 특징</h5>
 *   <ul>
 *     <li>16비트 유니코드 문자 (0 ~ 65,535)</li>
 *     <li>단일 문자만 저장 가능</li>
 *     <li>내부적으로는 정수로 저장됨</li>
 *   </ul>
 *   
 *   <h5>char 변수 초기화 방법</h5>
 *   <table border="1" cellpadding="5">
 *     <tr>
 *       <th>방법</th>
 *       <th>예시</th>
 *       <th>설명</th>
 *     </tr>
 *     <tr>
 *       <td>문자 리터럴</td>
 *       <td><code>'A'</code></td>
 *       <td>작은따옴표로 감싼 단일 문자</td>
 *     </tr>
 *     <tr>
 *       <td>유니코드 이스케이프</td>
 *       <td><code>'\u0041'</code></td>
 *       <td>\u + 4자리 16진수</td>
 *     </tr>
 *     <tr>
 *       <td>정수값</td>
 *       <td><code>65</code></td>
 *       <td>ASCII/유니코드 코드값</td>
 *     </tr>
 *   </table>
 *   
 *   <h5>특수 문자 (Escape Sequences)</h5>
 *   <ul>
 *     <li><code>'\n'</code> - 줄바꿈 (newline)</li>
 *     <li><code>'\t'</code> - 탭 (tab)</li>
 *     <li><code>'\''</code> - 작은따옴표</li>
 *     <li><code>'\\'</code> - 역슬래시</li>
 *   </ul>
 * 
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>다양한 방법으로 <code>char</code> 변수를 선언하세요</li>
 *   <li><code>char</code>와 <code>int</code> 간 변환으로 유니코드 값을 확인하세요</li>
 *   <li>특수 문자와 이스케이프 시퀀스를 활용하세요</li>
 * </ol>
 * 
 * <h4>힌트:</h4>
 * <ul>
 *   <li>문자를 정수로 변환: <code>(int)문자</code></li>
 *   <li>정수를 문자로 변환: <code>(char)정수</code></li>
 *   <li>한글도 유니코드 문자로 표현 가능</li>
 * </ul>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise06_CharAndUnicode {
    public static void main(String[] args) {
        // TODO: 다양한 방법으로 char 변수 선언하기
        
        // 방법 1: 직접 문자 할당
        // 여기에 'A' 문자를 letter 변수에 할당하는 코드를 작성하세요
        char letter = ' '; // TODO: 'A'로 변경하세요
        
        // 방법 2: 유니코드 이스케이프 시퀀스
        // 여기에 '\u0041' (이것도 'A'입니다)를 할당하는 코드를 작성하세요
        char unicodeLetter = ' '; // TODO: '\u0041'로 변경하세요
        
        // 방법 3: 정수값 (ASCII/유니코드 코드)
        // 여기에 65 (이것도 'A'입니다)를 할당하는 코드를 작성하세요
        char asciiLetter = ' '; // TODO: 65로 변경하세요
        
        // TODO: 문자와 유니코드 값 출력하기
        System.out.println("Character: " + letter + ", Unicode value: " + (int)letter);
        System.out.println("Unicode char: " + unicodeLetter);
        System.out.println("ASCII char: " + asciiLetter);
        
        // TODO: 한글 문자 다루기
        // 여기에 '한' 문자를 할당하고 출력하는 코드를 작성하세요
        char koreanChar = ' '; // TODO: '한'으로 변경하세요
        // 여기에 한글 문자와 유니코드 값을 출력하는 코드를 작성하세요
        
        // TODO: 특수 문자와 이스케이프 시퀀스
        // 여기에 줄바꿈('\n'), 탭('\t'), 작은따옴표('\''), 역슬래시('\\')를 할당하는 코듍드를 작성하세요
        
        // TODO: 문자 연산
        // 여기에 letter의 다음 문자를 계산하는 코드를 작성하세요 ('A' 다음은 'B')
        // 힌트: char nextLetter = (char)(letter + 1);
        
        // Expected output:
        // Character: A, Unicode value: 65
        // Unicode char: A
        // ASCII char: A
        // Korean character: 한, Unicode value: 54620
        // Special characters: newline, tab	quote ' backslash \
        // Next letter after A is B
    }
}