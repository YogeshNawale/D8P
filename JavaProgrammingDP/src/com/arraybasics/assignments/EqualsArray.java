package com.arraybasics.assignments;

//4.	Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 32, 42, 52, 62] and 
//		arr2[] = [52, 22, 62, 12, 42, 22] Here both arrays are equal.
public class EqualsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 22, 32, 42, 52, 62 };
		int b[] = { 52, 22, 62, 12, 42, 32 };

		// sorting acending order
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < b.length - 1; i++) {
			for (int j = 0; j < b.length - 1 - i; j++) {
				if (b[j] > b[j + 1]) {
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		// check equality

		boolean isEqual = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i])
					isEqual = false;
			}
		}

		else
			isEqual = false;

		if (isEqual)
			System.out.println("Two Arrays Are Equal");

		else

			System.out.println("Two Arrays Are Not equal");

	}

}
