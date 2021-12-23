package blocks;

public class LocalBlock {
	int i = 10; // Instance Variable
	static int j = 20;// static Variable
	int k = 30;// Instance Variable

	public static void main(String[] args) {
		LocalBlock L = new LocalBlock();
		System.out.println(L.i);
		System.out.println(L.k);
		// Local Block
		{
			short s = 40;// Local variable
			System.out.println(s);
			System.out.println(j); //We can call static variable in local block
			System.out.println(L.i); //We can call Instance varible in Local block
			//System.out.println(k); //We can not call Instance varible without object in local block
		}
		//System.out.println(s); //We can not call local vaible outside the local block
		System.out.println("I'm a Main Method");
		System.out.println("It's a example of Block");
	}

}
