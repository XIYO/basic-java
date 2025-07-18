---
author: XIYO
date: 2025-07-17
tags:
  - mac-setup
  - jetbrains
  - intellij
  - ide
  - development-tools
  - font-settings
---

# JetBrains 설정 가이드

## JetBrains Toolbox 초기 설정

### 1. Toolbox 실행

JetBrains Toolbox 앱을 실행하는 명령어입니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
open -a "JetBrains Toolbox"
```

### 2. 로그인
1. JetBrains 계정으로 로그인
2. 없다면 [JetBrains 계정 생성](https://account.jetbrains.com/login)

### 3. 설정 최적화

> [!TIP]
> **Settings** 톱니바퀴 아이콘을 클릭하여 설정을 변경합니다.

#### Shell Scripts 설정
- **Generate shell scripts** 활성화
- **Shell scripts location**: `/usr/local/bin`

이 설정을 활성화하면 터미널에서 `idea`, `pycharm` 등의 명령어로 IDE를 실행할 수 있습니다.

#### 업데이트 설정
- **Update Toolbox App automatically** 활성화
- **Keep only the latest version** 활성화 (디스크 공간 절약)

## IntelliJ IDEA Ultimate 설치

### 1. 설치
Toolbox에서 **IntelliJ IDEA Ultimate** 찾아서 Install 클릭

### 2. 라이선스 활성화

> [!NOTE]
> **학생 라이선스**  
> 학생은 Ultimate 버전을 무료로 사용할 수 있습니다.
> [JetBrains 학생 라이선스 신청](https://www.jetbrains.com/student/)

### 3. 필수 플러그인 설치
IntelliJ 실행 후 추천 플러그인:
- **GitToolBox** - Git 통합 기능 강화
- **Rainbow Brackets** - 괄호 색상 구분
- **Key Promoter X** - 단축키 학습 도우미
- **.env files support** - 환경 변수 파일 지원

## 유용한 단축키 설정

### macOS 시스템 단축키와 충돌 해결
System Preferences → Keyboard → Shortcuts에서 비활성화:
- **Mission Control** 관련 단축키들 (Ctrl + 방향키)
- **Input Sources** 관련 단축키들

### IntelliJ 핵심 단축키
- `Cmd + Shift + A` - 모든 액션 검색
- `Cmd + E` - 최근 파일
- `Cmd + Shift + F` - 전체 검색
- `Double Shift` - 모든 것 검색

## D2Coding Nerd Font 설정

> [!IMPORTANT]
> D2Coding Nerd Font는 한글 지원과 개발자 아이콘을 모두 지원하는 폰트입니다.
> step-01.md에서 이미 설치했으므로 설정만 진행하면 됩니다.

### 에디터 폰트 설정
1. IntelliJ IDEA → Settings (Cmd+,)
2. Editor → Font
   - Font: **D2CodingLigature Nerd Font**
   - Size: **14** (권장)
   - Line height: **1.2**
   - Enable ligatures: ON (코드 가독성 향상)

### 터미널 폰트 설정
1. Editor → Color Scheme → Console Font
   - "Use console font instead of the default" 체크
   - Font: **D2CodingLigature Nerd Font**
   - Size: **14**
   - Line height: **1.2**

### 터미널 추가 설정
1. Tools → Terminal
   - Shell path: `/bin/zsh` (Oh My Zsh 사용 시)
   - "Override IDE encoding" 체크 → **UTF-8** 선택
   - Environment variables: `TERM=xterm-256color` 추가
2. IntelliJ 재시작

> [!TIP]
> 이 설정으로 터미널의 Powerlevel10k 테마 아이콘이 IntelliJ 내장 터미널에서도 완벽하게 표시됩니다.

## 터미널에서 프로젝트 열기

Shell script가 활성화되었다면 터미널에서 IntelliJ를 바로 실행할 수 있습니다.

현재 위치의 프로젝트를 IntelliJ로 열려면 터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
# 현재 디렉토리를 IntelliJ로 열기
idea .
```

특정 경로의 프로젝트를 열려면 터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
# 특정 프로젝트 열기
idea ~/projects/my-project
```

[돌아가기](step-01.md)