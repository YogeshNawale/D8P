package com.statements;
import java.util.*;
public class DayName {

	public static void main(String[] args) {
		// write code to take day number as a input from the user and display its day name as per the input
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		switch(number)
		{
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("Invaild Number");
		}
	}

}
