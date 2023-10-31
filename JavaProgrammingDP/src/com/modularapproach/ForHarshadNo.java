package com.modularapproach;

import java.util.*;

public class ForHarshadNo {

	public boolean calculateHarshadNo(int num) {
		int sum = 0;
		int orignum = num;
		boolean isharshad = true;
		for (int i = num; i > 0; i = i / 10) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if (orignum % sum == 0) {
			isharshad = true;
		} else {
			isharshad = false;
		}

		return isharshad;

	}

	public static void main(String[] args) {
		// To Find if a number is a Harshad number or not
		// a harshad number (or Niven number) is an integer that is divisible by the sum
		// of its digits .

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		ForHarshadNo obj = new ForHarshadNo();
		boolean res = obj.calculateHarshadNo(num);

		if (res == true)
			System.out.println("The Number is Harshad Number");
		else
			System.out.println("The Number is not a Harshad Number");

	}

}
