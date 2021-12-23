package com.inheritance.multilevel;

public class D extends C {
	public void m20() {
		System.out.println("I'm m20 from D");
	}

	void m21() {
		System.out.println("I'm m21 from D");
	}

	private void m22() {
		System.out.println("I'm m22 from D");
	}

	protected void m23() {
		System.out.println("I'm m23 from D");
	}

	public static void main(String[] args) {
		D d = new D();
		d.m11();
		d.m12();
		d.m14();
		d.m15();
		d.m17();
		d.m18();
		d.m20();
		d.m21();
		d.m22();
		d.m23();
//		A a = new D();
//		a.m11();
//		a.m12();
//		C c = new D();
//		c.m11();
//		c.m12();
//		c.m14();
//		c.m15();
//		c.m17();
//		c.m18();
		
	}

}
