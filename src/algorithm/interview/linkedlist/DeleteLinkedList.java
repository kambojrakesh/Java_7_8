package algorithm.interview.linkedlist;

public class DeleteLinkedList {

	public static void main(String[] args) {
		LinkedLs ls = new LinkedLs();
		ls.addNode(1);
		ls.addNode(2);
		ls.addNode(3);
		// ls.addNode(12);

		ls.deleteFromEndNode();

		ls.display();
	}

}

class LinkedLs {
	public Node head;
	public Node tail;

	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public void addNode(int data) {
		Node current = new Node(data);
		if (head == null) {
			tail = current;
			head = current;

		} else {
			tail.next = current;
			tail = current;
		}
	}

	public void deleteFromStartNode(int val) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (head != tail) {
				head = head.next;
			} else {
				head = tail = null;
			}
		}
	}

	public void deleteFromEndNode() {
		Node current = head;

		if (current == null) {
			System.out.println("List is empty");
			return;

		} else {

			if (current != tail) {
				while (current.next != tail) {

					current = current.next;

				}

				tail = current;
				tail.next = null;

			} else {
				head = tail = null;
			}
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

}
