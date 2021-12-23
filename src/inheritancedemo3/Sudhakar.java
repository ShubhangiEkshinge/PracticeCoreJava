package inheritancedemo3;

public class Sudhakar extends Shubhangi {
	public void f4() { // public method
		System.out.println("I am f4 from sudhakar class");
	}

	void f5() { // default method
		System.out.println("I am f5 from sudhakar class");
	}

	protected void f6() { // Protected method
		System.out.println("I am f6 from sudhakar class");
	}

	public void f7() {// Public method
		System.out.println("I am f7 from sudhakar class");
	}

	public static void main(String[] args) {
		Shubhangi N = new Shubhangi();// object of parent class,call the method of parent class & object class only
		N.s1();
		N.s2();
		Sudhakar B = new Sudhakar();//object of child class,call the method parent,child & object class
		B.f4();
		B.f5();
		B.f6();
		B.f7();
		B.s1();
		B.s2();
	}

}
