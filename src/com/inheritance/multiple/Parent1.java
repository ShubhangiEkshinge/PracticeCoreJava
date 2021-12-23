package com.inheritance.multiple;

public final class Parent1 { // when we create class is final after that we can not create inheritance of
								// that class
	private Parent1() {
		super();
		System.out.println("constructor of Parent1");
	}

	void f1() {
		System.out.println("I am f1 from parent1");
	}

	

	public void f2() {
		System.out.println("I am f2 from parent1");
	}

}
