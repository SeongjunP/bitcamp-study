# bitcamp-study

## 1일차
- 수업도구 준비
webex - 온라인강의 (집에도 설치) : 주소(https://meet96.webex.com/meet/eomjinyoung-20210621

-git 설정 - S/W 버전관리 시스템 (github 계정생성 및 학습용 저장소 생성) - 잔디 주말에라도 꼭 심기

-git client 설치(choose a credential helper는 none으로 설정하기)
우선 사용자 폴더 밑에 bitcamp 폴더 생성
git 저장소 가져오기(강사님 git 저장소를 가져오는 과정) - 명령창 띄우고 git 저장소url(https://github.com/eomjinyoung/bitcamp-20210621)
    ->자세한 방법(명령창 mkdir git(git폴더 생성 명령(git폴더 없을시 생성!)) - cd git(명령창에서 git 폴더 진입) - git clone https://github.com/eomjinyoung/bitcamp-20210621 - cd bitcamp-20210621 - git pull)
git 저장소에 파일업로드 하기(나의 git 저장소를 가져오고, 파일업로드를 진행하는 과정) - 위쪽 저장소 가져오기 과정 참고하여 나의 git 클론, 내 이메일 유저네임 지정 및 변경사항 있을때 저장과정 실시
    ->업로드 자세한 방법(cd bitcamp-study(bitcamp-study 폴더 진입) - git add .(현재 및 그 하위 폴더 변경,삭제 파일 명단 작성) - git commit -m "백업설명"(local 저장소에 백업과정) - git push (변경내용 서버에 업로드 과정) - user name과 토큰 암호 기입)
!!내 이메일,유저네임 지정방법(한번만 하면 되고 업로드 하기전 진행!!) : bitcamp-study 파일에서 git config --global user.email "guppy217@naver.com"
                                                                      git config --global user.name "SeongjunP"

!!git clone 먼저 진행!!(위 저장소 가져오기 참고)
!!실수로 강사 파일을 수정했을 경우에는 cd..으로 git 폴더까지 나와서 다시 강사 파일 클론해주면 됨.

## 2일차
-어제 다뤘던 git client 복습
	-git pull(저장 폴더 가져오기)	
	-git add .(백업명단작성: 추가,삭제, 수정)
	-git commit -m "백업설명"(local 저장소에 백업과정) - 추가내용(커밋메시지 작성요령은 회사마다 다름)
	위 과정까지 실시하면 백업완료	
	-git push(변경내용 서버 업로드) -> username입력 및 토큰암호 기입
공유폴더를 repository(줄여서 repo)라고 부름.
마우스 오른쪽버튼을 컨텍스트 메뉴라고 부름.

-프로그램 만들고 실행
vscode(편집기) 설치
mingw 설치(https://sourceforge.net/projects/mingw-w64/files/mingw-w64/) <-압축수동설치 방법
x86_64-posix-seh 파일 다운 - c드라이브 밑 tools 파일생성 - 그 밑에 압축파일 풀기 - 환경변수 설정(시스템 환경변수 편집 - c:\tools\mingw64\bin) 

컴파일이란: 소스를 기계어로 번역하는 행동	컴파일러란: 소스를 기계어로 번역하는 소프트웨어

-컴파일 방식
컴파일된 소스는 똑같은 cpu라도 운영체제(os)가 다르면 실행x(운영체제마다 배치하는 방법(읽을 수 있는 양식)이 다르기 때문)
	->즉 같은 소스파일(프로그래밍 파일)이라도 각각의 운영체제에서 컴파일해야 된다
<->반대로 cpu는 다른데 os가 같은경우 : cpu가 다르니 당연히 같은 실행파일이라도 실행x

-인터프리터 방식: 소스파일의 명령을 도우미 프로그램(통역기=interpreter)을 통해 바로 실행(기계어로 바꾸는 방식x)

##3일차
-프로그래밍 언어, 인터프리터 차이점
인터프리터 방식은 속도가 느림, 하지만 os용 인터프리터만 있다면 운영체제와 상관없이 실행가능.(쉽게 멀티os를 지원)
<->컴파일 방식은 위와 반대로 생각하면 됨

-java 프로그래밍
자바 파일은 파일 첫 글자를 대문자로.
자바로 컴파일한 class 파일은 bytecode(기계어에 흡사한 가상 기계어)로 작성됨(즉, class는 컴퓨터가 바로 읽을 수 있는 기계어가 아님)
그래서 jvm만 있으면 os를 가리지 않고 실행가능.
class파일생성까지는 컴파일 방식, class파일을 jvm으로 실행시키는 것은 인터프리터 방식.
위 컴파일 방식과 인터프리터 방식이 공존하는 것을 hybrid 방식이라고 함.

-jdk설치
-버전은 11버전으로 설치권장(lts버전이기 때문(lts는 장기지원버전))
'JAVA_HOME' os환경변수에 등록하는 이유 
->환경변수 설정방법(win10) - 환경변수 검색, 고급-환경변수 , 시스템변수-새로만들기, 이름JAVA_HOME으로 추가

-vscode 폰트 바꾸기 
D2coding 폰트(https://github.com/naver/d2codingfont/releases/tag/VER1.3.2)
->네이버에서 배포한 폰트, l, |, ㅣ와 같이 비슷한 문자 가독성 좋음.

-compile 방식 vs interpreter 방식 vs Hybrid(cmd실행)
강사노트 그림 참고!

-utf-8
윈도우는 기본적으로 ms949라는 코드규칙으로 컴파일을 다룸(mac은 utf8)
따라서 윈도우에 설치된 vscode는 기본적으로 ms949라는 코드규칙으로 컴파일을 다룸
->(따라서 한글이 포함된 소스는 utf명령어로 실행시켜야함)

-자바 프로젝트 관리
최종목표가 웹 어플리케이션을 개발하는 것이라면 한개 이상의 프로젝트들로 관리, 이루어진다.
(강사노트 필기 참고)
총 4단계의 저장방식으로 나눌 수 있다.(자세한 예시는 강사 파일 참고)
	1단계 - 프로젝트 폴더 안에 클래스와 자바파일이 전부 들어있는 방식
	2단계 - 프로젝트 폴더 안에 소스파일과 class파일이 각 폴더(src, bin)에 분리
	3단계 - 기본 2단계 방식으로 되어있고 그 폴더 밑으로 애플리케이션, 자바소스, 일반 파일, 테스트 관련 파일, class 폴더로 분리
	4단계 - 대규모 프로젝트에 사용, 3단계보다 조금 더 세분화

!프로젝트를 github에 백업할 시 폴더 안쪽이 비어있는 폴더는 백업이 안됨
	->그래서 빈 폴더 밑으로 readme파일을 생성한다.
!  .gitignore 파일은 github 백업이 안되는 파일
