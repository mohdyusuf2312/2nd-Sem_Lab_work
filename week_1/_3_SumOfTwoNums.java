package week_1;

import java.util.Scanner;

public class _3_SumOfTwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		int sum = a+b;
		
		System.out.println("Sum of "+a+" and "+b+" is : "+sum);
	}

}
