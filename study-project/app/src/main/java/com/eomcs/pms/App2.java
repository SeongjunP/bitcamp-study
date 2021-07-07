package com.eomcs.pms;

import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    System.out.println("[프로젝트]");
    int i = 1201;
    System.out.println("번호: " + i);

    System.out.print("프로젝트명: ");
    String s1= keyboard.nextLine();

    System.out.print("내용: ");
    String s2= keyboard.nextLine();

    System.out.println("시작일: ");
    Date startDate = Date.valueOf(keyboard.nextLine());

    System.out.println("종료일: ");
    Date endDate = Date.valueOf(keyboard.nextLine());

    System.out.print("만든이: ");
    String s3= keyboard.nextLine();

    System.out.print("팀원: ");
    String s4= keyboard.nextLine();

    keyboard.close();

    System.out.println("-------------------------------------------------------");
    System.out.println("번호: " + i);
    System.out.println("프로젝트명: " + s1);
    System.out.println("내용: " + s2);
    System.out.println("시작일: " + startDate);
    System.out.println("종료일: " + endDate);
    System.out.println("만든이: "+ s3);
    System.out.println("팀원" + s4);
  }

}
