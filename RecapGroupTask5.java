package com.syntax.class12;

public class RecapGroupTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a java program to check whether a given number is prime or not
		 * 
		 */
		
		int n=11;
		boolean isPrime=true;
		if(n>1) {
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		System.out.println(n+" is prime "+isPrime);

	}

}
