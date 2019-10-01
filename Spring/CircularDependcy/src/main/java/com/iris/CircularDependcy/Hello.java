package com.iris.CircularDependcy;

public class Hello {
	private String name;
	private Student student;
	public Hello()
	{
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void printHello()
	{
		System.out.println("hello ! ::"+name);
	}
}
