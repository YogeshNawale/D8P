package com.loops;
import java.util.*;
public class BaseExponent {

	public static void main(String[] args) {
		// WAP for given Base and Exponent
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Base Number");
		int base= sc.nextInt();
		System.out.println("Enter the Exponent");
		int expo= sc.nextInt();
		int power=1;
		
		for (int i=1; i<=expo; i++)
		{
			power=power*base;
		}
		System.out.println(base +" to the power "+  expo +" = "+  power);

	}

}
