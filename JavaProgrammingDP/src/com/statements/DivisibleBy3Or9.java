package com.statements;
import java.util.*;
public class DivisibleBy3Or9 {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number");
		num= sc.nextInt();
		
		if (num%3==0 && num%9==0)
		{
			System.out.println("Number is Divisible by both 3 and 9");
		}
		else if (num%9==0)
		{
			System.out.println("Number is Divisible by 9");
		}
		else if (num%3==0)
		{
			System.out.println("Number is Divisible by 3");
		}
		else
		{
			System.out.println("Number is not Divisible by 3 or 9");
		}

	}

}
