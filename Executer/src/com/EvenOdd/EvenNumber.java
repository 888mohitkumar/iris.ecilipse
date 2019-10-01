package com.EvenOdd;

public class EvenNumber extends Thread{

	private Integer flag;
	public EvenNumber(Integer flag) {
		this.flag=flag;
		//System.out.println("flag hash code EvenNumber:::"+flag.hashCode());
	}
	@Override
	public void run()
	{
		System.out.println("RUN even number ");
		for(int i=2; i<2000; i=i+2)
		{
			synchronized (flag) 
			{
				while(flag==1)
				{
					try {
						System.out.println("Wait EVEN number");
						flag.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even:::"+i);
				flag=2;
				flag.notify();
			}	
		}
	}
}
