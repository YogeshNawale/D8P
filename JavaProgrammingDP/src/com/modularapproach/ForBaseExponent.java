package com.modularapproach;

import java.util.Scanner;

public class ForBaseExponent {

	public int calculatePower(int expo, int base)
	{
		int power=1;
		
		for (int i=1; i<=expo; i++)
		{
			power=power*base;
		}
		return power;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Base Number");
		int base= sc.nextInt();
		System.out.println("Enter the Exponent");
		int expo= sc.nextInt();
		
		ForBaseExponent obj=new ForBaseExponent();
		int res=obj.calculatePower(expo, base);
		
		System.out.println(base +" to the power "+  expo +" = "+  res);

	}

}
