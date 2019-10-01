package com.EvenOdd;

public class EvenNumber extends Thread{

	Object flag;

	public EvenNumber(Object flag) {
		this.flag = flag;
	}
	@Override
	public void run()
	{
		//System.out.println("RUN even number ");
		for(int i=0; i<2000; i=i+2)
		{
			synchronized (flag) 
			{
				while(TestEvenOdd.starting == false)
				{
					try {
						//System.out.println("Wait EVEN number");
						flag.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				TestEvenOdd.starting=false;
				//System.out.println("EVEN" + TestEvenOdd.flag.hashCode());
				flag.notifyAll();
			}	
		}
	}
}
