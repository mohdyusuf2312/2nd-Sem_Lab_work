package week_9;

import week_9._Arithmetic.ArithmeticOpr;
public class _5_AccessPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + ArithmeticOpr.add(num1, num2));
        System.out.println("Subtraction: " + ArithmeticOpr.subtract(num1, num2));
        System.out.println("Multiplication: " + ArithmeticOpr.multiply(num1, num2));
        System.out.println("Division: " + ArithmeticOpr.divide(num1, num2));
	}

}