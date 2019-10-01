package DS.com.ds.Array;

public class SubArrayWithGivenSum {

	public static void main(final String[] args) {
		final int arr[] = { 1, 4, 0, 0, 3, 10, 5 };
		mySubArrayWithGivenSum(arr, 7);
	}

	private static void mySubArrayWithGivenSum(final int[] arr, final int sum) {

		int local = 0, index = 0;
		for (int i = 0; i < arr.length; i++) {
			local += arr[i];
			while (index <= i && local > sum) {
				local -= arr[index];
				index++;
			}
			if (sum == local) {
				System.out.println("start index is ::" + index);
				System.out.println("END   index is ::" + i);
			}
		}
	}
}
