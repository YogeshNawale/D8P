package com.arraybasics.array2D;

import java.util.Scanner;

//3.	WAP to print maximum in rowwise in 2D array. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//		output is: 31 and 25.
public class MaximumRowWiseArray2D {

	public void createArray() {
		int arr[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of rows");
		int row= sc.nextInt();
		arr= new int [row][];
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter size of "+ (i+1)+ " Coloum");
			int col= sc.nextInt();
			arr[i]=new int [col];
			
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the Element");
				int ele= sc.nextInt();
				arr[i][j]=ele;
			}
		}
		
		for(int a[]: arr ) {
			for(int ele : a) {
				System.out.print (ele + "\t");
			}
			System.out.println();
		}
		findMaximum(arr);
	}
	
	
	public void findMaximum(int p[][]) {
		for(int i=0; i<p.length; i++) {
			int max=p[i][0];
			for (int j=0; j<p[i].length; j++) {
				if(p[i][j]>max) {
					max=p[i][j];
					
				}	
			}
			System.out.println("Maximum of " +(i+1)+ " Row is "+ max);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaximumRowWiseArray2D obj= new MaximumRowWiseArray2D();
		obj.createArray();
	}

}
