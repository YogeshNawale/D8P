package com.nestedloops;

public class DisplayPattern2 {

	public static void main(String[] args) {
		/* Diaplay Pattern
		*
		**
		***
		****					*/

	for (int i=1; i<=4; i++)
	{
		for (int j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
