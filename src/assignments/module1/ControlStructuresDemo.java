package assignments.module1;

import java.util.Scanner;

public class ControlStructuresDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Demonstrating if-else
		System.out.println("Enter a number to check if it is even or odd:");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}

		// Demonstrating switch
		System.out.println("\nEnter a day number (1 for Monday, 7 for Sunday):");
		int day = scanner.nextInt();
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day number.");
		}

		// Demonstrating for loop
		System.out.println("\nEnter a number to print its multiplication table:");
		int multiplier = scanner.nextInt();
		System.out.println("Multiplication table for " + multiplier + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(multiplier + " x " + i + " = " + multiplier * i);
		}

		scanner.close();
	}
}
