package com.iris.myinterface;

import java.util.Collections;
import java.util.List;

import com.iris.model.Student;

public interface MyInterface {
	default public List<Student> sortStudent(List<Student> stList)
	{
		Collections.sort(stList);
		return stList;
	}
	
	static public void  welcome(String name)
	{
		System.out.println("wlcome :::"+name);
	}
	
	public void temp1();
	public abstract void temp2();
	
}
