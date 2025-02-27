package collections;

import java.util.ArrayList;
import java.util.List;

public class CharacterPalindrome {
	private static boolean isPalindrome(List<Character> charList) {
		int left = 0;
		int right = charList.size() - 1;
		while (left < right) {
			if (!charList.get(left).equals(charList.get(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		List<Character> charList = new ArrayList<>();
		// 'r', 'a', 'c', 'e', 'c', 'a', 'r'
		charList.add('r');
		charList.add('a');
		charList.add('c');
		charList.add('e');
		charList.add('c');
		charList.add('a');
		charList.add('r');
		boolean val = isPalindrome(charList);
		System.out.println(val);

	}
}
