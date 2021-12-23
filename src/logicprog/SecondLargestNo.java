package logicprog;

import java.util.Scanner;

public class SecondLargestNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size = sc.nextInt();
		int[] x = new int[size];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println("second largest no from of an arary:" + x[size - 2]);
	}

}
