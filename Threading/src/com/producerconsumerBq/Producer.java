package com.producerconsumerBq;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	
	BlockingQueue<Integer> bq;
	public Producer(BlockingQueue<Integer> bq) {
		this.bq=bq;
	}
	
	@Override
	public void run()
	{
		int value=0;
		while(true)
		{
			try {
				System.out.println("Produce::"+value);
				bq.put(value++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
