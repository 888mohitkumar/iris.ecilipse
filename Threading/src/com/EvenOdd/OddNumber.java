package com.EvenOdd;

public class OddNumber extends Thread{

	Object flag;
	
	public OddNumber(Object flag) {
		this.flag = flag;
	}
	@Override
	public void run()
	{
		//System.out.println("RUN ODD number ");
		for(int i=1; i<2000; i=i+2)
		{
			synchronized (flag) 
			{
				while(TestEvenOdd.starting==true)
				{
					try {

						//System.out.println("Wait Odd number");
						flag.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				TestEvenOdd.starting = true;
				//System.out.println("ODD" + TestEvenOdd.flag.hashCode());
				flag.notifyAll();
			}	
		}
	}
}
