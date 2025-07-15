package javabasics.chapter03_strings.basic;

/**
 * <h2>Chapter 3 - 문자열 (기본)</h2>
 * <h3>문제 5: 문자 추출 (charAt)</h3>
 * 
 * <p><strong>■ 학습 목표</strong></p>
 * <ul>
 *   <li>charAt() 메서드를 사용하여 문자열의 특정 위치 문자를 추출합니다.</li>
 *   <li>문자열 인덱스의 개념을 이해합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 배경 지식</strong></p>
 * <ul>
 *   <li><code>charAt(int index)</code> 메서드는 지정된 인덱스의 문자를 반환합니다.</li>
 *   <li>인덱스는 0부터 시작합니다. (첫 번째 문자의 인덱스는 0)</li>
 *   <li>마지막 문자의 인덱스는 <code>문자열.length() - 1</code>입니다.</li>
 *   <li>반환 타입은 char(문자) 타입입니다.</li>
 * </ul>
 * 
 * <p><strong>■ 구현 지시사항</strong></p>
 * <ol>
 *   <li>word 문자열의 첫 번째 문자를 추출하세요 (인덱스 0)</li>
 *   <li>word 문자열의 마지막 문자를 추출하세요</li>
 * </ol>
 * 
 * <p><strong>■ 메서드 사용법</strong></p>
 * <pre>
 * String str = "Hello";
 * char ch1 = str.charAt(0);    // 'H'
 * char ch2 = str.charAt(4);    // 'o'
 * </pre>
 * 
 * <p><strong>■ 주의사항</strong></p>
 * <ul>
 *   <li>범위를 벗어난 인덱스를 사용하면 <code>StringIndexOutOfBoundsException</code>이 발생합니다.</li>
 *   <li>빈 문자열에서 charAt()을 호출하면 예외가 발생합니다.</li>
 * </ul>
 * 
 * <p><strong>■ 예상 출력 결과</strong></p>
 * <pre>
 * 첫 번째 문자: J
 * 마지막 문자: a
 * </pre>
 */
public class Exercise05_CharAt {
    public static void main(String[] args) {
        String word = "Java";
        
        // TODO: 첫 번째 문자를 추출하세요
        char firstChar = // ???
        
        // TODO: 마지막 문자를 추출하세요
        char lastChar = // ???
        
        // 아래 코드는 수정하지 마세요
        System.out.println("첫 번째 문자: " + firstChar);
        System.out.println("마지막 문자: " + lastChar);
        
        // 예상 출력:
        // 첫 번째 문자: J
        // 마지막 문자: a
    }
}