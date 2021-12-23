package arrayexamples2d;

public class Twodarray2 {

	public static void main(String[] args) {
		int[] []y,z = new int[4][1];
        int[][] x = new int[4][]; // creating 2D Array
		x[0][0] = 30;
		x[1][0] = 40;
		x[2][0] = 50;
		x[3][0] = 60;
		System.out.println(x[0][0]); // can't store to int array because "x[0]" is null
		System.out.println(x[1][0]);// NullpointException
		System.out.println(x[2][0]);
		System.out.println(x[3][0]);

	}

}
