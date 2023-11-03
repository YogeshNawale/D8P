package com.arraybasics.assignments;

import java.util.Arrays;

//16.	WAP sort array elements in ascending order.
public class AcendingElementsArrays {

	public static void sortAcending(int num[]) {
		
		for (int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int temp=num [j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= Array1.createArray();
		System.out.println(Arrays.toString(a));
		
		sortAcending(a);
	}

}
