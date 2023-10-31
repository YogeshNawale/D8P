package com.loops;

public class WhileDisplaySeries4 {

	public static void main(String[] args) {
	//  Write a program in Java to display the first 10 terms of the following series:
			// 1  8  9  64 25……..
			
			int i=1,square,cube;
			while (i<11)
				{
				if(i%2==0)
				{
					cube=i*i*i;
					System.out.print(cube+"  ");
					i++;
				}
				else
				{
					square=i*i;
					System.out.print(square+"  ");
					i++;
				}
				}
	}

}
