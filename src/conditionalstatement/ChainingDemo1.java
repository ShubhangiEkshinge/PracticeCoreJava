package conditionalstatement;

import java.util.Scanner;

public class ChainingDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		if (age <= 0) {
			System.out.println("You are yet to born");
		} else if (age > 0 && age <= 18) {
			System.out.println("You are child");
		} else if (age >= 18 && age < 55) {
			System.out.println("You are adult");
		} else if (age >= 55 && age < 110) {
			System.out.println("you are senior citizen");
		} else {
			System.out.println("You are not human");
		}
	}
}
