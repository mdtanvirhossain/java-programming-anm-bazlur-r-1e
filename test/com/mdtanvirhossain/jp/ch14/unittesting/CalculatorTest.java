package com.mdtanvirhossain.jp.ch14.unittesting;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CalculatorTest {

	@Test
	public void testAddIntInt() {
		Calculator calculator = new Calculator();
		int a = 6, b = 7;
		int actual = calculator.add(a, b);

		Assert.assertEquals(13, actual);
	}

	@Test
	public void testAddIntArray() {
		int[] intArray = { 1, 2, 3, 4, 5 };
		Calculator calculator = new Calculator();
		int actual = calculator.add(intArray);

		Assert.assertEquals(15, actual);
	}
}
