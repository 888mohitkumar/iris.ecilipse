package com.producerconsumerAL;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
	
	List<Integer> list;
	public Consumer(List<Integer> list) {
		this.list=list;
	}
	
	@Override
	public void run()
	{
		int value=0;
		while(true)
		{
			synchronized (list) {
				while(list.size()==0)
				{
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					System.out.println("Consumer::"+list.remove(0));
					//list.add(value++);
					Thread.sleep(1000);
					list.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}