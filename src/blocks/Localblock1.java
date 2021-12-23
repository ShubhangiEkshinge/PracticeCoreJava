package blocks;

public class Localblock1 {

	public static void main(String[] args) {
		int j = 121;// Local variable
		System.out.println(j);

		// Local block
		{
			System.out.println("I am local block");
			System.out.println(j);
		}
	}

}
