package com.arraybasics.array2D;

//10.	WAP to subtract two matrices.
public class Substract2MatricesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2  }, { 3, 3, 3 } };
		int b[][] = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };

		System.out.println("First Array");
		for (int a1[] : a) {
			for (int ele : a1) {
				System.out.print(ele + "\t");
			}
			System.out.println();
		}

		System.out.println("Second Array");
		for (int a2[] : b) {
			for (int ele : a2) {
				System.out.print(ele + "\t");
			}
			System.out.println();
		}

		int c[][] = new int[a.length][];

		// Substracting and printing substraction of 2 matrices

		for (int i = 0; i < a.length; i++) {
			c[i]=new int [a[i].length];
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
