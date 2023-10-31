package com.nestedloops;

public class DisplayTableBetn1To5 {

	public static void main(String[] args) {
		//Write code to display table between 1 to 5
		
		for(int i=1; i<=5; i++)
		{
			//int result=1;
			for (int j=1; j<=10; j++)
			{
				int result=i*j;
				System.out.print(result+"\t");
				
			}
			System.out.println();
		}

	}

}
