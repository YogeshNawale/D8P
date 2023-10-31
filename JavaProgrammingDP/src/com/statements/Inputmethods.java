package com.statements;
import java.util.Scanner;
public class Inputmethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter byte");
		byte num = sc.nextByte();
		System.out.println(num);
		
		System.out.println("Enter short");
		short num1=sc.nextShort();
		System.out.println(num1);
		
		System.out.println("Enter integer");
		int num2=sc.nextInt();
		System.out.println(num2);
		
		System.out.println("Enter long");
		long num3=sc.nextLong();
		System.out.println(num3);
		
		System.out.println("Enter Float");
		float num4=sc.nextFloat();
		System.out.println(num4);
		
		System.out.println("Enter Double");
		double num5=sc.nextDouble();
		System.out.println(num5);
	
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		
		System.out.println("Enter String");
		String name=sc.next();
		System.out.println(name);
		
		System.out.println("Enter boolean");
		boolean cond=sc.nextBoolean();
		System.out.println(cond);

	}

}
