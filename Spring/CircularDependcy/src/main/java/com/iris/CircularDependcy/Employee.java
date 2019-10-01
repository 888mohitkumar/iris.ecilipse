package com.iris.CircularDependcy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Controller
//@ComponentScan(basePackages = "com.iris.CircularDependcy")
public class Employee {

	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
	
	public Employee()
	{
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void hello()
	{
		System.out.println("in Employee");
	}
	
	@Bean
	public Hello getHello()
	{
		return new Hello();
	}
}
