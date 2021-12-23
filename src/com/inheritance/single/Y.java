package com.inheritance.single;

public class Y extends X {

	public Y(int a, int b) {
		super(a, b);
		System.out.println("I am parameterized constructor from Y ");
		System.out.println(this.a = a);
		System.out.println(this.b = b);
	}

	private void m3() {
		System.out.println("I am m3 from Y");
	}

	public static void main(String[] args) {
//		X x = new X(10,20); // Using parent object only call the Own & object class method
//		x.m1();
//		x.m2();
		Y y = new Y(30, 40);// Using Child class object we call the Own & method of parent class & object
							// class
		y.m1();
		y.m2();
		y.m3();

	}

}
