package com.arraybasics.array2D;

import java.util.Scanner;

//5.	WAP to find sum of each row and column of a matrix.
public class SumOfRowsAndColoumOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
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
		
		
		for(int a[]:arr) {
			for(int ele: a) {
				System.out.print(ele+ "\t");
			}
			System.out.println();
		}
		
		
		// sum of each row
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr[i].length; j++) {
				sum=sum+arr[i][j];
			}
			System.out.println("Sum of "+ (i+1)+ " Row is "+ sum);
		}
	
		//sum of each coloum
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr[i].length; j++) {
				sum=sum+arr[j][i];
			}
			System.out.println("Sum of "+ (i+1)+ " coloum is "+ sum);
		}
	
	}

}
