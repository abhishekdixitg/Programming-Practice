package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class FilterClass {
	<T> List<T> testFilter(List<T> list, Predicate<T> condition) {
		List<T> filteredList = new ArrayList<>();
		for (T item : list) {
			if (condition.test(item)) {
				filteredList.add(item);
			}
		}
		return filteredList;
	}
}

public class GenericCondition {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("Abhishek");
		strList.add("Rahul");
		strList.add("abc");

		FilterClass filterClass = new FilterClass();
		List<String> filterList = filterClass.testFilter(strList, word -> word.length() < 5);
		System.out.println(filterList);

	}
}
