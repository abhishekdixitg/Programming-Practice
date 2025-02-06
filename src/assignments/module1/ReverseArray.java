package assignments.module1;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 5, 6, 8 };
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
