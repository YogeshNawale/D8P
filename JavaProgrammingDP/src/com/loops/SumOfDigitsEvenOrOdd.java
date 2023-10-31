package com.loops;

import java.util.Scanner;

public class SumOfDigitsEvenOrOdd {
//Wap to check sum of digits of a given number is odd or even 

	public void checkEvenOrOdd(int num) {
		int sum=0;
		while (num > 0) {
			int digit = num % 10;
			sum=sum+digit;
			num = num / 10;
		}
		if(sum%2==0)
			System.out.println("sum of digits is Even " );
		else
			System.out.println("sum of digits is Odd " );
			

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		
		SumOfDigitsEvenOrOdd obj= new SumOfDigitsEvenOrOdd();
		obj.checkEvenOrOdd(num);
		
		
	}

}
