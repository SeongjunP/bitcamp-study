﻿# bitcamp-study

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

## 3일차
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

## 4일차
-application 개발하기위해
코드작성(JAVA, HTML,CSS,JavaScript), 기타파일(이미지,동영상 등), 다국어 지원 등 다양한 작업필요
    (체계적으로 관리필요(web, Android, iOS 개발 등 관리단위별로 나눠야함 <- 프로젝트))
!프로젝트를 생성하는 것이란 개발을 통해 나오는 산출물들을 보관할 폴더를 생성하는 것.

-앞으로 배울 study-project(교육용 프로젝트)의 로드맵
강사필기의 로드맵 참고!!

-study-project 생성하기
study-project를 Gradle이라는 빌드 도구를 사용하여 하위 폴더까지 포함하여 간단하게 생성가능
!빌드 도구란 애플리케이션을 만들기 위해 수행하는 작업을 도와준다.(컴파일,테스트,배포파일 생성, 문서생성 등..)
	-애플리케이션 생성과정을 통제하는 프로그램

!Gradle 빌드 도구 설치 후, Gradle 관련 명령어를 사용하여 프로젝트 폴더 생성 등 프로젝트를 통제할 수 있다
	-강사 필기 참고!
+추가: select test framework에서 JUnit 4 선택

## 5일차
-gradle로 프로젝트 폴더 준비하기
프로젝트 폴더 밑에서 gradle init
-> 순서대로 appliecation, Java, only one, Groovy, Junit, study-project, com.eomcs.pms

-자바 기초 문법
src/main/java까지는 프로젝트에서 정한 소스파일 기본위치(그 밑 폴더부터 패키지)
bin/main 까지는 프로젝트에서 정한 클래스파일의 기본 위치
소스파일 첫 번째 문장에 선언하는 패키지명 경로에 소스파일을 저장해야한다.

오늘 배운 기초 문법: 패키지 다루기, 자바 소스파일과 클래스 블록, 소스파일의 인코딩, main() 메서드
여러 줄 주석, 한 줄 주석, javadoc 주석, 애노테이션

-eclipse 설치
eclipse.org 사이트에서 개발 도구 다운로드 및 설치

## 6일차
- 리터럴 개념 및 변수, 배열에 대하여 학습.
	정수 리터럴, 부동소수점 리터럴, 논리 리터럴, 문자 리터럴, 문자열 리터럴

-콘솔 출력
자바 이클립스로 명령문 학습
System.out.print(값이나 식)    <-값 출력
System.out.println( )    <-값 출력 후 줄바꿈
System.out.printf(출력형식)   <-출력형식에 맞춰 값 출력

2진수, 8진수, 16진수 관련 학습
정수를 2진수로 변환 - 값이 1이 될때까지 나누고 값과 나머지를 이어준다
소수부분을 2진수로 변환 - 소수부분을 값이 1이 될때까지 x2를 계속 이어간다
                                  값이 1이 안되면 0, 1이 넘으면 1                                   
                                  최종 1이 나온값과 위에서 나온 값을 이어준다
n진수를 정수로 변환하는 방법 - 오른쪽 숫자부터 0승~왼쪽으로 1승씩 증가, 
			    각 숫자에서 n승과 곱한후 각각 더하기
★(중요) 16진수는 주로 2진수의 간단 표기법으로 사용한다.(2진수로 표현시 너무 길어질 수 있기 때문에)
	- 2진수    0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111
	  16진수로   1      2      3     4     5      6      7     8      9     a      b     c      d     e      f      g
빛, 소리 등 2진수 값으로 표현할 수 있다면 저장장치(하드디스크, 메모리)에 저장하여 활용할 수 있다.

-정수 -> 2진수 규칙
정수를 2진수를 바꾸는 것에는 여러가지 규칙이 존재.
1) Sign-Magnitude(부호 절대값)
2) 1의 보수(음수 값을 표현할 때)	보수란 보충해주는 수(쉽게 나머지라 이해..)
3) 2의 보수 =  1의보수 +1 (음수 값을 표현할 때)
4) Excess-k (지정된 값을 무조건 더한다)
	
TIP) 2의 n승까지 더하기 = 2의 n+1승 값에서 -1

-메모리 크기
1byte(8bit) = 0 ~ 255 = -128~ 127	2byte(16bit) = 0 ~ 65535 = -32768~ 32767
4byte(32bit) = 0 ~ 4,294,967,295 = 약 -21억 ~ 21억	8byte(64bit) = 0 ~ 약 1900경 = 약 -900경 ~ 900경

##7일차
-부동소수점
부동소수점의 부동은 소수점이 떠다니며 움직인다는 의미의 부동
(IEEE 754는 전기 전자 기술자 협회 (IEEE)에서 개발한 표준 부동소수점 방식이며 현재 컴퓨터에서 가장 널리 쓰이는 방식)
-문자집합
자바는 '유니코드(UTF-16BE; UCS2)' 라는 문자집합을 사용
(보통 키보드로 문자를 직접 입력할 수 없을 때 유티코드 값을 직접 적어서 사용(π, Σ, © 등...)
\u 뒤에 문자에 부여된 코드 값을 16진수로 적는다.
문자를 컴퓨터에 저장할 때는 2진수화(인코딩; encoding) 시켜서 저장한다.
아래는 다양한 문자집합
	1) ASCII(아스키코드) : 영어 대소문자, 숫자, 특수문자 등
	2) ISO-8859-1 : ASCII 문자 + 유럽문자
	3) EUC-KR : 한글 2350자에대한 규칙(한글 음절 11172자를 모두 표현할 수는 없음)
	4) Unicode : 일반적으로 통용되는 대부분 국가의 문자 포함
	5) UTF-8 : Unicode에 있는 문자를 규칙에 따라 1 ~ 4바이트로 변환
-폰트
Raster 폰트(bitmap 폰트)
   =폰트를 도트(점) 정보로 저장	
   =출력 속도가 빠르지만, 크기를 늘리면 계단현상 발생
Vector 폰트(truetype 폰트)
   =폰트를 명령어로 저장
   =크기를 늘려도 깔끔하게 출력, 하지만 폰트를 명령어로 저장
-char

##8일차
-변수 
변수는 값을 저장하는 메모리
ex) int age;	int는 값을 저장할 메모리의 종류와 크기(데이터 타입)
		age는 메모리를 가리키는 이름
메모리는 운영체제가 관리하고 통제
(따라서 JVM이 메모리를 사용하기 위해서 os에게 사용할 메모리를 할당받아야 한다)

-데이터 타입
정수: byte(1byte), short(2byte), int(4byte), long(8byte)
부동소수점:float, double
논리: int 타입의 메모리 사용(boolean) - ture, false
문자: 2byte(char)

-l-value 와 r-value
l-value의 l은 left(왼쪽), r-value의 r은 right(오른쪽)
ex) age = 20;	<- age부분을 l-value, 20을 r-value
l-value는 반드시 메모리여야 한다(상수는 올 수 없음)

-scanner
자바의 스캐너 클래스는 java.util 패키지 내에 존재하는 클래스로,
정수(int), 실수(double)등의 기본적인 데이터 타입 입력을 받기위한 클래스
스캐너 기능 삽입 후, 스캐너 이름과 .nextLine();을 엔터키를 누르는 곳 뒤에 배치해야 한다.

##9일차
-날짜 생성 명령어
java.sql.Date d = new java.sql.Date(millis)	<- 날짜정보를 다루는 물건을 생성
System.out.println(d. toString())	<-현재날짜 출력

javs.sql.Date.valueof(날짜문자열)	<- 위와 똑같이 날짜정보를 다루는 물건을 생성
		        l_>yyyy-mm-dd(위쪽 밀리초를 넣는 형식과는 다르다)
-import
자바에게 물건(Date(날짜기능), Scanner(입력기능) 등..)이 있는 위치를 미리 알려주는 명령어(위쪽에서 지정)

-배열
같은 종류와 크기를 가진 메모리를 여러개 선언하는 문법

-int [] 이름 = new int[숫자]		<-int[] 이름(int배열 타입을 가리킨다), 이름부분은 배열의 주소를 저장하는 변수)
				   new (메모리 준비명령),   int[숫자] (int 부분은 data type, 숫자는 개수)
int 값을 지닌 메모리 배열을 좀더 간단히 표기하는 방법
ex) int 이름1, int 이름2, int 이름3, int 이름4..... 처럼 길게 표시하지 않고
    int [] 이름 = new int[4]	<- 이렇게 간단히 표시할 수 있다

-while 조건문
int i = 0;		<-while 문에 사용할 int 생성
while (i < 숫자) {	<-반복할 만큼의 수를 숫자에 넣기
   i = i + 1;	<-i가 숫자에 도달할 때까지 반복
}		
(while조건문 뒤에 다른 출력문을 다시 while조건문을 적용시키고 싶다면
i = 0; 과 같은 명령어로 초기화 시키고 다시 while 조건문을 시작해야 한다)

-for 반복문
for (int i = 0; i < 숫자; i = i + 1){}
	-for 반복문에 사용할 int 생성, 숫자에 반복출력할 수 입력, i + 1은
	 i가 숫자에 도달할 때까지 반복

-int maxLength
여러 문장에서 반복해서 사용하는 값을 변수에 담아서 사용할 수 있다
ex) int maxLength = 5; 로 지정할 경우,
5라는 값을 사용한 곳에 maxLength라는 것을 대신 사용할 수 있다

-final
int 앞 final을 붙이면 최종적으로 출력해야할 숫자만큼으로 인식.
문자열을 다른 문자열과 비교할때는 .equals("")

##10일차
인스턴스 변수 : new 명령을 실행할 때 생성된다
클래스 변수 : 클래스를 로딩할 때 생성된다
로컬 변수 : 메서드를 실행할 때 생성된다

-레퍼런스(reference)란?
값이 아닌 메모리의 주소를 담는 변수.
-인스턴스(instance)란?
값을 저장하는 메모리

-static type binding vs dynamic type binding
자바의 경우 변수의 타입이 한번 정해지면 변경되지 않는다
예) float f = 3.14f;
     int i = (int)f;  // 소수점 이하가 제거된다.	<-float f의 값을 받아 int i에 3을 받는다
(주의: 즉 float f의 값이 3으로 변하는 것이 아니다..!)

자바와 반대로 자바스크립트의 경우에는 변수에 값을 저장하는 순간 데이터타입이 결정된다

-연산자
+, -, *, /, %	<-자바에서 사용하는 산술 연산자
연산자 우선수위: 1) ++, --	2) *, /, %     3) +, -    4) =

-전위연산자
-후위 증가 연산자
i++;	<- i = i + 1;을 간략하게 작성한 것이라고 생각하면 됨
System.out.println(i++);	<- 이러한 형식이 올경우 후위 증가 연사자의 경우
			    밑과 같은 형식이라 생각하면 된다
예) int i = 2;
     int temp = i; <-- 임시 변수를 만들어 현재 i 값을 저장한다.
     i = i + 1;
     System.out.println(temp);	<- 결과는 4가 나옴

##11일차
-if else

-debug 모드

-switch문

-반복문

-배열

##12일차
-메서드 사용법
메서드를 이용해 기존 코드를 유지보수해서 쉬운구조로 재작성하는 것을
"리팩토링(refactoring)"이라고 한다(관리하기 쉽게 코드를 분리)
변수 설정한 값을 main 메서드 위, 바깥쪽으로 빼고
add이름 ()을 이용하여 관련 실행문을 main 메서드 밑, 바깥으로 빼서 정리할 수 있다
static void

##13일차
-나중에 수정예정(임시 저장)
메서드는 소스코드를 관리하기 쉽게 기능단위로 묶어놓은 것이다

별은 공백출력을 이용

ed07 복습

-메서드 호출과 메모리
Method Area ,JVM Stack,Heap이라는 메모리 영역이 있다

로컬변수란 메서드가 호출될때 생성되는 변수(JVM Stack)

Method Area에 모든 코드가 있다(메서드는 Method Area에 있다)

new명령어는 heap에 위치

byte a, int b, double c... 등등 값을 저장하는 변수를 제외하고는
전부 주소를 저장하는 변수이다.(int[]	<-이런 경우도 주소를 저장)