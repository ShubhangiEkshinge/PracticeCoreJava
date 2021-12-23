package conditionalstatement;

import java.util.Scanner;

public class ChainingDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();

		if (age <= 0) {
			System.out.println("you are not going to school");
		} else if (age > 6 && age <= 14) {
			System.out.println("You are in school now ");
		} else if (age >= 14 && age < 16) {
			System.out.println("You are in college now ");

		} else if (age >= 16 && age < 21) {
			System.out.println("You are doing 3yrs degree now");

		} else if (age >= 16 && age < 22) {
			System.out.println("You are donig 4yrs degree now ");

		} else if (age >= 22 && age < 24) {
			System.out.println("You are doing your PG now ");

		} else if (age >= 24 && age < 29) {
			System.out.println("You are doing your PHD now");
		} else {

			System.out.println("Your qualification is completed");
		}

	}

}
