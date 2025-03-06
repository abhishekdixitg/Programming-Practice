package collections;

public class TestGenericStack {
	public static void main(String[] args) {
		GenericStack<String> stringStack = new GenericStack<>();

		stringStack.push("Apple");
		stringStack.push("Orange");
		stringStack.push("Grapes");

		System.out.println(stringStack);

		stringStack.pop();
		System.out.println(stringStack);

		String val = stringStack.peek();

		System.out.println(val);
	}
}
