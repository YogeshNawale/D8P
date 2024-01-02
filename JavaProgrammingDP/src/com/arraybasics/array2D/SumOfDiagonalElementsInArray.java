package com.arraybasics.array2D;

import java.util.Scanner;

//6.	WAP to find sum of main diagonal elements of a matrix.
public class SumOfDiagonalElementsInArray {

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
				int sum=0;
				for(int i=0; i<arr.length; i++) {
					
					for(int j=0; j<arr[i].length; j++) {
						if(i==j)
							sum=sum+arr[i][j];
					}
				}
				System.out.println("Sum of Principal Diagonal elements is "+ sum);
	}

}
