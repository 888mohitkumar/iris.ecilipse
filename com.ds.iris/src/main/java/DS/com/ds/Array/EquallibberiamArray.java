package DS.com.ds.Array;

public class EquallibberiamArray {

	private static void equallibberiamArray(final int[] arr) {
		int total_sum = 0, curr_sum = 0;
		for (final int temp : arr) {
			total_sum = total_sum + temp;
		}
		System.out.println("sum of total array is ::" + total_sum);

		for (int i = 0; i < arr.length; i++) {
			curr_sum = curr_sum + arr[i];
			total_sum = total_sum - arr[i];
			if (curr_sum - arr[i] == total_sum) {
				System.out.println("index is :::" + i);
			}
		}
	}

	public static void main(final String[] args) {
		final int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		equallibberiamArray(arr);

	}

}
