package DS.com.ds.Array;

public class PrintAllSubset {

	public static void knapsack(final int value[], final int weight[], final int capacity) {
		final int total_subset = (int) Math.pow(2, value.length);
		int current_weight, current_value;
		int max_weight = Integer.MIN_VALUE;
		int max_value = Integer.MIN_VALUE;
		for (int i = 0; i < total_subset; i++) {
			current_weight = current_value = 0;
			for (int j = 0; j < value.length; j++) {
				final int result = i & 1 << j;
				if (result != 0) {
					current_weight += weight[j];
					current_value += value[j];
				}
			}
			if (current_weight <= capacity && current_weight > max_weight) {
				max_weight = current_weight;
				max_value = current_value;
			}
		}
		System.out.println("Max value is ::::" + max_value);
	}

	public static void main(final String[] args) {

		// prinAllSubSet(new int[] { 1, 2, 3 });
		final int val[] = new int[] { 60, 100, 120 };
		final int wt[] = new int[] { 10, 20, 30 };
		knapsack(val, wt, 50);
	}

	public static void prinAllSubSet(final int[] arr) {
		final int total = (int) Math.pow(2, arr.length);
		for (int i = 0; i < total; i++) {
			System.out.print("{");
			for (int j = 0; j < arr.length; j++) {
				final int result = i & 1 << j;
				if (result != 0) {
					System.out.print(arr[j] + ",");
				}
			}
			System.out.println("}");
		}
	}

}
