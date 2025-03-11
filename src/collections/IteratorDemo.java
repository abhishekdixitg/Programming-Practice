package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i : list) {
			System.out.println(i);
		}

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for (Iterator iterator2 = list.iterator(); iterator2.hasNext();) {
			Integer integer = (Integer) iterator2.next();

		}

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		Iterator<Integer> iterator2 = numbers.iterator();

		while (iterator2.hasNext()) {
			Integer number = iterator2.next();
			if (number % 2 == 0) {
				iterator2.remove();
			}
		}
		System.out.println(numbers);

		ListIterator<Integer> listIterator = numbers.listIterator();

	}

}
