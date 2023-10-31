package com.loops;

public class WhileDisplaySeries2 {

	public static void main(String[] args) {
		// Write a program in Java to display the first 10 terms of the following series:
		// 10, 20, 30, 40, ……..
		
		int i=1;
		int result;
		
		while (i<11)
			{
			result=i*10;
			System.out.print(result+"  ");
			i++;
			}
		
	}

}
