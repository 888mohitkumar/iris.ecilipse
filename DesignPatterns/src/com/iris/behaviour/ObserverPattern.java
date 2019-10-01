package com.iris.behaviour;

import java.util.ArrayList;

interface Observer
{
	public void execute();
}

interface Observerable
{
	public void addobserver(Observer observer);
	public void removeObserver(Observer observer);
	public void allExecute();
}


class Bank implements Observerable
{
	private int rate ;
	private String name ;
	ArrayList<Observer> al = new ArrayList<Observer>();
	public Bank(int rate, String name) {
		super();
		this.rate = rate;
		this.name = name;
	}
	@Override
	public void addobserver(Observer observer) {
		
		al.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		al.remove(observer);
		
	}
	@Override
	public void allExecute() {
		
		for(Observer observer : al)
		{
			observer.execute();
		}
	}
	
	public void setRate(int rate)
	{
		this.rate = rate;
		allExecute();
	}
		
}

class Emedia implements Observer
{


	public void execute() {
		System.out.println("Print on electrical media that rate has increased");		
	}
	
}


class Papermedia implements Observer
{


	public void execute() {
		System.out.println("Print on Papermedia media that rate has increased");		
	}
	
}


public class ObserverPattern {

	public static void main(String[] args) {
		
		Observer emedia = new Emedia();
		Observer papermedia = new Papermedia();
		Bank bank = new Bank(10, "SBI");
		bank.addobserver(papermedia);
		bank.addobserver(emedia);
		bank.setRate(11);
		
	}

}
