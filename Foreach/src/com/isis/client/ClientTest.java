package com.isis.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.isis.model.Student;

public class ClientTest {
	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<>();
		al.add(new Student(1, "A"));
		al.add(new Student(2, "B"));
		al.add(new Student(3, "C"));
		al.add(new Student(4, "D"));
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			Student s =(Student) i.next();
			System.out.println(s.getName());
		}
		
		al.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				System.out.println(t);
				
			}
		});
		System.out.println("-----------------------1---");
		
		al.forEach(new MyConsumer());
		
		System.out.println("------------------------2--");
		
		al.forEach((Student student)->{System.out.println(student);});
		
		System.out.println("------------------------3--");
		
		al.forEach((student)->{System.out.println(student);});
		
		al.forEach(Student::toString);
		
		//al.add(Student::new);
		
		//System.out.println(Student::toString);
		System.out.println("------------------------4--");
		
		al.forEach(System.out::println);	
	
		System.out.println("------------------------5--");
		
		//forEach loop is present in Stream class and iterable class.
		// forEach loop is called internal iteration that why it is consider as fast over enhanced for loop  
		// enhanced for loop is external iteration.
		
		Map<Integer,Student> hm= new HashMap<>();
		hm.put(1, new Student(1,"A"));
		hm.put(2, new Student(2,"B"));
		hm.put(3, new Student(3,"C"));
		
		Set s =hm.keySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Integer key = (Integer) it.next();
			Student st = hm.get(key);
			System.out.println(key);
			System.out.println(st);
			
			
		}
		
		System.out.println("------------------------6--");
		Set<Entry<Integer,Student>> et = hm.entrySet();
		for(Entry<Integer,Student> es : et)
		{
			System.out.println(es.getKey());
			System.out.println(es.getValue());
		}
		
		System.out.println("------------------------7--");
		
		hm.forEach(new BiConsumer<Integer, Student>() {

			@Override
			public void accept(Integer t, Student u) {
				// TODO Auto-generated method stub
				System.out.println(t);
				System.out.println(u);
			}
		});
		
		
		System.out.println("------------------------8--");
		
		hm.forEach((Integer t, Student u)-> 
		   {
				// TODO Auto-generated method stub
				System.out.println(t);
				System.out.println(u);
			}
		);		
		
		System.out.println("------------------------9--");
		
		hm.forEach((k,v)-> 
		   {
				// TODO Auto-generated method stub
				System.out.println(k);
				System.out.println(v);
			}
		);
		
		System.out.println("------------------------10--");
		
		hm.forEach((k,v)->System.out.println("key is ::"+k +" value is ::"+v));			
	
		System.out.println("------------------------11--");
		
     	hm.forEach(ClientTest::print);
     	
     	// implementation of comparator using lambda expression.
     	
     	
		
	}
	
	private static void print(Integer k, Student s) {
		System.out.println(k +"\t"+s);
		
	}
}

class MyConsumer implements Consumer<Student>
{

	@Override
	public void accept(Student student) {
		System.out.println(student);
		
	}
	
}
