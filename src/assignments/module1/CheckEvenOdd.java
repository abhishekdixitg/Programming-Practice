package assignments.module1;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("Number is even:");
		} else {
			System.out.println("Number is odd:");
		}
		scanner.close();
	}
}
