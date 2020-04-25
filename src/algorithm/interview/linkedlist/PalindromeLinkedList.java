package algorithm.interview.linkedlist;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		LinkedLsp ls = new LinkedLsp();
		ls.addNode(1);
		ls.addNode(2);
		ls.addNode(3);
		ls.addNode(4);

		ls.reverseList();
		ls.display();
	}

}

class LinkedLsp {
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

	public void reverseList() {
		Node current = head;

		Node prevNode = null;
		Node nextNode = null;

		String value = "";
		if (head == null) {
			System.out.println("Linked List is empty.");
			return;
		} else {
			while (current != null) {
				nextNode = current.next;
				
				if (nextNode != null)
					System.out.println("nextNode  = " + nextNode.data);
				else
					System.out.println("nextNode  = " + nextNode);

				current.next = prevNode;
				
				if (prevNode != null)
					System.out.println("prevNode = " + prevNode.data);
				else
					System.out.println("prevNode  = " + prevNode);
				
				
				prevNode = current;
				current = nextNode;

				if (nextNode != null)
					System.out.println(prevNode.data + "--------------------" + current.data);
				else
					System.out.println(prevNode + "--------------------" + current);

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
