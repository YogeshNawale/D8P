package com.modularapproach;

import java.util.*;

public class ForArmstrongNo {

	public boolean calculateisAmstrong(int num) {
		int sum = 0;
		boolean isarmstrong = true;
		int orignum = num;
		for (int i = num; i > 0; i = i / 10) {
			int rem = num % 10;
			int product = rem * rem * rem;
			sum = sum + product;
			num = num / 10;
		}
		if (orignum % sum == 0)
			isarmstrong = true;
		else
			isarmstrong = false;

		return isarmstrong;

	}

	public static void main(String[] args) {
		// to find if a number is armstrong no. or not
		// eg. 153= 1^3 + 5^3 + 3^3

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		ForArmstrongNo obj = new ForArmstrongNo();
		boolean res = obj.calculateisAmstrong(num);

		if (res == true)
			System.out.println("The Number is Armstrong Number");
		else
			System.out.println("The Number is not a Armstrong Number");

	}

}
