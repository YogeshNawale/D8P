package com.arraybasics.assignments;

import java.util.Arrays;

//  addition of subsequent elements into new array
//eg.   int a[]= {1,2,3,4,5,6};
//			int arr[]= {3,7,11};
public class MergeArray2 {

	public static void addSebsequentElements(int num[]) {
		int arr[]= new int[num.length/2];
		int j=0,i=0;
		for ( i=0; i<arr.length; i++) {
			arr[i]=num[j]+num[++j];
			j++;
		}
		
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[]=Array1.createArray();
		int a[]={1,2,3,4,5,6,7};
		Array1.printArray(a);
		
		addSebsequentElements(a);
	}

}
