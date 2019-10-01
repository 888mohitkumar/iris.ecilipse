package com.EvenOdd;

public class OddNumber extends Thread{

	private Integer flag;
	public OddNumber(Integer flag) {
		this.flag=flag;
		//System.out.println("flag hash code OddNumber:::"+flag.hashCode());
	}
	@Override
	public void run()
	{
		System.out.println("RUN ODD number ");
		for(int i=1; i<2000; i=i+2)
		{
			synchronized (flag) 
			{
				while(flag==2)
				{
					try {

						System.out.println("Wait Odd number");
						flag.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd::::"+i);
				flag=2;
				flag.notify();
			}	
		}
	}
}
