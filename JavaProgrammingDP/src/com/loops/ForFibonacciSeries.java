package com.loops;

public class ForFibonacciSeries {

	public static void main(String[] args) {
		// fibonacci series
		// eg 0, 1, 1, 2, 3, 5, 8, 13...
		
		int n=10;
		int firstterm=0;
		int secondterm=1;
		System.out.print("0 1 ");
		for(int i=1; i<=n-2; i++) {
			int nextterm= firstterm + secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			
			System.out.print( nextterm+" ");
			
		}

	}

}
