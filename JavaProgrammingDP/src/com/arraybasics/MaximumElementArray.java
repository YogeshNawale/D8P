package com.arraybasics;

import java.util.Scanner;

//Print Maximum Element in array
public class MaximumElementArray {
	public static int[] createArray() {
		int num[];
		System.out.println("Enter Size of Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter " + (i + 1) + " Element");
			num[i] = sc.nextInt();
		}
		sc.close();
		return num;
	}

	public static void printArray(int num[]) {
		System.out.println();
		for (int a : num)
			System.out.print(a + "  ");
	}
	public static void printMaximumElement(int num[]) {
		int max=num[0];
		for (int i=1; i<num.length; i++) {
			if(num[i]>max) 
				  max=num[i];
					
		}
		System.out.println();
		System.out.println("Maximum Element is : "+ max);
	}
	public static void main(String[] args) {
		int arr[]=createArray();
		printArray(arr);
		printMaximumElement(arr);
		
	}
}
