package com.modularapproach;

import java.util.Scanner;

public class ClaculateGreatestDigitInNumber {

	public int calulateCount(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	
	public void calculateResult(int num) {
		int temp=0;
		int cnt=calulateCount(num);
		System.out.println("Number of DIgits :" + cnt);
		for (int i=1; i<=cnt; i++)
		{
			int rem=num%10;
			num=num/10;
			if (rem>temp) {
				temp=rem;
			}

		}
		System.out.println("Greatest digit is "+temp);
	}
	public static void main(String[] args) {
		// To find greatest digit in a given number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		ClaculateGreatestDigitInNumber obj= new ClaculateGreatestDigitInNumber();
		obj.calculateResult(num);
	}

}
