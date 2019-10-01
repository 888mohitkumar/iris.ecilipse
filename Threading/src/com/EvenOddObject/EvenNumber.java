package com.EvenOddObject;

public class EvenNumber extends Thread{

	private Temp temp;
	public EvenNumber(Temp temp) {
		this.temp=temp;
		//System.out.println("flag hash code EvenNumber:::"+flag.hashCode());
	}
	@Override
	public void run()
	{
		System.out.println("RUN even number ");
		for(int i=2; i<2000; i=i+2)
		{
			synchronized (temp) 
			{
				while(temp.flag==1)
				{
					try {
						System.out.println("Wait EVEN number");
						temp.wait(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even:::"+i);
				temp.flag=1;
				temp.notify();
			}	
		}
	}
}
