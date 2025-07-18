---
author: XIYO
date: 2025-07-17
tags:
  - mac-setup
  - git
  - github
  - version-control
  - ssh
  - github-cli
---

# Git & GitHub 설정

> [!NOTE]
> **사전 요구사항**  
> [개발자 필수 도구 설치](step-01.md)가 완료되어야 합니다.

## Git 기본 설정

### 사용자 정보 설정

Git 커밋에 사용될 이름과 이메일을 설정합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```

> [!TIP]
> GitHub 계정과 동일한 이메일을 사용하는 것을 권장합니다.
> 달라도 되지만 누가 커밋했는지 빠르게 알기 어렵습니다.

### 기본 브랜치 이름 설정

GitHub의 기본 브랜치 이름과 일치시킵니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
git config --global init.defaultBranch main
```

### 줄바꿈 처리 설정 (macOS)

운영체제 간 협업 시 줄바꿈 문자 차이로 인한 문제를 방지합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
git config --global core.autocrlf input
```

## GitHub CLI 인증

### GitHub 로그인

웹 브라우저를 통해 GitHub 계정으로 인증합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
gh auth login
```

인증 과정에서 선택할 옵션:
1. **What account do you want to log into?** → GitHub.com
2. **What is your preferred protocol for Git operations?** → HTTPS
3. **Authenticate Git with your GitHub credentials?** → Y
4. **How would you like to authenticate GitHub CLI?** → Login with a web browser

### 인증 확인

GitHub 인증이 성공적으로 완료되었는지 확인합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
gh auth status
```

## SSH 키 설정 (선택사항)

> [!NOTE]
> HTTPS를 사용하는 경우 이 단계는 건너뛰어도 됩니다.

### SSH 키 생성

새로운 SSH 키를 생성합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
ssh-keygen -t ed25519 -C "your.email@example.com"
```

Enter를 3번 눌러 기본값으로 진행합니다.

### SSH 키를 GitHub에 추가

생성된 SSH 공개키를 GitHub 계정에 추가합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
gh ssh-key add ~/.ssh/id_ed25519.pub --title "My Mac"
```

## 설정 확인

모든 Git 설정이 올바르게 되었는지 확인합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
git config --list
```

## 첫 번째 저장소 만들기

### 로컬에서 시작하기

새 프로젝트 디렉토리를 만들고 Git 저장소로 초기화합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
mkdir my-first-project
cd my-first-project
git init
echo "# My First Project" > README.md
git add README.md
git commit -m "Initial commit"
```

### GitHub에 저장소 만들고 연결하기

GitHub CLI를 사용하여 원격 저장소를 생성하고 연결합니다.

터미널을 열고 아래 명령어를 복사해서 붙여넣으세요:
```bash
gh repo create my-first-project --public --source=. --remote=origin --push
```

> [!SUCCESS]
> 축하합니다! 첫 번째 GitHub 저장소가 생성되었습니다.

## 다음 단계

Git과 GitHub 설정이 완료되었습니다. 이제 개발 환경 설정을 계속 진행하세요.

[돌아가기](step-02.md)