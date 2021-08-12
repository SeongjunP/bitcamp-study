package com.eomcs.oop;

class O {
	String s;
	int n;
	static int l = 1;
	static int t = 100;
}
	class Test {

	public static void main(String[] args) {
		O c1 = new O();
		c1.s = "ddd";
		c1.n = 2;
		O.l = 10;
		O.t = 5;
		System.out.println(c1.s);
		System.out.println(c1.n);
		System.out.println(O.l);
		System.out.println(O.t);
	}
}