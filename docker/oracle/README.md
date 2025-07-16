# Oracle Linux Docker 실행 가이드

## 1. Docker 이미지 정보
- **이미지**: oraclelinux:8.10
- **버전**: Oracle Linux 8.10
- **공식 저장소**: https://hub.docker.com/_/oraclelinux (Oracle 공식 이미지)

## 2. Docker 이미지 다운로드

### 이미지 다운로드 (Pull)
```bash
# 특정 버전 다운로드
docker pull oraclelinux:8.10

# 최신 버전 다운로드
docker pull oraclelinux:latest

# 다른 버전들 (예시)
docker pull oraclelinux:9
docker pull oraclelinux:8-slim
docker pull oraclelinux:7-slim
```

### 다운로드된 이미지 확인
```bash
# 로컬에 있는 모든 이미지 목록
docker images

# Oracle Linux 이미지만 필터링
docker images | grep oraclelinux
```

### 이미지 상세 정보 확인
```bash
docker inspect oraclelinux:8.10
```

### 이미지 삭제
```bash
docker rmi oraclelinux:8.10
```

## 3. 컨테이너 실행 방법

### 기본 실행 (일회성)
```bash
docker run -it --name oracle-linux oraclelinux:8.10 /bin/bash
```

### 백그라운드 실행 (지속적)
```bash
docker run -d --name oracle-linux-bg oraclelinux:8.10 tail -f /dev/null
```

### 실행 중인 컨테이너 접속
```bash
docker exec -it oracle-linux-bg /bin/bash
```

## 4. 접속 정보

### 기본 사용자
- **사용자**: root (기본)
- **패스워드**: 없음 (Docker 컨테이너는 기본적으로 root로 접속)

### 새 사용자 생성 (옵션)
```bash
# 컨테이너 내부에서 실행
useradd -m -s /bin/bash oracle
passwd oracle  # 패스워드 설정
```

## 5. 유용한 Docker 명령어

### 컨테이너 목록 확인
```bash
docker ps        # 실행 중인 컨테이너
docker ps -a     # 모든 컨테이너
```

### 컨테이너 시작/중지
```bash
docker start oracle-linux-bg
docker stop oracle-linux-bg
```

### 컨테이너 삭제
```bash
docker rm oracle-linux-bg
```

### 로그 확인
```bash
docker logs oracle-linux-bg
```

## 6. 볼륨 마운트 (데이터 공유)

로컬 디렉토리와 컨테이너 간 파일 공유:
```bash
docker run -d --name oracle-linux-volume \
  -v $(pwd)/shared:/mnt/shared \
  oraclelinux:8.10 tail -f /dev/null
```

## 7. 네트워크 포트 설정

특정 포트를 열어야 하는 경우:
```bash
docker run -d --name oracle-linux-net \
  -p 8080:80 \
  -p 2222:22 \
  oraclelinux:8.10 tail -f /dev/null
```

## 8. SSH 설정 (선택사항)

컨테이너에 SSH로 접속하려면:
```bash
# 컨테이너 내부에서
yum install -y openssh-server
ssh-keygen -A
echo 'PermitRootLogin yes' >> /etc/ssh/sshd_config
/usr/sbin/sshd
```

## 9. 주의사항

- Oracle Linux 컨테이너는 최소 설치 버전으로 많은 패키지가 포함되어 있지 않습니다
- 필요한 패키지는 `yum install` 명령으로 설치해야 합니다
- 컨테이너를 중지하면 설치한 내용이 사라집니다 (영구 저장을 위해서는 Docker 이미지 커밋 필요)

## 10. 이미지 커밋 (변경사항 저장)

```bash
docker commit oracle-linux-bg my-oracle-linux:custom
```