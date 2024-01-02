package com.arraybasics;

import java.util.Scanner;

public class DivisibleBy2And3Array {

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
	
	public static void divisible2And3(int num []) {
		System.out.println();
		System.out.println(" Elements Divisible by 2 And 3 are : ");
		for (int i=0; i<num.length; i++) {
			if(num[i]%2==0 && num[i]%3==0)
				System.out.print(num[i]+ "  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= createArray();
		printArray(arr);
		divisible2And3(arr);
	}

}
