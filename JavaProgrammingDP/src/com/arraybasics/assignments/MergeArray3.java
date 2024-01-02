package com.arraybasics.assignments;

import java.util.Arrays;

//addition of alternate elements into new array
//eg.   int a[]= {1,2,3,4,5,6};
//		int arr[]= {4,6,8,10};
public class MergeArray3 {

	public static void addAlternateElements(int num[]) {
		int arr[] = new int[(num.length / 2) +1];
		int j = 0, i = 0;
		for (i = 0; i < arr.length; i++) {
			arr[i] = num[j++] + num[++j];
			j--;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a[]=Array1.createArray();
		int a[] = { 1, 2, 3, 4, 5, 6};
		Array1.printArray(a);

		addAlternateElements(a);
	}

}
