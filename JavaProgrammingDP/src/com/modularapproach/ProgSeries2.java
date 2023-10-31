package com.modularapproach;
// Series 1  22  333  4444  55555 666666..... 
import java.util.Scanner;

public class ProgSeries2 {
	public void calculateSeries(int n) {
		int num=1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
		System.out.print(" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the terms");
		int n=sc.nextInt();
		
		ProgSeries2 obj=new ProgSeries2();
		obj.calculateSeries(n);
	}

}
