package com.eomcs.pms;

public class App {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    System.out.println("[회원]");
    System.out.print("번호? ");
    String s1= keyboard.nextLine();
    System.out.print("이름? ");
    String s2= keyboard.nextLine();
    System.out.print("이메일? ");
    String s3= keyboard.nextLine();
    System.out.print("암호? ");
    String s4= keyboard.nextLine();
    System.out.print("사진? ");
    String s5= keyboard.nextLine();
    System.out.print("전화? ");
    String s6= keyboard.nextLine();
    java.sql.Date now = new java.sql.Date(System.currentTimeMillis());
    keyboard.close();
    System.out.println("-----------------------------");
    System.out.println("번호? " + s1);
    System.out.println("이름? " + s2);
    System.out.println("이메일? " + s3);
    System.out.println("암호? " + s4);
    System.out.println("사진? " + s5);
    System.out.println("전화? " + s6);
    System.out.println("가입일?" + now);
  }
}
