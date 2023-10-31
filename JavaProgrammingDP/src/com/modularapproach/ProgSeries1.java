package com.modularapproach;

import java.util.Scanner;

// 1  3  7 15 31......
public class ProgSeries1 {
	
	public void calculateSreies(int n) {
		
		int temp=0;
		int num=0;
		for(int i=1; i<=n; i++) {
			temp=(num+num)+1;
			num=temp;
			System.out.print(temp +" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the terms");
		int n=sc.nextInt();
		
		ProgSeries1 obj= new ProgSeries1();
		obj.calculateSreies(n);
		
	}

}
