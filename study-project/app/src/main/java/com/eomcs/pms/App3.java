package com.eomcs.pms;

public class App3 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);



    System.out.println("[작업]");
    System.out.print("프로젝트: ");
    String s1= keyboard.nextLine();
    System.out.print("번호: ");
    String s2= keyboard.nextLine();
    System.out.print("내용: ");
    String s3= keyboard.nextLine();
    System.out.print("완료일: ");
    String s4= keyboard.nextLine();
    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    keyboard.nextLine();
    System.out.print("담당자: ");
    String s5= keyboard.nextLine();
    keyboard.close();
    System.out.println("------------------------------------------");
    System.out.println("프로젝트: " + s1);
    System.out.println("번호: " + s2);
    System.out.println("내용: " + s3);
    System.out.println("완료일: " + s4);
    System.out.println("상태: ");
    System.out.println("담당자: " + s5);
  }
}
