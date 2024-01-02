package com.arraybasics;

import java.util.Scanner;

public class MinimumElementArray {
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

	public static void printMinimumElement(int num[]) {
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min)
				min = num[i];
				
		}
		System.out.println();
		System.out.println("Minimum Element is : " + min);
	}

	public static void main(String[] args) {
		int arr[] = createArray();
		printArray(arr);
		printMinimumElement(arr);

	}
}
