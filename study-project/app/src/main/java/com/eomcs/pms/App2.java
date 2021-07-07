package com.eomcs.pms;

public class App2 {

  public static void main(String[] args) {
    java.io.InputStream keyboard = System.in;
    java.util.Scanner keyScan = new java.util.Scanner(keyboard);
    System.out.print("[프로젝트]");
    System.out.println(keyScan.nextLine());
    System.out.print("번호: 1201");
    System.out.println(keyScan.nextLine());
    System.out.print("프로젝트명: 미니 프로젝트 관리 시스템 개발");
    System.out.println(keyScan.nextLine());
    System.out.print("내용: 소규모 팀을 위한 프로젝트 관리 시스템을 개발한다.");
    System.out.println(keyScan.nextLine());
    System.out.print("시작일: 2020-01-01");
    System.out.println(keyScan.nextLine());
    System.out.print("종료일: 2020-12-31");
    System.out.println(keyScan.nextLine());
    System.out.print("만든이: 홍길동");
    System.out.println(keyScan.nextLine());
    System.out.print("팀원: 홍길동,김구,유관순,안중근,윤봉길");

    keyScan.close();
  }

}
