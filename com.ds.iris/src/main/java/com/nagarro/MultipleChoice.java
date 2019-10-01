package com.nagarro;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class MultipleChoice {

	static {
		final String name = "ram";
		final Student s = new Student();
		final MultipleChoice k = new MultipleChoice();
	}

	private static void case1() {
		final List<Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al.get(3));
	}

	private static void case2(final StringBuilder x, StringBuilder y) {
		x.append(y);
		y = x.append("c");
		y.append("d");

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	}

	public static void case3() {
		final List al = new ArrayList();
		al.add(100);
		al.add(1);
		al.add(1000);
		al.add(10);
		al.add(10000);
		al.add(10);
		System.out.println(al);
		final NavigableSet<Integer> s = new TreeSet(al);
		System.out.println(s);
		System.out.println(s.tailSet(100, false));
		System.out.println(s.tailSet(100));
		System.out.println(s.higher(100));
		System.out.println(s.pollFirst());
		System.out.println(s);

	}

	public static void main(final String[] args) {

		case3();
		/*
		 * final StringBuilder a = new StringBuilder("a"); final StringBuilder b
		 * = new StringBuilder("b"); case2(a, b); System.out.println(a +
		 * "---------" + b);
		 *
		 * // System.out.println("xyz".compareTo(new Student())); final Student
		 * s = new Student(); s.setPriority(100); s.start(); // method1(null);
		 * System.out.println("xyx".endsWith(" "));
		 */

		final List[] al = new ArrayList[2];
		al[0] = new ArrayList<Integer>();
		al[1] = new ArrayList<String>();
		System.out.println();

	}

	public static void method1(final Object o) {
		System.out.println("object");
	}

	public static void method1(final String o) {
		System.out.println("String");
	}

	public static void method1(final StringBuffer o) {
		System.out.println("StringBuffer");
	}

}

class Student extends Thread {
	@Override
	public void run() {
		System.out.println("hello");
	}
}
