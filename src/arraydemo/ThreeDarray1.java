//Example of 3D array
package arraydemo;

public class ThreeDarray1 {

	public static void main(String[] args) {
		int[][][] y = new int[5][3][1];

		y[3][2][0] = 22;
		y[2][1][0] = 33;
		y[1][0][0] = 44;
		y[0][0][0] = 55;

		System.out.println(y[3][2][0]);
		System.out.println(y[2][1][0]);
		System.out.println(y[1][0][0]);
		System.out.println(y[0][0][0]);
	}

}
