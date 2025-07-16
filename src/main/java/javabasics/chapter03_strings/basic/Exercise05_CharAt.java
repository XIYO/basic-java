package main.java.javabasics.chapter03_strings.basic;

/**
 * <h3>Chapter 3 - 문자열 (기본)</h3>
 * <h3>문제 5: 문자 추출 (charAt)</h3>
 * 
 * <p><b>■ 학습 목표</b></p>
 * <ul>
 *   <li>charAt() 메서드를 사용하여 문자열의 특정 위치 문자를 추출합니다.</li>
 *   <li>문자열 인덱스의 개념을 이해합니다.</li>
 * </ul>
 * 
 * <p><b>■ 배경 지식</b></p>
 * <ul>
 *   <li><code>charAt(int index)</code> 메서드는 지정된 인덱스의 문자를 반환합니다.</li>
 *   <li>인덱스는 0부터 시작합니다. (첫 번째 문자의 인덱스는 0)</li>
 *   <li>마지막 문자의 인덱스는 <code>문자열.length() - 1</code>입니다.</li>
 *   <li>반환 타입은 char(문자) 타입입니다.</li>
 * </ul>
 * 
 * <p><b>■ 구현 지시사항</b></p>
 * <ol>
 *   <li>word 문자열의 첫 번째 문자를 추출하세요 (인덱스 0)</li>
 *   <li>word 문자열의 마지막 문자를 추출하세요</li>
 * </ol>
 * 
 * <p><b>■ 메서드 사용법</b></p>
 * <ul>
 *   <li>문자열 변수 뒤에 점(.)을 찍고 charAt() 메서드를 호출합니다</li>
 *   <li>괄호 안에 추출하고 싶은 위치의 인덱스를 넣습니다</li>
 *   <li>첫 번째 문자는 인덱스 0, 두 번째는 1, 세 번째는 2...</li>
 *   <li>마지막 문자의 인덱스는 문자열 길이에서 1을 뺀 값입니다</li>
 * </ul>
 * 
 * <p><b>■ 주의사항</b></p>
 * <ul>
 *   <li>범위를 벗어난 인덱스를 사용하면 <code>StringIndexOutOfBoundsException</code>이 발생합니다.</li>
 *   <li>빈 문자열에서 charAt()을 호출하면 예외가 발생합니다.</li>
 * </ul>
 * 
 * <p><b>■ 예상 출력 결과</b></p>
 * <pre>
 * 첫 번째 문자: J
 * 마지막 문자: a
 * </pre>
 */
public class Exercise05_CharAt {
    public static void main(String[] args) {
        String word = "Java";
        
        // TODO: 첫 번째 문자를 추출하세요
        // 힌트: charAt() 메서드에 인덱스 0을 전달하세요
        char firstChar = ???;
        
        // TODO: 마지막 문자를 추출하세요
        // 힌트: 마지막 인덱스는 word.length()에서 1을 뺀 값입니다
        char lastChar = ???;
        
        // 아래 코드는 수정하지 마세요
        System.out.println("첫 번째 문자: " + firstChar);
        System.out.println("마지막 문자: " + lastChar);
        
        // 예상 출력:
        // 첫 번째 문자: J
        // 마지막 문자: a
    }
}