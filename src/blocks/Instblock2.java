package blocks;

public class Instblock2 {
	static int j = 1020; // Static variable
	int k = 3020; // Instance variable

	public static void main(String[] args) {
		Instblock2 I2 = new Instblock2(); // Creating object
	}

	// Instance block
	{
		System.out.println(k);
		System.out.println(j);
	}

}
