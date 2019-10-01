package DS.com.MarketAsexTeam;

import java.util.Arrays;
import java.util.List;

class Result {

	static class Interval {
		int buy;
		int sell;
	}

	public static void main(final String arg[]) {
		List<Integer> list;
		// list = Arrays.asList(3, 4, 5, 3, 15, 2);
		list = Arrays.asList(5, 4, 3, 4, 5);
		final long result = maximumProfit(list);
		System.out.println(result);
	}

	public static long maximumProfit(final List<Integer> price) {
		long profit = 0L;
		final int max = Integer.MIN_VALUE;
		int buy, sell;
		for (int i = 0; i < price.size(); i++) {
			buy = price.get(i);
			sell = Integer.MIN_VALUE;
			for (int j = i + 1; j < price.size(); j++) {
				if (sell < price.get(j)) {
					sell = price.get(j);
				}
			}
			System.out.println("value of i>>>" + i);
			System.out.println("buy>>>" + buy);
			System.out.println("sell>>>" + sell);
			System.out.println("-----------------------------------");
			if (sell > Integer.MIN_VALUE && sell > buy) {
				profit = profit + (sell - buy);
			}
		}
		return profit;
	}

}