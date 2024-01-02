package com.arraybasics.assignments;

import java.util.Arrays;

/*
 * 17.	WAP to reverse the array itself, don’t print array in reverse – I want current array reverse.
 *  Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 37, 29, 45, 90, 3] 
 *  without using temporary array.
 */
public class ReverseArray {

	public static void printReverse(int num[]) {
		int j=0;
		for (int i=num.length-1; i>=0; i--) {
			if(i!=j && j<i) {		
				int temp=num [j];
				num[j]=num[i];
				num[i]=temp;
				j++;
			}
					}
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = Array1.createArray();
		System.out.println(Arrays.toString(a));
//
//		int a[]={3, 23, 53, 1, 21};
//		System.out.println(Arrays.toString(a));
		printReverse(a);
	}

}
