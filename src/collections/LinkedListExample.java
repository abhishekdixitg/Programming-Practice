package collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.addFirst(40);
		list.addLast(60);
		System.out.println(list);
		list.add(2, 70);
		System.out.println(list);

		int firstVal = list.getFirst();
		System.out.println(firstVal);

	}
}
