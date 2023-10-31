package com.test1;

import java.util.Scanner;

/*
 * Q3.Write Java Code to generate output as Specified…
e		g.Given number is 345 then show output of 3^1 +  4^2 +  5^3 so, 3+16+125 i.e. 144 	     [2]

 */
public class SumOfPowerOfDigits {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * SumOfPowerOfDigits obj = new SumOfPowerOfDigits(345); obj.calculateCount();
		 * obj.calculateSum();
		 * 
		 * System.out.println(obj);
		 */
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number");
		int num= sc.nextInt();
		int temp=num;
		int count=0;
		int sum=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		
		for(int i=0; temp!=0; i++) {
			int power=1;
			int rem=temp%10;
			int count1=count;
			for(int j=1; count1>0; j++) {
				power= rem* power;
				count1--;
			}
			sum=sum+power;
			temp=temp/10;
			count--;
		}
		System.out.println(" Sum Of Decreasing Power of Digits is : " + sum);
	}

}
