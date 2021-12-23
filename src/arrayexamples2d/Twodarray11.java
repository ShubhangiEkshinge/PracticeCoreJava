package arrayexamples2d;

import java.util.Scanner;

public class Twodarray11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements:");

		int[] x[]; // defined x
		x = new int[5][4]; // declared x

		x[3][1] = sc.nextInt();
		x[2][1] = sc.nextInt();
		x[0][1] = sc.nextInt();
		x[4][2] = sc.nextInt();
		x[1][3] = sc.nextInt();

		System.out.println(x[2][1]);
		System.out.println(x[4][2]);

	}

}
