package com.iris.creational;

class Employee implements Cloneable
{
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
	
	public Employee getPrototype()
	{
		Employee emp=null;
		try {
			emp =(Employee)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public String toString()
	{
		return "is ::"+id +":: name "+name;
	}
	
}


public class Prototype {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Ram");
		System.out.println(emp);
		
		System.out.println(emp.getPrototype());
	}
}
