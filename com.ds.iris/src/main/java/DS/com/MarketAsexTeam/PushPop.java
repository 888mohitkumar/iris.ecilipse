package DS.com.MarketAsexTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PushPop {

	public static List<Integer> getResult(final List<Integer> items, final List<String> operations) {
		final List<Integer> result = new ArrayList();
		TreeSet<Integer> treeSet;
		final List<Integer> holding = new ArrayList<Integer>();
		for (final String operation : operations) {
			if (operation.equalsIgnoreCase("PUSH")) {
				holding.add(items.get(0));
			} else if (operation.equalsIgnoreCase("POP")) {
				holding.remove(items.get(0));
			} else {
				System.out.println("NOT Valid operation:::" + operation);
				break;
			}
			items.remove(0);
			treeSet = new TreeSet();
			treeSet.addAll(holding);

			result.add(treeSet.first() * treeSet.last());

		}
		for (final int i : result) {
			System.out.println(i);
		}
		return result;
	}

	public static void main(final String[] args) {
		final List<Integer> items = new ArrayList<Integer>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(1);
		final List<String> operations = new ArrayList<String>();
		operations.add("push");
		operations.add("push");
		operations.add("push");
		operations.add("push");
		operations.add("pop");
		getResult(items, operations);
	}
}
