package com.test1;

import java.util.Scanner;

/*
 * Q12. Write a code show prime numbers between the range of given numbers. Accept range from user.
 * 		 Eg. Range given by user is 12 to 25 then out put should be 13,17,19,23.
 */
public class PrimeNoInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n,m; // Starting and Ending range 
		System.out.println("Enter Starting range");
		n=sc.nextInt();
		System.out.println("Enter Ending range");
		m=sc.nextInt();
		for(int i=n; i<=m; i++) {
			int count=0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
				if(count==0)
					System.out.print (i + ",");
			
		} 
	}

}
