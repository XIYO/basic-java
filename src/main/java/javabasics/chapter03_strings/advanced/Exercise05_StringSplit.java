package main.java.javabasics.chapter03_strings.advanced;

/**
 * <h3>Chapter 3 - 문자열 (응용)</h3>
 * <h3>문제 5: 문자열 분리</h3>
 * 
 * <p><b>■ 학습 목표</b></p>
 * <ul>
 *   <li>split() 메서드를 사용하여 문자열을 배열로 분리하는 방법을 학습합니다.</li>
 *   <li>문자열 배열 처리의 기초를 익힙니다.</li>
 *   <li>구분자를 기준으로 데이터를 파싱하는 방법을 이해합니다.</li>
 * </ul>
 * 
 * <p><b>■ 배경 지식</b></p>
 * <ul>
 *   <li><code>split(String regex)</code>: 주어진 정규표현식을 구분자로 문자열을 분리</li>
 *   <li>반환 타입은 String[] (문자열 배열)입니다.</li>
 *   <li>구분자는 결과 배열에 포함되지 않습니다.</li>
 *   <li>연속된 구분자는 빈 문자열을 생성할 수 있습니다.</li>
 * </ul>
 * 
 * <p><b>■ 구현 지시사항</b></p>
 * <ol>
 *   <li>csv를 쉼표(,)로 분리하여 배열로 만드세요</li>
 *   <li>분리된 배열의 길이를 구하세요</li>
 *   <li>배열의 두 번째 요소를 출력하세요</li>
 * </ol>
 * 
 * <p><b>■ 메서드 사용법</b></p>
 * <ul>
 *   <li><b>split() 메서드</b>
 *     <ul>
 *       <li>문자열을 구분자로 나누어 배열로 만듭니다</li>
 *       <li>괄호 안에 구분자 문자열을 넣습니다</li>
 *       <li>결과는 String[] 타입의 배열입니다</li>
 *     </ul>
 *   </li>
 *   <li><b>배열 사용법</b>
 *     <ul>
 *       <li>배열의 길이는 배열명.length로 구합니다</li>
 *       <li>배열의 요소는 인덱스로 접근합니다 (0부터 시작)</li>
 *       <li>첫 번째는 인덱스 0, 두 번째는 인덱스 1</li>
 *     </ul>
 *   </li>
 * </ul>
 * 
 * <p><b>■ 주의사항</b></p>
 * <ul>
 *   <li>split()의 매개변수는 정규표현식이므로 특수문자 사용 시 주의 필요</li>
 *   <li>예: 마침표(.)로 분리하려면 <code>split("\\.")</code> 사용</li>
 *   <li>빈 문자열을 split하면 길이 1인 배열이 반환됩니다.</li>
 * </ul>
 * 
 * <p><b>■ 실무 활용 예</b></p>
 * <ul>
 *   <li><b>CSV 파일 파싱</b>: 쉼표로 구분된 데이터 처리</li>
 *   <li><b>로그 분석</b>: 공백이나 탭으로 구분된 로그 데이터 파싱</li>
 *   <li><b>URL 분석</b>: 슬래시(/)로 경로 분리</li>
 *   <li><b>파일 경로 처리</b>: 디렉토리 구분자로 경로 분리</li>
 * </ul>
 * 
 * <p><b>■ 고급 옵션</b></p>
 * <ul>
 *   <li><code>split(regex, limit)</code>: 최대 분리 개수 제한</li>
 *   <li>예: <code>"a,b,c,d".split(",", 2)</code> → ["a", "b,c,d"]</li>
 * </ul>
 * 
 * <p><b>■ 예상 출력 결과</b></p>
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
        // 힌트: split() 메서드에 구분자로 쉼표(",")를 전달하세요
        String[] fruits = ???;
        
        // TODO: 배열의 길이를 구하세요
        // 힌트: 배열의 length 속성을 사용하세요 (메서드가 아닌 속성입니다)
        int arrayLength = ???;
        
        // TODO: 배열의 두 번째 요소(인덱스 1)를 가져오세요
        // 힌트: 배열명[인덱스] 형식으로 접근하세요
        String secondFruit = ???;
        
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