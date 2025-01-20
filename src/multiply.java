
public class multiply extends Sum {
	private int a;
	private int b;

	multiply(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int add(int a, int b) {
		return a * b;
	}
}
