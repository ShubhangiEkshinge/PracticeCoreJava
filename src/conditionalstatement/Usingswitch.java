package conditionalstatement;

import java.util.Scanner;

public class Usingswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Addition");
			break;
		case 2:
			System.out.println("Substraction");
			break;
		case 3:
			System.out.println("Multiplication");
			break;
		case 4:
			System.out.println("Division");
			break;
		default:
			System.out.println("Enter your choice");
			break;
		}
	}

}
