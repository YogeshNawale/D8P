package com.nestedloops;

public class DisplayPattern6 {

	public static void main(String[] args) {
		/* Diaplay Pattern
		1234
		123
		12
		1				*/

	for (int i=4; i>=1; i--)
	{
		for (int j=1; j<=i; j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	}

}
