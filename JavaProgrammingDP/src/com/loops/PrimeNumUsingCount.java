package com.loops;

import java.util.Scanner;

public class PrimeNumUsingCount {

	public static void main(String[] args) {
		// // Prime Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int count=0;
		
		for (int i=2; i<num; i++)
		{
			if (num%i==0)
			{
				count=1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("number is prime");
		}
		else
			System.out.println("number is not prime");
			
	}

}
