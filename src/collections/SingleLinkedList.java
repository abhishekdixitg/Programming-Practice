package collections;

class Node {
	int val;
	Node next;
}

public class SingleLinkedList {
	public static void main(String[] args) {
		Node node1 = new Node();
		Node node2 = new Node();
		node1.val = 1;
		node2.val = 2;

		node1.next = node2;
		node2.next = null;
	}
}