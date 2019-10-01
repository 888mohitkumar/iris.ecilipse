package com.ds.String;

import java.util.ArrayList;
import java.util.List;

public class MakePalendrome {

	public static void main(final String[] args) {
		makePalendrome("cabcjkyhnm");
	}

	public static int makePalendrome(final String str) {
		final List<Character> list = new ArrayList();
		for (final char ch : str.toCharArray()) {
			list.add(ch);
		}
		int start = 0;
		int end = str.length() - 1;
		int count = 0;
		while (start <= end) {
			System.out.println(list);
			System.out.println("start ::" + start);
			System.out.println("end ::" + end);
			System.out.println("--------------------------------");
			if (list.get(start) != list.get(end)) {
				list.add(start, list.get(end));
				count++;
				// end--;
				start++;
			} else {
				start++;
				end--;
			}

		}
		return count;
	}

}
