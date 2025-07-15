package main.java.javabasics.chapter03_strings.advanced;

/**
 * <h2>Chapter 3 - 문자열 (응용)</h2>
 * <h3>문제 5: 문자열 분리</h3>
 * 
 * <p><strong>■ 학습 목표</strong></p>
 * <ul>
 *   <li>split() 메서드를 사용하여 문자열을 배열로 분리하는 방법을 학습합니다.</li>
 *   <li>문자열 배열 처리의 기초를 익힙니다.</li>
 *   <li>구분자를 기준으로 데이터를 파싱하는 방법을 이해합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 배경 지식</strong></p>
 * <ul>
 *   <li><code>split(String regex)</code>: 주어진 정규표현식을 구분자로 문자열을 분리</li>
 *   <li>반환 타입은 String[] (문자열 배열)입니다.</li>
 *   <li>구분자는 결과 배열에 포함되지 않습니다.</li>
 *   <li>연속된 구분자는 빈 문자열을 생성할 수 있습니다.</li>
 * </ul>
 * 
 * <p><strong>■ 구현 지시사항</strong></p>
 * <ol>
 *   <li>csv를 쉼표(,)로 분리하여 배열로 만드세요</li>
 *   <li>분리된 배열의 길이를 구하세요</li>
 *   <li>배열의 두 번째 요소를 출력하세요</li>
 * </ol>
 * 
 * <p><strong>■ 메서드 사용 예제</strong></p>
 * <pre>
 * // 기본 사용법
 * String str = "one-two-three";
 * String[] parts = str.split("-");      // ["one", "two", "three"]
 * 
 * // 공백으로 분리
 * String sentence = "Hello World Java";
 * String[] words = sentence.split(" "); // ["Hello", "World", "Java"]
 * 
 * // 배열 접근
 * String first = words[0];              // "Hello"
 * int count = words.length;             // 3
 * </pre>
 * 
 * <p><strong>■ 주의사항</strong></p>
 * <ul>
 *   <li>split()의 매개변수는 정규표현식이므로 특수문자 사용 시 주의 필요</li>
 *   <li>예: 마침표(.)로 분리하려면 <code>split("\\.")</code> 사용</li>
 *   <li>빈 문자열을 split하면 길이 1인 배열이 반환됩니다.</li>
 * </ul>
 * 
 * <p><strong>■ 실무 활용 예</strong></p>
 * <ul>
 *   <li><strong>CSV 파일 파싱</strong>: 쉼표로 구분된 데이터 처리</li>
 *   <li><strong>로그 분석</strong>: 공백이나 탭으로 구분된 로그 데이터 파싱</li>
 *   <li><strong>URL 분석</strong>: 슬래시(/)로 경로 분리</li>
 *   <li><strong>파일 경로 처리</strong>: 디렉토리 구분자로 경로 분리</li>
 * </ul>
 * 
 * <p><strong>■ 고급 옵션</strong></p>
 * <ul>
 *   <li><code>split(regex, limit)</code>: 최대 분리 개수 제한</li>
 *   <li>예: <code>"a,b,c,d".split(",", 2)</code> → ["a", "b,c,d"]</li>
 * </ul>
 * 
 * <p><strong>■ 예상 출력 결과</strong></p>
 * <pre>
 * 과일 개수: 4
 * 두 번째 과일: banana
 * 전체 과일: apple banana orange grape 
 * </pre>
 */
public class Exercise05_StringSplit {
    public static void main(String[] args) {
        String csv = "apple,banana,orange,grape";
        
        // TODO: csv를 쉼표로 분리하여 배열로 만드세요
        String[] fruits = // ???
        
        // TODO: 배열의 길이를 구하세요
        int arrayLength = // ???
        
        // TODO: 배열의 두 번째 요소(인덱스 1)를 가져오세요
        String secondFruit = // ???
        
        // 아래 코드는 수정하지 마세요
        System.out.println("과일 개수: " + arrayLength);
        System.out.println("두 번째 과일: " + secondFruit);
        System.out.print("전체 과일: ");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        
        // 예상 출력:
        // 과일 개수: 4
        // 두 번째 과일: banana
        // 전체 과일: apple banana orange grape
    }
}