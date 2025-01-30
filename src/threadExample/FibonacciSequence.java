package threadExample;

class CalculateFibonacci implements Runnable {
	int number = 0;

	CalculateFibonacci(int number) {
		this.number = number;
	}

	private int calculate(int n) {
		if (n <= 1) {
			return n;
		}
		return calculate(n - 1) + calculate(n - 2);
	}

	@Override
	public void run() {
		System.out.println("Fibonacci of " + number + ": " + calculate(number));

	}

}

public class FibonacciSequence {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			new Thread(new CalculateFibonacci(i)).start();
			;
		}
	}

}
