package com.operation;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArithmaticTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		final Artithmatic a = new Artithmatic();
		assertEquals("This method adds two numbers", 2, a.add(1, 1));

	}

}
