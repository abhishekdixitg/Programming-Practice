package threadExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorExample implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Executing task " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Task Completed");

	}

}

public class ThreadPoolExample {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		ExecutorExample task1 = new ExecutorExample();
		ExecutorExample task2 = new ExecutorExample();
		ExecutorExample task3 = new ExecutorExample();
		ExecutorExample task4 = new ExecutorExample();
		ExecutorExample task5 = new ExecutorExample();
		Future<?> future1 = executor.submit(task1, "Task1 Success");
		Future<?> future2 = executor.submit(task2, "Task2 Success");
		Future<?> future3 = executor.submit(task3, "Task3 Success");
		Future<?> future4 = executor.submit(task4, "Task4 Success");
		Future<?> future5 = executor.submit(task5, "Task5 Success");
		try {
			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());
			System.out.println(future4.get());
			System.out.println(future5.get());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} catch (ExecutionException e) {
			Thread.currentThread().interrupt();
		}
		/*
		 * executor.submit(task2); executor.submit(task3); executor.submit(task4);
		 * executor.submit(task5);
		 */

		System.out.println("Executor completed");

	}
}
