# bitcamp-study

## 1일차
- *수업도구 준비
webex - 온라인강의 (집에도 설치) : 주소(https://meet96.webex.com/meet/eomjinyoung-20210621

git 설정 - S/W 버전관리 시스템 (github 계정생성 및 학습용 저장소 생성) - 잔디 주말에라도 꼭 심기

git client 설치(choose a credential helper는 none으로 설정하기)
우선 사용자 폴더 밑에 bitcamp 폴더 생성
git 저장소 가져오기(강사님 git 저장소를 가져오는 과정) - 명령창 띄우고 git 저장소url(https://github.com/eomjinyoung/bitcamp-20210621)
    ->자세한 방법(명령창 mkdir git(git폴더 생성 명령(git폴더 없을시 생성!)) - cd git(명령창에서 git 폴더 진입) - git clone https://github.com/eomjinyoung/bitcamp-20210621 - cd bitcamp-20210621 - git pull)
git 저장소에 파일업로드 하기(나의 git 저장소를 가져오고, 파일업로드를 진행하는 과정) - 위쪽 저장소 가져오기 과정 참고하여 나의 git 클론, 내 이메일 유저네임 지정 및 변경사항 있을때 저장과정 실시
    ->업로드 자세한 방법(cd bitcamp-study(bitcamp-study 폴더 진입) - git add .(현재 및 그 하위 폴더 변경,삭제 파일 명단 작성) - git commit -m "백업설명"(local 저장소에 백업과정) - git push (변경내용 서버에 업로드 과정) - user name과 토큰 암호 기입)
!!내 이메일,유저네임 지정방법(한번만 하면 되고 업로드 하기전 진행!!) : bitcamp-study 파일에서 git config --global user.email "guppy217@naver.com"
                                                                      git config --global user.name "SeongjunP"

!!git clone 먼저 진행!!(위 저장소 가져오기 참고)
!!실수로 강사 파일을 수정했을 경우에는 cd..으로 git 폴더까지 나와서 다시 강사 파일 클론해주면 됨.