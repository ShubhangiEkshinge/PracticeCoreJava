package arrayexamples2d;

public class Twodarray16 {

	public static void main(String[] args) {
		int[] x[], y;// x is 2D & y is variable
		x = new int[4][3];

		x[0][0] = 11;
		x[1][1] = 22;
		x[2][2] = 33;
		x[3][0] = 44;

		System.out.println(x[0][0]);
		System.out.println(x[1][1]);
		System.out.println(x[2][2]);
		System.out.println(x[3][0]);
	}

}
