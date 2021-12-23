//Example of Static variable
package variables;

public class StaticvarDemo1 {
	public static int k = 127;// Static variable

	public static void main(String[] args) {
		InstancevarDemo1 I1 = new InstancevarDemo1();
		System.out.println(I1.j);// other class of Instance Variable call in this class With the object
		System.out.println(k);

	}

}
