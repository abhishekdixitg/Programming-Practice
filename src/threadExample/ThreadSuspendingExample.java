package threadExample;

class MyThread extends Thread {
	private boolean suspended = false;

	public synchronized void resumeThread() {
		suspended = false;
		notify();
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				while (suspended) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void suspendThread() {
		suspended = true;
	}
}

public class ThreadSuspendingExample {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		try {
			Thread.sleep(3000);
			t.suspendThread();
			System.out.println("Thread suspended.");
			Thread.sleep(3000);
			t.resumeThread();
			System.out.println("Thread resumed.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
