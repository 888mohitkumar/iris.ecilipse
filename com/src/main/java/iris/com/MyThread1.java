package iris.com;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread1 implements Runnable {

	CyclicBarrier cb;

	MyThread1(final CyclicBarrier cb) {
		this.cb = cb;
	}

	public void run() {
		System.out.println("Thread  is going to start::" + Thread.currentThread().getName());
		try {
			cb.await();
		} catch (final InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread is going to end:::" + Thread.currentThread().getName());
	}

}
