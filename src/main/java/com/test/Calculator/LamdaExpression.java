package com.test.Calculator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LamdaExpression {

	

	public int functionEx(int a) {

		Function<Integer, Integer> half = number -> number / 2;
		double halfValue = half.apply(a);
		System.out.println(halfValue);

		BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
		int mutliplyValue = multiply.apply((int) halfValue, a);
		System.out.println(mutliplyValue);

		Function<Integer, Integer> times2 = e -> e * 2;
		Function<Integer, Integer> squared = e -> e * e;
		int composeValue = times2.compose(squared).apply(mutliplyValue);
		return composeValue;


	}
	/*public int factorial(int no){
		
		if(no==0 || no==1){
			return no;
		}else{
			
			return no*factorial(no-1);
		}
	}*/
	

}
