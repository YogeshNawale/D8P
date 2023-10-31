package com.loops;
import java.util.*;
public class WhileFactorial {

	public static void main(String[] args) {
		// WAP to find factorial of a given number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int fact=1;
		
			while(num>0)
			{
				fact=fact*num;
				num--;
				
			}
			System.out.print(fact);
	}
}
