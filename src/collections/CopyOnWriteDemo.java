package collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {

	public static void main(String[] args) {
		List<String> test = new CopyOnWriteArrayList<>();
		test.add("Abhishe");
		test.add("Rahul");

		Thread readThread = new Thread(() -> {
			while (true) {
				for (String s : test) {
					System.out.println(s);
				}
			}
		});
		Thread write = new Thread(() -> {
			test.add("Sincer");
		});

		readThread.start();
		write.start();
	}

}
