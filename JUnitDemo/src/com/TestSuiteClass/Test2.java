package com.TestSuiteClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test2 {

	TestSuiteExample tse = new TestSuiteExample("RAM");

	@Test
	public void test() {
		// fail("Not yet implemented");
		assertEquals(tse, "RAM");
	}

}
