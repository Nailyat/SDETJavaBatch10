package com.syntax.class12;

public class RecapGroupTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a program to swap 2 numbers without a temporary variable
		 */
		
		int a=10;
		int b=20;
		a=a+b; //30 (new condition of a)
		b=a-b; //30-20=10 (new condition of b)
		a=a-b; //30-10=20 (the given condition of b)
		
		System.out.println("a is "+a);
		System.out.println("b is "+b);

	}

}
