package com.iris.behaviour;

import java.util.ArrayList;

interface Command
{
	public void execute();
}

class Stock
{
	public void sellStock()
	{
		System.out.println("Sell Stock");
	}
	
	public void buyStock()
	{
		System.out.println("Buy Stock");
	}	
}


class SellStock implements Command
{

	Stock stock ;
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	@Override
	public void execute() {
		stock.sellStock();
	}
	
}

class BuyStock implements Command
{

	Stock stock ;
	public BuyStock(Stock stock) {
		this.stock = stock;
	}
	@Override
	public void execute() {
		stock.buyStock();
	}
	
}


class Broker
{
	ArrayList<Command> al = new ArrayList<Command>();
	public void addCommand(Command command) {
		al.add(command);
	}
	
	public void executeCommand()
	{
		for(Command command : al)
		{
			command.execute();
		}
	}
}

public class CommandDesign {

	public static void main(String[] args) {
		Stock stock = new Stock();
		SellStock sellStock = new SellStock(stock);
		BuyStock buyStock = new BuyStock(stock);
		
		Broker broker = new Broker();
		broker.addCommand(buyStock);
		broker.addCommand(sellStock);
		
		broker.executeCommand();
	}

}
