package com.inheritance.multilevel;

public class C extends B {
	public void m17() {
		System.out.println("I'm m19 from C");
	}

	void m18() {
		System.out.println("I'm m19 from C");
	}

	private void m19() {
		System.out.println("I'm m19 from C");
	}

	public static void main(String[] args) {
		C c = new C();
		c.m11();
		c.m12();
		c.m14();
		c.m15();
		c.m17();
		c.m18();
		c.m19();
		
	}

}
