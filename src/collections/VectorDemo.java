package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(3, 2);
		vector.add(10);
		vector.add(20);
		vector.add(20);
		System.out.println(vector.capacity());

	}
}
