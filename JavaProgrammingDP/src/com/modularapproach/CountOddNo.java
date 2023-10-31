package com.modularapproach;
import  java.util.*;
public class CountOddNo {

	public int calculatecount(int num)
	{
		int count=0;
		
		for (int i=1; i<=num; i++)
		{
			if (i%2!=0)
			{
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// WAP to count number of odd numbers between 1 to 10
		
		Scanner sc= new Scanner(System.in);
		System.out.println("In the range from 1 to n enter the value of n");
		int num=sc.nextInt();
		CountOddNo obj=new CountOddNo();
		int res=obj.calculatecount(num);
		
		System.out.println(res);

	}

}
