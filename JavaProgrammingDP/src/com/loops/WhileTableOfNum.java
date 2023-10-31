package com.loops;
import java.util.*;
public class WhileTableOfNum {

	public static void main(String[] args) {
		// WAP to find out the table of a given number
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=1;
		
		while(i<=10)
		{
			int result=num*i;
			System.out.println(result);
			i++;
		}

	}

}
