package DS.com.ds.Array;

public class LeaderInArray {

	private static void leaderInArray(final int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println("LEADER is ::::" + max);
			}
		}
	}

	public static void main(final String[] args) {
		final int arr[] = { 16, 17, 4, 3, 5, 2 };
		leaderInArray(arr);
	}

}
