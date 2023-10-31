package com.modularapproach;

import java.util.Scanner;

// fibonacci series 0 1 1 2 3 5 8.....
public class ForFebonacciSeries {
	public void printFibonacii(int n) {
		int firstterm = 0;
		int secondterm = 1;
		System.out.print(firstterm +" "+secondterm +" ");
		for (int i = 1; i <= n - 2; i++) {
			int nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;

			System.out.print(nextterm + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the terms");
		int n= sc.nextInt();
		
		ForFebonacciSeries obj=new ForFebonacciSeries();
		obj.printFibonacii(n);
		
		
		
	}

}
