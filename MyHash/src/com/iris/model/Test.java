package com.iris.model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {

		Student student = new Student(1, "A", "FA");
		Map<Student,Integer> hm = new HashMap();
/*		hm.put(student, 11);
		hm.put(student, 22);
		hm.put(new Student(3, "C", "FC"), 33);
		hm.put(new Student(4, "D", "FD"), 44);*/
		hm.put(new Student(5, null, null), 55);
		hm.put(new Student(6, "na", null), 66);
		hm.put(new Student(7, null, "Fnc"), 77);
		hm.put(new Student(8, "nc", "Fnc"), 88);
		
		hm.forEach(new BiConsumer<Student, Integer>() {

			@Override
			public void accept(Student t, Integer u) {

				System.out.println(t);
				System.out.println(u);
				System.out.println("-----------------");
			}
		});
		Student student1 = new Student(6, "na", null);
		System.out.println(hm.get(student1));
		
		//hm.forEach((Student s,Integer i)->{System.out.println(s);System.out.println(i);System.out.println("----");});
		
	}

}
