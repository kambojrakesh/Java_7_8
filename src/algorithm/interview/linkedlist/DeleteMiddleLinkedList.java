package algorithm.interview.linkedlist;

public class DeleteMiddleLinkedList {

	public static void main(String[] args) {
		LinkedLss ls = new LinkedLss();
		ls.addNode(1);
		ls.addNode(2);
		ls.addNode(3);
		ls.addNode(4);
		ls.addNode(5);
		ls.addNode(6);
		ls.addNode(7);
		ls.addNode(8);

		ls.deleteFromMiddleNode();
		ls.display();
	}
}

class LinkedLss {
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

	public void deleteFromMiddleNode() {
		Node current = head;

		if (current == null) {
			System.out.println("List is empty");
			return;
		} else {
			Node fast_node = head;
			Node slow_node = head;
			Node prev = null;

			while (fast_node != null && fast_node.next != null) {
				fast_node = fast_node.next.next;
				prev = slow_node;
				slow_node = slow_node.next;
				
			}
			prev.next = slow_node.next;
		}
		//return head;
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
