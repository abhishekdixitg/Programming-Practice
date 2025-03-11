package generics;

import java.util.Arrays;
import java.util.List;

class WildcardExample {

	// Method using lower-bounded wildcard
	public void addInteger(List<? super Integer> list) {
		list.add(10); // Can add an Integer or its subclass
		list.add(20);
	}

	// Method using unbounded wildcard
	public void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	// Method using bounded wildcard
	public double sumList(List<? extends Number> list) {
		double sum = 0;
		for (Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}
}

public class WildCardTest {
	public static void main(String[] args) {
		WildcardExample example = new WildcardExample();

		// Unbounded wildcard example
		List<String> stringList = Arrays.asList("Hello", "Wildcard");
		example.printList(stringList);

		// Bounded wildcard example
		List<Integer> intList = Arrays.asList(1, 2, 3);
		System.out.println("Sum: " + example.sumList(intList));

		// Lower-bounded wildcard example
		List<Number> numberList = new java.util.ArrayList<>();
		example.addInteger(numberList);
		System.out.println("Number List: " + numberList);
	}
}
