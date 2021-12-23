package constructor;

public class ChildClass extends ParentClass {

	public ChildClass() {
		super();
		System.out.println("constructor of child");
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();

	}

}
