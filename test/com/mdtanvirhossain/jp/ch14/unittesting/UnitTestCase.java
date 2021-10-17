package com.mdtanvirhossain.jp.ch14.unittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTestCase {

	@Before
	public void before() {
		System.out.println("Runnign before");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Runnign before class");
	}

	@Test
	public void method1() {
		System.out.println("Running method1");
	}

	@Test
	public void method2() {
		System.out.println("Running method2");
	}

	@After
	public void after() {
		System.out.println("Runnign after");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Runnign after class");
	}
}
