package com.iris.behaviour;

interface Strategy
{
	public void doOperation();
}


class Air implements Strategy
{
	public void doOperation()
	{
		System.out.println("Operation is by done INDIA AIR FORCE");
	}
}


class Navy implements Strategy
{
	public void doOperation()
	{
		System.out.println("Operation is done by INDIA NAVY FORCE");
	}
}

class Army implements Strategy
{
	public void doOperation()
	{
		System.out.println("Operation is done by INDIA Army");
	}
}

class Action 
{
	Strategy stratey;
	public void doAction(Strategy strategy)
	{
		this.stratey=strategy;
		strategy.doOperation();
	}
}


public class StrategyDesign {
	public static void main(String[] args) {
		Action action = new Action();
		Strategy army = new Army();
		action.doAction(army);
	}
}
 