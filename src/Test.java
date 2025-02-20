import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
	public static final Logger logger = Logger.getLogger(Test.class.getName());

	public static void main(String[] args) {
		// Sum sum = new multiply();
		// System.out.println(sum.add(1, 2));

		logger.log(Level.INFO, "inside main method");
		String sb = "Abhishek";
		// String sb1 = "Abhishek";
		// System.out.println(sb == sb1);
		String ab1 = new String("Abhishek");
		String sb1 = new String("Abhishek");
		System.out.println(sb1.equals(sb1));
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("Abhishek");
		sbuffer.append(" Dixit");
		System.out.println(sbuffer.toString());

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			x += arr[i];
		}
		System.out.println(x);

		int val = 0;
		int len = arr.length;

		for (int i = 0; i < len / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[len - i - 1];
			arr[len - i - 1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String abc = "Abhishek Dixit";
		StringBuffer reverseSb = new StringBuffer(abc);
		System.out.println(reverseSb.reverse());

		String reverse = "";
		for (int i = abc.length() - 1; i >= 0; i--) {
			reverse += abc.charAt(i);
		}

		System.out.println("reverse------" + reverse);

		System.out.println("reverse------" + abc.split(" "));
		System.out.println("PLease enter::");

		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error reading file");
		}

		// System.out.println(br.readLine());

	}
}
