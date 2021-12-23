package arrayexamples2d;

import java.util.Scanner;

public class Twodarray14 {

	public static void main(String[] args) {
		int[] x[], y; //x is 2D & y is 1D Array
		x = new int[4][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 elements:");
		x[0][0] = sc.nextInt();
		x[1][1] = sc.nextInt();
		x[2][2] = sc.nextInt();
		x[3][0] = sc.nextInt();
		System.out.println(x[0][0]);
		System.out.println(x[1][1]);
		System.out.println(x[2][2]);
		System.out.println(x[3][0]);

	}

}
