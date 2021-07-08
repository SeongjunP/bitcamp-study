package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

//1) 배열 사용 전
//2) 배열 사용 후
//3) 반복문 적용 : while문
//4) 반복문 적용 : for 문
//5) 여러 문장에서 반복해서 사용하는 값은 변수에 담아서 사용한다.
//6) 조회용으로만 사용할 변수라면 상수로 선언한다.
//7) 특정 조건에 따라 반복을 멈춘다.
//8) 날짜의 출력형식을 "yyyy-MM-dd"로 변경한다.
public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");
    Scanner keyboardScan = new Scanner(System.in);

    final int maxlength = 3;
    int z = 0;

    int[] no = new int[maxlength];
    String[] name = new String[maxlength];
    String[] email = new String[maxlength];
    String[] password = new String[maxlength];
    String[] photo = new String[maxlength];
    String[] tel = new String[maxlength];
    Date[] today =  new Date[maxlength]; 

    for (int i = 0; i < maxlength; i = i + 1) {
      z = z + 1;
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();
      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();
      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();
      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();
      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();
      today[i] = new Date();
      System.out.println();

      System.out.println("계속 입력하시겠습니까? (y/N) ");
      String input = keyboardScan.nextLine();
      if (input.equalsIgnoreCase("N") || input.equals("")) {
        break;
      }
    }

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    System.out.println("--------------------------------");

    for (int i = 0; i < z; i = i + 1){
      System.out.println("번호: " + no[i]);
      System.out.println("이름: " + name[i]);
      System.out.println("이메일: " + email[i]);
      System.out.printf("암호: %s\n", password[i]);
      System.out.printf("사진: %s\n", photo[i]);
      System.out.printf("전화: %s\n", tel[i]);
      System.out.printf("가입일: %s\n", today[i]);
      System.out.println();
    }
  }
}

