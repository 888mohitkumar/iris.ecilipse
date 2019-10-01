package com.execution;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	Student s1, s2, s3, s4, s5;

	@Before
	public void setUp() throws Exception {
		System.out.println("in before method");
		s1 = new Student(1, "Ram", 80);
		s2 = new Student(2, "kush", 50);
		s3 = new Student(1, "John", 33);
		s4 = new Student(1, "deepa", 20);
		s5 = new Student(1, "vipul", 65);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDistinction() {
		System.out.println("--------------------------------------------------");
		System.out.println("in testDistinction  method");
		s1.calGrade();
		assertEquals(s1.grade, "Distinction");
		System.out.println(s1);
	}

	@Test
	public void testfirst() {
		System.out.println("--------------------------------------------------");
		System.out.println("in testfirst  method");
		s5.calGrade();
		assertEquals("first", s5.grade);
		System.out.println(s5);
	}

	@Test
	public void testPass() {
		System.out.println("--------------------------------------------------");
		System.out.println("in testPass method");
		s4.calGrade();
		assertEquals("fail1", s4.grade);
		System.out.println(s4);
	}

	@Test
	public void testSecond() {
		System.out.println("--------------------------------------------------");
		System.out.println("in testSecond  method");
		s2.calGrade();
		assertEquals("second", s2.grade);
		System.out.println(s2);
	}

	@Test
	public void testThird() {
		System.out.println("--------------------------------------------------");
		System.out.println("in testThird  method");
		s3.calGrade();
		assertEquals("third", s3.grade);
		System.out.println(s3);
	}

}
