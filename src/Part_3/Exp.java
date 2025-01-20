package Part_3;

import java.util.Scanner;

public class Exp {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		StringProcessor rev_str = (String a) -> {
			StringBuffer new_string = new StringBuffer(a);
			return new_string.reverse().toString();
		};
		StringProcessor UppCase = (String a) -> {
			a.toUpperCase();
			return a;
		};
		System.out.println("Enter the string: ");
		String input_string = obj.nextLine();
		System.out.println("The reverse of given string is: " + rev_str.ReverseString(input_string));
		System.out.println("The reverse of given string is: " + UppCase.ReverseString(input_string));

		obj.close();
	}
}

@FunctionalInterface
interface StringProcessor {
	String ReverseString(String a);
	// String UpperCase(String a);
}