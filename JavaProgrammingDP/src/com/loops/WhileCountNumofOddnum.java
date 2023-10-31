package com.loops;

public class WhileCountNumofOddnum {

	public static void main(String[] args) {
		// WAP to count number of Odd numbers between 1 to 10
		
		int i=1;
		int count=0;
		while(i<=10)
			{
				if(i%2!=0)
					{ 
					count=count+1;
					}
				i++;
			}
		System.out.print(count);
	}

}
