package com.modularapproach;

import java.util.*;

public class DemoArmstrong {

	public int digitCount(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public int power(int base, int expo) {
		int power = 1;
		for (int i = 1; i <= expo; i++)
			power = power * base;
		return power;
	}

	public boolean checkArmstrong(int num) {
		int cnt = digitCount(num);
		System.out.println("Digit Count is " + cnt);
		int sum = 0;
		int temp = num;

		while (num != 0) {
			int rem = num % 10;
			sum = sum + power(rem, cnt);
			System.out.println("Power of " + rem + " is" + sum);
			num = num / 10;

		}
		if (sum == temp)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// to find if a number is armstrong no. or not
		// eg. 153= 1^3 + 5^3 + 3^3
		// eg. 1634
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		DemoArmstrong obj = new DemoArmstrong();
		if (obj.checkArmstrong(num))
			System.out.println("Number is Armstrong Number");
		else
			System.out.println("Number is not a Armstrong Number");
	}

}
