package com.modularapproach;

import java.util.Scanner;

public class ForDisplaySeries2 {
	
	public void displaySeries(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(i*i*i + "  ");
		}
	}

	public static void main(String[] args) {
		// WAP to display the given series till 10th term
		// 1  8  27  65  125.....
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range 1 to n as n= ");
		int n= sc.nextInt();
		
		ForDisplaySeries2 res=new ForDisplaySeries2();
		res.displaySeries(n);
	}

}
