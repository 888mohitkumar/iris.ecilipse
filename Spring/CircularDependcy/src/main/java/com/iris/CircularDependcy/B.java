package com.iris.CircularDependcy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	A a;

	
	public B()
	{
		System.out.println("B class Constructer");
	}
	public A getA() {
		return a;
	}
	
	@Autowired
	public void setA(A a) {
		this.a = a;
	}
	
	public void helloB()
	{
		System.out.println("Hello B");
	}	
	
}
