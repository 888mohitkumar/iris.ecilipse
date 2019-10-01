package com.nagarro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Child extends Parent implements Serializable {
	int cid = 10;

	@Override
	public String toString() {
		return "child [cid=" + cid + ", pid=" + pid + ", gid=" + gid + "]";
	}
}

class GrandParent {
	int gid = 1000;
}

class Parent extends GrandParent {
	int pid = 100;

}

public class SerializableTest {

	public static void main(final String[] args) {
		final File file = new File("d://temp");
		writeData1(file);
		readData1(file);
	}

	public static void readData(final File file) {
		Student1 c;
		try {
			final FileInputStream fis = new FileInputStream(file);
			final ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Student1) ois.readObject();
			System.out.println(c);
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readData1(final File file) {
		Child c;
		try {
			final FileInputStream fis = new FileInputStream(file);
			final ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Child) ois.readObject();
			System.out.println(c);
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeData(final File file) {
		final Student1 c = new Student1();
		c.child.gid = 400;
		// c.cid = 500;
		System.out.println(c);
		try {
			final FileOutputStream fis = new FileOutputStream(file);
			final ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(c);
			System.out.println("successfull");
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeData1(final File file) {
		final Child c = new Child();

		c.gid = 500;
		System.out.println(c);
		try {
			final FileOutputStream fis = new FileOutputStream(file);
			final ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(c);
			System.out.println("successfull");
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Student1 implements Serializable {
	Child child = new Child();

	@Override
	public String toString() {
		return "Student1 [child=" + child + "]";
	}

}