package com.assertExample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertRunner {

	public static void main(final String[] args) {
		final Result runClasses = JUnitCore.runClasses(AssertExample.class);
		for (final Failure fail : runClasses.getFailures()) {
			System.out.println(fail.getMessage());
		}
		System.out.println("pass");
	}

}
