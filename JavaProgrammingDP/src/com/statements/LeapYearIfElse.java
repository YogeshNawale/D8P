package com.statements;
import java.util.*;
public class LeapYearIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the given Year");
		year=sc.nextInt();
		
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0)
					System.out.println(year + "is a leap year");
				else
					System.out.println(year + "is a not leap year");
			}
			else
			System.out.println(year + "is a leap year");
		}
		else
			System.out.println(year + "is a not leap year");
	}

}
