package com.arraybasics.array2D;

import java.util.Scanner;

public class Demo2 {

	public void createArrayUserDefinedValues() {

		int arr[][];
		System.out.println("Please Enter the size of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		arr = new int[rows][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Size of  " + (i + 1) + " coloum");
			int col = sc.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the element ");
				int ele=sc.nextInt();
				arr[i][j]=ele;
			}
		}
		printArray(arr);
	}

	public void printArray(int p[][]) {
		 
		for(int i=0; i< p.length; i++) {
			for(int j=0; j< p[i].length; j++) {
				System.out.print(p[i][j] + "\t");
			}
			System.out.println();
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 a=new Demo2(); 
		a.createArrayUserDefinedValues();
		
	}

}
