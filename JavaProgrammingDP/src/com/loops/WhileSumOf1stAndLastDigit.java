package com.loops;
import java.util.Scanner;
public class WhileSumOf1stAndLastDigit {

	public static void main(String[] args) {
		// WAP to display Sum of first digit and last digit for a given number
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum, firstdigit=0;
		int lastdigit=num%10;
		
		while(num>0)
		{
			firstdigit=num%10;
			num=num/10;
		}
		sum=firstdigit+lastdigit;
		System.out.println("Sum of first digit and last digit= "+ sum);

	}

}
