package com.arraybasics.assignments;

import java.util.Arrays;
import java.util.Scanner;

//7.	WAP to insert an element in a specific position into an array.
public class InsertElementArray {

	public static void insertElement(int num[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Position of Array");
		int pos= sc.nextInt();
		if ((pos-1)<num.length) {
			System.out.println("Enter Element to be inserted");
			num[pos-1]=sc.nextInt();
		}
		else
			System.out.println("Index out of bound");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=Array1.createArray();
		Array1.printArray(arr);
		
		insertElement(arr);
		Array1.printArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
