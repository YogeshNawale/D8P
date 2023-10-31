package com.loops;
import java.util.*;
public class SwitchDaysInMonth {

	public static void main(String[] args) {
		// Write a Java program print total number of days in a month using switch case 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month as follows\n 1.jan\t 2.feb\t 3.mar\t 4.apr\t 5.may\t 6.june\t"
				+ " 7.july\t 8.aug\t 9.sept\t 10.oct\t 11.nov\t 12.dec\t ");
		int month=sc.nextInt();
		
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("31 Days");
				break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30 Days");
				break;
		case 2:System.out.println("28 or 29 Days");
				break;
		default:System.out.println("Invalid Month");
		}
	
	
	
	
	}

}
