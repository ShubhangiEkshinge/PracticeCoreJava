package arrayexamples2d;

public class Twodarray15 {

	public static void main(String[] args) {
		int[][] x, y; // x is 2D & y is variable
		x = new int[5][2];

		x[4][1] = 11;
		x[3][0] = 12;
		x[2][0] = 14;
		x[1][0] = 15;
		x[0][0] = 16;
		System.out.println(x[4][1]);
		System.out.println(x[3][0]);
		System.out.println(x[2][0]);
		System.out.println(x[1][0]);
		System.out.println(x[0][0]);
	}

}
