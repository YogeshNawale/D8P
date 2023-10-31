package com.loops;
 import java.util.*;
public class WhileCountNoOfDigit {

	public static void main(String[] args) {
		// WAP to count the number of digits from the number
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;

		
		while (num>0)
		{
			num=num/10;
			count=count+1;
		}
		System.out.println(count);
	}

}
