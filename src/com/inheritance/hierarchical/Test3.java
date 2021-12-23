package com.inheritance.hierarchical;

public class Test3 extends Test1 {
	public void M7() {
		System.out.println("I'm M7 from Test3");
	}

	void M8() {
		System.out.println("I'm M8 from Test3");
	}

	public static void main(String[] args) {
		Test3 c = new Test3();
		c.M1();
		c.M2();
		c.M3();
		c.M4();
		c.M7();
		c.M8();
	}

}
