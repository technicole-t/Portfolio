package com.qa.portfolio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test file for Example Class.
 * 
 * Run this file to see if it passes
 * 
 */
public class ExampleTest {

	private Example answers = new Example();
	
	@Test
	public void greetingJohnTest() {
		assertEquals("Hi John", answers.greetingExample("John"));
	}
	
	@Test
	public void greetingMattTest() {
		assertEquals("Hi Matt", answers.greetingExample("Matt"));
	}
	
	@Test
	public void greetingAngelicaTest() {
		assertEquals("Hi Angelica", answers.greetingExample("Angelica"));		
	}
	
}
