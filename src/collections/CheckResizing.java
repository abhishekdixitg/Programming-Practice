package collections;

import java.util.ArrayList;

public class CheckResizing {

	// Reflection to get internal capacity (for demonstration only)
	private static int getCapacity(ArrayList<?> list) {
		try {
			java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
			field.setAccessible(true);
			Object[] elementData = (Object[]) field.get(list);
			return elementData.length;
		} catch (Exception e) {
			return -1;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// Adding elements
		list.add(10);
		list.add(20);
		list.add(30);

		// Removing an element
		list.remove(1); // Removes the element at index 1

		// Accessing an element
		System.out.println("Element at index 0: " + list.get(0));

		// Internal resizing demonstration
		for (int i = 0; i < 20; i++) {
			list.add(i);
			System.out.println("Size: " + list.size() + ", Capacity: " + getCapacity(list));
		}
	}
}
