# SQL Developer 설치 가이드

## 📌 SQL Developer란?
Oracle SQL Developer는 Oracle에서 제공하는 **무료** 데이터베이스 관리 도구입니다. 
- SQL 쿼리 작성 및 실행
- 테이블 생성 및 관리
- 데이터 조회 및 수정
- 시각적인 인터페이스 제공

## 💻 Windows 설치 방법

### 준비사항
- Windows 10 이상
- Java 11 이상 (자동으로 설치됩니다)

### 방법 1: Winget으로 설치 (추천) 🌟

1. **PowerShell을 관리자 권한으로 열기**
   - 시작 버튼 우클릭 → Windows PowerShell (관리자)

2. **다음 명령어 실행**
   ```powershell
   # Java 설치 확인
   java -version
   
   # Java가 없다면 먼저 설치
   winget install Oracle.JavaRuntimeEnvironment
   
   # SQL Developer 설치
   winget install Oracle.SQLDeveloper
   ```

### 방법 2: 수동 설치

1. [Oracle SQL Developer 다운로드 페이지](https://www.oracle.com/database/sqldeveloper/technologies/download/) 접속
2. Windows 64-bit with JDK included 버전 다운로드
3. 다운로드한 ZIP 파일을 원하는 위치에 압축 해제
4. `sqldeveloper.exe` 실행

## 🍎 Mac 설치 방법

### 준비사항
- macOS 10.14 이상
- Java 11 이상 (자동으로 설치됩니다)

### 방법 1: 수동 설치 (추천) 🌟

**Homebrew에 SQL Developer가 없으므로 수동 설치를 진행합니다.**

1. **Java 설치 (필요한 경우)**
   ```bash
   # Terminal에서 Java 확인
   java -version
   
   # Java가 없다면 Homebrew로 설치
   brew install openjdk@17
   ```

2. **SQL Developer 다운로드**
   - [Oracle SQL Developer 다운로드 페이지](https://www.oracle.com/database/sqldeveloper/technologies/download/) 접속
   - **macOS** 버전 다운로드 (JDK 포함 버전 권장)
   - 다운로드한 DMG 파일 실행
   - SQL Developer를 Applications 폴더로 드래그

> 💡 **참고**: Homebrew에는 SQL Developer cask가 제공되지 않아 수동 설치가 필요합니다.

## ✅ 설치 확인

### Windows
- 시작 메뉴에서 "SQL Developer" 검색하여 실행
- 첫 실행 시 Java 경로를 묻는다면, Java 설치 경로 지정
  - 보통: `C:\Program Files\Java\jdk-17` 또는 유사한 경로

### Mac
- Launchpad 또는 Applications 폴더에서 SQL Developer 실행
- 첫 실행 시 보안 경고가 나타나면:
  - 시스템 환경설정 → 보안 및 개인정보 보호 → "확인 없이 열기" 클릭

## ❓ 문제 해결

### "Java를 찾을 수 없습니다" 오류
```bash
# Windows (PowerShell)
java -version
$env:JAVA_HOME

# Mac (Terminal)
java -version
echo $JAVA_HOME
```

Java가 설치되어 있지 않다면 위의 설치 명령어로 설치

### SQL Developer가 시작되지 않을 때

1. Java 버전 확인 (11 이상 필요)
2. 설치 경로에 한글이나 특수문자가 없는지 확인
3. 관리자 권한으로 실행해보기

## 🎯 다음 단계

SQL Developer 설치가 완료되었다면:
➡️ [Oracle 데이터베이스 접속 가이드](./CONNECT_WITH_SQL_DEVELOPER.md)로 이동하세요!