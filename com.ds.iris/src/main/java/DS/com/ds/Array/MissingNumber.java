package DS.com.ds.Array;

public class MissingNumber {

	public static void main(final String[] args) {
		final int arr[] = { 1, 2, 3, 5, 6, 7 };
		missingNumber(arr);

	}

	private static void missingNumber(final int[] arr) {

		int xor1 = 0, xor2 = 0;
		for (int i = 1; i <= arr.length + 1; i++) {
			xor1 = xor1 ^ i;
		}

		for (final int element : arr) {
			xor2 = xor2 ^ element;
		}
		System.out.println("result is :::" + (xor1 ^ xor2));
	}

}
