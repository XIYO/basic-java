/**
 * 초보자를 위한 JavaDoc HTML 주석 템플릿
 * 
 * 이 템플릿은 Java를 처음 배우는 학생들이 쉽게 이해할 수 있도록
 * HTML 태그를 활용한 시각적이고 구조화된 주석 작성 가이드입니다.
 */

/**
 * <h3>🎯 문제명: [문제 제목]</h3>
 * 
 * <h3>📋 문제 설명</h3>
 * <p>
 * 여기에 문제를 쉽고 친근하게 설명합니다.<br>
 * 초보자가 이해하기 쉬운 일상적인 예시를 들어주세요.
 * </p>
 * 
 * <h3>📌 학습 목표</h3>
 * 
 *   <ul>
 *     <li>✅ 목표 1: 무엇을 배울 것인지</li>
 *     <li>✅ 목표 2: 어떤 개념을 이해하게 될 것인지</li>
 *     <li>✅ 목표 3: 실습 후 할 수 있게 될 것</li>
 *   </ul>
 * 
 * 
 * <h3>📝 기초 개념</h3>
 * <table border="1">
 *   <tr>
 *     <th>개념</th>
 *     <th>설명</th>
 *     <th>예시</th>
 *   </tr>
 *   <tr>
 *     <td><code>int</code></td>
 *     <td>정수를 저장하는 자료형</td>
 *     <td><code>int age = 20;</code></td>
 *   </tr>
 * </table>
 * 
 * <h3>💡 힌트</h3>
 * 
 *   <p><b>힌트 1:</b> 변수를 선언할 때는 자료형을 먼저 쓰고 변수명을 씁니다.</p>
 *   <p><b>힌트 2:</b> 세미콜론(;)을 잊지 마세요!</p>
 * 
 * 
 * <h3>⚠️ 주의사항</h3>
 * 
 *   <ul>
 *     <li>변수명은 숫자로 시작할 수 없어요</li>
 *     <li>Java는 대소문자를 구분해요 (age ≠ Age)</li>
 *   </ul>
 * 
 * 
 * <h3>✅ 예제 코드</h3>
 * <pre>
 * <code>
 * // 올바른 예시
 * int myAge = 25;
 * String myName = "홍길동";
 * 
 * // 잘못된 예시
 * int 2myAge = 25;  // ❌ 숫자로 시작
 * String myname;     // ❌ 초기화하지 않음
 * </code>
 * </pre>
 * 
 * <h3>🎮 도전 과제</h3>
 * <ol>
 *   <li>기본: 변수를 선언하고 값을 할당해보세요</li>
 *   <li>중급: 두 변수의 값을 교환해보세요</li>
 *   <li>고급: 여러 자료형을 활용한 계산을 해보세요</li>
 * </ol>
 * 
 * <h3>📚 추가 학습 자료</h3>
 * <ul>
 *   <li>🔗 <a href="#">Java 변수 기초 (동영상)</a></li>
 *   <li>📖 추천 도서: "Java의 정석" 3장</li>
 *   <li>💻 온라인 실습: <a href="#">코드 플레이그라운드</a></li>
 * </ul>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */

public class BeginnerJavaDocTemplate {
    
    /**
     * <h3>🔧 메서드명: [메서드 이름]</h3>
     * 
     * <p><b>역할:</b> 이 메서드가 하는 일을 쉽게 설명합니다.</p>
     * 
     * <h4>매개변수 설명</h4>
     * <table border="1">
     *   <tr>
     *     <th>매개변수</th>
     *     <th>타입</th>
     *     <th>설명</th>
     *     <th>예시</th>
     *   </tr>
     *   <tr>
     *     <td>param1</td>
     *     <td>int</td>
     *     <td>첫 번째 숫자</td>
     *     <td>10, 20, -5</td>
     *   </tr>
     * </table>
     * 
     * <h4>반환값</h4>
     * <p>✅ <b>타입:</b> int<br>
     *    ✅ <b>설명:</b> 계산된 결과값</p>
     * 
     * <h4>사용 예시</h4>
     * <pre>
     * int result = methodName(10, 20);
     * System.out.println(result);  // 출력: 30
     * </pre>
     * 
     * @param param1 첫 번째 매개변수
     * @param param2 두 번째 매개변수
     * @return 계산 결과
     */
    public int methodName(int param1, int param2) {
        return param1 + param2;
    }
    
    /**
     * <h3>📊 필드 설명</h3>
     * 
     * <p>이 변수는 <b>[용도]</b>를 저장합니다.</p>
     * 
     * 
     *   <b>💡 Tip:</b> private으로 선언하면 다른 클래스에서 직접 접근할 수 없어요!
     * 
     */
    private String fieldName;
    
    /**
     * <h3>🏁 실행 순서</h3>
     * <ol>
     *   <li>프로그램 시작</li>
     *   <li>변수 선언 및 초기화</li>
     *   <li>계산 수행</li>
     *   <li>결과 출력</li>
     *   <li>프로그램 종료</li>
     * </ol>
     */
    public static void main(String[] args) {
        // 실행 코드
    }
}

/**
 * 🌟 주석 작성 팁 for 초보자
 * 
 * 1. 이모지 사용하기
 *    - 🎯 목표/목적
 *    - 📋 설명
 *    - 💡 힌트/팁
 *    - ⚠️ 주의사항
 *    - ✅ 올바른 예시
 *    - ❌ 잘못된 예시
 *    - 🔧 도구/메서드
 *    - 📊 데이터/변수
 *    - 🎮 실습/과제
 *    - 📚 참고자료
 * 
 * 2. HTML 태그 활용
 *    - <h3>~<h6>: 제목 레벨
 *    - <p>: 문단
 *    - <br>: 줄바꿈
 *    - <ul>, <ol>, <li>: 목록
 *    - <table>: 표
 *    - <code>: 코드 강조
 *    - <pre>: 코드 블록
 *    - <b>, <b>: 굵은 글씨
 *    - <em>, <i>: 기울임
 *    - : 영역 구분
 *    - style 속성: 색상, 배경 등
 * 
 * 3. 초보자 친화적 작성법
 *    - 전문 용어보다 쉬운 말 사용
 *    - 구체적인 예시 제공
 *    - 단계별 설명
 *    - 시각적 구분 (색상, 박스)
 *    - 자주 하는 실수 언급
 *    - 격려하는 톤 사용
 */