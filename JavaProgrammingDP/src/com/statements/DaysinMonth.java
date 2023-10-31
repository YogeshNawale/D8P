package com.statements;
import java.util.*;
public class DaysinMonth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month as jan,feb,mar,april,may,june,july,aug,sept,oct,nov,dec");
		String month=sc.next();
		
		switch(month)
		{
		case "jan":System.out.println("janaury has 31 days");
		break;
		case "mar":System.out.println("March has 31 days");
		break;
		case "may":System.out.println("May has 31 days");
		break;
		case "july":System.out.println("July has 31 days");
		break;
		case "aug":System.out.println("August has 31 days");
		break;
		case "oct":System.out.println("October has 31 days");
		break;
		case "dec":System.out.println("December 31 days");
		break;
		case "april":System.out.println("April has 30 days");
		break;
		case "june":System.out.println("June has 30 days");
		break;
		case "sept":System.out.println("September has 30 days");
		break;
		case "nov":System.out.println("November has 30 days");
		break;
		case "feb":System.out.println("Febeurary has 28 or 29 days");
		break;
		default:System.out.println("Invalid Month");
		}
		
	}

}
