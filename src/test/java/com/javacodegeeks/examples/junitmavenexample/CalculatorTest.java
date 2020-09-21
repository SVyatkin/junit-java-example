package com.javacodegeeks.examples.junitmavenexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is executed after each Test");
	}

	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);

		assertEquals(7, result);

		int result1 = calculator.sum(4, 4);

		assertEquals(8, result1);
	}

	@Test
	public void testDivision() {
		try {
			int result = calculator.division(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.division(10, 0);
	}

	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);

		assertTrue(result);
	}

	@Test
	public void testSubtraction() {
		int result = calculator.subtraction(10,1);

		assertEquals(9, result);
	}
}
