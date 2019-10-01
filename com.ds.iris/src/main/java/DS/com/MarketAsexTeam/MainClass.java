package DS.com.MarketAsexTeam;

abstract class Distance {
	int feet;
	int inch;

	abstract public int compareDistance(Distance distance);

	abstract public void setFeet(int feet);

	abstract public void setInch(int inch);
}

class DistanceImplementation extends Distance {

	@Override
	public int compareDistance(final Distance distance) {
		final int result1 = inch + feet * 12;
		final int result2 = distance.inch + distance.feet * 12;
		return result1 - result2;
	}

	@Override
	public void setFeet(final int feet) {
		this.feet = feet;

	}

	@Override
	public void setInch(final int inch) {
		this.inch = inch;
	}

}

public class MainClass {

	public static void main(final String[] args) {
		final DistanceImplementation dis1 = new DistanceImplementation();
		dis1.setFeet(2);
		dis1.setInch(15);

		final DistanceImplementation dis2 = new DistanceImplementation();
		dis2.setFeet(3);
		dis2.setInch(1);

		System.out.println(dis1.compareDistance(dis2));

	}

}
