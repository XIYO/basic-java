package main.java.javabasics.chapter01_variables.basic;

/**
 * <h3>Chapter 1 - 변수와 데이터 타입</h3>
 * <h3>문제 4: 모든 기본 자료형 (All Primitive Data Types)</h3>
 * 
 * <p><b>목표:</b> Java의 8가지 기본 자료형(Primitive Types)을 모두 이해하고 활용할 수 있습니다.</p>
 * 
 * <h4>학습 내용: Java의 8가지 기본 자료형</h4>
 * 
 * <h5>1. 정수형 (Integer Types) - 4가지</h5>
 * <table border="1" cellpadding="5">
 *   <tr>
 *     <th>타입</th>
 *     <th>크기</th>
 *     <th>범위</th>
 *     <th>용도</th>
 *   </tr>
 *   <tr>
 *     <td><code>byte</code></td>
 *     <td>1 byte</td>
 *     <td>-128 ~ 127</td>
 *     <td>메모리 절약, 파일 처리</td>
 *   </tr>
 *   <tr>
 *     <td><code>short</code></td>
 *     <td>2 bytes</td>
 *     <td>-32,768 ~ 32,767</td>
 *     <td>중간 크기 정수</td>
 *   </tr>
 *   <tr>
 *     <td><code>int</code></td>
 *     <td>4 bytes</td>
 *     <td>-2,147,483,648 ~ 2,147,483,647</td>
 *     <td>일반적인 정수, 배열 인덱스</td>
 *   </tr>
 *   <tr>
 *     <td><code>long</code></td>
 *     <td>8 bytes</td>
 *     <td>-9,223,372,036,854,775,808 ~<br/>9,223,372,036,854,775,807</td>
 *     <td>시간(밀리초), 큰 파일 크기</td>
 *   </tr>
 * </table>
 * 
 * <h5>2. 실수형 (Floating-point Types) - 2가지</h5>
 * <table border="1" cellpadding="5">
 *   <tr>
 *     <th>타입</th>
 *     <th>크기</th>
 *     <th>정밀도</th>
 *     <th>용도</th>
 *   </tr>
 *   <tr>
 *     <td><code>float</code></td>
 *     <td>4 bytes</td>
 *     <td>약 7자리</td>
 *     <td>그래픽스, 대량 실수 데이터</td>
 *   </tr>
 *   <tr>
 *     <td><code>double</code></td>
 *     <td>8 bytes</td>
 *     <td>약 15자리</td>
 *     <td>과학 계산, 일반 실수 연산</td>
 *   </tr>
 * </table>
 * 
 * <h5>3. 논리형 (Boolean Type) - 1가지</h5>
 * <ul>
 *   <li><code>boolean</code>: <code>true</code> 또는 <code>false</code> (조건문, 플래그)</li>
 * </ul>
 * 
 * <h5>4. 문자형 (Character Type) - 1가지</h5>
 * <ul>
 *   <li><code>char</code>: 2 bytes, 유니코드 문자 (0 ~ 65,535)</li>
 * </ul>
 * 
 * <h4>지시사항:</h4>
 * <ol>
 *   <li>8가지 기본 자료형 변수를 모두 선언하고 초기화하세요</li>
 *   <li>각 변수를 타입 이름과 함께 출력하세요</li>
 *   <li>각 타입의 범위와 정밀도를 관찰하세요</li>
 * </ol>
 * 
 * <h4>힌트:</h4>
 * <ul>
 *   <li><code>long</code> 리터럴은 <code>L</code> 접미사 사용 (예: <code>123L</code>)</li>
 *   <li><code>float</code> 리터럴은 <code>f</code> 접미사 사용 (예: <code>3.14f</code>)</li>
 *   <li><code>char</code>는 작은따옴표 사용 (예: <code>'A'</code>)</li>
 * </ul>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise04_AllPrimitives {
    public static void main(String[] args) {
        // TODO: 8가지 기본 자료형 변수 선언 및 초기화
        
        // 정수형 (Integer types) - 4가지
        // TODO: byte 타입 변수 선언 (-128 ~ 127)
        // 예시: byte myByte = 100;
        // 용도: 메모리 절약이 필요한 대용량 배열, 파일 처리
        byte myByte = 0; // 여기에 적절한 값을 할당하세요
        
        // TODO: short 타입 변수 선언 (-32,768 ~ 32,767)
        // 예시: short myShort = 30000;
        // 용도: byte보다 큰 범위가 필요하지만 int는 과한 경우
        short myShort = 0; // 여기에 적절한 값을 할당하세요
        
        // TODO: int 타입 변수 선언 (-2,147,483,648 ~ 2,147,483,647)
        // 예시: int myInt = 2000000;
        // 용도: 가장 일반적인 정수형, 배열 인덱스, 반복문 카운터
        int myInt = 0; // 여기에 적절한 값을 할당하세요
        
        // TODO: long 타입 변수 선언 (약 -9×10¹⁸ ~ 9×10¹⁸)
        // 예시: long myLong = 9876543210L;  // L 접미사 필수!
        // 용도: 시간(밀리초), 큰 파일 크기, ID 값
        long myLong = 0L; // 여기에 적절한 값을 할당하세요 (L 접미사 잊지 마세요!)
        
        // 실수형 (Floating-point types) - 2가지
        // TODO: float 타입 변수 선언 (32비트 정밀도, 약 7자리)
        // 예시: float myFloat = 3.14f;  // f 접미사 필수!
        // 용도: 그래픽스, 대량의 실수 데이터 (정밀도보다 메모리 중요)
        float myFloat = 0.0f; // 여기에 적절한 값을 할당하세요 (f 접미사 잊지 마세요!)
        
        // TODO: double 타입 변수 선언 (64비트 정밀도, 약 15자리)
        // 예시: double myDouble = 3.141592653589793;
        // 용도: 과학 계산, 일반적인 실수 연산 (기본 실수형)
        double myDouble = 0.0; // 여기에 적절한 값을 할당하세요
        
        // 논리형 (Boolean type) - 1가지
        // TODO: boolean 타입 변수 선언 (true 또는 false)
        // 예시: boolean myBoolean = true;
        // 용도: 조건문, 플래그, 상태 표시
        boolean myBoolean = false; // 여기에 true 또는 false를 할당하세요
        
        // 문자형 (Character type) - 1가지
        // TODO: char 타입 변수 선언 (단일 문자, 유니코드)
        // 예시: char myChar = 'A';
        // 용도: 단일 문자 처리, 문자 배열로 문자열 표현
        char myChar = ' '; // 여기에 단일 문자를 할당하세요
        
        // 변수 출력
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("boolean: " + myBoolean);
        System.out.println("char: " + myChar);
        
        // 예상 출력:
        // byte: 100
        // short: 30000
        // int: 2000000
        // long: 9876543210
        // float: 3.14
        // double: 3.141592653589793
        // boolean: true
        // char: A
        
        // 🎯 추가 학습:
        // 1. 각 타입의 최대/최소값을 저장해보세요
        // 2. 서로 다른 타입 간의 연산을 시도해보세요
        // 3. 메모리 크기와 성능의 관계를 고려해보세요
        
        // ⚠️ 주의사항:
        // 1. long 리터럴에 L 접미사를 빼먹지 마세요
        // 2. float 리터럴에 f 접미사를 빼먹지 마세요
        // 3. 타입의 범위를 초과하면 오버플로우 발생
        // 4. 정수 나눗셈은 결과도 정수 (5/2 = 2)
    }
}