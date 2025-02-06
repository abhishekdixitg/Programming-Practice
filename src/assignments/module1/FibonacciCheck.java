package assignments.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciCheck {
	static int fibonacci(int val) {
		if (val <= 1) {
			return val;
		}

		/* --- recursion -- */
		// return fibonacci(val - 1) + fibonacci(val - 2);

		/* --- use iterative approach -- */

		int prev1 = 0;
		int prev2 = 1;
		int current = 0;

		for (int i = 2; i <= val; i++) {
			current = prev1 + prev2;
			prev1 = prev2;
			prev2 = current;
		}
		return current;
	}

	public static void main(String[] args) throws IOException {

		try {
			InputStreamReader fr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Please enter a non-negative number:: ");
			int val = Integer.parseInt(br.readLine());
			for (int i = 0; i <= val; i++) {
				System.out.println("Fibonacci series of number " + i + " - " + fibonacci(i));
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter an integer.");
		}
	}
}
