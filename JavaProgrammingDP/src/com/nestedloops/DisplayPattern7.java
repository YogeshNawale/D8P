package com.nestedloops;

public class DisplayPattern7 {

	public static void main(String[] args) {
		/* Diaplay Pattern
		4321
		432
		43
		4				*/

	for (int i=1; i<=4; i++)
	{
		for (int j=4; j>=i; j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	}

}
