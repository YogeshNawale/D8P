package com.nestedloops;

public class DisplayPattern10 {

	public static void main(String[] args) {
		/* Diaplay Pattern
		1
		10
		101
		1010
		10101					*/

	for (int i=1; i<=5; i++)
	{
		for (int j=1; j<=i; j++)
		{
			if (j%2!=0)
			System.out.print("1");
			else
			System.out.print("0");
		}
		System.out.println();
	}
	}

}
