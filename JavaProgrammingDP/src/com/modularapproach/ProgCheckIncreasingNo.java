package com.modularapproach;
// //Prog to find if number is Increasing Or Not
import java.util.Scanner;

public class ProgCheckIncreasingNo {
	
	public boolean checkNo(int num) {
		int lastdigit=num%10;
		boolean count=false;
		while(num>0) {
			int digit=num%10;
			num=num/10;
			if(digit>lastdigit)
				count=true;
			lastdigit=digit;
		}
		return count;
		
	}
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		ProgCheckIncreasingNo obj= new ProgCheckIncreasingNo();
		boolean count=obj.checkNo(num);
		
		if(count==false)
			System.out.println("Increasing no");
		else
			System.out.println("Not a Increasing No");
		
	}
}
