package com.inheritance.hierarchical;

public class Test2 extends Test {
	public void M5() {
		System.out.println("I'm M5 from Test2");
	}

	void M6() {
		System.out.println("I'm M6 from Test2");
	}

	public static void main(String[] args) {
		Test2 b = new Test2();
		b.M1();
		b.M2();
		b.M5();
		b.M6();
	}

}

