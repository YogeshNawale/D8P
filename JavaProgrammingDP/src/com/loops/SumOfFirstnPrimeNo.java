package com.loops;

import java.util.Scanner;

public class SumOfFirstnPrimeNo {

	public boolean checkPrime(int num) {
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0) {
			return true;
		} else
			return false;
	}

	public void sumPrime(int n) {
		int sum = 0;
		int cnt = 0;

		for (int i = 2; cnt < n; i++) {
			if (checkPrime(i)) {
				sum = sum + i;
				cnt++;
			}
		}

		System.out.println("Sum of first "+n +" Prime Numbers is "+ sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of prime Numbers to be added");
		int n = sc.nextInt();

		SumOfFirstnPrimeNo obj = new SumOfFirstnPrimeNo();
		obj.sumPrime(n);

	}

}
