package com.inheritance.hierarchical;

import inheritancedemo1.Mainclass;

public class Test1 extends Test {
	void M3() {
		System.out.println("I'm M3 from Test1");
	}

	public void M4() {
		System.out.println("I'm M4 from Test1");
	}
	public static void main(String[] args) {
		Test1 a = new Test1();
		a.M1();
		a.M2();
		a.M3();
		a.M4();
	}

}
