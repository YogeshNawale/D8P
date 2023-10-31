package com.loops;
import java.util.*;
public class WhileBaseExponent {

	public static void main(String[] args) {
		// WAP for given Base and Exponent
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Base Number");
		int base=sc.nextInt();
		System.out.println("Enter the Exponent Number");
		int expo=sc.nextInt();
		int power=1;
		int i=1;
		
		while(i<=expo)
		{
			power=power*base;
			i++;
		}
		System.out.print(power);
		
	}

}
