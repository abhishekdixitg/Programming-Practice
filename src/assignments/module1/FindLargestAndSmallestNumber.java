package assignments.module1;

import java.util.Scanner;

public class FindLargestAndSmallestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Size of the array
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();

		if (size <= 0) {
			System.out.println("Array size must be greater than 0.");
			return;
		}

		// Input: Elements of the array
		int[] numbers = new int[size];
		System.out.println("Enter " + size + " elements of the array:");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Initialize smallest and largest with the first element
		int smallest = numbers[0];
		int largest = numbers[0];

		// Traverse the array to find smallest and largest numbers
		for (int i = 1; i < size; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}

		// Output: Smallest and largest numbers
		System.out.println("Smallest number: " + smallest);
		System.out.println("Largest number: " + largest);

		scanner.close();
	}
}
