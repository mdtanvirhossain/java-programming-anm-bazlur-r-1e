package com.mdtanvirhossain.jp.ch14.unittesting;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AssertStatementsDemo {

	@Test
	public void testAddIntInt() {
		Calculator calculator = new Calculator();
		Assert.assertNotNull("Instance of Calculator should be created", calculator);
		int a = 6;
		int b = 7;
		int actual = calculator.add(a, b);

		Assert.assertEquals("Addition of 6 and 7 should be 13", 13, actual);
	}
}
