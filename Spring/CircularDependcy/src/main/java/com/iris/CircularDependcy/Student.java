package com.iris.CircularDependcy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class Student implements  BeanFactoryAware,BeanNameAware,ApplicationContextAware{
	int id;
	public Student()
	{
		System.out.println("In constructer");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("In properties Set method");
		this.id = id;
		
	}
	public void setBeanName(String arg0) {
		System.out.println("In BeanNameAware  method :::"+arg0);
		
	}
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("In BeanFactoryAware  method ::"+arg0);
		
	}
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("In ApplicationContextAware awre method");
		
	}
	public void details()
	{
		System.out.println("method call");
	}
	
	public void init()
	{
		System.out.println("In init method");
	}

	public void destroy()
	{
		System.out.println("In destroy method");
	}
	
}
