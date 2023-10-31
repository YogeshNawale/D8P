package com.modularapproach;

import java.util.Scanner;

// 2  3  5  7  11  13  17......
public class ProgSeries3Prime {

	public void calculatePrime(int num) {

		int count;

		for (int i = 1; i <= num; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.print(i+"  ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto ");
		int num = sc.nextInt();

		ProgSeries3Prime obj = new ProgSeries3Prime();
		obj.calculatePrime(num);
	}

}
