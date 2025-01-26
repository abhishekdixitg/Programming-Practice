package assignments.module1;

import java.util.Scanner;

public class IdentifierChecker {

	// Method to check if a string is a Java keyword
	public static boolean isKeyword(String identifier) {
		String[] keywords = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
				"for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new",
				"null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false" };

		for (String keyword : keywords) {
			if (identifier.equals(keyword)) {
				return true;
			}
		}
		return false;
	}

	// Method to check if a string is a valid Java identifier
	public static boolean isValidIdentifier(String identifier) {
		// Check if the string is empty or null
		if (identifier == null || identifier.isEmpty()) {
			return false;
		}

		// Check if the first character is valid (letter, $, or _)
		if (!Character.isJavaIdentifierStart(identifier.charAt(0))) {
			return false;
		}

		// Check the rest of the characters (letters, digits, $, or _)
		for (int i = 1; i < identifier.length(); i++) {
			if (!Character.isJavaIdentifierPart(identifier.charAt(i))) {
				return false;
			}
		}

		// The identifier must not be a Java keyword
		if (isKeyword(identifier)) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter an identifier to check if it is valid:");
		String identifier = scanner.nextLine();

		if (isValidIdentifier(identifier)) {
			System.out.println("\"" + identifier + "\" is a valid identifier.");
		} else {
			System.out.println("\"" + identifier + "\" is an invalid identifier.");
		}

		scanner.close();
	}
}
