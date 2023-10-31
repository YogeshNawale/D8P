package com.loops;
import java.util.Scanner;
public class WhilePrimeNo {

	public static void main(String[] args) {
		// WAP to check weather a number is prime or not
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int i=2;
		int count =0;
		
		while (i<num)
		{
			if (num%2==0)
			{
				count=1;
				break;
			}
			i++;
		}
		if (count==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	
	
	}

}
