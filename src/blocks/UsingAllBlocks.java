package blocks;

public class UsingAllBlocks {
	public int i = 200; // Instance variable with public Access Modifier
	public static short s = 300;//Static variable with public Static Access Modifier
	static byte b = 100; // Static variable with static Access modifier
	// Instance Block
	{
		System.out.println("I'm Instance Block ");
		System.out.println(i);// Calling static variable in Instance Block
		System.out.println(s);// Calling static variable in Instance Block
		System.out.println(b);// Calling static variable in Instance Block
	}
	// static Block
	static {
		System.out.println("I'm a static block");
		System.out.println(s);// Calling static variable in Static block
		System.out.println(b);// Calling static variable in Static block
	}

	public static void main(String[] args) {
		System.out.println("I am a main method");
		float f = 10;// Local variable in main method
		System.out.println(f);// Calling local variable from the main method
		// Local Block
		{
			int k = 50;// Local variable in Local block
			System.out.println("I'm Local  Block");
			System.out.println(s);// Calling static variable in Local block
			System.out.println(b);// Calling static variable in Local block

		}
	}

	// Static block
	static {
		System.out.println("I am second no. static block");
	}
}
