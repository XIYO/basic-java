package main.java.javabasics.chapter04_conditions.basic;

/**
 * <h3>Chapter 4 - 조건문</h3>
 * <h3>문제 4: 중첩 if문 (Nested If Statements)</h3>
 * 
 * <h3>📚 학습 목표</h3>
 * <ul>
 *   <li>if문 안에 또 다른 if문을 사용하는 중첩 조건문을 학습합니다</li>
 *   <li>복잡한 조건을 단계별로 검사하는 방법을 이해합니다</li>
 *   <li>중첩된 조건문의 실행 흐름을 파악합니다</li>
 * </ul>
 * 
 * <h3>📝 문제 설명</h3>
 * <p>운전 가능 여부를 판단하는 프로그램을 작성합니다.</p>
 * <p>운전을 하려면 두 가지 조건을 모두 만족해야 합니다:</p>
 * <ol>
 *   <li>나이가 18세 이상이어야 함</li>
 *   <li>운전면허를 보유하고 있어야 함</li>
 * </ol>
 * 
 * <h3>🛠️ 구현 지시사항</h3>
 * <ol>
 *   <li>먼저 age가 18 이상인지 확인하세요</li>
 *   <li>나이 조건을 만족하면, hasLicense가 true인지 확인하세요</li>
 *   <li>두 조건을 모두 만족하면 canDrive를 true로 설정하세요</li>
 *   <li>조건을 만족하지 않으면 canDrive는 false로 유지됩니다</li>
 * </ol>
 * 
 * <h3>💡 코드 작성 힌트</h3>
 * <ul>
 *   <li>if문 안에 또 다른 if문을 작성할 수 있습니다</li>
 *   <li>들여쓰기를 통해 구조를 명확히 하세요</li>
 *   <li>외부 if문이 false면 내부 if문은 실행되지 않습니다</li>
 * </ul>
 * 
 * <h3>📌 중첩 if문 구조</h3>
 * <ul>
 *   <li>바깥쪽 if문: 첫 번째 조건을 검사합니다</li>
 *   <li>안쪽 if문: 첫 번째 조건이 참일 때만 두 번째 조건을 검사합니다</li>
 *   <li>중첩 구조: if문 안에 또 다른 if문을 작성합니다</li>
 *   <li>들여쓰기: 각 단계마다 들여쓰기를 해서 구조를 명확히 합니다</li>
 * </ul>
 * 
 * @author XIYO
 * @version 1.0
 * @since 2025-07-15
 */
public class Exercise04_NestedIf {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;
        boolean canDrive = false;
        
        // TODO: 중첩 if문을 사용하여 canDrive를 설정하세요
        // 힌트1: 먼저 age가 18 이상인지 확인하는 if문을 작성하세요
        // 힌트2: 첫 번째 조건이 참이면, 그 안에서 hasLicense를 확인하는 if문을 작성하세요
        // 힌트3: 두 조건을 모두 만족할 때 canDrive를 true로 변경하세요
        
        
        
        
        
        
        // 아래 코드는 수정하지 마세요
        System.out.println("나이: " + age);
        System.out.println("면허 보유: " + hasLicense);
        System.out.println("운전 가능: " + canDrive);
        
        // 예상 출력:
        // 나이: 20
        // 면허 보유: true
        // 운전 가능: true
    }
}