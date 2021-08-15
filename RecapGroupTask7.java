package com.syntax.class12;

public class RecapGroupTask7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Maximum and minimum number in the array
		 */
		
		int [] a= {10, 5, 3, -5, 15};
		int largest =a[0];
		int smallest=a[0];
		for (int i=1; i<a.length; i++) {
			if(a[i]>largest) {
				largest=a[i];
		}
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
