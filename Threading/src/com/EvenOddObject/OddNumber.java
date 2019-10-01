package com.EvenOddObject;

public class OddNumber extends Thread{

	private Temp temp;
	public OddNumber(Temp temp) {
		this.temp=temp;
		//System.out.println("flag hash code OddNumber:::"+flag.hashCode());
	}
	@Override
	public void run()
	{
		System.out.println("RUN ODD number ");
		for(int i=1; i<2000; i=i+2)
		{
			synchronized (temp) 
			{
				while(temp.flag==2)
				{
					try {

						System.out.println("Wait Odd number");
						temp.wait(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd::::"+i);
				temp.flag=2;
				temp.notify();
			}	
		}
	}
}
