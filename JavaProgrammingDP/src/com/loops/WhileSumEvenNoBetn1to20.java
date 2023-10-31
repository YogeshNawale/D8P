package com.loops;

public class WhileSumEvenNoBetn1to20 {

	public static void main(String[] args) {
		// WAP to Display Sum of Even Number Between 1 to 20
		
		int i=1;
		int sum=0;
		
		while (i<=20)
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.print(sum);

	}

}
