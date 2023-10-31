package com.loops;

public class DisplaySeries5 {

	public static void main(String[] args) {
		// Write the program in Java to display the first ten terms of the following series:
		// 1 8 9 64 25

		int i;
		int square,cube;
		for(i=1; i<=10; i++)
			{
			if(i%2==0)
			{
				cube=i*i*i;
				System.out.print(cube+"  ");
			}
			else
			{
			square=i*i;
			System.out.print(square+"  ");
			}
			}
	}

}
