package com.loops;

public class DisplaySeries1 {

	public static void main(String[] args) {
		// WAP to display the given series till 10th term
		// 1  4  9  16  25.....
		
		int i;
		int square;
		for(i=1; i<=10; i++)
			{
			square=i*i;
			System.out.print(square+"  ");
			}
		
	}
}
