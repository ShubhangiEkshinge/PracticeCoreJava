package arrayexamples2d;

public class Twodarray13 {

	public static void main(String[] args) {
		int[][] x, y; // x is 2D Array & y is single-dimension Array
		x = new int[4][5];

		x[3][0] = 2;
		x[2][1] = 4;
		x[1][2] = 16;
		x[0][1] = 256;

		System.out.println(x[3][0]);
		System.out.println(x[2][1]);
		System.out.println(x[1][2]);
		System.out.println(x[0][1]);
	}

}
