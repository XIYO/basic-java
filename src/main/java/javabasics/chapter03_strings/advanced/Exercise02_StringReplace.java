package main.java.javabasics.chapter03_strings.advanced;

/**
 * <h3>Chapter 3 - 문자열 (응용)</h3>
 * <h3>문제 2: 문자열 치환</h3>
 * 
 * <p><b>■ 학습 목표</b></p>
 * <ul>
 *   <li>replace() 메서드를 사용하여 문자열의 일부를 바꾸는 방법을 학습합니다.</li>
 *   <li>문자열의 불변성(immutability)을 이해합니다.</li>
 * </ul>
 * 
 * <p><b>■ 배경 지식</b></p>
 * <ul>
 *   <li><code>replace(CharSequence target, CharSequence replacement)</code>: 대상 문자열을 모두 치환</li>
 *   <li>원본 문자열은 변경되지 않고, 새로운 문자열이 반환됩니다.</li>
 *   <li>대소문자를 구분하여 정확히 일치하는 문자열만 치환됩니다.</li>
 *   <li>문자열에 해당 패턴이 없으면 원본 문자열이 그대로 반환됩니다.</li>
 * </ul>
 * 
 * <p><b>■ 구현 지시사항</b></p>
 * <ol>
 *   <li>original에서 "bad"를 "good"으로 바꾸세요</li>
 *   <li>text에서 모든 공백을 "_"(언더스코어)로 바꾸세요</li>
 * </ol>
 * 
 * <p><b>■ 메서드 사용법</b></p>
 * <ul>
 *   <li>replace() 메서드는 첫 번째 인자로 찾을 문자열을 받습니다</li>
 *   <li>두 번째 인자로 바꿀 문자열을 받습니다</li>
 *   <li>문자열에서 찾은 모든 부분을 바꿔서 새 문자열을 반환합니다</li>
 *   <li>대소문자를 정확히 구분하므로 주의하세요</li>
 * </ul>
 * 
 * <p><b>■ 주의사항</b></p>
 * <ul>
 *   <li>replace()는 모든 일치하는 부분을 치환합니다.</li>
 *   <li>원본 문자열은 절대 변경되지 않습니다. (String은 불변 객체)</li>
 *   <li>치환 결과를 사용하려면 반드시 반환값을 변수에 저장해야 합니다.</li>
 * </ul>
 * 
 * <p><b>■ 관련 메서드</b></p>
 * <ul>
 *   <li><code>replaceAll()</code>: 정규표현식을 사용한 치환</li>
 *   <li><code>replaceFirst()</code>: 첫 번째 일치 항목만 치환</li>
 * </ul>
 * 
 * <p><b>■ 예상 출력 결과</b></p>
 * <pre>
 * 원본: This is a bad example
 * 변경: This is a good example
 * 공백 치환: Hello_World_Java
 * </pre>
 */
public class Exercise02_StringReplace {
    public static void main(String[] args) {
        String original = "This is a bad example";
        String text = "Hello World Java";
        
        // TODO: "bad"를 "good"으로 바꾸세요
        // 힌트: original 문자열에서 replace() 메서드를 사용하세요
        String replaced1 = ???;
        
        // TODO: 모든 공백을 "_"로 바꾸세요
        // 힌트: text 문자열에서 공백(" ")을 언더스코어("_")로 바꾸세요
        String replaced2 = ???;
        
        // 아래 코드는 수정하지 마세요
        System.out.println("원본: " + original);
        System.out.println("변경: " + replaced1);
        System.out.println("공백 치환: " + replaced2);
        
        // 예상 출력:
        // 원본: This is a bad example
        // 변경: This is a good example
        // 공백 치환: Hello_World_Java
    }
}