package assignments.module1;

import java.util.Scanner;

public class CalculateFactorial {

	private static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number to calcualte factorial:");
		int number = scanner.nextInt();
		// int result = 1;
		// while (!(number < 1)) {
		// result = result * number;
		// number--;
		// }
		// System.out.println(result);
		System.out.println(factorial(number));
	}
}
