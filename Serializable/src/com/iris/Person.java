package com.iris;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Person extends Employee{
	
	String company;
	public Person()
	{
		
	}
	
	public Person(String company)
	{
		this.company=company;
	}
	
	@Override
	public String toString()
	{
		return "company name is :"+company;
	}
	
	
}
