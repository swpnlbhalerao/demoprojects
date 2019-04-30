package com.test.Calculator;

public class Calculator {

    private static  CalcInterface calcInterface;
    
    
			public Calculator(CalcInterface calcInterface) {
				this.calcInterface=calcInterface;
			}
	
	public static void main(String[] args) {
		
	/*	double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");

		num1 = scanner.nextDouble();
		System.out.print("Enter second number:");
		num2 = scanner.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		scanner.close();*/

		//double result = getResult(num1, num2, operator);
//		System.out.println("Result of the " + num1 +" "+ operator+ " " + num2 + " operation :: " + result);
		
		//RunCalc.perform(num1,num2, operator);
		/*LamdaExpression l=new LamdaExpression();
		int functionReturn =l.functionEx(-114);
		System.out.println(functionReturn);
		//84448008
	    int fact=l.factorial(5);
	    System.out.println(fact);*/
	
	}
	
	
	
	public static double perform(double num1, double num2, char operator){
		return calcInterface.calculateService(num1, num2)*num1;
	}

	public static double getResult(double num1, double num2, char operator) {
		double output = 0;
		switch (operator) {
		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;

		case '/':
			output = num1 / num2;
			break;

		/*
		 * If user enters any other operator or char apart from +, -, * and /,
		 * then display an error message to user
		 * 
		 */
		default:
			System.out.println("You have entered wrong operator "+operator);
			return output;
		}
		return output;

	}

}
