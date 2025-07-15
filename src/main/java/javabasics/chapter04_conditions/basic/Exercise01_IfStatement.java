package javabasics.chapter04_conditions.basic;

/**
 * Chapter 4 - 조건문
 * 문제 1: if문 기초
 * 
 * ===== 학습 목표 =====
 * • 기본적인 if문 사용법을 학습합니다
 * • 조건식을 작성하고 조건에 따른 코드 실행을 이해합니다
 * • boolean 변수의 값을 조건에 따라 설정하는 방법을 익힙니다
 * 
 * ===== 문제 설명 =====
 * 투표 가능 나이를 확인하는 프로그램입니다.
 * 만 18세 이상인 경우에만 투표가 가능합니다.
 * 
 * ===== 구현 지시사항 =====
 * 1. age 변수의 값이 18 이상인지 확인합니다
 * 2. if문을 사용하여 조건을 검사합니다
 * 3. 조건이 참이면 canVote 변수를 true로 변경합니다
 * 
 * ===== 코드 작성 힌트 =====
 * • if문 기본 구조:
 *   if (조건식) {
 *       // 조건이 참일 때 실행할 코드
 *   }
 * 
 * • 비교 연산자:
 *   - >= : 크거나 같다
 *   - >  : 크다
 *   - <= : 작거나 같다
 *   - <  : 작다
 *   - == : 같다
 *   - != : 같지 않다
 * 
 * ===== 예제 코드 패턴 =====
 * if (변수 >= 기준값) {
 *     결과변수 = true;
 * }
 */
public class Exercise01_IfStatement {
    public static void main(String[] args) {
        int age = 20;
        boolean canVote = false;
        
        // TODO: age가 18 이상이면 canVote를 true로 설정하는 if문을 작성하세요
        // 작성 위치: 여기에 if문을 작성합니다
        
        
        
        // ===== 테스트 출력 (수정 금지) =====
        System.out.println("나이: " + age);
        System.out.println("투표 가능: " + canVote);
        
        // ===== 예상 출력 =====
        // 나이: 20
        // 투표 가능: true
        
        /* IntelliJ 단축키 팁:
         * • 코드 자동완성: Ctrl+Space (Windows/Linux) / Cmd+Space (Mac)
         * • 코드 포맷팅: Ctrl+Alt+L (Windows/Linux) / Cmd+Option+L (Mac)
         * • 주석 토글: Ctrl+/ (Windows/Linux) / Cmd+/ (Mac)
         */
    }
}