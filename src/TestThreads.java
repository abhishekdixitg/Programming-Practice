class Counter {
	int val = 0;

	public synchronized void increment() {
		val++;
	}
}

public class TestThreads {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		Counter c = new Counter();

		Runnable hello = () -> {
			for (int i = 0; i < 10000; i++) {
				c.increment();
			}

		};
		Runnable hi = () -> {
			for (int i = 0; i < 10000; i++) {
				c.increment();

			}
		};

		Thread t1 = new Thread(hello, "Thread1");
		Thread t2 = new Thread(hi);

		// hi.setPriority(Thread.MAX_PRIORITY);
		// System.out.println(hi.getPriority());
		t1.setDaemon(true);
		t1.start();
		t2.start();

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.join();
		t2.join();

		System.out.println(c.val);
		// hi.start();

	}
}
