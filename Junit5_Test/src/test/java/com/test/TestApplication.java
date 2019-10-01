package com.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.function.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("TestApplication class")
@RunWith(JUnitPlatform.class)
public class TestApplication {

	@Nested
	@DisplayName("AddMethods")
	class AddMethods {
		@Test
		@DisplayName("displayNegative")
		void displayNegative() {
			assertEquals(2, 2);
		}

		@Test
		@DisplayName("displayPositive")
		void displayPositive() {
			assertEquals(3, 2);
		}
	}

	@Disabled
	@Test
	@DisplayName("My Assert All example")
	public void AssertAllExample() {
		// assertEquals(3, 3);
		// assertEquals(3, 3);
		// assertEquals(2, 3);
		assertAll(() -> assertEquals(2, 2), () -> assertEquals(3, 3));

	}

	@Disabled
	@Test
	void enabledRun() {
		// System.out.println("enabled run");
		assumeTrue(true);
		System.out.println("enabled run");
		Assertions.assertEquals(3, 3);
	}

	@Disabled
	@Test
	@DisplayName("My First Test")
	void myFirstTest(final TestInfo testInfo) {
		final NumericCalculator calculator = new NumericCalculator();
		Assertions.assertEquals(2, calculator.add(1, 1), "1 + 1 = 2");
		Assertions.assertEquals("My First Test", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
	}
}