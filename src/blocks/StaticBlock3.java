package blocks;

public class StaticBlock3 {
	int i = 20; // Instance Variable
	static short s = 30; // Static variable
	// Static Block
	static {
		System.out.println("I am static block");
	}

	public static void main(String[] args) { // without main method we can't execute prog

	}

}