package com.modularapproach;

import java.util.Scanner;

// 5  9  17  29  45  65
public class ProgSeries4 {

	public void calculateString(int n) {
		
		int num=5;
		for(int i=0; i<n; i++) {
			int temp=4*i+num;
			num=temp;
			System.out.print(temp+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range ");
		int n = sc.nextInt();
		
		ProgSeries4 obj= new ProgSeries4();
		obj.calculateString(n);
	}

}
