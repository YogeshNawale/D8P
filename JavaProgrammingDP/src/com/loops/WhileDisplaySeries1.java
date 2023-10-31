package com.loops;

public class WhileDisplaySeries1 {

	public static void main(String[] args) {
		// WAP to display the given series till 10th term
		// 1  4  9  16  25.....
		
		int i=1;
		int square;
		while (i<11)
			{
			square=i*i;
			System.out.print(square+"  ");
			i++;
			}
		
	}

}
