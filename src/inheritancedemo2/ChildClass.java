package inheritancedemo2;

public class ChildClass extends ParentClass { //ParentClass become parent of ChildClass Using 'extends'keyword
	public void c11() {
		System.out.println("I am c11 from ChildClass");
	}

	public void c12() {
		System.out.println("I am c12 from ChildClass");
	}

	private void c13() {// We can not call private method of outside this class
		System.out.println("I am c13 from ChildClass");
	}

	public static void main(String[] args) {
		ChildClass C = new ChildClass();// When we create child class object that time we can call child,parent,object
										// class method
		C.c11();
		C.c12();
		C.c13();// Only call here,because c13 is private method
		C.m11();
		C.m12();

	}

}
