package com.iris.CircularDependcy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	B b;

	
	public A()
	{
		System.out.println("A class Constructer");
	}
	
	public B getB() {
		return b;
	}

	@Autowired
	public void setB(B b) {
		this.b = b;
	}
	
	public void helloA()
	{
		System.out.println("Hello A");
	}
}
