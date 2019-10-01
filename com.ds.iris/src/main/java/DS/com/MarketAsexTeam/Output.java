package DS.com.MarketAsexTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Output {

	public static void main(final String[] args) {
		final Temp obj1 = new Temp(40);
		final Temp obj2 = new Temp(200);
		final Temp obj3 = new Temp(60);
		final List<Temp> list = new ArrayList();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		// Arrays.sort(list);

		Collections.sort(list);

		for (final Temp t : list) {
			System.out.println(t);
		}

	}

}

class Temp implements Comparable<Temp> {
	int value;

	public Temp(final int value) {
		super();
		this.value = value;
	}

	public int compareTo(final Temp o) {
		return value - o.value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(final int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Temp [value=" + value + "]";
	}

}
