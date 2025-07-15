package javabasics.chapter02.advanced;

/**
 * Chapter 02 - 연산자 (Operators) - 고급
 * 연습문제 5: 연산자 실전 응용
 * 
 * <h3>학습 목표:</h3>
 * <ul>
 *   <li>실제 프로그래밍에서 연산자를 활용하는 다양한 패턴 습득</li>
 *   <li>비트 연산을 활용한 권한 관리 시스템 구현</li>
 *   <li>효율적인 연산을 위한 비트 시프트 활용법</li>
 *   <li>실무에서 자주 사용되는 연산자 조합 패턴 이해</li>
 * </ul>
 * 
 * <h3>실전 응용 분야:</h3>
 * <table border="1">
 *   <tr><th>분야</th><th>활용 기술</th><th>효과</th></tr>
 *   <tr><td>권한 관리</td><td>비트 플래그</td><td>메모리 효율적인 권한 표현</td></tr>
 *   <tr><td>색상 처리</td><td>비트 마스킹</td><td>RGB 값 추출 및 조합</td></tr>
 *   <tr><td>성능 최적화</td><td>비트 시프트</td><td>빠른 곱셈/나눗셈</td></tr>
 *   <tr><td>데이터 검증</td><td>XOR 체크섬</td><td>간단한 무결성 검사</td></tr>
 *   <tr><td>순환 처리</td><td>나머지 연산</td><td>배열 인덱스 순환</td></tr>
 * </table>
 * 
 * <h3>💡 핵심 개념:</h3>
 * <ul>
 *   <li>비트 플래그: 각 비트를 독립적인 플래그로 사용</li>
 *   <li>비트 마스킹: 특정 비트만 추출하거나 변경</li>
 *   <li>비트 시프트: 2의 거듭제곱 연산 최적화</li>
 *   <li>XOR 스왑: 임시 변수 없이 값 교환</li>
 * </ul>
 * 
 * <h3>🎯 실무 활용 예시:</h3>
 * <ul>
 *   <li>파일 시스템 권한 (읽기/쓰기/실행)</li>
 *   <li>게임 캐릭터 상태 관리</li>
 *   <li>네트워크 패킷 처리</li>
 *   <li>이미지 처리 및 필터링</li>
 *   <li>데이터 압축 알고리즘</li>
 * </ul>
 * 
 * <h3>⚠️ 주의사항:</h3>
 * <ul>
 *   <li>비트 연산은 가독성이 떨어질 수 있으므로 주석 필수</li>
 *   <li>플랫폼별 정수 크기 차이 고려</li>
 *   <li>음수에 대한 비트 연산 시 주의</li>
 *   <li>성능 최적화는 실제 측정 후 적용</li>
 * </ul>
 * 
 * @author 자바 기초 학습
 * @version 1.0
 * @since Chapter 02 Advanced
 */
public class Exercise05_RealWorldApplications {
    public static void main(String[] args) {
        // 문제 5-1: 비트 플래그를 사용한 권한 관리 시스템
        System.out.println("=== 권한 관리 시스템 ===");
        final int PERM_READ = 1 << 0;     // 0001
        final int PERM_WRITE = 1 << 1;    // 0010
        final int PERM_EXECUTE = 1 << 2;  // 0100
        final int PERM_DELETE = 1 << 3;   // 1000
        
        // 사용자에게 읽기와 쓰기 권한 부여
        int userPermissions = PERM_READ | PERM_WRITE;
        System.out.println("초기 권한: " + Integer.toBinaryString(userPermissions));
        
        // 실행 권한 추가
        userPermissions |= PERM_EXECUTE;
        System.out.println("실행 권한 추가 후: " + Integer.toBinaryString(userPermissions));
        
        // 쓰기 권한 제거
        userPermissions &= ~PERM_WRITE;
        System.out.println("쓰기 권한 제거 후: " + Integer.toBinaryString(userPermissions));
        
        // 권한 확인
        System.out.println("읽기 가능? " + ((userPermissions & PERM_READ) != 0));
        System.out.println("쓰기 가능? " + ((userPermissions & PERM_WRITE) != 0));
        System.out.println("실행 가능? " + ((userPermissions & PERM_EXECUTE) != 0));
        
        // 문제 5-2: 색상 값 처리 (RGB)
        System.out.println("\n=== RGB 색상 처리 ===");
        int color = 0xFF6B3A;  // RGB: 255, 107, 58
        
        int red = (color >> 16) & 0xFF;
        int green = (color >> 8) & 0xFF;
        int blue = color & 0xFF;
        
        System.out.println("색상값: 0x" + Integer.toHexString(color).toUpperCase());
        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);
        
        // 새로운 색상 만들기
        int newRed = 200, newGreen = 150, newBlue = 100;
        int newColor = (newRed << 16) | (newGreen << 8) | newBlue;
        System.out.println("새 색상값: 0x" + Integer.toHexString(newColor).toUpperCase());
        
        // 문제 5-3: 빠른 곱셈과 나눗셈
        System.out.println("\n=== 비트 시프트를 사용한 빠른 연산 ===");
        int num = 25;
        
        System.out.println(num + " * 2 = " + (num << 1));
        System.out.println(num + " * 4 = " + (num << 2));
        System.out.println(num + " * 8 = " + (num << 3));
        System.out.println(num + " / 2 = " + (num >> 1));
        System.out.println(num + " / 4 = " + (num >> 2));
        
        // 문제 5-4: 순환 배열 인덱스
        System.out.println("\n=== 순환 배열 인덱스 ===");
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        int currentDay = 5;  // 토요일 (0부터 시작)
        
        // 3일 후
        int afterDays = (currentDay + 3) % days.length;
        System.out.println("현재: " + days[currentDay]);
        System.out.println("3일 후: " + days[afterDays]);
        
        // 10일 전
        int beforeDays = (currentDay - 10 % days.length + days.length) % days.length;
        System.out.println("10일 전: " + days[beforeDays]);
        
        // 문제 5-5: 체크섬 계산
        System.out.println("\n=== 간단한 체크섬 계산 ===");
        String data = "Hello World";
        int checksum = 0;
        
        for (char c : data.toCharArray()) {
            checksum ^= c;  // XOR 연산으로 체크섬 생성
        }
        
        System.out.println("데이터: " + data);
        System.out.println("체크섬: " + checksum);
        
        // 문제 5-6: 페이징 처리
        System.out.println("\n=== 페이징 처리 ===");
        int totalItems = 123;
        int itemsPerPage = 10;
        
        int totalPages = (totalItems + itemsPerPage - 1) / itemsPerPage;  // 올림 처리
        System.out.println("전체 아이템: " + totalItems);
        System.out.println("페이지당 아이템: " + itemsPerPage);
        System.out.println("전체 페이지: " + totalPages);
        
        // 특정 페이지의 시작과 끝 인덱스
        int currentPage = 5;  // 5페이지 (1부터 시작)
        int startIndex = (currentPage - 1) * itemsPerPage;
        int endIndex = Math.min(startIndex + itemsPerPage - 1, totalItems - 1);
        
        System.out.println("\n" + currentPage + "페이지 범위: " + startIndex + " ~ " + endIndex);
        
        // 문제 5-7: 비트 카운팅
        System.out.println("\n=== 비트 카운팅 ===");
        int value = 0b11010110;  // 214
        int bitCount = 0;
        int temp = value;
        
        while (temp != 0) {
            bitCount += temp & 1;
            temp >>>= 1;
        }
        
        System.out.println("값: " + value + " (binary: " + Integer.toBinaryString(value) + ")");
        System.out.println("1의 개수: " + bitCount);
        
        // 문제 5-8: 스왑 알고리즘
        System.out.println("\n=== XOR을 사용한 스왑 ===");
        int x = 10, y = 20;
        System.out.println("교환 전: x = " + x + ", y = " + y);
        
        // 임시 변수 없이 교환
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        
        System.out.println("교환 후: x = " + x + ", y = " + y);
    }
}