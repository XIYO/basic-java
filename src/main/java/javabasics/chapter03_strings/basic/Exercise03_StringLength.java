package javabasics.chapter03_strings.basic;

/**
 * <h3>Chapter 3 - 문자열 (기본)</h3>
 * <h3>문제 3: 문자열 길이</h3>
 * 
 * <h3>🎯 학습 목표</h3>
 * <ul>
 *   <li>문자열의 길이를 구하는 방법을 학습합니다.</li>
 *   <li>length() 메서드의 사용법을 익힙니다.</li>
 * </ul>
 * 
 * <h3>📚 배경 지식</h3>
 * <ul>
 *   <li>String 클래스의 <code>length()</code> 메서드는 문자열의 길이를 반환합니다.</li>
 *   <li>길이는 문자의 개수를 의미하며, 공백도 하나의 문자로 계산됩니다.</li>
 *   <li>빈 문자열("")의 길이는 0입니다.</li>
 * </ul>
 * 
 * <h3>📝 구현 지시사항</h3>
 * <ol>
 *   <li>text 문자열의 길이를 구하세요</li>
 *   <li>emptyText 문자열의 길이를 구하세요</li>
 * </ol>
 * 
 * <h3>💡 메서드 사용법</h3>
 * <pre>
 * String str = "Hello";
 * int len = str.length();  // 5가 반환됩니다
 * </pre>
 * 
 * <h3>⚠️ 주의사항</h3>
 * <ul>
 *   <li>length()는 메서드이므로 괄호()를 반드시 붙여야 합니다.</li>
 *   <li>배열의 length와 달리 문자열은 length() 메서드를 사용합니다.</li>
 * </ul>
 * 
 * <h3>🎯 예상 출력</h3>
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
        int textLength = 0; // length() 메서드를 사용하세요
        
        // TODO: emptyText의 길이를 구하세요
        int emptyLength = 0; // 빈 문자열에도 length() 메서드를 사용할 수 있습니다
        
        // 아래 코드는 수정하지 마세요
        System.out.println("'" + text + "'의 길이: " + textLength);
        System.out.println("빈 문자열의 길이: " + emptyLength);
        
        /*
         * 🎯 예상 출력:
         * 'Java Programming'의 길이: 16
         * 빈 문자열의 길이: 0
         */
    }
}