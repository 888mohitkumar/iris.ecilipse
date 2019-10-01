package com.iris.CircularDependcy;

import org.springframework.stereotype.Component;

@Component
public class Temp {
	
	public Temp()
	{
		System.out.println("Temp class constructer ::::");
	}
	public void show()
	{
		System.out.println("in temp class and show function");
	}
}
