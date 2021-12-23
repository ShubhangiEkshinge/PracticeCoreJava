package constructor;

public class ParentClass {
	int i;
	int j;

	public ParentClass() {
		System.out.println("default constructor");
		this.i = 10;
		this.j = 20;
		// this.m1();
		// this.main(null);

	}

	public ParentClass(int x, int y) {
		 this();
		System.out.println("parameter constructor");
		this.i = x;
		this.j = y;
//		this.i = 200;
//		this.i = 300;

	}
	public void m1() {
		System.out.println("I am m1");

//		System.out.println(i);
//		System.out.println(j);
	}

	public static void main(String[] args) {
		//ParentClass p = new ParentClass();
		ParentClass p1 = new ParentClass(500,400);
		p1.m1();
	}

}
