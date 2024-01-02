package com.arraybasics.array2D;

import java.util.Scanner;

//4.	WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}}
//		output is: 12, 5, 2.
public class MinimumOfColoumArray2D {

	public void createArray() {
		int arr[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of rows");
		int row = sc.nextInt();
		arr = new int[row][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter size of " + (i + 1) + " Coloum");
			int col = sc.nextInt();
			arr[i] = new int[col];

			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the Element");
				int ele = sc.nextInt();
				arr[i][j] = ele;
			}
		}

		findMinimum(arr);

		for (int a[] : arr) {
			for (int ele : a) {
				System.out.print(ele + "\t");
			}
			System.out.println();
		}
	}

	public void findMinimum(int p[][]) {
		for (int i = 0; i < p.length; i++) {
			int min = p[0][i];
			for (int j = 0; j < p[i].length; j++) {
				if (p[j][i] < min) {
					min = p[j][i];

				}
			}
			System.out.println("Minimum of " + (i + 1) + " coloum is " + min);
		}
	}
	
	
	public static void main(String[] args) {
		
		MinimumOfColoumArray2D obj= new MinimumOfColoumArray2D();
		obj.createArray();
	}
}
