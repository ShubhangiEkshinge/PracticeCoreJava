package blocks;

public class InstanceBlock {
	int i = 20; // Instatice variable
	static float f = 30.0f; // static variable
	long l = 50l; // Instance Variable
	//Instance Block
	{
		System.out.println("I am a Instance Block");
	}

	public static void main(String[] args) {
		InstanceBlock I = new InstanceBlock();
		System.out.println(I.i); // calling Instance variable with the object
		System.out.println(f); // calling Static variable from the method
		System.out.println(I.l); // calling Instance variable with the object
	}

}
