package com.loops;
import java.util.*;
public class WhilePalindromeNo {

	public static void main(String[] args) {
		// WAP to check weather given number is Palindrome or nor
		// i.e num= rev num
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		int originalnum=num;
		
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if (originalnum==rev)
			System.out.println("The given number is Palindrome Number");
		else
			System.out.println("The given number is Not a Palindrome Number");
	}

}
