package conditionalstatement;

import java.util.Scanner;

public class UsingIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		if (age < 18 && age > 0);
			
		//{// end the if statement here,that,s why print the statement
			System.out.println("You are child");
			System.out.println("You are going to school now");
		//}
	}
}
