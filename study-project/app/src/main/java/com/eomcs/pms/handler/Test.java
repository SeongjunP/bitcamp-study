package com.eomcs.pms.handler;

public class Test {
  public static void main(String[] args) {
    int score = 101;
    char grade;
    if (score > 100 || score < 0) {
      grade = 'p';
    }
    else if (score >= 90) {
      grade = 'A';
    }
    else if (score >= 80) {
      grade = 'B';
    }
    else if (score >= 70) {
      grade = 'C';
    }
    else if (score >= 60) {
      grade = 'D';
    }
    else {
      grade = 'E';
    }
    if (grade <= 'E' && grade >= 'A') {
      System.out.println("점수: " + score);
      System.out.println("당신의 학점은" + grade + "입니다");
    }
    else 
      System.out.println("점수잘못");
  }



}
