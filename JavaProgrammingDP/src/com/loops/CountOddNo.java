package com.loops;

public class CountOddNo {

	public static void main(String[] args) {
		// WAP to count number of odd numbers between 1 to 10
		
		int i;
		int count=0;
		
		for (i=1; i<=10; i++)
		{
			if (i%2!=0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
