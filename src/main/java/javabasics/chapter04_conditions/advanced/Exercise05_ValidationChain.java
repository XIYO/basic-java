package main.java.javabasics.chapter04_conditions.advanced;

/**
 * Chapter 4 - 조건문 (응용)
 * 문제 5: 입력 검증 체인
 * 
 * 목표: 여러 단계의 검증을 거쳐 최종 결과를 도출하는 프로그램을 작성합니다.
 * 
 * 지시사항:
 * 1. 비밀번호 검증 프로그램을 작성하세요
 * 2. 검증 조건:
 *    - 길이가 8자 이상
 *    - 대문자 포함 (hasUpperCase가 true)
 *    - 소문자 포함 (hasLowerCase가 true)
 *    - 숫자 포함 (hasNumber가 true)
 *    - 특수문자 포함 (hasSpecialChar가 true)
 * 3. 모든 조건을 만족하면 "강함", 4개 만족하면 "보통", 
 *    3개 이하면 "약함"으로 표시하세요
 * 
 * 힌트:
 * - 각 조건을 개별적으로 검사한 후 카운트하세요
 * - 검증 실패 이유를 구체적으로 알려주면 더 좋습니다
 */
public class Exercise05_ValidationChain {
    public static void main(String[] args) {
        String password = "Pass123!";
        int length = password.length();
        boolean hasUpperCase = true;
        boolean hasLowerCase = true;
        boolean hasNumber = true;
        boolean hasSpecialChar = true;
        
        String strength = "";
        int validCount = 0;
        
        // TODO: 비밀번호 강도를 검증하는 로직을 작성하세요
        // 힌트1: 각 조건(길이, 대문자, 소문자, 숫자, 특수문자)을 확인하여 validCount를 증가시키세요
        // 힌트2: 길이가 8 이상인지 확인하세요
        // 힌트3: 각 boolean 변수가 true일 때마다 validCount를 1씩 증가시키세요
        // 힌트4: 최종적으로 validCount에 따라 strength를 설정하세요 (5개:"강함", 4개:"보통", 3개 이하:"약함")
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // 아래 코드는 수정하지 마세요
        System.out.println("비밀번호: " + password);
        System.out.println("비밀번호 강도: " + strength);
        System.out.println("충족 조건 수: " + validCount + "/5");
        
        // 예상 출력:
        // 비밀번호: Pass123!
        // 비밀번호 강도: 강함
        // 충족 조건 수: 5/5
    }
}