package collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IDHashMapDemo {
	public static void main(String[] args) {

		String s1 = new String("key1");
		String s2 = new String("key1");

		Map<String, String> strMap = new HashMap<>();
		strMap.put(s1, "Abhishek");
		strMap.put(s2, "Dixit");
		System.out.println("strMap--" + strMap);

		IdentityHashMap<String, String> strMap1 = new IdentityHashMap<>();
		strMap1.put(s1, "Abhishek");
		strMap1.put(s2, "Dixit");
		System.out.println("strMap1--" + strMap1);

	}
}
