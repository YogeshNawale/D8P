package com.loops;
import java.util.*;
public class WhileSumOfEvenDigits {

	public static void main(String[] args) {
		// WAP to find out the sum of even digits from the number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum=0;
		
		while (num>0)
		{
			int digit=num%10;
			if (digit%2==0)
			{
				sum=sum+digit;
				
			}
			num=num/10;
		}
		System.out.println(sum);

	}

}
