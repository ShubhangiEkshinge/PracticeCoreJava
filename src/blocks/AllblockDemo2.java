//Example of using all block
package blocks;

public class AllblockDemo2 {
	float f = 30f;// Instance variable
	static double d = 20.0;// Static variable

	public static void main(String[] args) {
		AllblockDemo2 h = new AllblockDemo2();
		System.out.println(h.f);
		System.out.println(d);
		// Local block
		{
			char c = 70;// Local variable
			System.out.println(c);// unicode value of 70 is F
		}
	}

	// static block
	static {
		short s = 10;// Local variable
		int i = (int) s;// Explicit type casting
		System.out.println(i);
	}

	// Instance block
	{
		short s = 50;// Local variable
		int i = s;// Implicit type casting
		System.out.println(i);
	}
}
