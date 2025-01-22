package module1;

interface AbstractExample {
	abstract int calculate(int a, int b);
}

class Add implements AbstractExample {
	@Override
	public int calculate(int a, int b) {
		return a + b;
	}
}

public class InterfaceAbstractionExample {

	public static void main(String[] args) {
		AbstractExample add = new Add();
		AbstractExample multi = new Multiplication();
		System.out.println("Addition:: " + add.calculate(4, 2));
		System.out.println("Multiplication:: " + multi.calculate(4, 2));
	}

}

class Multiplication implements AbstractExample {
	@Override
	public int calculate(int a, int b) {
		return a * b;
	}
}
