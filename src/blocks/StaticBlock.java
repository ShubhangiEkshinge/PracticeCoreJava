package blocks;

public class StaticBlock {
	public long l = 50l; //Instance Variable
	static short s = 20; //Static variable
	int j = 1000; //Instance Variable
	//Static Block
	static {
		System.out.println("I'm a first static block");
		System.out.println(s); //We can call Static variable in static block
		//System.out.println(S.j); //We can't call a Instance variable from static block
	}

	public static void main(String[] args) {
		StaticBlock S = new StaticBlock();
		System.out.println(S.l); //calling the instance varible with an object
		System.out.println(S.j); //calling the instance varible with an object
		System.out.println(s); //calling the static varible from the method
	}
	static {
		System.out.println("I'm second static block in this class");
	}

}
