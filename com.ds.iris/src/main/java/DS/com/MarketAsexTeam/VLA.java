package DS.com.MarketAsexTeam;

import java.util.Arrays;
import java.util.Comparator;

public class VLA implements Comparator<VLA> {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final VLA[] vla = { new VLA(40), new VLA(200), new VLA(60) };

		for (final VLA v : vla) {
			System.out.print(v.dishSize + ",");
		}
		System.out.print("____________________________________________________________");
		/// Arrays.sort(vla, new VLA(10));
		final int index = Arrays.binarySearch(vla, new VLA(60), vla[0]);

		System.out.println(index + " ");

		/// Arrays.sort(vla);
		// Arrays.sort(vla, new VLA(10));
		System.out.print("____________________________________________________________");
		for (final VLA v : vla) {
			System.out.print(v.dishSize + ",");
		}

		Arrays.sort(vla, vla[0]);
		for (final VLA v : vla) {
			System.out.print(v.dishSize + " ");
		}

		final int index1 = Arrays.binarySearch(vla, new VLA(60), vla[0]);
		System.out.print(index1);
	}

	int dishSize;

	VLA(final int dishSize) {
		this.dishSize = dishSize;
	}

	@Override
	public int compare(final VLA a, final VLA b) {
		return a.dishSize - b.dishSize;
	}

}
