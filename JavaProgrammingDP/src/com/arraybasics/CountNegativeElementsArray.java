package com.arraybasics;

import java.util.Scanner;

public class CountNegativeElementsArray {
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
	
	public static void countNegativeNo(int num[]) {
		System.out.println();
		int count=0;
		for(int i=0; i<num.length;i++) {
			if(num[i]<0)
				count++;
		}
		
		System.out.println("Count of Negtive Elements is : "+ count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= createArray();
		printArray(arr);
		countNegativeNo(arr);
		
	}

}
