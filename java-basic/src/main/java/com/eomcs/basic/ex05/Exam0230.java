package com.eomcs.basic.ex05;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;

public class Exam0230 {

  public static void main(String[] args) {
	
	ArrayDeque<String> stack = new ArrayDeque<>();
    
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    // 
    for (String s : stack) {
    	System.out.println(s);
    }
  }

}

