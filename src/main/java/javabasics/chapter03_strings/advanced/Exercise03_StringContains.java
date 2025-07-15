package main.java.javabasics.chapter03_strings.advanced;

/**
 * <h2>Chapter 3 - 문자열 (응용)</h2>
 * <h3>문제 3: 문자열 포함 확인</h3>
 * 
 * <p><strong>■ 학습 목표</strong></p>
 * <ul>
 *   <li>contains() 메서드로 문자열 포함 여부를 확인하는 방법을 학습합니다.</li>
 *   <li>indexOf() 메서드로 문자열의 위치를 찾는 방법을 학습합니다.</li>
 *   <li>두 메서드의 차이점과 활용법을 이해합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 배경 지식</strong></p>
 * <ul>
 *   <li><code>contains(CharSequence s)</code>: 문자열 포함 여부를 boolean으로 반환</li>
 *   <li><code>indexOf(String str)</code>: 문자열의 첫 번째 위치(인덱스)를 반환, 없으면 -1</li>
 *   <li>두 메서드 모두 대소문자를 구분합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 구현 지시사항</strong></p>
 * <ol>
 *   <li>email에 "@"가 포함되어 있는지 확인하세요</li>
 *   <li>fileName에서 "."의 위치(인덱스)를 찾으세요</li>
 *   <li>text에 "Java"가 포함되어 있는지 확인하세요</li>
 * </ol>
 * 
 * <p><strong>■ 메서드 사용 예제</strong></p>
 * <pre>
 * String str = "Hello World";
 * 
 * // contains() 사용 예제
 * boolean has1 = str.contains("World");    // true
 * boolean has2 = str.contains("world");    // false (대소문자 구분)
 * 
 * // indexOf() 사용 예제
 * int index1 = str.indexOf("World");       // 6
 * int index2 = str.indexOf("Java");        // -1 (없음)
 * int index3 = str.indexOf("o");           // 4 (첫 번째 'o'의 위치)
 * </pre>
 * 
 * <p><strong>■ 활용 팁</strong></p>
 * <ul>
 *   <li><strong>contains()</strong>: 단순히 포함 여부만 확인할 때 사용</li>
 *   <li><strong>indexOf()</strong>: 위치 정보가 필요하거나, 위치를 기준으로 문자열을 처리할 때 사용</li>
 *   <li>indexOf()의 결과가 -1이 아니면 문자열이 포함되어 있다는 의미입니다.</li>
 * </ul>
 * 
 * <p><strong>■ 실무 활용 예</strong></p>
 * <ul>
 *   <li>이메일 유효성 검사: @ 기호 포함 여부 확인</li>
 *   <li>파일 확장자 추출: 마지막 . 의 위치 찾기</li>
 *   <li>키워드 검색: 특정 단어 포함 여부 확인</li>
 * </ul>
 * 
 * <p><strong>■ 예상 출력 결과</strong></p>
 * <pre>
 * 이메일에 @ 포함: true
 * 점(.)의 위치: 8
 * Java 포함 여부: true
 * </pre>
 */
public class Exercise03_StringContains {
    public static void main(String[] args) {
        String email = "user@example.com";
        String fileName = "document.pdf";
        String text = "I love Java programming";
        
        // TODO: email에 "@"가 포함되어 있는지 확인
        boolean hasAt = // ???
        
        // TODO: fileName에서 "."의 위치를 찾으세요
        int dotIndex = // ???
        
        // TODO: text에 "Java"가 포함되어 있는지 확인
        boolean hasJava = // ???
        
        // 아래 코드는 수정하지 마세요
        System.out.println("이메일에 @ 포함: " + hasAt);
        System.out.println("점(.)의 위치: " + dotIndex);
        System.out.println("Java 포함 여부: " + hasJava);
        
        // 예상 출력:
        // 이메일에 @ 포함: true
        // 점(.)의 위치: 8
        // Java 포함 여부: true
    }
}