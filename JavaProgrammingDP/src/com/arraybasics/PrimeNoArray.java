package com.arraybasics;

import java.util.Scanner;

public class PrimeNoArray {

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
	public static void printPrimeNo(int num[]){
		System.out.println();
		System.out.println("Prime Elements in Array are : ");
		for(int i=0; i<num.length; i++) {
			int count=0;
			for (int j=2; j<=num[i]/2; j++) {
				if(num[i]%j==0) {
					count++;
					break;
				}	
			}
			if(count==0)
				System.out.print(num[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= createArray();
		printArray(arr);
		printPrimeNo(arr);
		
	}

}
