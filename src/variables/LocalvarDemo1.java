package variables;

public class LocalvarDemo1 {

	public static void main(String[] args) {
		int i = 300; // Local variable
		System.out.println(i);// call the local variable

		{
			int j = 500;
			System.out.println(j);
			System.out.println(i);
		}
	}

}
