package com.modularapproach;

import java.util.Scanner;

public class ForDisplaySeries {

	public void displaySeries(int n) {
		int i;
		int square, cube;
		for (i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				cube = i * i * i;
				System.out.print(cube + "  ");
			} else {
				square = i * i;
				System.out.print(square + "  ");
			}
		}
	}

	public static void main(String[] args) {
		// Write the program in Java to display the first ten terms of the following
		// series:
		// 1 8 9 64 25

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range 1 to n where n=");
		int n = sc.nextInt();

		ForDisplaySeries res = new ForDisplaySeries();
		res.displaySeries(n);

	}
}
