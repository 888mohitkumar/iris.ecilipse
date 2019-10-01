package com.iris.structural;

import java.util.TreeMap;
import java.util.TreeSet;

interface Shape
{
	public void draw();
}

class Circle implements Shape
{
   public void draw() {
		System.out.println("Circle draw method is called");
	}
}


class Square implements Shape
{
   public void draw() {
		System.out.println("Square draw method is called");
	}
}


interface ColorBoudry extends Shape
{
	public void putColor();
}

class ColorBoudryCircle implements ColorBoudry
{
	Shape shape;
	
	public ColorBoudryCircle(Shape shape) {
		this.shape=shape;
	}
	@Override
	public void draw() {
		shape.draw();
		putColor();
	}
	public void putColor()
	{
		System.out.println("Color boundary");
	}
	
}

public class DecoratorPattern {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		
		ColorBoudryCircle colorBoudryCircle = new ColorBoudryCircle(circle);
		colorBoudryCircle.draw();

		TreeMap tm = new TreeMap<>();
		//tm.put(null, "ram");
		
		System.out.println("hello");
		TreeSet ts = new TreeSet();
		ts.add(null);
	}

}
