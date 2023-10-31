package com.modularapproach;

import java.util.*;

public class FindHarshadNum {

	public boolean checkHarshadNo(int num) {
		int sum = 0;
		int orignum = num;
		boolean isharshad = true;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if (orignum % sum == 0)
			isharshad = true;
		else
			isharshad = false;
		return isharshad;
	}

	public static void main(String[] args) {
		// To Find if a number is a Harshad number or not
		// a harshad number (or Niven number) is an integer that is divisible by the sum
		// of its digits .

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		FindHarshadNum obj = new FindHarshadNum();
		boolean res = obj.checkHarshadNo(num);

		if (res == true)
			System.out.println("The Number is Harshad Number");
		else
			System.out.println("The Number is not a Harshad Number");

	}

}
