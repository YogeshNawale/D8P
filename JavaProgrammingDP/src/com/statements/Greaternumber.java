package com.statements;
import java.util.Scanner;
public class Greaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number num1");
		num1=sc.nextInt();
		System.out.println("Enter the Number num2");
		num2=sc.nextInt();
		
		if (num1>num2)
		{
			System.out.println("num1 is Greater");
		}
		else 
		{
			System.out.println("num2 is Greater");
		}

	}

}
