package com.modularapproach;

import java.util.Scanner;

public class ForFactorialOfNum {

	public int calculateFactorial(int num)
	{
		int fact=1;
		for (int i=1; i<=num; i++)
			{
			fact=fact*i;
			}
			return fact;
	}
	
	public static void main(String[] args) {
		// To find factorial of a number using for loop
		
		ForFactorialOfNum obj=new ForFactorialOfNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int res=obj.calculateFactorial(num);
		
		
		System.out.println("Factorial of "+ num +" is: "+ res);

	}

}
