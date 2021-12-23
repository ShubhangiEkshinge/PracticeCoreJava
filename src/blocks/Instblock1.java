package blocks;

public class Instblock1 {
	int i = 100;
	static long l = 102l;

	// Instance block
	{
		System.out.println(i); // call the instance variable
		System.out.println(l);// call the static variable
	}

	public static void main(String[] args) {
		Instblock1 I1 = new Instblock1(); // Creating object
		System.out.println(I1.i);
		System.out.println(l);

	}

}
