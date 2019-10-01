package com.sequence;

class Temp
{
	int flag=1;
}

public class Sequence {
	
	public static void main(String[] args) {
		 //System.out.println("flag hash code main:::"+flag.hashCode());
		Temp temp = new Temp(); 
		 SecondThread secondThread = new SecondThread(temp);
		 FirstThread firstThread = new FirstThread(temp);
		 ThirdThread thirdThread = new ThirdThread(temp);
		 firstThread.start();
		 secondThread.start();
		 thirdThread.start();
	}

}
