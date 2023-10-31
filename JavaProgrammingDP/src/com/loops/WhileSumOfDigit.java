package com.loops;
import java.util.*;
public class WhileSumOfDigit {

	public static void main(String[] args) {
		// WAP to calculate sum of digits of a given number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");	
		int num=sc.nextInt();
		int sum=0;
		
		while (num>0)
		{
			int digit=num%10;
			sum= sum+digit;
			num=num/10;
		}
		System.out.println(sum);
	
	
	
	}

}
