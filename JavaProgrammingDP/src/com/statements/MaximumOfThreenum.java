package com.statements;

import java.util.Scanner;

public class MaximumOfThreenum {
	public static void main(String[] args) {
	int num1,num2,num3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num1");
	num1=sc.nextInt();
	System.out.println("Enter num2");
	num2=sc.nextInt();
	System.out.println("Enter num3");
	num3=sc.nextInt();
	
	if (num1>num2) 
		{ if (num1>num3)
			{
				System.out.println("Print num1 is Greater");
			}
		else
			{
				System.out.println("Print num3 is Greater");
			}
		}	
		
	else 
		{
		 if (num2>num3)
		 {
			 System.out.println("Print num2 is Greater");
		 }
		 else
		 {
			 System.out.println("Print num3 is Greater");
		 }
		} 
	}
}