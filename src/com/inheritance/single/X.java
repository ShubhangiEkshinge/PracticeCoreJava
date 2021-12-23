package com.inheritance.single;

public class X {
	int a;
	int b;

//	public X() {// No argument constructor
//		super();
//		System.out.println("I am no argument constructor from X");
//	}

	public X(int a, int b) { // Parameterized constructor
		super();
		System.out.println("I am Parameterized constructor from X");
		this.a = a;
		this.b = b;
	}

	void m1() {
		System.out.println("I am m1 from class X");
	}

	public void m2() {
		System.out.println("I am m2 from class X");
	}

}
