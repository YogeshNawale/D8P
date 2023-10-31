package com.loops;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		// WAP to find out the table of given number
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(i=1; i<=10 ; i++)
		{
			System.out.println(num*i);
		}
		
	}

}
