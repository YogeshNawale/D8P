package com.nestedloops;

public class DisplayPattern5 {

	public static void main(String[] args) {
		/* Diaplay Pattern
		4444
		333
		22
		1				*/

	for (int i=4; i>=1; i--)
	{
		for (int j=1; j<=i; j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	}

}
