package com.Oops;

import java.util.Scanner;

public class BouncingNo {
	int num, orignum,count;

	public void setData(int n) {
		num = n;
		orignum = n;
	}

	public void checkIncreasingNo() {
		int lastdigit=num%10;
		count=0;
		while(num>0) {
			int digit=num%10;
			num=num/10;
			if(digit>lastdigit)
				count++;
			lastdigit=digit;
		}
		if(count==0)
			System.out.println("Increasing Number");
	
		
	}

	public void checkDecreasingNo() {
		num = orignum;
		int lastdigit = num % 10;
		count = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			if (digit < lastdigit)
				count++;
			lastdigit = digit;
		}
		if (count == 0)
			System.out.println("Decreasing Number");

	}
	
	public void checkBouncingNo() {
		
		if(count!=0)
			System.out.println("Bouncing Number");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BouncingNo obj = new BouncingNo();
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		obj.setData(n);
		obj.checkIncreasingNo();
		obj.checkDecreasingNo();
		obj.checkBouncingNo();
	}

}
