package com.example.myproject_ci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class App2Test {

	
	private App app;

	@Before
	public void setUp() {
		app = new App();
	}

	@Test
	public void test() {
		assertEquals("Hallo", app.sayHello());
	}

}
