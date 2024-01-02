package com.arraybasics.array2D;

//8.	WAP to create transpose of a matrix (transpose is converting rows to columns) and print it.
public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int a[] : arr) {
			for (int ele : a) {
				System.out.print(ele + "\t");
			}
			System.out.println();
		}

//		for (int i=0; i<arr.length; i++) {
//			for (int j=i+1; j<arr[i].length; j++) {
//				int temp = arr[i][j]; 
//                arr[i][j] = arr[j][i]; 
//                arr[j][i] = temp; 
//			}
//			System.out.println();
//		}

		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {
				if (i != j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}

		for (int a[] : arr) {
			for (int ele : a) {
				System.out.print(ele + "\t");
			}
			System.out.println();
		}
	}

}
