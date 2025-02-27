package collections;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {
	private static int findSecondLarger(List<Integer> allList) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int num : allList) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		return secondLargest == Integer.MIN_VALUE ? Integer.MIN_VALUE : secondLargest;
	}

	public static void main(String[] args) {
		List<Integer> allList = new ArrayList<>();
		allList.add(10);
		allList.add(20);
		allList.add(4);
		allList.add(45);
		allList.add(90);

		int value = findSecondLarger(allList);
		System.out.println(value);

	}
}
