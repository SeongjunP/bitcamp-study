package com.eomcs.pms.handler;

public class Testsss {

	public static void main(String[] args) {
		int num = 22;
		switch(num / 10) { 
		case 0: 
		System.out.println(num + "은(는) 0보다 크거나 같고 10보다 작다.");
		break;
		case 1:
		System.out.println(num + "은(는) 10보다 크거나 같고 20보다 작다.");
		break;
		default: 
		System.out.println(num + "은(는) 20이상의 수 또는 음수이다.");
		break;
		} 
	}
}
