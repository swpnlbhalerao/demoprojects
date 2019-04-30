package com.test.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalc {
	
	
		@Before
		public void setUp() throws Exception {
			
		}

	
	@Test
	public void testCalcWithPostiveScenario1(){
		
		double result=Calculator.getResult(10, 20, '+');
		assertEquals(30.0, result, 0);
		// assertEquals(0.0, result, 0.01);
	
	}
	
	@Test
	public void testCalcWithPostiveScenario2(){
		
		double result=Calculator.getResult(10, 20, '+');
		assertEquals(30.0, result, 0);
	
	}
	
	@Test
	public void testCalcWithNegScenario1(){
		
		double result=Calculator.getResult(10, 20, 'a');
		assertEquals(30.0, result, 0);
	
	}
	@Test
	public void testCalcWithNegScenario2(){
		
		double result=Calculator.getResult(10, 20, '-');
		assertEquals(30.0, result, 0);
	
	}
	
}
