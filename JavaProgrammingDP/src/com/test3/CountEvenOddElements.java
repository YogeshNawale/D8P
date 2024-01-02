package com.test3;
//Create a Array of integer and count the number of even and odd elements from array
public class CountEvenOddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,12,4,2,4,6,78,5,3};
		
		int countEven=0;
		int countOdd=0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("Count of Even Elements : "+countEven);
		System.out.println("Count of odd Elements : "+countOdd);

	}

}
