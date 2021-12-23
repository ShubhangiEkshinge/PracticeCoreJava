package com.inheritance.hierarchical;

public class Test4 extends Test1 {
	public void M9() {
		System.out.println("I'm M9 from Test4");
	}

	void M10() {
		System.out.println("I'm M10 from Test4");
	}

	public static void main(String[] args) {
		Test4 d = new Test4();
		d.M1();
		d.M10();
		d.M2();
		d.M3();
		d.M4();
		d.M9();
	}
}
