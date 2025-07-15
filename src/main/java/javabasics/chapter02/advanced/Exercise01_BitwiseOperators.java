package main.java.javabasics.chapter02.advanced;

/**
 * Chapter 02 - 연산자 (Operators) - 고급
 * 연습문제 1: 비트 연산자 심화 학습
 * 
 * <h3>학습 목표:</h3>
 * <ul>
 *   <li>비트 단위 논리 연산자(&, |, ^, ~) 완벽 이해</li>
 *   <li>비트 시프트 연산자(<<, >>, >>>) 마스터</li>
 *   <li>실무에서의 비트 연산 활용법 학습</li>
 *   <li>플래그 처리와 비트 마스킹 기법 습득</li>
 * </ul>
 * 
 * <h3>비트 연산자 종류:</h3>
 * <table border="1">
 *   <tr><th>연산자</th><th>이름</th><th>설명</th><th>예시</th></tr>
 *   <tr><td>&</td><td>AND</td><td>두 비트가 모두 1일 때만 1</td><td>1100 & 1010 = 1000</td></tr>
 *   <tr><td>|</td><td>OR</td><td>둘 중 하나라도 1이면 1</td><td>1100 | 1010 = 1110</td></tr>
 *   <tr><td>^</td><td>XOR</td><td>두 비트가 다르면 1</td><td>1100 ^ 1010 = 0110</td></tr>
 *   <tr><td>~</td><td>NOT</td><td>비트 반전 (0↔1)</td><td>~0101 = 1010</td></tr>
 *   <tr><td><<</td><td>왼쪽 시프트</td><td>비트를 왼쪽으로 이동</td><td>0011 << 1 = 0110</td></tr>
 *   <tr><td>>></td><td>오른쪽 시프트</td><td>비트를 오른쪽으로 이동 (부호 유지)</td><td>1000 >> 1 = 0100</td></tr>
 *   <tr><td>>>></td><td>부호없는 오른쪽 시프트</td><td>비트를 오른쪽으로 이동 (0으로 채움)</td><td>음수에서 차이 발생</td></tr>
 * </table>
 * 
 * <h3>💡 실무 활용 예시:</h3>
 * <ul>
 *   <li>권한 관리 시스템 (읽기/쓰기/실행 권한)</li>
 *   <li>플래그 설정 및 확인</li>
 *   <li>효율적인 곱셈/나눗셈 (2의 거듭제곱)</li>
 *   <li>비트 마스킹을 통한 데이터 추출</li>
 *   <li>암호화 및 해시 알고리즘</li>
 * </ul>
 * 
 * <h3>⚠️ 주의사항:</h3>
 * <ul>
 *   <li>음수의 비트 연산은 2의 보수 표현을 이해해야 함</li>
 *   <li>시프트 연산 시 데이터 손실 가능</li>
 *   <li>비트 연산은 정수형에서만 사용 가능</li>
 * </ul>
 * 
 * @author 자바 기초 학습
 * @version 1.0
 * @since Chapter 02 Advanced
 */
public class Exercise01_BitwiseOperators {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 문제 1-1: 비트 AND (&) 연산
         * ==========================================
         * 두 비트가 모두 1일 때만 1을 반환
         * 
         * [비트 AND 연산 과정]
         * a = 12 = 1100₂
         * b = 10 = 1010₂
         * ---------
         * a & b = 1000₂ = 8
         * 
         * 📌 활용: 특정 비트 추출, 플래그 확인, 짝수/홀수 판별
         */
        int a = 12;  // 1100 in binary
        int b = 10;  // 1010 in binary
        
        System.out.println("a = " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        System.out.println("a & b = " + (a & b) + " (binary: " + Integer.toBinaryString(a & b) + ")");
        
        /*
         * ==========================================
         * 문제 1-2: 비트 OR (|) 연산
         * ==========================================
         * 둘 중 하나라도 1이면 1을 반환
         * 
         * [비트 OR 연산 과정]
         * a = 12 = 1100₂
         * b = 10 = 1010₂
         * ---------
         * a | b = 1110₂ = 14
         * 
         * 📌 활용: 플래그 설정, 비트 합치기, 권한 부여
         */
        System.out.println("\na | b = " + (a | b) + " (binary: " + Integer.toBinaryString(a | b) + ")");
        
        /*
         * ==========================================
         * 문제 1-3: 비트 XOR (^) 연산
         * ==========================================
         * 두 비트가 다를 때만 1을 반환 (배타적 OR)
         * 
         * [비트 XOR 연산 과정]
         * a = 12 = 1100₂
         * b = 10 = 1010₂
         * ---------
         * a ^ b = 0110₂ = 6
         * 
         * 💡 특징: a ^ a = 0, a ^ 0 = a
         * 📌 활용: 토글 스위치, 암호화, 체크섬, 스왑
         */
        System.out.println("a ^ b = " + (a ^ b) + " (binary: " + Integer.toBinaryString(a ^ b) + ")");
        
        /*
         * ==========================================
         * 문제 1-4: 비트 NOT (~) 연산
         * ==========================================
         * 모든 비트를 반전 (0 ↔ 1)
         * 
         * [비트 NOT 연산 과정]
         * c = 5 = 00000101₂
         * ~c = 11111010₂ = -6 (2의 보수)
         * 
         * ⚠️ 주의: ~n = -(n+1) 공식
         * 📌 활용: 비트 마스크 생성, 부호 반전
         */
        int c = 5;  // 0101 in binary
        System.out.println("\nc = " + c + " (binary: " + Integer.toBinaryString(c) + ")");
        System.out.println("~c = " + (~c) + " (binary: " + Integer.toBinaryString(~c) + ")");
        
        /*
         * ==========================================
         * 문제 1-5: 왼쪽 시프트 (<<)
         * ==========================================
         * 비트를 왼쪽으로 이동, 오른쪽은 0으로 채움
         * 
         * [왼쪽 시프트 연산]
         * num = 3 = 0011₂
         * num << 1 = 0110₂ = 6 (3 × 2¹)
         * num << 2 = 1100₂ = 12 (3 × 2²)
         * 
         * 🔑 공식: n << k = n × 2^k
         * 💡 활용: 빠른 곱셈, 비트 플래그 설정
         */
        int num = 3;  // 0011 in binary
        System.out.println("\nnum = " + num + " (binary: " + Integer.toBinaryString(num) + ")");
        System.out.println("num << 1 = " + (num << 1) + " (binary: " + Integer.toBinaryString(num << 1) + ")");
        System.out.println("num << 2 = " + (num << 2) + " (binary: " + Integer.toBinaryString(num << 2) + ")");
        
        /*
         * ==========================================
         * 문제 1-6: 오른쪽 시프트 (>>)
         * ==========================================
         * 비트를 오른쪽으로 이동, 부호 비트 유지
         * 
         * [오른쪽 시프트 연산]
         * num2 = 16 = 10000₂
         * num2 >> 1 = 01000₂ = 8 (16 ÷ 2¹)
         * num2 >> 2 = 00100₂ = 4 (16 ÷ 2²)
         * 
         * 🔑 공식: n >> k = n ÷ 2^k (소수점 버림)
         * 💡 활용: 빠른 나눗셈, 비트 추출
         */
        int num2 = 16;  // 10000 in binary
        System.out.println("\nnum2 = " + num2 + " (binary: " + Integer.toBinaryString(num2) + ")");
        System.out.println("num2 >> 1 = " + (num2 >> 1) + " (binary: " + Integer.toBinaryString(num2 >> 1) + ")");
        System.out.println("num2 >> 2 = " + (num2 >> 2) + " (binary: " + Integer.toBinaryString(num2 >> 2) + ")");
        
        /*
         * ==========================================
         * 문제 1-7: 부호 없는 오른쪽 시프트 (>>>)
         * ==========================================
         * 비트를 오른쪽으로 이동, 왼쪽은 항상 0으로 채움
         * 
         * [>> vs >>> 차이점]
         * >> : 부호 비트 유지 (음수는 음수로)
         * >>> : 부호 무시, 0으로 채움 (음수도 양수로)
         * 
         * 📌 예시: -8 >> 1 = -4, -8 >>> 1 = 2147483644
         * ⚠️ 주의: >>> 는 자바에만 있는 연산자
         */
        int negative = -8;
        System.out.println("\nnegative = " + negative + " (binary: " + Integer.toBinaryString(negative) + ")");
        System.out.println("negative >> 1 = " + (negative >> 1));
        System.out.println("negative >>> 1 = " + (negative >>> 1));
        
        /*
         * ==========================================
         * 문제 1-8: 실전 활용 - 플래그 설정
         * ==========================================
         * 비트 연산을 활용한 권한 관리 시스템
         * 
         * [권한 비트 설계]
         * READ    = 001₂ (1) - 읽기 권한
         * WRITE   = 010₂ (2) - 쓰기 권한
         * EXECUTE = 100₂ (4) - 실행 권한
         * 
         * [비트 연산 활용]
         * - 권한 부여: OR 연산 (|=)
         * - 권한 확인: AND 연산 (&)
         * - 권한 제거: AND NOT 연산 (&= ~)
         * 
         * 🎯 실무 활용: 파일 권한, 사용자 권한, 기능 플래그
         */
        final int READ_PERMISSION = 1;    // 001
        final int WRITE_PERMISSION = 2;   // 010
        final int EXECUTE_PERMISSION = 4; // 100
        
        int userPermission = 0;
        
        // 권한 부여
        userPermission |= READ_PERMISSION;
        userPermission |= WRITE_PERMISSION;
        System.out.println("\n권한 설정 후: " + Integer.toBinaryString(userPermission));
        
        // 권한 확인
        boolean canRead = (userPermission & READ_PERMISSION) != 0;
        boolean canWrite = (userPermission & WRITE_PERMISSION) != 0;
        boolean canExecute = (userPermission & EXECUTE_PERMISSION) != 0;
        
        System.out.println("읽기 권한: " + canRead);
        System.out.println("쓰기 권한: " + canWrite);
        System.out.println("실행 권한: " + canExecute);
        
        /*
         * ==========================================
         * 문제 1-9: 비트 마스킹
         * ==========================================
         * 특정 비트만 추출하거나 보호하는 기법
         * 
         * [마스킹 연산]
         * value = 11010110₂
         * mask  = 00001111₂ (하위 4비트 마스크)
         * result= 00000110₂ (하위 4비트만 추출)
         * 
         * 💡 활용 예시:
         * - RGB 색상 값에서 특정 채널 추출
         * - IP 주소에서 네트워크 부분 추출
         * - 데이터 압축/암호화
         */
        int value = 0b11010110;  // 214 in decimal
        int mask = 0b00001111;   // 하위 4비트만 추출
        
        int result = value & mask;
        System.out.println("\n원본 값: " + Integer.toBinaryString(value));
        System.out.println("마스크: " + Integer.toBinaryString(mask));
        System.out.println("결과: " + Integer.toBinaryString(result));
        
        /*
         * ==========================================
         * 문제 1-10: 비트 토글
         * ==========================================
         * XOR를 사용한 비트 반전 (켜지면 끄고, 꺼지면 켜기)
         * 
         * [토글 연산]
         * flags      = 10101010₂
         * toggleMask = 00110011₂
         * flags ^= mask = 10011001₂
         * 
         * 💡 토글 원리:
         * - 1 ^ 1 = 0 (ON → OFF)
         * - 0 ^ 1 = 1 (OFF → ON)
         * - x ^ 0 = x (변화 없음)
         * 
         * 🎮 활용: 게임 스위치, LED 제어, 상태 전환
         */
        int flags = 0b10101010;
        int toggleMask = 0b00110011;
        
        System.out.println("\n토글 전: " + Integer.toBinaryString(flags));
        flags ^= toggleMask;
        System.out.println("토글 후: " + Integer.toBinaryString(flags));
    }
}