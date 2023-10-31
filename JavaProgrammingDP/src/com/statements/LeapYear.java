package com.statements;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Year");
		year=sc.nextInt();
		if	(year%400==0 || (year%100!=0 && year%4==0)) {
			System.out.println(year + "is a leap Year");
		}
			else {
				System.out.println(year + "is not aleap Year");
			}
			}
		

}
