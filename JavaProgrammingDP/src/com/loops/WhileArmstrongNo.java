package com.loops;
import java.util.*;
public class WhileArmstrongNo {

	public static void main(String[] args) {
		// WAP to check weather given number is armstrong number or not for any given 3 digit number
		// eg 153= 1^3 + 5^3 + 3^3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");	
		int num=sc.nextInt();
		int result=0;
		int originalnum=num;
		
		while (num>0)
		{
			int digit=num%10;
			result=result+(digit*digit*digit);
			num=num/10;
		}
		if (originalnum==result)
			System.out.println("Number is armstrong number");
		else
			System.out.println("Number is not a armstrong number");

	}

}
