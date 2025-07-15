package main.java.javabasics.chapter03_strings.basic;

/**
 * <h2>Chapter 3 - 문자열 (기본)</h2>
 * <h3>문제 4: 문자열 비교 (equals)</h3>
 * 
 * <p><strong>■ 학습 목표</strong></p>
 * <ul>
 *   <li>equals() 메서드를 사용하여 문자열을 올바르게 비교하는 방법을 학습합니다.</li>
 *   <li>== 연산자와 equals() 메서드의 차이점을 이해합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 배경 지식</strong></p>
 * <ul>
 *   <li><code>==</code> 연산자는 참조(주소)를 비교합니다.</li>
 *   <li><code>equals()</code> 메서드는 문자열의 내용을 비교합니다.</li>
 *   <li>문자열 비교는 대소문자를 구분합니다. (case-sensitive)</li>
 * </ul>
 * 
 * <p><strong>■ 구현 지시사항</strong></p>
 * <ol>
 *   <li>str1과 str2가 같은지 비교하세요 (equals 사용)</li>
 *   <li>str1과 str3가 같은지 비교하세요 (equals 사용)</li>
 * </ol>
 * 
 * <p><strong>■ 메서드 사용법</strong></p>
 * <pre>
 * String a = "Java";
 * String b = "Java";
 * boolean result = a.equals(b);  // true
 * </pre>
 * 
 * <p><strong>■ 주의사항</strong></p>
 * <ul>
 *   <li>문자열 비교 시 반드시 <code>equals()</code> 메서드를 사용하세요.</li>
 *   <li>"Hello"와 "hello"는 다른 문자열입니다. (대소문자 구분)</li>
 *   <li>대소문자 무시 비교는 <code>equalsIgnoreCase()</code>를 사용합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 예상 출력 결과</strong></p>
 * <pre>
 * str1과 str2가 같은가? true
 * str1과 str3가 같은가? false
 * </pre>
 */
public class Exercise04_StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";  // 소문자
        
        // TODO: str1과 str2가 같은지 비교하세요
        boolean isEqual1 = // ???
        
        // TODO: str1과 str3가 같은지 비교하세요  
        boolean isEqual2 = // ???
        
        // 아래 코드는 수정하지 마세요
        System.out.println("str1과 str2가 같은가? " + isEqual1);
        System.out.println("str1과 str3가 같은가? " + isEqual2);
        
        // 예상 출력:
        // str1과 str2가 같은가? true
        // str1과 str3가 같은가? false
    }
}