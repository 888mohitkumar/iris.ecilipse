package com.TestResultClass;

import static org.junit.Assert.assertEquals;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestResult;

public class TestResultExample extends TestResult {

	@Override
	public synchronized void addError(final Test test, final Throwable t) {
		super.addError(test, t);
	}

	@Override
	public synchronized void addFailure(final Test test, final AssertionFailedError t) {
		super.addFailure(test, t);
	}

	@SuppressWarnings("deprecation")
	@org.junit.Test
	public void testAdd() {
		assertEquals(5, 5);
	}

}
