package com.sequenceExecution;

public class Main {

	public static void main(final String[] args) {
		final Thread t1 = new Thread(new MyThread());
		t1.setName("Thread -1");

		final Thread t2 = new Thread(new MyThread());
		t2.setName("Thread -2");

		final Thread t3 = new Thread(new MyThread());
		t3.setName("Thread -3");

		final Thread t4 = new Thread(new MyThread());
		t4.setName("Thread -4");

		try {

			t1.start();
			t1.join();
		} catch (final Exception ex) {

		}
		try {

			t2.start();
			t2.join();
		} catch (final Exception ex) {

		}
		try {

			t3.start();
			t3.join();
		} catch (final Exception ex) {

		}

		try {

			t4.start();
			t4.join();
		} catch (final Exception ex) {

		}
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (final InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("current thread name ::" + Thread.currentThread().getName());
	}

}
