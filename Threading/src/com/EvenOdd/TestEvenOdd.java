package com.EvenOdd;

public class TestEvenOdd {
	public static boolean starting = true;
	public static void main(String[] args) {
		  
		 //System.out.println("flag hash code main:::"+flag.hashCode());
		final Object mutex = new Object();
		 EvenNumber evenNumber = new EvenNumber(mutex);
		 OddNumber oddNumber = new OddNumber(mutex);
		 evenNumber.setName("EvenThread");
		 oddNumber.setName("oddThread");
		 evenNumber.start();
		 oddNumber.start();
	}

}
