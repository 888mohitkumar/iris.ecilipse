package com.iris;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {
	 public static void main(String[] args) {
		 ArrayList<String> arrayList = new ArrayList();
		 
		 arrayList.add("11");
		 arrayList.add("211");

		 arrayList.add("31");
		 arrayList.add("411");

		 arrayList.add("52");
		 arrayList.add("611");
		 
		 
		 Stream<String> filter2 = arrayList.stream().filter((s)->(s.contains("11")));
		 filter2.forEach(System.out::println);
		 
		 
		 ArrayList<Integer> arrayList2 = new ArrayList();
		 
		 arrayList2.add(1);
		 arrayList2.add(2);

		 arrayList2.add(3);
		 arrayList2.add(4);

		 arrayList2.add(5);
		 arrayList2.add(6);
		 
		 
		 
		 Stream<Integer> filter = arrayList2.stream().filter((element)->(element <4));
		 
		 filter.forEach((e)->System.out.println(e));
		 
/*		 Stream stream =arrayList.stream();
		 Boolean result = stream.anyMatch((element)->
		 {
			 return (element.equals("1"));
			 
		 });
		 System.out.println("result ::"+result);*/
/*		 Boolean result =stream.anyMatch(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return (t==6);
			}
		});*/
		  //System.out.println("result is ::;"+result);
		 
/*		 Stream stream = arrayList.stream();
		 long count = stream.distinct().count();
		 System.out.println("count is :"+count);
		 stream.forEach(System.out::println);
		 */
		 
		 List<Employee> elist = new ArrayList<>();
		 elist.add(new Employee(1, "A"));
		 elist.add(new Employee(2, "B"));
/*
		 elist.add(new Employee(3, "C"));
		 elist.add(new Employee(4, "D"));
		 elist.add(new Employee(5, "E"));
		 elist.add(new Employee(6, "f"));

		 elist.add(new Employee(7, "J"));
		 elist.add(new Employee(8, "H"));	
		 
		
		 Stream<Employee> parallelStream = elist.parallelStream();
		 //parallelStream.forEach((s)->System.out.println(s));
		 parallelStream.forEach((e)->doOperation(e));
		 */
		 
		 
		 System.out.println("The stream after applying "
                 + "the function is : "); 

		 // Creating a list of Integers 
		 List<Integer> list = new ArrayList<>();
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 
		 Stream<Integer> map = list.stream().map((t)->t*2);
		 List<Integer> collect = map.collect(Collectors.toList());
		 collect.forEach(System.out::println);

		 // Using Stream map(Function mapper) and 
		 // displaying the corresponding new stream 
		 //list.stream().map(number -> number * 3).forEach(System.out::println);
	
		 
/*	 elist.stream().filter(MyStream::filterA).forEach(System.out::println);
	 
	 
	 Predicate<Employee> p1 = e -> e.getName().equals("A");
	 Predicate<Employee> p2 = e -> e.getId() == 1;
	 
	 
	 elist.stream().filter(p1).filter(p2).forEach(System.out::println);
	 elist.stream().filter(p1.or(p2)).forEach(System.out::println);
	 
	 elist.stream().filter(p1.negate()).forEach(System.out::println);*/

	//elist.stream().filter(e ->filterA(e));
	}

	private static void doOperation(Employee e) {
		System.out.println(e);
	}
	
	private static boolean filterA(Employee e) {
		return e.getName().equals("A");
	}
}
