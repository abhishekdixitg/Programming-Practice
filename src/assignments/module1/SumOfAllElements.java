package assignments.module1;

public class SumOfAllElements {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 5, 6, 8 };
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			counter = counter + arr[i];
		}
		System.out.println("Total Sum:: " + counter);
	}
}
