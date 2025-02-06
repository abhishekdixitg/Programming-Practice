package generics;

public class BoundedMethod {
	private String val;

	public int add(int a) {
		return a;
	}

	public <T> void add(T value) {
		System.out.println(value);
	}
}
