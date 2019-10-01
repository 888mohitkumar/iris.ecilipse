package DS.com.ds.Array;

public class Largest3element {

	private static void Largest3element(final int[] arr) {
		int first, second, third;
		first = second = third = Integer.MIN_VALUE;
		for (final int element : arr) {
			if (element > first) {
				third = second;
				second = first;
				first = element;
			} else if (element > second) {
				third = second;
				second = element;
			} else if (element > third) {
				third = element;
			}
		}
		System.out.println("First is :::" + first);
		System.out.println("Second is :::" + second);
		System.out.println("third is :::" + third);
	}

	public static void main(final String[] args) {
		final int arr[] = { 100, 2, 5, 6, 7, 89, 65, 3, 76, 55, 54, 87, 90, 43 };
		Largest3element(arr);
	}

}
