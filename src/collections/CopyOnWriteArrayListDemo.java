package collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Abhishek");
		list.add("Rijul");
		list.add("Aadi");

		for (String val : list) {
			if (val.equals("Rijul")) {
				list.add("Kashish");
			}
			System.out.println(val);
		}
		System.out.println(list);

		Thread readThread = new Thread(() -> {
			while (true) {
				for (String val : list) {
					System.out.println(val);
				}
			}
		});
		Thread writeThread = new Thread(() -> {
			list.add("Abcd");
		});
		readThread.start();
		writeThread.start();
	}

}
