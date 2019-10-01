package com.iris;

public class ClientTest 
{
	public static void main(String[] args) 
	{
		Runnable r = () ->
		    {
				System.out.println("My lambda expression");
				
			};
		
		
		Thread t = new Thread(r);
		t.start();
		
		MyInterface mi = new MyInterface() {
			public void test() {
				System.out.println("here test of my interface");
				
			}
		};
		
		mi.test();
		
		System.out.println("---------------------------------------------------------");
		MyInterface mi2 = () -> 
				System.out.println("here test of my interface");
				;	
		mi2.test();

		System.out.println("---------------------------------------------------------");
		
		MyInterface2 mi22 = (String name)->
		{
			System.out.println("here name is :"+name);
			return "hello"+name;
		};
		
		System.out.println(mi22.method("LUCKY"));
		
     }
}	
