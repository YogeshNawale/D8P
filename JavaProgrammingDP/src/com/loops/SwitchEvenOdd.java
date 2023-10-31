package com.loops;
import java.util.*;
public class SwitchEvenOdd {

	public static void main(String[] args) {
		// Write a Java program to check whether a number is even or odd using switchcase 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
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
