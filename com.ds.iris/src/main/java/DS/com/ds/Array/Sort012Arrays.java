package DS.com.ds.Array;

public class Sort012Arrays {

	public static void main(final String[] args) {
		final int arr[] = { 2, 1, 1, 2, 0, 2, 0, 1, 0, 1, 2, 0 };
		sort012Arrays2(arr);
	}

	private static void sort012Arrays(final int[] arr) {
		int low, mid, high, temp;
		low = -1;
		high = arr.length;
		mid = 0;
		while (mid < high) {
			if (arr[mid] == 0) // swapping
			{
				temp = arr[low + 1];
				arr[low + 1] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;

			} else if (arr[mid] == 1) // no action
			{
				mid++;
			} else if (arr[mid] == 2) // swapping
			{
				temp = arr[high - 1];
				arr[high - 1] = arr[mid];
				arr[mid] = temp;
				high--;
			} else {
				System.out.println("here other then 0,1,2 element");
				break;
			}
		}

		for (final int element : arr) {
			System.out.println(element);
		}

	}

	private static void sort012Arrays2(final int[] arr) {
		int low, mid, high, temp;
		low = -1;
		high = arr.length;
		mid = 0;
		while (mid < high) {
			switch (arr[mid]) {
			case 0: // swapping
			{
				temp = arr[low + 1];
				arr[low + 1] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;

			}
			case 1: // no action
			{
				mid++;
				break;
			}
			case 2: // swapping
			{
				temp = arr[high - 1];
				arr[high - 1] = arr[mid];
				arr[mid] = temp;
				high--;
				break;
			}
			default: {
				System.out.println("here other then 0,1,2 element");
				break;
			}
			}
		}

		for (final int element : arr) {
			System.out.println(element);
		}

	}

}
