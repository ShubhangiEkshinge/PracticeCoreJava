//Example of using all block
package blocks;

public class AllblockDemo1 {
	byte b = 50;// Instance variable
	short s = 10; // Instance variable
	static long l = 60l;// Static variable

	// Instance block
	{
		int i = 40; // Local variable
		System.out.println(i);
	}

	// Static block
	static {
		int j = 20; // Local variable
		System.out.println(j);
	}

	public static void main(String[] args) {
		AllblockDemo1 g = new AllblockDemo1();
		System.out.println(g.b);
		System.out.println(g.s);
		System.out.println(l);

		// Local block
		{
			float f = 80.4f;// Local variable
			System.out.println(f);
		}
	}

}
