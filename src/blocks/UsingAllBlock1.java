package blocks;

public class UsingAllBlock1 {
	int i = 20; // Instance Variable
	static short s = 30; // Static variable
	long l = 50;// Instance variable
	// Instance Block
	{
		System.out.println("Instance Block");
		float f = 200.0f; // Local Block
	}
	static {
		System.out.println("Staic Block");
	}

	public static void main(String[] args) {
		UsingAllBlock1 Bl = new UsingAllBlock1();
		System.out.println(Bl.i);
		System.out.println(Bl.l);
		//Local Block
		{
			System.out.println("Local Block");
		}
	}

}
