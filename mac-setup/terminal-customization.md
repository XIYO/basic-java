---
author: XIYO
date: 2025-07-17
tags:
  - mac-setup
  - terminal
  - oh-my-zsh
  - powerlevel10k
  - iterm2
  - zsh
---

# 터미널 꾸미기 가이드

## STEP 1: Oh My Zsh 설치

> [!IMPORTANT]
> **사전 요구사항**
> - iTerm2가 설치되어 있어야 합니다
> - 기존 `.zshrc` 파일이 백업됩니다

Oh My Zsh는 Zsh 셰을 더 강력하고 사용하기 편리하게 만들어주는 프레임워크입니다. 테마, 플러그인, 별칭 등을 쉽게 관리할 수 있습니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
sh -c "$(curl -fsSL https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"
```

설치 중 나타나는 질문:
- "Do you want to change your default shell to zsh?" → **Y** 입력

## STEP 2: 테마와 플러그인 설정

> [!TIP]
> Oh My Zsh 설치가 완료된 후 실행하세요

이 명령어는 다음 작업을 수행합니다:
1. Powerlevel10k 테마 설치 (가장 인기 있는 Zsh 테마)
2. zsh-autosuggestions 플러그인 설치 (명령어 자동완성 기능)
3. zsh-syntax-highlighting 플러그인 설치 (명령어 구문 강조 기능)
4. .zshrc 파일을 자동으로 업데이트하여 테마와 플러그인 활성화

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
# Powerlevel10k 테마 + 자동완성 + 하이라이팅 설치
git clone --depth=1 https://github.com/romkatv/powerlevel10k.git ${ZSH_CUSTOM:-$HOME/.oh-my-zsh/custom}/themes/powerlevel10k && \
git clone https://github.com/zsh-users/zsh-autosuggestions ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-autosuggestions && \
git clone https://github.com/zsh-users/zsh-syntax-highlighting.git ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-syntax-highlighting && \
sed -i '' 's/ZSH_THEME=".*"/ZSH_THEME="powerlevel10k\/powerlevel10k"/' ~/.zshrc && \
sed -i '' 's/plugins=(.*)/plugins=(git docker docker-compose zsh-autosuggestions zsh-syntax-highlighting)/' ~/.zshrc && \
source ~/.zshrc
```

## iTerm2 폰트 설정 (필수)

> [!CAUTION]
> 폰트를 설정하지 않으면 아이콘이 깨져서 보입니다!

1. iTerm2 → Settings → Profiles → Text
2. Font에서 "D2CodingLigature Nerd Font" 선택
3. 터미널 재시작


## Powerlevel10k 초기 설정

터미널을 재시작하면 자동으로 설정 마법사가 시작됩니다.

> [!NOTE]
> **추천 선택 사항** (초보자용)
> - Diamond: **y** (다이아몬드 아이콘 보임)
> - Lock: **y** (자물쇠 아이콘 보임)
> - Style: **3 (Rainbow)** - 가장 인기 있는 컬러풀한 스타일
> - Character Set: **1 (Unicode)** 
> - Prompt Style: **3 (Pure)** - 깔끔한 스타일
> - Transient Prompt: **n** (기본값)
> - Instant Prompt: **1 (Verbose)** - 빠른 시작

Powerlevel10k 테마 설정을 다시 하고 싶다면 터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
p10k configure
```

## 설치 확인

설치가 올바르게 되었는지 확인하려면 터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
echo $ZSH_THEME  # powerlevel10k/powerlevel10k 출력
echo $SHELL      # /bin/zsh 출력
```

[돌아가기](step-01.md)