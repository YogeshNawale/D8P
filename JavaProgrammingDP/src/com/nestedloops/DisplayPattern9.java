package com.nestedloops;

public class DisplayPattern9 {

	public static void main(String[] args) {
		/* Diaplay Pattern
		1
		11
		111
		1111				*/

	for (int i=1; i<=4; i++)
	{
		for (int j=1; j<=i; j++)
		{
			System.out.print('1');
		}
		System.out.println();
	}
	}

}
