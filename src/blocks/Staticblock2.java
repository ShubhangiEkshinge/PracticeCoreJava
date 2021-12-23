package blocks;

public class Staticblock2 {
	long l = 100l; // Instance variable
	static double d = 3.0; // Static variable

	// Static Block
	static{
		System.out.println("I am Static block");
		//System.out.println(l);
		System.out.println(d);
	}

	public static void main(String[] args) {
    System.out.println("I am main method");
	}

}
