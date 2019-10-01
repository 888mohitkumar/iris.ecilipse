package com.producerconsumerAL;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	
	List<Integer> list;
	public Producer(List<Integer> list) {
		this.list=list;
	}
	
	@Override
	public void run()
	{
		int value=0;
		while(true)
		{
			synchronized (list) {
				while(list.size()>=16)
				{
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					System.out.println("Produce::"+value);
					list.add(value);
					value = value+1;
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
