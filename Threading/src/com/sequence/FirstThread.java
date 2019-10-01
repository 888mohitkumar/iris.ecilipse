package com.sequence;

public class FirstThread extends Thread{

	private Temp temp;
	public FirstThread(Temp temp) {
		this.temp=temp;
		//System.out.println("flag hash code OddNumber:::"+flag.hashCode());
	}
	@Override
	public void run()
	{
		//System.out.println("RUN ODD number ");
		for(int i=1; i<2000; i=i+3)
		{
			synchronized (temp) 
			{
				while(temp.flag!=1)
				{
					try {

						//System.out.println("Wait Odd number");
						temp.wait(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("First::::"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				temp.flag=2;
				temp.notifyAll();
			}	
		}
	}
}
