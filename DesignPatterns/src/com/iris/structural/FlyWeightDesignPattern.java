package com.iris.structural;

import java.util.HashMap;

class Circle1 implements Shape
{

	private int radious;
	private String color;
	
	public Circle1(int radious, String color) {
		super();
		this.radious = radious;
		this.color = color;
		
	}

	public void draw() {
			System.out.println("Radious of circle is :::"+radious);
			System.out.println("color   of circle is :::"+color);
	}
	
}


class CircleFactory
{
	public static final HashMap<String , Shape> hm =  new HashMap<>();
	
	public static Circle1 getCircle(int radious , String color)
	{
		Circle1 circle = (Circle1) hm.get(color);
		if(circle==null)
		{
			circle = new Circle1(radious, color);
			circle.draw();
			hm.put(color, circle);
			System.out.println("NEW CIRCLE IS DRAW HERE");
		}
		else
		{
			System.out.println("already exit circle");
		}
		return circle;
	}
}


public class FlyWeightDesignPattern {

	public static void main(String[] args) {
		Circle1 cicle1 = CircleFactory.getCircle(5, "red");
		Circle1 cicle2 = CircleFactory.getCircle(5, "red");
		Circle1 cicle3 = CircleFactory.getCircle(5, "blue");
	}

}
