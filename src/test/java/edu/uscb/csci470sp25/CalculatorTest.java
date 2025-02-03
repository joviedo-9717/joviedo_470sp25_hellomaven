package edu.uscb.csci470sp25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();  // Arrange
		int result = calculator.add(2, 3);    // Act 
		assertEquals(5, result);   // Assert 		
	}
}
