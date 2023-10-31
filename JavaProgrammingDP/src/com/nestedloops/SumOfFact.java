package com.nestedloops;
import java.util.*;
public class SumOfFact {

	public static void main(String[] args) {
		// Find the sum of 1!+2!+3!+4!+.....+n!
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range n");
		int n=sc.nextInt();
		int sum=0;
		
		for(int num=1; num<=n; num++)
		{
			int fact=1;
			for(int j=1; j<=num; j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		}
		System.out.print(sum);
	}

}
