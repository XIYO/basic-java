package main.java.javabasics.chapter03_strings.basic;

/**
 * <h3>Chapter 3 - 문자열 (기본)</h3>
 * <h3>문제 2: 문자열 연결</h3>
 * 
 * <h3>🎯 학습 목표</h3>
 * <ul>
 *   <li>+ 연산자를 사용하여 문자열을 연결하는 방법을 학습합니다.</li>
 *   <li>문자열 연결 시 공백 처리 방법을 이해합니다.</li>
 * </ul>
 * 
 * <h3>📚 배경 지식</h3>
 * <ul>
 *   <li>Java에서 + 연산자는 문자열 연결에 사용됩니다.</li>
 *   <li>문자열 + 문자열 = 연결된 문자열이 됩니다.</li>
 *   <li>공백도 하나의 문자열입니다: " "</li>
 * </ul>
 * 
 * <h3>📝 구현 지시사항</h3>
 * <ol>
 *   <li>firstName과 lastName을 공백으로 연결하여 fullName을 만드세요</li>
 *   <li>"Hello, " + fullName + "!" 형태로 인사말을 만드세요</li>
 * </ol>
 * 
 * <h3>💡 힌트</h3>
 * <ul>
 *   <li>문자열은 더하기 연산자로 연결할 수 있습니다</li>
 *   <li>공백도 큰따옴표로 감싼 하나의 문자열입니다</li>
 *   <li>여러 문자열을 연결할 때는 더하기를 연속해서 사용합니다</li>
 * </ul>
 * 
 * <h3>🎯 예상 출력</h3>
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
        // 힌트: 더하기 연산자를 사용하고, 이름 사이에 공백 문자열을 넣으세요
        String fullName = ???;
        
        // TODO: fullName을 사용하여 인사말을 만드세요
        // 힌트: "Hello, "로 시작하고 fullName을 더한 후 "!"로 끝나도록 연결하세요
        String greeting = ???;
        
        // 아래 코드는 수정하지 마세요
        System.out.println("전체 이름: " + fullName);
        System.out.println("인사말: " + greeting);
        
        /*
         * 🎯 예상 출력:
         * 전체 이름: Hong Gildong
         * 인사말: Hello, Hong Gildong!
         */
    }
}