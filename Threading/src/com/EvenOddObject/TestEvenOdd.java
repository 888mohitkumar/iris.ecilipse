package com.EvenOddObject;

class Temp
{
	int flag=1;
}


public class TestEvenOdd {
	
	public static void main(String[] args) {
		 //System.out.println("flag hash code main:::"+flag.hashCode());
		Temp temp = new Temp(); 
		EvenNumber evenNumber = new EvenNumber(temp);
		 OddNumber oddNumber = new OddNumber(temp);
		 evenNumber.start();
		 oddNumber.start();
	}

}
