package assignments.module1;

public class StringBuilderExample {
	public static void main(String[] args) {
		// Create a StringBuilder instance
		StringBuilder sb = new StringBuilder("Hello");

		// Append text to the StringBuilder
		sb.append(" World");
		System.out.println("After append: " + sb);

		// Insert text at a specific index
		sb.insert(6, "Java ");
		System.out.println("After insert: " + sb);

		// Replace a portion of the string
		sb.replace(6, 10, "Beautiful");
		System.out.println("After replace: " + sb);

		// Delete a portion of the string
		sb.delete(6, 15);
		System.out.println("After delete: " + sb);

		// Reverse the string
		sb.reverse();
		System.out.println("After reverse: " + sb);

		// Reset the StringBuilder
		sb.setLength(0); // Clears the content
		sb.append("StringBuilder is efficient!");
		System.out.println("Reset and updated: " + sb);

		// Display capacity and length
		System.out.println("Capacity: " + sb.capacity());
		System.out.println("Length: " + sb.length());
	}
}
