package com.ds.Stack;

import java.util.Stack;

public class StackReverse {

	public static void main(final String[] args) {
		final Stack<Integer> s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		System.out.println(s);
		stackReverse(s);
		System.out.println(s);
	}

	private static void pushAtLast(final Stack<Integer> s, final int value) {
		if (s.isEmpty()) {
			s.push(value);
			return;
		}
		final int temp = s.pop();
		pushAtLast(s, value);
		s.push(temp);

	}

	private static void stackReverse(final Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		final int temp = s.pop();
		stackReverse(s);
		pushAtLast(s, temp);
	}

}
