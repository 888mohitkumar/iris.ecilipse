package com.ds.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	static Node head;

	public static void convertBTreeToDLL(final Node root) {
		if (root == null) {
			return;
		}
		convertBTreeToDLL(root.right);
		if (head == null) {
			head = root;
		} else {
			root.right = head;
			head.left = root;
			head = root;
		}
		Node curr = head;
		while (curr != null) {
			System.out.print(" " + curr.data);
			curr = curr.right;
		}
		System.out.println();
		convertBTreeToDLL(root.left);
	}

	public static void levelOrderSprial(final Node root) {
		if (root == null) {
			return;
		}
		final Queue<Node> q = new LinkedList<>();
		Stack<Integer> s = new Stack();
		q.add(root);
		q.add(null);
		boolean onStack = true;
		while (!q.isEmpty()) {
			final Node temp = q.remove();
			if (temp == null) {
				if (onStack) {
					while (!s.isEmpty()) {
						System.out.println(s.pop());
					}
					s = new Stack();
					onStack = false;
				} else {
					onStack = true;
				}
				if (!q.isEmpty()) {
					q.add(null);
				}
			} else {
				if (onStack) {
					s.add(temp.data);
				} else {
					System.out.println(temp.data);
				}
				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}
			}
		}

	}

	public static void main(final String[] args) {

		final BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(13);
		tree.root.right.right = new Node(30);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.left = new Node(6);
		tree.root.left.right.right = new Node(7);

		// BinaryTree.printPaths(tree.root);

		// BinaryTree.printPathsSum(tree.root);
		// levelOrderSprial(tree.root);
		convertBTreeToDLL(tree.root);
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.right;
		}
	}

	/* Utility that prints out an array on a line */
	public static void printArray(final int ints[], final int len) {
		int i;
		for (i = 0; i < len; i++) {
			System.out.print(ints[i] + " ");
		}
		System.out.println("");
	}

	public static void printPaths(final Node node) {
		final List<Integer> list = new ArrayList();
		printPathsRecur(node, list);
	}

	/*
	 * Recursive helper function -- given a node, and an array containing the
	 * path from the root node up to but not including this node, print out all
	 * the root-leaf paths.
	 */
	public static void printPathsRecur(final Node node, final List<Integer> list) {
		if (node == null) {
			return;
		}

		/* append this node to the path array */
		list.add(node.data);

		/* it's a leaf, so print the path that led to here */
		if (node.left == null && node.right == null) {
			System.out.println(list);
		} else {
			/* otherwise try both subtrees */
			printPathsRecur(node.left, list);
			list.remove(list.size() - 1);
			printPathsRecur(node.right, list);
			list.remove(list.size() - 1);
		}
	}

	public static void printPathsSum(final Node node) {
		final List<Integer> list = new ArrayList();
		printPathsSum(node, list);
	}

	public static void printPathsSum(final Node node, final List<Integer> list) {
		if (node == null) {
			return;
		}

		/* append this node to the path array */
		list.add(node.data);

		/* it's a leaf, so print the path that led to here */
		if (node.left == null && node.right == null) {
			System.out.println(list);
			final int sum = list.stream().mapToInt(Integer::intValue).sum();
			System.out.println(sum);
		} else {
			/* otherwise try both subtrees */
			printPathsSum(node.left, list);
			list.remove(list.size() - 1);
			printPathsSum(node.right, list);
			list.remove(list.size() - 1);
		}
	}

	Node root;
}

class Node {
	int data;
	Node left, right;

	Node(final int item) {
		data = item;
		left = right = null;
	}
}
