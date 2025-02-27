package collections;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayList {
	public static void main(String[] args) {
		List<Integer> allList = new ArrayList<>();
		allList.add(1);
		allList.add(2);
		allList.add(3);
		allList.add(4);
		allList.add(5);

		rotate(allList, 2);
		System.out.println(allList);

	}

	private static void reverse(List<Integer> numbers, int start, int end) {
		while (start < end) {
			// Swap the elements at start and end
			int temp = numbers.get(start);
			numbers.set(start, numbers.get(end));
			numbers.set(end, temp);

			start++;
			end--;
		}
	}

	private static void rotate(List<Integer> numbers, int k) {
		int n = numbers.size();
		if (n == 0 || k % n == 0) {
			return;
		}

		k = k % n;
		reverse(numbers, 0, n - 1);

		reverse(numbers, 0, k - 1);

		reverse(numbers, k, n - 1);

	}
}
