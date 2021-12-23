//Example of Instance variable
package variables;

public class InstancevarDemo1 {
	public int j = -128;// Instance variable

	public static void main(String[] args) {
		InstancevarDemo1 I = new InstancevarDemo1();
		System.out.println(I.j);// Instance variable call with object
		System.out.println(StaticvarDemo1.k);// other class of static variable call in this class
	}

}
