package collections;

import java.util.ArrayList;
import java.util.List;

public class EvenOddListExample {
	public static void main(String[] args) {
		List<Integer> allList = new ArrayList<>();
		allList.add(2);
		allList.add(3);
		allList.add(4);
		allList.add(5);
		allList.add(6);
		allList.add(7);
		allList.add(8);
		allList.add(9);

		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		for (int i = 0; i < allList.size(); i++) {
			if (allList.get(i) % 2 == 0) {
				evenList.add(allList.get(i));
			} else {
				oddList.add(allList.get(i));
			}
		}
		System.out.println("evenList:: " + evenList + " oddList:: " + oddList);

	}

}
