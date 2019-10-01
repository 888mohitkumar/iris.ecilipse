package com.ThreadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {
	class RunningThreads extends Thread {
		@Override
		public void run() {
			System.out.println("Thread has start :::" + Thread.currentThread().getName());
			while (true) {
				try {
					blockingQueue.take().run();
				} catch (final InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(final String[] args) {
		final CustomThreadPool customThreadPool = new CustomThreadPool(5);
		for (int i = 0; i < 25; i++) {
			customThreadPool.execute(new MyTask(i + 1));
		}
	}

	private BlockingQueue<Runnable> blockingQueue = null;

	private RunningThreads runningThreads[] = null;

	public CustomThreadPool(final int size) {
		blockingQueue = new LinkedBlockingQueue<>(100);
		runningThreads = new RunningThreads[size];

		for (int i = 0; i < size; i++) {
			runningThreads[i] = new RunningThreads();
			runningThreads[i].setName("Thread-" + (i + 1));
			runningThreads[i].start();
		}
	}

	private void closeAll() {
		while (blockingQueue.isEmpty()) {
			for (final RunningThreads runningThread : runningThreads) {
				runningThread.interrupt();
			}
		}

	}

	public synchronized void execute(final Runnable task) {
		try {
			blockingQueue.put(task);
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class MyTask extends Thread {
	int value;

	public MyTask(final int value) {
		this.value = value;
	}

	@Override
	public void run() {
		try {
			System.out.println("In run Method and value is ::" + value + " and thread name is ::"
					+ Thread.currentThread().getName());
			Thread.sleep(3000);
		} catch (final Exception e) {

		}
	}
}