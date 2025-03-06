package collections.map;

import java.util.EnumMap;
import java.util.Map;

enum Day {
	Monday, Tuesday, Wednesday, Thursday, Friday
}

/*
 * No resize,
 *
 * No hash keys works on ordinal (index of enum)
 *
 * maintains order
 */
public class EnumMapDemo {

	public static void main(String[] args) {
		Map<Day, String> map = new EnumMap<>(Day.class);

		map.put(Day.Tuesday, "Lecture");
		map.put(Day.Monday, "No class");

		System.out.println(Day.Tuesday.ordinal());
		System.out.println(map);
	}

}
