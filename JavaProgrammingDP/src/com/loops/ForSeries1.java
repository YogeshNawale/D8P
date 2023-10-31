package com.loops;

import java.util.*;

public class ForSeries1 {

	public static void main(String[] args) {
		// sum of series 5  8  12  15  19.......

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		int i, term = 5, sum = 0;
		System.out.print(term+" ");
		for (i = 1; i <= n; i++) {
			sum = sum + term;
			if (i % 2 == 0) {
				term = term + 4;
				System.out.print(term+" ");
			}
			else {
				term = term + 3;
				System.out.print(term+" ");
			}
		}
		System.out.println();
		System.out.println("sum of first "+n+" terms in series = " + sum);
	}

}
