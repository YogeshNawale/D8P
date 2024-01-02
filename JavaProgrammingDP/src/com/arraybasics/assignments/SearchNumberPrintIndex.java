package com.arraybasics.assignments;

import java.util.Scanner;

//3.	WAP to search for a given number in an array and accordingly print the index if exists.
public class SearchNumberPrintIndex {
	public static int[] createArray() {
		int num[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size= sc.nextInt();
		num= new int[size];
		
		for (int i=0; i<num.length; i++) {
			System.out.println(" Enter "+ (i+1) + " ELement");
			num[i]= sc.nextInt();
		}
		//sc.close();
		return num;
	}
	public static void printArray(int num[]) {
		System.out.println(" Given Array is : ");
		for (int a: num)
			System.out.print(a+"  ");
		System.out.println();
	}
	
	public static void searchNum(int num[]) {
		
		System.out.println("Enter the Element to be searched : ");
		Scanner sc= new Scanner(System.in);
		int elem= sc.nextInt();
		sc.close();
		
		for(int i=0; i<num.length; i++) {
			if (elem==num[i])
				System.out.println(" Index of "+ elem + " is " + i);
			
 			
		}
 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= createArray();
		printArray(arr);
		searchNum(arr);
	}

}
