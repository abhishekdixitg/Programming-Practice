package ThreadExample;

public class TestSynchronized {
	public static void main(String[] args) {
		MyAccount myAccount = new MyAccount();

		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				myAccount.withdraw(100);
			}
		};
		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				myAccount.withdraw(100);
			}
		};
		Thread t1 = new Thread(task1, "Thread 1");
		Thread t2 = new Thread(task2, "Thread 2");

		t1.start();
		t2.start();

	}

}
