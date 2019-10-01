package DS.com.ds.Array;

public class MaximumSumSubArray {

	public static void main(final String[] args) {
		final int[] a = { -2, -3, -4, -1, 2, -1, -5, -3 };
		MaximumSumSubArray(a);
	}

	private static void MaximumSumSubArray(final int[] arr) {
		int curr_sum = 0, old_sum = Integer.MIN_VALUE;
		for (final int element : arr) {
			curr_sum = curr_sum + element;
			if (curr_sum > old_sum) {
				old_sum = curr_sum;
			}

			if (curr_sum < 0) {
				curr_sum = 0;
			}
		}
		System.out.println("out put is ::" + old_sum);
	}

}
