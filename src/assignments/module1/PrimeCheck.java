package assignments.module1;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number to check if it is prime:");
		int number = scanner.nextInt();

		if (number <= 1) {
			System.out.println(number + " is not a prime number.");
		} else {
			boolean isPrime = true;
			int divisor = 2;

			while (divisor <= Math.sqrt(number)) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
				divisor++;
			}

			if (isPrime) {
				System.out.println(number + " is a prime number.");
			} else {
				System.out.println(number + " is not a prime number.");
			}
		}

		scanner.close();
	}
}
