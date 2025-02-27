package collections;

import java.util.ArrayList;
import java.util.List;

public class SortStringsAlphabetically {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<>();

		allList.add("Rahul");
		allList.add("xavier");
		allList.add("Kirti");
		allList.add("Abhishek");
		allList.add("Gaurav");

		allList.sort(null);

		// another way
		// Collections.sort(null);
		System.out.println(allList);

	}
}
