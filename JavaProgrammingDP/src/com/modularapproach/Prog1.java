package com.modularapproach;
// Write your own method to satisfy the relationship between the inputs and outputs
// eg 832=>594,   52=>36 ,  665=>99,    149=>0
import java.util.Scanner;

public class Prog1 {

	public void calculateNum(int num) {
		int rev=0;
		int orignum=num;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		rev=orignum-rev;
		if (rev>0)
			System.out.println(rev);
		else
			System.out.println("0");
	}
	public static void main(String[] args) {
		// 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		Prog1 obj= new Prog1();
		obj.calculateNum(num);

	}

}
