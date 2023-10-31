package com.modularapproach;
import java.util.*;
public class AddNum {

	public int calculateAdd(int a, int b )
	{
		int sum=a+b;
		System.out.println("a+b: "+sum);
		return sum;
	}
	public static void main(String[] args) {
		// Addition of two numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		
		AddNum obj=new AddNum();
		int sum=obj.calculateAdd(a, b);
		
	}

}
