package com.sequence;

public class SecondThread extends Thread{

	private Temp temp;
	public SecondThread(Temp temp) {
		this.temp=temp;
		//System.out.println("flag hash code EvenNumber:::"+flag.hashCode());
	}
	@Override
	public void run()
	{
		//System.out.println("RUN even number ");
		for(int i=2; i<2000; i=i+3)
		{
			synchronized (temp) 
			{
				while(temp.flag!=2)
				{
					try {
						//System.out.println("Wait EVEN number");
						temp.wait(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Second:::"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				temp.flag=3;
				temp.notifyAll();
			}	
		}
	}
}
