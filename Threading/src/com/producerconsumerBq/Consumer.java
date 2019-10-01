package com.producerconsumerBq;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
	
	BlockingQueue<Integer> bq;
	public Consumer(BlockingQueue<Integer> bq) {
		this.bq=bq;
	}
	
	@Override
	public void run()
	{
		int value=0;
		while(true)
		{
			try {
				value = bq.take();
				System.out.println("Consumer::"+value);
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
