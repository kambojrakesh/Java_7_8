package algorithm.interview.linkedlist;

public class ReverseLinkedList {
	private Node head;
	private Node tail;

	static class Node {
		private int data;
		private Node next;

		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	public void addNode(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public void display() {
		Node current = head;
		if (current == null) {
			System.out.println("empty list");
			return;
		} else {
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
		System.out.println();
	}

	public void reverse(Node current) {

		if (current == null) {
			System.out.println("empty list");
			return;
		} else {

			if (current.next == null) {
				System.out.println(current.data+"==");
				return;
			}
			reverse(current.next);
			System.out.println(current.data+"--");

		}
		System.out.println();
	}

	public static void main(String args[]) {
		ReverseLinkedList li = new ReverseLinkedList();
		li.addNode(10);
		li.addNode(13);
		li.addNode(19);
		li.display();

		li.reverse(li.head);
	}
}