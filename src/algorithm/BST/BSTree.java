package algorithm.BST;

import java.util.Currency;

public class BSTree {
	
	Node current;
	
	static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			right = null;
			left = null;
		}
	}

	private Node addRecursive(Node current, int value) {	
		
		if(current == null) {
			return new Node(value);
		}
		
		if(current.value > value) {
			current.left = addRecursive(current.left, value);
		} else if(current.value < value) {
			current.right = addRecursive(current.right, value);
		} else {
			return current;
		}
		
		return current;
	}

	public static void traverseInOrder(Node node) {
		if(node != null) {
			System.out.println(node.value);
			traverseInOrder(node.left);
			traverseInOrder(node.right);
		}
	}
	public void add(int value) {
	    current = addRecursive(current, value);
	}
	
	public static void main(String[] args) {
		BSTree bst = new BSTree();
		bst.add(1);
		bst.add(2);
		bst.add(3);
		bst.add(4);
		bst.add(5);
		
		traverseInOrder(bst.current);		
		//System.out.println(bst.find(10));		
	}

	private boolean find(int i) {
		return findValue(current, 4);
	}

	private boolean findValue(Node current, int value) {
		if(current == null) {
			return false;
		}
		
		if(value == current.value) {
			return true;
		}
		return value < current.value ? findValue(current.left, value) : findValue(current.right, value);
	}
}




