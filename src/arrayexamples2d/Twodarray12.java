package arrayexamples2d;

import java.util.Scanner;

public class Twodarray12 {

	public static void main(String[] args) {
		int[][] x, y; // Defined x & y is variable
		x = new int[6][5]; // declared x
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter 6 elements:");
		x[5][4] = sc.nextInt();
		x[4][3] = sc.nextInt();
		x[3][2] = sc.nextInt();
		x[2][1] = sc.nextInt();
		x[1][0] = sc.nextInt();
		x[0][0] = sc.nextInt();

		System.out.println(x[0][0]);
		System.out.println(x[1][0]);
		System.out.println(x[2][1]);
		System.out.println(x[3][2]);
		System.out.println(x[4][3]);
		System.out.println(x[5][4]);
	}

}
