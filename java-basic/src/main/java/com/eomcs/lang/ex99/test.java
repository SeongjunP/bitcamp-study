package com.eomcs.lang.ex99;

public class test {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    System.out.print("나이, 이름, 취업여부? ");
    int age = keyboard.nextInt();


    String name = keyboard.next();

    boolean working = keyboard.nextBoolean();

    keyboard.close();

    System.out.printf("%d, %s, %b\n", age, name, working);
  }
}
