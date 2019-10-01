package DS.com.ds.Array;

public class QuickSort {

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
		final int arr[] = { 1, 4, 2, 3, 8, 9, 10, 5, 6, 11 };
		myQuickSort(arr, 0, arr.length - 1);
		for (final int element : arr) {
			System.out.println(element);
		}
	}

	private static void myQuickSort(final int[] arr, final int start, final int end) {
		if (start < end) {
			final int pivot = getPivot(arr, start, end);
			myQuickSort(arr, start, pivot - 1);
			myQuickSort(arr, pivot + 1, end);
		}
	}

}
