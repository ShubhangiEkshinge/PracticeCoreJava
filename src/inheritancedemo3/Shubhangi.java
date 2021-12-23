package inheritancedemo3;

public class Shubhangi {

	public Shubhangi() { // No argument constructor
		System.out.println("I am no argument constructor of Shubhangi class");
	}

	public void s1() { //public method
		System.out.println("I am s1");
	}

	void s2() { //default method
		System.out.println("I am s2");
	}

	private void s3() { //private method
		System.out.println("I am s3");// Private method only call in Shubhangi class
	}
	public void s4() {
		System.out.println("I am s4 from shubhangi class");//same method of shubhangi & main class
	}

	public static void main(String[] args) {
		//Shubhangi S = new Shubhangi();
		//Sudhakar B = new Sudhakar();
	

	}

}
