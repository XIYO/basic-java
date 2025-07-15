package javabasics.chapter03_strings.advanced;

/**
 * <h2>Chapter 3 - 문자열 (응용)</h2>
 * <h3>문제 1: 부분 문자열 추출</h3>
 * 
 * <p><strong>■ 학습 목표</strong></p>
 * <ul>
 *   <li>substring() 메서드를 사용하여 문자열의 일부를 추출합니다.</li>
 *   <li>두 가지 형태의 substring() 메서드 사용법을 익힙니다.</li>
 * </ul>
 * 
 * <p><strong>■ 배경 지식</strong></p>
 * <ul>
 *   <li><code>substring(int beginIndex)</code>: 시작 인덱스부터 문자열 끝까지 추출</li>
 *   <li><code>substring(int beginIndex, int endIndex)</code>: 시작 인덱스부터 끝 인덱스-1까지 추출</li>
 *   <li>원본 문자열은 변경되지 않고, 새로운 문자열이 생성됩니다.</li>
 * </ul>
 * 
 * <p><strong>■ 구현 지시사항</strong></p>
 * <ol>
 *   <li>sentence에서 "Java"만 추출하세요 (인덱스 0부터 4까지)</li>
 *   <li>sentence에서 "Programming"만 추출하세요</li>
 * </ol>
 * 
 * <p><strong>■ 메서드 사용 예제</strong></p>
 * <pre>
 * String str = "Hello World";
 * String sub1 = str.substring(0, 5);    // "Hello"
 * String sub2 = str.substring(6);       // "World"
 * String sub3 = str.substring(6, 11);   // "World"
 * </pre>
 * 
 * <p><strong>■ 주의사항</strong></p>
 * <ul>
 *   <li>endIndex는 포함되지 않습니다. (exclusive)</li>
 *   <li>beginIndex는 포함됩니다. (inclusive)</li>
 *   <li>인덱스가 범위를 벗어나면 <code>StringIndexOutOfBoundsException</code>이 발생합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 팁</strong></p>
 * <ul>
 *   <li>문자열의 위치를 찾으려면 <code>indexOf()</code> 메서드를 활용할 수 있습니다.</li>
 *   <li>"Programming"의 시작 위치: 인덱스 5</li>
 *   <li>"Programming"의 끝 위치: 인덱스 16</li>
 * </ul>
 * 
 * <p><strong>■ 예상 출력 결과</strong></p>
 * <pre>
 * 추출된 단어 1: Java
 * 추출된 단어 2: Programming
 * </pre>
 */
public class Exercise01_Substring {
    public static void main(String[] args) {
        String sentence = "Java Programming is fun!";
        
        // TODO: "Java"만 추출하세요
        String java = // ???
        
        // TODO: "Programming"만 추출하세요 (인덱스 5부터 16까지)
        String programming = // ???
        
        // 아래 코드는 수정하지 마세요
        System.out.println("추출된 단어 1: " + java);
        System.out.println("추출된 단어 2: " + programming);
        
        // 예상 출력:
        // 추출된 단어 1: Java
        // 추출된 단어 2: Programming
    }
}