package com.EvenOdd;

public class TestEvenOdd {
	public static volatile Integer flag = new Integer(1);
	public static void main(String[] args) {
		 //System.out.println("flag hash code main:::"+flag.hashCode());
		 EvenNumber evenNumber = new EvenNumber(flag);
		 OddNumber oddNumber = new OddNumber(flag);
		 evenNumber.start();
		 oddNumber.start();
	}

}
