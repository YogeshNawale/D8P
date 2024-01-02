package com.arraybasics.array2D;

import java.util.Scanner;

//1.	WAP to accept data in 2D array of 3X4 and accept data.
public class Create2Darray3by4 {

	public void createArray() {

		int arr[][] = new int[3][4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(" Enter the Element");
				int ele = sc.nextInt();
				arr[i][j] = ele;
			}
		}
		printArray(arr);
	}

	public void printArray(int p[][]) {

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Create2Darray3by4 a= new Create2Darray3by4();
		a.createArray();
	}
}
