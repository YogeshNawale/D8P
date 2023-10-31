package com.modularapproach;

import java.util.*;

public class CheckTechinicalNo {
	public int digitCount(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public void calculateResult(int num) {
		int cnt= digitCount(num);
		System.out.println(cnt);
		int power=1;
		int temp=num;
		
		for (int i=1; i<=cnt/2; i++) {
			power= power*10;
		}
		if(cnt%2==0) {
			int num1=temp/power;
			int num2=temp%power;
			int sum=num1+num2;
			int square=sum*sum;
			if(square==temp)
				System.out.println("Techinical Number");
			else
				System.out.println("Not a techinical number");
		}
		else
			System.out.println("Not a techinical number");
		
		
	}

	public static void main(String[] args) {
		// To find if number is a techinical no. or not
		/* A number is said to be a tech number, when an even digit number is divided 
		 * into exactly two parts and the square value of the sum of those two numbers is 
		 * equal to the original number. */
		// eg 3025 3025=(30^2 + 25^2)
		// eg 195 195!= (19^2 + 5^2)

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		CheckTechinicalNo obj=new CheckTechinicalNo();
		obj.calculateResult(num);
		
	}

}
