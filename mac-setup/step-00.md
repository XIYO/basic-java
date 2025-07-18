---
author: XIYO
date: 2025-07-17
tags:
  - mac-setup
  - homebrew
  - apple-silicon
  - getting-started
---

# Mac 초기 설정 가이드 (Apple Silicon)

## Homebrew 설치

이 명령어는 Homebrew를 설치하고 환경 설정을 자동으로 구성합니다. 설치 후 버전을 확인하여 설치가 성공했는지 검증합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" && \
echo 'eval "$(/opt/homebrew/bin/brew shellenv)"' >> ~/.zprofile && \
eval "$(/opt/homebrew/bin/brew shellenv)" && \
brew --version && \
echo "Homebrew 설치 완료! 다음 단계로 진행하세요."
```

> [!NOTE]
> **Homebrew란?**  
> macOS용 패키지 관리자(터미널용 앱스토어 느낌)입니다. 터미널에서 명령어 하나로 프로그램을 설치, 업데이트, 삭제할 수 있습니다.

## 다음 단계

Homebrew 설치가 완료되었다면, 개발 도구를 설치할 준비가 되었습니다.

[다음 단계: 개발 도구 설치](step-01.md)