package inheritancedemo2;

public class ClassC extends ChildClass { // ChildClass become parent class of ChildC using 'extends' keyword

	private void Class1() {
		System.out.println("I am Class1 method of ChildC class");
	}

	public void Class2() {
		System.out.println("I am Class2 method of ChildC class");
	}

	public static void main(String[] args) {
		ClassC C1 = new ClassC(); // here we can call method of ParentClass,ChildClass & ChildC
		C1.Class1();
		C1.Class2();// Only call here,because c13 is private method
		C1.c11();
		C1.c12();
		C1.m11();
		C1.m12();
		try {
		ClassC n= (ClassC)new ChildClass();
		}catch(Exception ClassCastExcetion) {
			System.out.println("Hello");
           		
		}
	}

}
