package com.iris;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {
	
	
	public static void main(String arg[])
	{
		//myThreadAnnonimus();
		//myThreadFunctionalInterface();
		List<String> nameList = new ArrayList<>();
		nameList.add("amit");
		nameList.add("nitin");
		nameList.add("vineet");
		nameList.forEach(new Consumer<String>() 
												{
													@Override
													public void accept(String t) 
													{
														System.out.println(t);
													}
												}
						);
		System.out.println("-----------------------------------------------------------1--");
		nameList.forEach((String t) ->{ System.out.println(t);});
		
		System.out.println("-----------------------------------------------------------2--");
		nameList.forEach(( t) ->{ System.out.println(t);});

		System.out.println("-----------------------------------------------------------3--");
		nameList.forEach(( t) -> System.out.println(t));
		
		System.out.println("---------accessing functional interface using method reference----------4--");
		nameList.forEach(System.out::println);		
		
	}

	private static void myThreadAnnonimus() {
		Runnable r = new Runnable(){
			public void run()
			{
				
			}
		};
	}

	private static void myThreadFunctionalInterface() {
		
		Runnable r = () ->{System.out.println("my myThreadFunctionalInterface");};
		
		Thread t = new Thread(r);
		t.start();
	}
}
