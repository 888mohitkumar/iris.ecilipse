package DS.com.ds.Array;

public class KthLargestElement {

	private static int getPivot(final int[] arr, int start, final int end) {
		int pos = start, temp;
		while (start < end) {
			if (arr[start] < arr[end]) {
				temp = arr[pos];
				arr[pos] = arr[start];
				arr[start] = temp;
				pos++;
			}
			start++;
		}
		temp = arr[pos];
		arr[pos] = arr[end];
		arr[end] = temp;
		return pos;
	}

	public static void main(final String[] args) {
		final int arr[] = { 1, 4, 2, 3, 8, 9, 10, 5, 6, 11, 80, 79 };
		myKthLargestElement(arr, 0, arr.length - 1, 5);
		for (final int element : arr) {
			System.out.print(element + " , ");
		}
	}

	private static void myKthLargestElement(final int[] arr, final int start, final int end, final int k) {
		if (start < end) {
			final int pivot = getPivot(arr, start, end);

			printArray(arr, pivot);

			myKthLargestElement(arr, start, pivot - 1, k);
			myKthLargestElement(arr, pivot + 1, end, k);
		}
	}

	private static void printArray(final int arr[], final int pivot) {
		System.out.println("pivot is :::" + pivot);
		System.out.println("value of pivot :::" + arr[pivot]);
		for (int i = 0; i <= pivot; i++) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println();
	}

}
