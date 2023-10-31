package com.statements;
import java.util.*;
public class DisplayWord {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		if (num==1)
		{
			System.out.println("one");
		}
		else if (num==2)
		{
			System.out.println("Two");
		}
		else if (num==3)
		{
			System.out.println("Three");
		}
		else if (num==4)
		{
			System.out.println("Four");
		}
		else if (num==5)
		{
			System.out.println("Five");
		}
		else
		{
			System.out.println("Invalid Number");
		}
	}

}
