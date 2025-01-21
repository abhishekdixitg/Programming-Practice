package ThreadExample;

class DeadLockExample {

	private static final Object obj1 = new Object();
	private static final Object obj2 = new Object();

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println("Thread 1: Holding lock1...");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				System.out.println("Thread 1: Waiting for lock2...");
				synchronized (obj2) {
					System.out.println("Thread 1: Acquired lock2!");
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (obj2) {
				System.out.println("Thread 2: Holding lock2...");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				System.out.println("Thread 2: Waiting for lock1...");
				synchronized (obj1) {
					System.out.println("Thread 2: Acquired lock1!");
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}
