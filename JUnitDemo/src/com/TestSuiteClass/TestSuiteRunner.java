package com.TestSuiteClass;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuiteRunner {

	public static void main(final String[] args) {
		final Result runClasses = JUnitCore.runClasses(AllTests.class);
		for (final Failure fail : runClasses.getFailures()) {
			System.out.println(fail.getMessage());
		}
	}

}
