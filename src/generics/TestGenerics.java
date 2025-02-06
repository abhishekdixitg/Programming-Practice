package generics;

import java.util.ArrayList;

public class TestGenerics {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList(); // Type safe
		list.add(12);
		list.add(13);
		// list.add("Abhishek");
		// list.add(12.34);

		Store<Integer> store = new Store();
		store.setValue(10);
		int result = store.getValue();
		System.out.println(result);

		// Store<String> store1 = new Store();
		/// store1.setValue("Abhishek");
		// String result1 = store1.getValue();
		// System.out.println(result1);

		BoundedMethod bounded = new BoundedMethod();
		bounded.add(10);
		bounded.add("Abhishek");
	}

}
