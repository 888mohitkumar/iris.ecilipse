package com.ThreadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {

	class RunningThreads extends Thread
	{
		public void run() 
		{
			System.out.println("Thread has start :::"+Thread.currentThread().getName());
			Runnable task;
			while(true)
			{
				synchronized (blockingQueue) {
					while(blockingQueue.isEmpty())
					{
						try {
							System.out.println("Blocking Queue is Empty and Thread is waiting::"+Thread.currentThread().getName());
							blockingQueue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					try {
						task= blockingQueue.take();
						task.run();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}	
	
	private BlockingQueue<Runnable> blockingQueue=null;
	private RunningThreads runningThreads[]=null;
	public CustomThreadPool(int size) {
		blockingQueue = new LinkedBlockingQueue<Runnable>(size);
		runningThreads = new RunningThreads[size];
		
		for(int i=0; i<size ; i++)
		{
			runningThreads[i]= new RunningThreads();
			runningThreads[i].setName("Thread-"+(i+1));
			runningThreads[i].start();
		}
	}
	
	public void execute(Runnable task)
	{
		synchronized (blockingQueue) {
			try {
				blockingQueue.put(task);
				blockingQueue.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		

	public static void main(String[] args) {
		CustomThreadPool customThreadPool = new CustomThreadPool(5);
		for(int i=0; i<25; i++){
			customThreadPool.execute(new MyTask(i+1));
		}
	}
	
}


class MyTask extends Thread
{
	int value;
	public MyTask(int value) {
		this.value=value;
	}
	public void run()
	{
		try
		{
			System.out.println("In run Method and value is ::"+value+" and thread name is ::"+Thread.currentThread().getName());
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
	}
}