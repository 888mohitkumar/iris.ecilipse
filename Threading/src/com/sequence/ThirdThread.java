package com.sequence;

public class ThirdThread extends Thread{

	private Temp temp;
	public ThirdThread(Temp temp) {
		this.temp=temp;
		//System.out.println("flag hash code EvenNumber:::"+flag.hashCode());
	}
	@Override
	public void run()
	{
		//System.out.println("RUN even number ");
		for(int i=3; i<2000; i=i+3)
		{
			synchronized (temp) 
			{
				while(temp.flag!=3)
				{
					try {
						//System.out.println("Wait EVEN number");
						temp.wait(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Third:::"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				temp.flag=1;
				temp.notifyAll();
			}	
		}
	}
}
