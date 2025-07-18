---
author: XIYO
date: 2025-07-17
tags:
  - mac-setup
  - developer-tools
  - git
  - docker
  - vscode
  - iterm2
  - jetbrains
---

# 개발자 필수 도구 설치

> [!NOTE]
> **사전 요구사항**  
> 이 가이드를 진행하기 전에 [Homebrew 설치](step-00.md)가 완료되어야 합니다.

## 필수 도구 한 번에 설치

이 명령어는 개발에 필수적인 도구들을 Homebrew를 통해 한 번에 설치합니다. Git, GitHub CLI, 터미널, 코드 에디터, Docker, JetBrains 도구, 폰트가 포함됩니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
brew install git gh && \
brew install --cask iterm2 visual-studio-code docker jetbrains-toolbox font-d2coding-nerd-font font-pretendard && \
echo "모든 필수 도구 설치 완료!"
```

## 설치된 도구 설명

### 개발 도구
- **Git** - 분산 버전 관리 시스템. 코드의 변경 이력을 관리하고 협업할 때 필수
- **GitHub CLI (gh)** - GitHub를 터미널에서 사용할 수 있게 해주는 공식 도구. PR, 이슈 관리가 편리해짐

### 터미널 & 에디터
- **iTerm2** - macOS 기본 터미널보다 강력한 기능을 제공하는 터미널 에뮬레이터
- **Visual Studio Code** - 마이크로소프트의 무료 코드 에디터. 가볍고 확장성이 뛰어남

### 개발 환경
- **Docker** - 컨테이너 기반 가상화 플랫폼. 개발 환경을 표준화하고 배포를 간소화
- **JetBrains Toolbox** - IntelliJ, PyCharm 등 JetBrains IDE를 관리하는 도구

### 폰트
- **D2Coding Nerd Font** - 한글 지원과 개발자용 아이콘이 포함된 코딩 전용 폰트
- **Pretendard** - 가독성이 뛰어난 한글 폰트. 문서 작성과 UI에 최적화

## 추가 설정이 필요한 도구

> [!WARNING]
> 아래 도구들은 설치 후 추가 설정이 필요합니다.

- **Git & GitHub CLI** → [Git & GitHub 설정 가이드](git-github-setup.md)
- **JetBrains Toolbox** → [JetBrains 설정 가이드](jetbrains-setup.md)
- **iTerm2 + Oh My Zsh** → [터미널 꾸미기 가이드](terminal-customization.md)

## 다음 단계

필수 도구 설치가 완료되었다면, 시스템 유틸리티를 설치하세요.

[다음 단계: 시스템 유틸리티 설치](step-02.md)