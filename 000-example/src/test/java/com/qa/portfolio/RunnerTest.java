package com.qa.portfolio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunnerTest {

	private Runner answers = new Runner();
	
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
