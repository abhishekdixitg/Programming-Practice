package collections;

import java.util.ArrayList;
import java.util.List;

public class InterleaveList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);

		List<Integer> list3 = new ArrayList<>();
		int counter1 = list1.size();
		int counter2 = list2.size();
		for (int i = 0; i < list1.size() + list2.size(); i++) {
			if (i % 2 == 0) {
				list3.add(list1.get(list1.size() - counter1));
				counter1--;
			} else {
				list3.add(list2.get(list2.size() - counter2));
				counter2--;
			}
		}
		System.out.println(list3);

	}
}
