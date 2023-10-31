package com.loops;
import java.util.*;
public class WhileReverseNo {

	public static void main(String[] args) {
		// WAP to reverse a number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("The Reverse of the number is " +rev);

	}

}
