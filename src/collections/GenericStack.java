package collections;

import java.util.ArrayList;

public class GenericStack<T> {

	ArrayList<T> list;

	public GenericStack() {
		list = new ArrayList<>();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public T peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return list.get(list.size() - 1);
	}

	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return list.remove(list.size() - 1);
	}

	public void push(T element) {

		list.add(element);
	}

	public int size() {

		return list.size();

	}

	@Override
	public String toString() {
		return "GenericStack [list=" + list + "]";
	}
}
