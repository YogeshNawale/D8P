package com.modularapproach;

import java.util.Scanner;

//Prog to find if number is Increasing Or Not
public class ProgIncreaseOrDecreasingNo {
	public void checkNo(int num) {
		int lastdigit=num%10;
		int count=0;
		while(num>0) {
			int digit=num%10;
			num=num/10;
			if(digit>lastdigit)
				count++;
			lastdigit=digit;
		}
		if(count==0)
			System.out.println("Increasing no");
		else
			System.out.println("Not a Increasing No");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
	
		ProgIncreaseOrDecreasingNo obj= new ProgIncreaseOrDecreasingNo();
		obj.checkNo(num);
	}

}
