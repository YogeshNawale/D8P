package com.statements;
import java.util.*;
public class OddEvenSwitch {

	public static void main(String[] args) {
		// write code to check given number is odd or even using switch case

		Scanner sc= new Scanner(System.in);
		int num = 0;
		System.out.println("Enter the Number : ");
		num = sc.nextInt();
		switch (num % 2)
		{
			case 0:
				System.out.println("This is a Even Number");
				break;
 
			case 1:
				System.out.println("This is a Odd Number");
				break;
		}
		
	}

}
