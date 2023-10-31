package com.statements;
import java.util.*;
public class StudentSelectedlogical {

	public static void main(String[] args) {
		//  A student is selected if the canditate is a passout of year 2022 ad has perc>=60
		
		int perc,year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Percentage");
		perc=sc.nextInt();
		System.out.println("Enter the passout Year");
		year=sc.nextInt();
		
		if (year==2022 && perc>=60)
		{
			System.out.println("Student is Selected");
		}
		else
		{
			System.out.println("Student is Not Selected");
		}
	}

}
