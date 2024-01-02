package com.arraybasics;

import java.util.Scanner;

// print average of array elements
public class AverageOfElementsArray {

	public static int[] createArray() {
		int num[];
		System.out.println("Enter Size of Array");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		num=new int[size];
		
		for(int i=0; i<num.length; i++) {
		System.out.println("Enter "+ (i+1)+ " Element");
		num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	
	public static void printArray(int num[]) {
		System.out.println();
		for (int a: num)
			System.out.print(a+ "  ");
	}
	public static void calculateAverage(int num[]) {
		int sum=0;
		for(int a: num) {
			sum=sum+a;
		}
		System.out.println();
		int avg= sum/num.length;
		System.out.println("Average of Elements in Array is : " + avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= createArray();
		printArray(arr);
		calculateAverage(arr);
	}

}
