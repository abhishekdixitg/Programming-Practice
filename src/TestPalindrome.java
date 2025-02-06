
public class TestPalindrome {
	public static boolean isPalindrome(String s) {
		int len = s.length();
		int start = 0;
		int end = len - 1;
		boolean d = true;
		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
				end--;

			} else {
				d = false;
			}
		}
		return d;
	}

	public static void main(String[] args) {
		String s = "A R O R ";

		if (isPalindrome(s)) {
			System.out.println("palidrome string");
		} else {
			System.out.println(" not a palindrome string");
		}

	}

}
