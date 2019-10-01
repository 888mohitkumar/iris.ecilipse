package com.iris;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MySerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		Employee e = new Employee(1, "Ram",5);
	
		Person p = new Person("IRIS");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d://abc.txt")));
/*		System.out.println(e);
		oos.writeObject(e);*/
		System.out.println(p);
		oos.writeObject(p);
		oos.flush();
		
		
		//System.out.println("Sample output");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d://abc.txt")));
		//Employee readObject = (Employee)ois.readObject();
		Person readObject = (Person)ois.readObject();
		System.out.println(readObject);
		
	}

}
