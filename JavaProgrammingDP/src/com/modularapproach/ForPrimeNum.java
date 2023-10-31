package com.modularapproach;
import java.util.*;
public class ForPrimeNum {

	public boolean calculateisprime(int num)
	{
		boolean isprime=true;
		
		for (int i=2; i<num; i++)
		{
			if (num%i==0)
			{
				isprime=false;
				break;
			}
		}
		return isprime;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ForPrimeNum obj=new ForPrimeNum();
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		boolean res=obj.calculateisprime(num);
		
		
		if(res==true)
		{
			System.out.println("number is prime");
		}
		else
			System.out.println("number is not prime");
			
	}

}
