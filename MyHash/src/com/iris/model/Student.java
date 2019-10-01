package com.iris.model;

import java.util.Collections;

public class Student {
	int id;
	String name;
	String fname;
		
	public Student(int id, String name, String fname) {
		super();
		this.id = id;
		this.name = name;
		this.fname = fname;
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
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Override
	public String toString()
	{
		return "id::"+id+"	name::"+name+"	fname::"+fname;
	}
	@Override
	 public int hashCode() 
	 { 	
		int r=0;
		r=31+id;
		r=r+((name==null)?0:name.hashCode());
		r=r+((fname==null)?0:fname.hashCode());
		return r;
	 }
	
	@Override
	public boolean equals(Object O)
	{
		if(O instanceof Student )
		{
					
			Student s1 = this;
			Student s2 = (Student)O;
			if(s1==s2)
			{
				return true;
			}
			else
			{
								
	

				if((s1.id==s2.id)&&(s1.name.equals(s2.name))&&(s1.fname.equals(s2.fname)))
				{
					return  true;
				}
				
				/*			if(!(s1.id==s2.id)) {
					return false;
				}
				
				if((s1.name==null && s2.name!=null) || (s1.name!=null && s2.name==null)) {
					return false;
				}
				else if(!(s1.name.equals(s2.name)))
				{
					return false;
				}
				
				if((s1.fname==null && s2.fname!=null) || (s1.fname!=null && s2.fname==null)) {
					return false;
				}
				else if(!(s1.fname.equals(s2.fname)))
				{
					return false;
				}
				*/
				

				
				
				/*boolean result_name=false;
				boolean result_fname=false;
				//compare name for both reference
				if(s1.name!=null&&s2.name!=null)
				{
					result_name = s1.name.equals(s2.name);
				}
				else if(s1.name!=null||s2.name!=null)
				{
					result_name=false;
				}
				else
				{
					result_name=true;
				}
				//compare fname for both reference
				if(s1.fname!=null&&s2.fname!=null)
				{
					result_fname = s1.fname.equals(s2.fname);
				}			
				else if(s1.fname!=null||s2.fname!=null)
				{
					result_name=false;
				}				
				else
				{
					result_fname = true;
				}
				return result_name&&result_fname;*/
				
			}
		}
		//return true;
		return false;
	}
			
}
