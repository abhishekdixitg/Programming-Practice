package collections.map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	public static void main(String[] args) {
		String val = "apple banana apple orange banana apple";

		String[] arr = val.split(" ");

		Map<String, Integer> frequencyCount = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (frequencyCount.containsKey(arr[i])) {
				int count = frequencyCount.get(arr[i]) + 1;
				frequencyCount.put(arr[i], count);
			} else {
				frequencyCount.put(arr[i], 1);
			}

		}
		System.out.println(frequencyCount);
	}
}
