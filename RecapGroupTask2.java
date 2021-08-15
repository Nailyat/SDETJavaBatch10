package com.syntax.class12;

public class RecapGroupTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a 2D Array or integer type where you will store odd and even numbers
		 * Develop a program which will identify/print the even numbers only
		 */
		
		int[][] n= {{1, 2, 3, 4, 5}, {12, 23, 33, 45, 46}};
		for (int i=0; i<n.length; i++) {
			for (int j=0; j<n[i].length; j++) {
				if (n[i][j]%2==0) {
					System.out.print(n[i][j]+" ");	
				}
			}
		
		}
	}

}
