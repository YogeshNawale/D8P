package com.test3;

import java.util.Arrays;

/*3) Write a java program to remove duplicate elements from an array?[1M]

		Array With Duplicates : [4, 3, 2, 4, 9, 2]
		Array Without Duplicates : [4, 3, 2, 9]
*/
public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 3, 2, 4, 9, 2 };

		// Sorting array in ascending order
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// counting number of duplicate elements

		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				count++;
		}
		System.out.println(Arrays.toString(arr));

		int arr1[] = new int[arr.length - count];
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1])
				arr1[k++] = arr[i];

		}

		if (arr[arr.length - 1] != arr[arr.length - 2])
			arr1[k++] = arr[arr.length - 1];

		System.out.println(Arrays.toString(arr1));
	}

}
