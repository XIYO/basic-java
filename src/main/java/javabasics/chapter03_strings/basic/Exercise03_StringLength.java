package javabasics.chapter03_strings.basic;

/**
 * <h2>Chapter 3 - 문자열 (기본)</h2>
 * <h3>문제 3: 문자열 길이</h3>
 * 
 * <p><strong>■ 학습 목표</strong></p>
 * <ul>
 *   <li>문자열의 길이를 구하는 방법을 학습합니다.</li>
 *   <li>length() 메서드의 사용법을 익힙니다.</li>
 * </ul>
 * 
 * <p><strong>■ 배경 지식</strong></p>
 * <ul>
 *   <li>String 클래스의 <code>length()</code> 메서드는 문자열의 길이를 반환합니다.</li>
 *   <li>길이는 문자의 개수를 의미하며, 공백도 하나의 문자로 계산됩니다.</li>
 *   <li>빈 문자열("")의 길이는 0입니다.</li>
 * </ul>
 * 
 * <p><strong>■ 구현 지시사항</strong></p>
 * <ol>
 *   <li>text 문자열의 길이를 구하세요</li>
 *   <li>emptyText 문자열의 길이를 구하세요</li>
 * </ol>
 * 
 * <p><strong>■ 메서드 사용법</strong></p>
 * <pre>
 * String str = "Hello";
 * int len = str.length();  // 5가 반환됩니다
 * </pre>
 * 
 * <p><strong>■ 주의사항</strong></p>
 * <ul>
 *   <li>length()는 메서드이므로 괄호()를 반드시 붙여야 합니다.</li>
 *   <li>배열의 length와 달리 문자열은 length() 메서드를 사용합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 예상 출력 결과</strong></p>
 * <pre>
 * 'Java Programming'의 길이: 16
 * 빈 문자열의 길이: 0
 * </pre>
 */
public class Exercise03_StringLength {
    public static void main(String[] args) {
        String text = "Java Programming";
        String emptyText = "";
        
        // TODO: text의 길이를 구하세요
        int textLength = // ???
        
        // TODO: emptyText의 길이를 구하세요
        int emptyLength = // ???
        
        // 아래 코드는 수정하지 마세요
        System.out.println("'" + text + "'의 길이: " + textLength);
        System.out.println("빈 문자열의 길이: " + emptyLength);
        
        // 예상 출력:
        // 'Java Programming'의 길이: 16
        // 빈 문자열의 길이: 0
    }
}