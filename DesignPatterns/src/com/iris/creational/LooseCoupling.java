package com.iris.creational;

class Person
{
	public void operation()
	{
		System.out.println("Do operations::::::::::::");
	}
}

interface living
{
	public void operation();
}

class Human implements living
{

	@Override
	public void operation() {
		localOperation();
	}
	
	public void localOperation()
	{
		System.out.println("Local operation");
	}
}

public class LooseCoupling {

	living living;
	public void setOperation(living living)
	{
		this.living= living;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.operation();
		
		LooseCoupling looseCoupling = new LooseCoupling();
		looseCoupling.setOperation(new Human());
		looseCoupling.living.operation();
	}

}
