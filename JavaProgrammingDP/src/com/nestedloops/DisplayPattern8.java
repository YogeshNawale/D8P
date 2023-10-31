package com.nestedloops;

public class DisplayPattern8 {

	public static void main(String[] args) {
		/* Diaplay Pattern
		****
		***
		**
		*					*/

	for (int i=4; i>=1; i--)
	{
		for (int j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
