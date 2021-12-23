package logicprog;

import java.util.Scanner;

public class LargestNoFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] x = new int[size];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		int max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		System.out.println("Largest no from given Array:" + max);
	}

}
