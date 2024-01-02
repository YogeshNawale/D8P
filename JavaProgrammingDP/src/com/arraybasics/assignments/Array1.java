package com.arraybasics.assignments;
//1.	WAP to add elements to single dimensional int array and print elements from 1D array

import java.util.Scanner;

public class Array1 {
	public static int[] createArray() {
		int num[];
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		num= new int[size];
		
		for (int i=0; i<num.length; i++) {
			System.out.println(" Enter "+ (i+1) + " ELement");
			num[i]= sc.nextInt();
		}
		 
		return num;
	}
	public static void printArray(int num[]) {
		System.out.println(" Given Array is : ");
		for (int a: num)
			System.out.print(a+"  ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=createArray();
		printArray(arr);
	}

}
