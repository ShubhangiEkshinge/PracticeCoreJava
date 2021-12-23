package arrayexamples2d;

public class Twodarray5 {

	public static void main(String[] args) {
		int[][] x = new int[4][3]; // creating 2D Array

		x[3][2] = 11;
		x[2][1] = 12;
		x[1][0] = 13;
		System.out.println(x[3][2]);
		System.out.println(x[2][1]);
		System.out.println(x[1][0]);
	}

}
