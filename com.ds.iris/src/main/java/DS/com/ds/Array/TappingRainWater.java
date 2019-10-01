package DS.com.ds.Array;

public class TappingRainWater {

	public static void main(final String[] args) {
		final int arr[] = { 3, 0, 0, 2, 0, 4 };
		tappingRainWater(arr);
	}

	private static void printArray(final int arr[]) {
		for (final int element : arr) {
			System.out.print(element + ",");
		}
		System.out.println();
	}

	private static void tappingRainWater(final int[] arr) {
		final int left_right[] = new int[arr.length];
		final int right_left[] = new int[arr.length];
		int max = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			max = Math.max(arr[i], max);
			left_right[i] = max;
		}
		printArray(arr);
		printArray(left_right);

		System.out.println("---------------------------------------");
		max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i], max);
			right_left[i] = max;
		}
		printArray(arr);
		printArray(right_left);

	}

}
