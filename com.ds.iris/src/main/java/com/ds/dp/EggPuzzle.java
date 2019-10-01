package com.ds.dp;

public class EggPuzzle {

	static int eggDrop(final int n, final int k) {
		// If there are no floors, then
		// no trials needed. OR if there
		// is one floor, one trial needed.
		System.out.println("hello");
		if (k == 1 || k == 0) {
			return k;
		}

		// We need k trials for one egg
		// and k floors
		if (n == 1) {
			return k;
		}

		int min = Integer.MAX_VALUE;
		int x, res;

		// Consider all droppings from
		// 1st floor to kth floor and
		// return the minimum of these
		// values plus 1.
		for (x = 1; x <= k; x++) {
			res = Math.max(eggDrop(n - 1, x - 1), eggDrop(n, k - x));
			if (res < min) {
				min = res;
			}
		}

		return min + 1;
	}

	public static void main(final String[] args) {
		final int n = 2, k = 100;
		System.out.print("Minimum number of " + "trials in worst case with " + n + " eggs and " + k + " floors is "
				+ eggDrop(n, k));
	}
}
