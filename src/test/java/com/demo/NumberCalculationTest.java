package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author: Antonyo Lebab
 * @time:Mar 10, 2022-10:54:18 AM
 */
public class NumberCalculationTest {
	
	NumberCalculation nc = new NumberCalculation();

	@Test
	public void testCase1() {
		assertEquals(nc.add(1, 2), 3);
	}

	@Test
	public void testCase2() {
		
		assertEquals(nc.CovertCase("hello"), "Hello");

	}

	@Test
	public void testCase3() {

	}
}
