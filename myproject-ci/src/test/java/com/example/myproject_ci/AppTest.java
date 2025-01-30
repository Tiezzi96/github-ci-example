package com.example.myproject_ci;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private App app;

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
	@Before
	public void setup() {
		// TODO Auto-generated method stub
		app = new App();

	}
	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello());
	}

}
