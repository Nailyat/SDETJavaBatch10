package com.syntax.class12;

public class RecapGroupTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a Java Program to print the first 10 numbers for Fibonacci series
		 * 0 1 1 2 3 5 8 13 21 34...
		 */

		int previousN=0;
		int currentN=1;
		int sumOfPreviousAndCurrent=0;
		int nToGenerate=10;
		System.out.print(previousN+" ");
		System.out.print(currentN+" ");
		for(int i=0; i<nToGenerate-2; i++) {
			sumOfPreviousAndCurrent=previousN+currentN;
			System.out.print(sumOfPreviousAndCurrent+" ");
			previousN=currentN;
			currentN=sumOfPreviousAndCurrent;
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}

}
