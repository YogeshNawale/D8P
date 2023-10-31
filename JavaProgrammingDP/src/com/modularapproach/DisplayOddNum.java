package com.modularapproach;
import java.util.*;
public class DisplayOddNum {

	public int calculateOddNum(int n)
	{
		int i;
		for( i=1; i<=n ; i++)
		{
			if (i%2!=0)
			System.out.println(i);
		}
		
		return i;
	}
	public static void main(String[] args) {
		// WAP to dispaly Odd number between 1 to n
		Scanner sc= new Scanner(System.in);
		System.out.println("In the range from 1 to n enter the value of n");
		int n=sc.nextInt();

		DisplayOddNum obj=new DisplayOddNum();
		int res=obj.calculateOddNum(n);
		
		
	}

}
