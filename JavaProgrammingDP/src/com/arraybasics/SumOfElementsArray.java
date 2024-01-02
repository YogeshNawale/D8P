package com.arraybasics;

import java.util.Scanner;

public class SumOfElementsArray {

	public static int[] createArray() {
		int num[];
		System.out.println("Enter Size of Array");
		Scanner sc = new Scanner (System.in);
		int size= sc.nextInt();
		num= new int[size];
		
		for(int i=0; i<num.length; i++) {
		System.out.println("Enter "+ (i+1)+ " Element ");
		num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	
	public static void printArray(int num[]) {
		System.out.println("Array is : ");
		for(int a: num)
			System.out.print (a+"  ");
	} 
	public static void calculateSum(int num[]) {
		int sum=0;
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
		System.out.println();
		System.out.println("Sum of Elements of Array is : "+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=createArray();
		printArray(arr);
		calculateSum(arr);
		
	}

}
