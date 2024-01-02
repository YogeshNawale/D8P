package com.arraybasics.assignments;

//8.	WAP to arrange the elements of an given array of integers 
//		where all negative integers appear before all the positive integers.
public class ArrangeNegElemBeforePosElemArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };

		for (int i = 0; i < arr.length; i++) {
			int j = i;
			// Shift negative numbers to the left and positive numbers to the right.
			while ((j > 0) && (arr[j] < 0) && (arr[j - 1] > 0)) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}

		for (int a : arr)
			System.out.print(a + "  ");
	}
}
