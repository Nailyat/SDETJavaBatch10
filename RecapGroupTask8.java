package com.syntax.class12;

public class RecapGroupTask8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {10, 5, 3, -5, 15};
		int largest =a[0];
		int secondLargest=a[0];
		for (int i=1; i<a.length; i++) {
			if(a[i]>largest) {
				secondLargest=largest;
				largest=a[i];
		}else if(a[i]>secondLargest) {
			secondLargest=a[i];
		}
			
		}
		System.out.println(secondLargest);
		
	}

}
