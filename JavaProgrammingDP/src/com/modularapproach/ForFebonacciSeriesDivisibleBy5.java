package com.modularapproach;
import java.util.Scanner;

//fibonacci series 0 1 1 2 3 5 8.....
	public class ForFebonacciSeriesDivisibleBy5 {
	
		public void printFibonaciiDiv5(int n) {
		int firstterm = 0;
		int secondterm = 1;
		
		
		for (int i = 1; i <= n - 2; i++) {
			
			int nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
			if(nextterm%5==0) {
			System.out.print(nextterm + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the terms");
		int n= sc.nextInt();
		
		ForFebonacciSeriesDivisibleBy5 obj = new ForFebonacciSeriesDivisibleBy5();
		obj.printFibonaciiDiv5(n);
		
		
	

	}

}
