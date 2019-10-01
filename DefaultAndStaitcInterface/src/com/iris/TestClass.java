package com.iris;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.iris.model.Student;
import com.iris.myinterface.MyInterface;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new LinkedList();
		MyInterface.welcome("RAM RAM");
		Student s1 = new Student();
		s1.setAge(10);
		s1.setName("amit");

		Student s2 = new Student();
		s2.setAge(20);
		s2.setName("nitin");

		Student s3 = new Student();
		s3.setAge(30);
		s3.setName("jatin");
		List<Student> slist = new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		for (Student s : slist) {
			System.out.println(s.getName());
		}
		System.out.println(slist);
		InterfaceImpl impl = new InterfaceImpl();

		slist = impl.sortStudent(slist);
		System.out.println(slist);
		for (Student s : slist) {
			System.out.println(s.getName());
		}
	}

}
