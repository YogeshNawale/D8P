package com.arraybasics.assignments;

//11.	WAP to display all perfect square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] 
//			so output is 25, 49, 9.
public class DisplayPerfectSquaresInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j * j <= arr[i]; j++) {
				// if (i * i = element)
				// comparing conditions using logical AND
				if ((arr[i] % j == 0) && (arr[i] / j == j)) {
					// returns true if both conditions are true
					System.out.print(arr[i] + ", ");
				}
			}

		}

	}

}
