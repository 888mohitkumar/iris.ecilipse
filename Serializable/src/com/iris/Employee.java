package com.iris;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Employee extends Human {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	int age;
	String name;
	//transient and static not going to save and default value will be return 
	 
	
	public Employee(int id, String name,int fingures) {
		super(fingures);
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
	@Override
	public String toString()
	{
		return "id ::"+id +"::name ::"+name +" fingures ::"+fingures;
	}
	
	
	private void writeObject(ObjectOutputStream out) throws IOException {
        //throw new IOException();
		//out.defaultWriteObject();
		System.out.println("wirte object");
        
    }
	private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException {
    	//throw new IOException();
    	//in.defaultReadObject();
    	System.out.println("read object");
    }
}
