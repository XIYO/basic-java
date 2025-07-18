package main.java.javabasics.chapter03_strings.advanced;

/**
 * <h3>Chapter 3 - 문자열 (응용)</h3>
 * <h3>문제 4: 공백 제거와 대소문자 변환</h3>
 * 
 * <p><b>■ 학습 목표</b></p>
 * <ul>
 *   <li>trim() 메서드로 문자열의 앞뒤 공백을 제거하는 방법을 학습합니다.</li>
 *   <li>toUpperCase()와 toLowerCase() 메서드로 대소문자를 변환하는 방법을 학습합니다.</li>
 *   <li>문자열 정규화의 중요성을 이해합니다.</li>
 * </ul>
 * 
 * <p><b>■ 배경 지식</b></p>
 * <ul>
 *   <li><code>trim()</code>: 문자열 앞뒤의 공백문자(스페이스, 탭, 줄바꿈 등)를 제거</li>
 *   <li><code>toUpperCase()</code>: 모든 문자를 대문자로 변환</li>
 *   <li><code>toLowerCase()</code>: 모든 문자를 소문자로 변환</li>
 *   <li>모든 메서드는 새로운 문자열을 반환하며, 원본은 변경되지 않습니다.</li>
 * </ul>
 * 
 * <p><b>■ 구현 지시사항</b></p>
 * <ol>
 *   <li>input의 앞뒤 공백을 제거하세요</li>
 *   <li>name을 모두 대문자로 변환하세요</li>
 *   <li>code를 모두 소문자로 변환하세요</li>
 * </ol>
 * 
 * <p><b>■ 메서드 사용법</b></p>
 * <ul>
 *   <li><b>trim() 메서드</b>
 *     <ul>
 *       <li>문자열의 시작과 끝에 있는 공백을 제거합니다</li>
 *       <li>중간에 있는 공백은 제거하지 않습니다</li>
 *       <li>탭, 줄바꿈 등도 공백으로 처리됩니다</li>
 *     </ul>
 *   </li>
 *   <li><b>toUpperCase() 메서드</b>
 *     <ul>
 *       <li>모든 알파벳을 대문자로 변환합니다</li>
 *       <li>숫자나 특수문자는 그대로 유지됩니다</li>
 *     </ul>
 *   </li>
 *   <li><b>toLowerCase() 메서드</b>
 *     <ul>
 *       <li>모든 알파벳을 소문자로 변환합니다</li>
 *       <li>숫자나 특수문자는 그대로 유지됩니다</li>
 *     </ul>
 *   </li>
 * </ul>
 * 
 * <p><b>■ 주의사항</b></p>
 * <ul>
 *   <li>trim()은 문자열 중간의 공백은 제거하지 않습니다.</li>
 *   <li>숫자나 특수문자는 대소문자 변환의 영향을 받지 않습니다.</li>
 *   <li>한글 등 알파벳이 아닌 문자도 영향을 받지 않습니다.</li>
 * </ul>
 * 
 * <p><b>■ 실무 활용 예</b></p>
 * <ul>
 *   <li><b>trim()</b>: 사용자 입력값 정규화, 데이터 정제</li>
 *   <li><b>toUpperCase()</b>: 대소문자 구분 없는 비교, 코드값 표준화</li>
 *   <li><b>toLowerCase()</b>: 이메일 주소 정규화, 검색어 처리</li>
 * </ul>
 * 
 * <p><b>■ 추가 정보</b></p>
 * <ul>
 *   <li>Java 11부터는 <code>strip()</code> 메서드가 추가되어 유니코드 공백도 제거 가능</li>
 *   <li><code>stripLeading()</code>: 앞쪽 공백만 제거</li>
 *   <li><code>stripTrailing()</code>: 뒤쪽 공백만 제거</li>
 * </ul>
 * 
 * <p><b>■ 예상 출력 결과</b></p>
 * <pre>
 * 원본: '   Hello World   '
 * 공백 제거: 'Hello World'
 * 대문자 이름: JOHN DOE
 * 소문자 코드: abc123xyz
 * </pre>
 */
public class Exercise04_StringTrim {
    public static void main(String[] args) {
        String input = "   Hello World   ";
        String name = "John Doe";
        String code = "ABC123XYZ";
        
        // TODO: input의 앞뒤 공백을 제거하세요
        // 힌트: trim() 메서드를 사용하여 앞뒤 공백을 제거하세요
        String trimmed = ???;
        
        // TODO: name을 모두 대문자로 변환하세요
        // 힌트: toUpperCase() 메서드를 사용하세요
        String upperName = ???;
        
        // TODO: code를 모두 소문자로 변환하세요
        // 힌트: toLowerCase() 메서드를 사용하세요
        String lowerCode = ???;
        
        // 아래 코드는 수정하지 마세요
        System.out.println("원본: '" + input + "'");
        System.out.println("공백 제거: '" + trimmed + "'");
        System.out.println("대문자 이름: " + upperName);
        System.out.println("소문자 코드: " + lowerCode);
        
        // 예상 출력:
        // 원본: '   Hello World   '
        // 공백 제거: 'Hello World'
        // 대문자 이름: JOHN DOE
        // 소문자 코드: abc123xyz
    }
}