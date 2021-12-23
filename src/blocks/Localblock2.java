package blocks;

public class Localblock2 {

	public static void main(String[] args) {

		// Local block
		{
			short s = -127; // Local variable
			int l = 128;// Local variable
			System.out.println(s);
			System.out.println(l);
		}
		System.out.println("I am main method");
		//System.out.println(l);
	}

}
