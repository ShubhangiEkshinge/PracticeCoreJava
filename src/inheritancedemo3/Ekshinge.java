package inheritancedemo3;

public class Ekshinge extends Sudhakar {

	public Ekshinge() {
		System.out.println("I am no argument constructor of Ekshinge class");
	}

	public void E1() {
		System.out.println("I am E1 of Ekshinge class");
	}

	public void E2() {
		System.out.println("I am E2 of Ekshinge class");
	}

	public static void main(String[] args) {
		Ekshinge e = new Ekshinge();// object of class,call the method of parent of parent
									// class,object,child,Ekshinge class
		e.E1();
		e.E2();
		e.f4();
		e.f5();
		e.f6();
		e.f7();
		e.s1();
		e.s2();
	}

}
