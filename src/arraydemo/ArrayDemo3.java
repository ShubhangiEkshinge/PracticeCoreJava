//Example of Array from taking user I/P
package arraydemo;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] x = new int[5];
		System.out.println("Enter 5 elements:");
		Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		// x[0] = a;

		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		x[3] = sc.nextInt();
		x[4] = sc.nextInt();

		System.out.println("Element at index 4 is:" + x[4]);

	}

}
