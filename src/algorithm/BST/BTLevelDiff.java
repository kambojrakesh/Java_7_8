package algorithm.BST;

import algorithm.BST.BSTree.Node;

public class BTLevelDiff {

	Node current;

	static class Node {
		int value;
		Node right;
		Node left;

		Node(int value) {
			this.value = value;
			right = null;
			left = null;
		}
	}

	private Node addRecursive(Node current, int value) {

		if (current == null) {
			Node n = new Node(value);
			return n;
		}

		if (current.value > value) {
			current.left = addRecursive(current.left, value);
		} else if (current.value < value) {
			current.right = addRecursive(current.right, value);
			
		} else {
			return current;
		}

		return current;
	}

	int countEven = 0;

	int countOdd = 0;

	int countDiff(Node current) {
		if (current != null) {
			

		if (current.value % 2 == 0) {
			countEven = countEven + current.value;
			countDiff(current.right);
		} else {
			countOdd = countOdd + current.value;
			countDiff(current.left);
		}

		System.out.println("countOdd==" + countOdd);
		System.out.println("countEven==" + countEven);
		}
		return 0;

	}
	public static void traverseInOrder(Node node) {
		if(node != null) {
			
			traverseInOrder(node.left);
			System.out.println(node.value);
			traverseInOrder(node.right);
		}
	}
	public static void main(String args[]) {
		BTLevelDiff bt = new BTLevelDiff();
		bt.add(8);
		bt.add(10);
		bt.add(13);
		bt.add(3);
		bt.add(1);
		bt.add(6);
		//bt.add(0);
		// bt.add(10);
		bt.countDiff();
		bt.traverseInOrder();
	}

	private void traverseInOrder() {
		traverseInOrder(current);
	}
	private void countDiff() {
		System.out.println(current.value);
		countDiff(current);
	}

	private void add(int i) {
		current = addRecursive(current, i);
	}
}
