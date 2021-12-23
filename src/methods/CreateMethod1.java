package methods;

public class CreateMethod1 {

	public int SumMethod(int a, int b) {
		System.out.println("I am sum method");
		return a - b;
	}

	public int SubMethod(int x, int y) {
		System.out.println("I am sub method");
		return x - y;
	}

	public static void main(String[] args) {
		CreateMethod1 c = new CreateMethod1();
		c.SumMethod(30, 50);
		c.SubMethod(10, 20);
	}

}
