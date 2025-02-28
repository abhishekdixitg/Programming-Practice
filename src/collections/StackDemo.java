package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		// stack.pop();
		System.out.println(stack);
		int val = stack.peek();
		System.out.println(val);

		int searchVal = stack.search(20);
		System.out.println("-----" + searchVal);

		// LinkedList as stack
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.addLast(40);
		linkedList.addLast(50);
		linkedList.addLast(60);
		System.out.println(linkedList);
		int peek = linkedList.getLast();
		System.out.println(peek);
		linkedList.removeLast();

		// list as stack
		List<Integer> listStack = new ArrayList<>();
		System.out.println(listStack.size());
		listStack.add(70);
		listStack.add(80);
		listStack.add(90);
		System.out.println(listStack);
		listStack.remove(listStack.size() - 1); // pop
		System.out.println(listStack);
		int lastVal = listStack.get(listStack.size() - 1); // peek
		System.out.println(lastVal);

	}

}
