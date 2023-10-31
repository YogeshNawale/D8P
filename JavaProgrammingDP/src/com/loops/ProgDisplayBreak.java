package com.loops;

public class ProgDisplayBreak {

	public static void main(String[] args) {
// WAP to display number between 1 to 20. If any number is divisible by 2 and 9 then stop to display number
	
		int i;
		for (i=1; i<=20; i++)
		{
			if (i%2==0 && i%9==0)
				{
				break;
				}
			else 
				System.out.println(i);
		}
		
	}
}
