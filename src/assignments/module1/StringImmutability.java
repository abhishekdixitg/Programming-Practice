package assignments.module1;

public class StringImmutability {
	public static void main(String[] args) {
		// Create an initial String
		String str = "Hello";

		// Print the original string
		System.out.println("Original String: " + str);

		// Attempt to modify the string using concatenation
		String newStr = str.concat(" World");

		// Check if the original string is changed
		System.out.println("After concat operation:");
		System.out.println("Original String: " + str);
		System.out.println("New String: " + newStr);

		// Attempt to modify the string using replacement
		String replacedStr = str.replace('H', 'J');

		// Check if the original string is changed
		System.out.println("\nAfter replace operation:");
		System.out.println("Original String: " + str);
		System.out.println("Replaced String: " + replacedStr);

		// Attempt to modify the string using substring
		String substring = str.substring(1, 4);

		// Check if the original string is changed
		System.out.println("\nAfter substring operation:");
		System.out.println("Original String: " + str);
		System.out.println("Substring: " + substring);

		// Verify the immutability
		if (str == newStr || str == replacedStr || str == substring) {
			System.out.println("\nString object was modified!");
		} else {
			System.out.println("\nString object remains immutable.");
		}
	}
}
