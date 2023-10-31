package com.statements;
import java.util.*;
public class Displaynumber {

	public static void main(String[] args) {
		// write a code to display 1 to 5 numbers using switch
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num between 1 to 5");
		num=sc.nextInt();
		
		switch(num)
		{
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		case 5: System.out.println("Five");
		break;
		default:System.out.println("Invalid Number");
		
		}

	}

}
