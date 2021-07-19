package com.eomcs.pms;

public class Test {

  public static void main(String[] args) {
    int a = 60;
    System.out.println("점수 : " + a);
    if (a > 100) {
      System.out.println("점수가 잘못되었습니다");
    } else if (a >= 90) {
      System.out.println("A");
    } else if (a >= 80) {
      System.out.println("B");
    } else if (a >= 70) {
      System.out.println("C");
    } else if (a >= 60) {
      System.out.println("D");
    }

  }

}
