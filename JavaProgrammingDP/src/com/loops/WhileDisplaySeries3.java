package com.loops;

public class WhileDisplaySeries3 {

	public static void main(String[] args) {
		//  Write a program in Java to display the first 10 terms of the following series:
		// 1  8  27  64 ……..
		
		int i=1,cube;
		while (i<11)
			{
			cube=i*i*i;
			System.out.print(cube+"  ");
			i++;
			}
		
	}

}
