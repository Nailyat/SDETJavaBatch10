package com.syntax.class12;

public class RecapGroupTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Task 1. Create a 2D array of integer values. Print the sum of all numbers
		
		int [][] num= {{1, 2, 3, 4,},{6, 5, 4, 3}};
		int sum=0;
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length; j++) {
				sum+=num[i][j];
			}
			
		}
		System.out.println("The sum of all 2D array elements is " +sum);
	}

}
