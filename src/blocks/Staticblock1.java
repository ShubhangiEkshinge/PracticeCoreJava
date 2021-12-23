package blocks;

public class Staticblock1 {

	int m = 150;// Instance variable

	static int n = 250; // Static variable
	// Instance block
	{
		System.out.println("I am Instance block");
		System.out.println(m);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Staticblock1 s1 = new Staticblock1(); // Creating object
		System.out.println("I am main method");

	}

	// Static block
	static {
		System.out.println("I am Static block");
	}

}
