package com.test3;

import java.util.Arrays;

/*
 * 
6)	Take an array of integers as input. Print the odd number and even number alternate. 
Remaining numbers should appear at the last. [2M]

	Ex: I/P=[1,5,9,7,3,6,8,13,2,4] 
		O/P=[6,1,8,5,2,9,4,7,3,13]

 */
public class PrintOddEvenAlternateElements1DArray {

	public static void main(String[] args) {
		
		int arr[]= {1,5,9,7,3,6,8,13,2,4};
		int countEven=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				countEven++;
		}
		
		int arrEven[]=new int [countEven];
		int arrOdd[]=new int [arr.length-countEven];
		
		int j=0,k=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) 
				arrEven[j++]=arr[i];
			
			else
				arrOdd[k++]=arr[i];
		}
		
		int arrfinal[]=new int [arr.length];
		int i = 0;
		j = 0;
		k = 0;
		
		while (i < arrEven.length && j < arrOdd.length) {
			arrfinal[k++] = arrEven[i++];
			arrfinal[k++] = arrOdd[j++];
        }
 
        // Store remaining elements of first array
        while (i < arrEven.length)
        	arrfinal[k++] = arrEven[i++];
 
        // Store remaining elements of second array
        while (j < arrOdd.length)
        	arrfinal[k++] = arrOdd[j++];
        
        System.out.println(Arrays.toString(arrfinal));
		
		
	}

}
