import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyAccount {

	public int balance = 1000;

	Lock lock = new ReentrantLock();

	public void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " holding lock:: trying to deduct::" + amount);
		try {
			try {
				if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException ie) {

					}
					balance -= amount;
					System.out.println("Current balance::" + balance);
				} else {
					System.out.println(Thread.currentThread().getName() + " Lock not acquired, will try later");
				}
			} finally {
				lock.unlock();
			}
		} catch (Exception e) {

		}
	}

}
