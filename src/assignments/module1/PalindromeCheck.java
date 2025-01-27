package assignments.module1;

import java.util.Scanner;

public class PalindromeCheck {
	private static boolean isPalindrom(String input) {
		int end = input.length() - 1;
		int start = 0;
		while (start < end) {
			if (input.charAt(start) != input.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

	public static void main(String[] args) {
		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a string or number
		System.out.print("Enter a string or number: ");
		String input = scanner.nextLine();
		if (isPalindrom(input)) {
			System.out.println("The given input is a palindrome.");
		} else {
			System.out.println("The given input is not a palindrome.");
		}
		scanner.close();
	}
}
