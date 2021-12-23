package inheritancedemo1;

public class Mainclass {

	public static void main(String[] args) {

		B b = new B();// creating object of class B ,B is child of parent A
		b.m1();// Here we can see total 14 methods(object class=9,A class=3 & B class=2)
		b.m2();
		b.m3();
		b.m4();
		b.m5();

	}

}
