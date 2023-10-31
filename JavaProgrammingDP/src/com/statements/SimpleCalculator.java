package com.statements;
import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		// 
		int num1, num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		System.out.println("1. Add  \n 2. Sub \n 3. Multi \n 4. Div \n 5. Mod");
		System.out.println("ENter your Choice from above menu");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Addition= "+(num1+num2));
		break;
		case 2:System.out.println("Substraction= "+(num1-num2));
		break;
		case 3:System.out.println("Multiplication= "+(num1*num2));
		break;
		case 4:System.out.println("Division= "+(num1/num2));
		break;
		case 5:System.out.println("Modulus= "+(num1%num2));
		break;
		default:System.out.println("Invalid Choice");
		
		
		
		}

	}

}
