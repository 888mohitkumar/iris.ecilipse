package com.isis.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.isis.model.Student;

public class ComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "rohit");
		Student s2 = new Student(2, "amit");
		Student s3 = new Student(3, "mohit");
		
		List <Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		//studentList.forEach((s)->System.out.println(s));
		//studentList.forEach(System.out::print);
		
/*		studentList.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});*/
		
		studentList.sort((ss1,ss2)->(ss1.getName().compareTo(ss2.getName())));
		
		studentList.forEach(System.out::print);
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(1);
		Stream stream = arrayList.stream();
		Stream distinct = stream.distinct();
		long count = stream.count();
		System.out.println(count);
		
	}

}
