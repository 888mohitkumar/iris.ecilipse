package com.execution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class StudentRunner {

	public static void main(final String[] args) {
		final Result runClasses = JUnitCore.runClasses(AllTests.class);
		for (final Failure fail : runClasses.getFailures()) {
			System.out.println(fail.getMessage());
		}
		System.out.println(runClasses.getFailureCount());
		System.out.println(runClasses.wasSuccessful());
	}

}
