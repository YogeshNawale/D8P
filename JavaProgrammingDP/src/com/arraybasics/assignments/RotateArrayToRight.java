package com.arraybasics.assignments;

import java.util.Scanner;

//2.	WAP to right rotate an array.
public class RotateArrayToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5, 6, 23, 67, 39, 10, 2};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of times array to be  rotated to right ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int temp= arr[arr.length-1];
			
			for(int j=arr.length-1; j>0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
		
		for(int a: arr)
				System.out.print(a+ "  ");
	}

}
