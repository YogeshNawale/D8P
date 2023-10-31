package com.loops;

public class DoWhileSumOdd {

	public static void main(String[] args) {
		// Find sum of odd numbers between 1 to 15 using do while loop
		
		int i=1, sum=0;
		do 
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		i++;
	
		}while(i<=15);
		System.out.println(sum);

	}

}
