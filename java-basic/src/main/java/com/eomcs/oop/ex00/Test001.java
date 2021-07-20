package com.eomcs.oop.ex00;

public class Test001 {
	  static int countEvenNumber(int value) {
          int result = 0;
          int n = value;
            while(n != 0) {
              if ((n % 2) == 0) {
                result+= 1;
             }
             n /= 10;
          }
         return result;
  }
  public static void main(String[] args) {
    System.out.println(countEvenNumber(1238694636));
}
}