package com.inheritance.multilevel;

public class B extends A {
	public void m14() {
		System.out.println("I'm m14 from B");
	}

	void m15() {
		System.out.println("I'm m15 from B");
	}

	private void m16() {
		System.out.println("I'm m16 from B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m11();
		b.m12();
		b.m14();
		b.m15();
		b.m16();
	}

}
