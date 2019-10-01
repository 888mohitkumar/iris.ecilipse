package com.TestSuiteClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {

	TestSuiteExample tse = new TestSuiteExample("Ram");

	@Test
	public void test() {
		// fail("Not yet implemented");
		assertEquals("Ram", tse.getMessage());
	}

}
