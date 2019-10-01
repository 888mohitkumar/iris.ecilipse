class Bulb_Red {
	public volatile int state = 0;
}

public class BulbOnOff2Thread {

	public static void main(final String[] args) {
		final Bulb_Red bulb = new Bulb_Red();

		final PersonOFF person_off[] = new PersonOFF[20];
		for (int i = 0; i < person_off.length; i++) {
			person_off[i] = new PersonOFF(bulb);
			person_off[i].setName("OFFThread-" + (i + 1));
			person_off[i].start();
		}

		final PersonON person_on[] = new PersonON[20];
		for (int i = 0; i < person_on.length; i++) {
			person_on[i] = new PersonON(bulb);
			person_on[i].setName("ONThread-" + (i + 1));
			person_on[i].start();
		}

	}

}

class PersonOFF extends Thread {

	Bulb_Red bulb;

	PersonOFF(final Bulb_Red bulb) {
		this.bulb = bulb;
	}

	@Override
	public void run() {
		synchronized (bulb) {
			while (bulb.state == 0) {
				try {
					bulb.wait();
				} catch (final InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("ONN          BULB is off so nedd to OFF:::" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (final InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bulb.state = 0;
			bulb.notifyAll();
		}
	}

}

class PersonON extends Thread {

	Bulb_Red bulb;

	PersonON(final Bulb_Red bulb) {
		this.bulb = bulb;
	}

	@Override
	public void run() {
		synchronized (bulb) {
			while (bulb.state == 1) {
				try {
					bulb.wait();
				} catch (final InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("OFF          BULB is off so nedd to ON:::" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (final InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bulb.state = 1;
			bulb.notifyAll();
		}
	}

}
