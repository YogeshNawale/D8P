package com.loops;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// Prime Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		boolean isprime=true;
		
		for (int i=2; i<num; i++)
		{
			if (num%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime==true)
		{
			System.out.println("number is prime");
		}
		else
			System.out.println("number is not prime");
			

	}

}
