package com.arraybasics;

import java.util.Scanner;

public class ReverseOrder {

	public static int[] createArray() {
		int num[];
		System.out.println("Enter size of Array : ");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		num=new int [size];
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Please enter  " + (i+1) + " Element " );
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	public static void printArray(int num[]) {
		for(int a: num )
			System.out.print (a+ "  ");
	}
	
	public static void printReverseArray(int num[]) {
		System.out.println();
		System.out.println("Reverse of Array ");
		for(int i=num.length-1; i>=0; i--) 
			System.out.print (num[i]+"  ");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=createArray();
		printArray(arr);
		printReverseArray(arr);
	}

}
