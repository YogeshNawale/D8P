package com.modularapproach;

import java.util.Scanner;

public class ForDisplaySeries1 {

	public void displaySeries(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(i*i +"   ");
		}
	}
	
	public static void main(String[] args) {
		// WAP to display the given series till 10th term
		// 1  4  9  16  25.....n

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of 1 to n where n = ");
		int n=sc.nextInt();
		
		ForDisplaySeries1 res=new ForDisplaySeries1();
		res.displaySeries(n);
		
	}

}
