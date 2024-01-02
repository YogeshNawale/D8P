package com.arraybasics.assignments;
//4.	WAP to copy an array by iterating the array.
public class CopyArray {

	public static int[] copyArray(int num[]) {
		int arr1[]=new int[num.length];
		for (int i=0; i< num.length; i++) {
			 arr1[i]=num[i];
		}
		return arr1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=Array1.createArray();
		Array1.printArray(arr);
		int a[]=copyArray(arr);
		Array1.printArray(a);
	}

}
