package com.loops;

public class SumEvenNo {

	public static void main(String[] args) {
		// WAP to display sum of even numbers between 1 to 20
		
		int i=1;
		int sum=0;
		
		while (i<=20)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
