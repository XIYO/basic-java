package javabasics.chapter03_strings.basic;

/**
 * <h2>Chapter 3 - 문자열 (기본)</h2>
 * <h3>문제 2: 문자열 연결</h3>
 * 
 * <p><strong>■ 학습 목표</strong></p>
 * <ul>
 *   <li>+ 연산자를 사용하여 문자열을 연결하는 방법을 학습합니다.</li>
 *   <li>문자열 연결 시 공백 처리 방법을 이해합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 배경 지식</strong></p>
 * <ul>
 *   <li>Java에서 + 연산자는 문자열 연결에 사용됩니다.</li>
 *   <li>문자열 + 문자열 = 연결된 문자열이 됩니다.</li>
 *   <li>공백도 하나의 문자열입니다: " "</li>
 * </ul>
 * 
 * <p><strong>■ 구현 지시사항</strong></p>
 * <ol>
 *   <li>firstName과 lastName을 공백으로 연결하여 fullName을 만드세요</li>
 *   <li>"Hello, " + fullName + "!" 형태로 인사말을 만드세요</li>
 * </ol>
 * 
 * <p><strong>■ 힌트</strong></p>
 * <ul>
 *   <li>문자열 연결: <code>str1 + " " + str2</code></li>
 *   <li>여러 문자열을 연결할 때도 + 연산자를 연속해서 사용합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 예상 출력 결과</strong></p>
 * <pre>
 * 전체 이름: Hong Gildong
 * 인사말: Hello, Hong Gildong!
 * </pre>
 */
public class Exercise02_StringConcatenation {
    public static void main(String[] args) {
        String firstName = "Hong";
        String lastName = "Gildong";
        
        // TODO: firstName과 lastName을 공백으로 연결하여 fullName을 만드세요
        String fullName = // ???
        
        // TODO: "Hello, " + fullName + "!" 형태로 greeting을 만드세요
        String greeting = // ???
        
        // 아래 코드는 수정하지 마세요
        System.out.println("전체 이름: " + fullName);
        System.out.println("인사말: " + greeting);
        
        // 예상 출력:
        // 전체 이름: Hong Gildong
        // 인사말: Hello, Hong Gildong!
    }
}