package com.Oops;

import java.util.Scanner;

public class SumOfEvenDigits {
	int num, orignum;
	int sum;
	int digit;

	public void setData(int n) {
		num = n;
		orignum=n;
	}

	public void calculateSum() {

		sum = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			if (digit % 2 == 0) {
				sum = sum + digit;
			}

		}
		
	}

	public void display() {
		System.out.println("The Given Number is " + orignum);
		System.out.println("Sum of Even digits is :" + sum);
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		SumOfEvenDigits obj = new SumOfEvenDigits();
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		obj.setData( n);
		obj.calculateSum();
		obj.display();

	}

}
