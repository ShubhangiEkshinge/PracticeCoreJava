package conditionalstatement;

import java.util.Scanner;

public class Usingswitchblock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit:");
		int Digit = sc.nextInt();

		switch (Digit) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SEX");
			break;
		default:
			System.out.println("Invalid Digit");
		}
	}

}
