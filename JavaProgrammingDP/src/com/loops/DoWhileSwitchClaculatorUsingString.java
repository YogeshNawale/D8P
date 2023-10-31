package com.loops;
import java.util.*;
public class DoWhileSwitchClaculatorUsingString {

	public static void main(String[] args) {
		// Create  a simple calculator program using integer and string as input
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		do 
		{
			System.out.println("Enter First Operand");
			int num1=sc.nextInt();
			System.out.println("Enter Second Operand");
			int num2=sc.nextInt();
			System.out.println("Enter your choice : add, sub, multi, div");
			String choice=sc.next();
			
			switch(choice)
			{
			case "add":
				System.out.println("Add= "+(num1+num2));
				break;
			case "sub":
				System.out.println("Sub= "+(num1-num2));
				break;
			case "multi":
				System.out.println("Multi= "+(num1*num2));
				break;
			case "div":
				System.out.println("Div= "+(num1/num2));
				break;
			default:
				System.out.println("Invalid choice");
			}
					
		System.out.println("Do you want to continue.....");
		ch=sc.next().charAt(0);
				
		}while(ch=='y'||ch=='Y');
			
			
		}
	
}	
			
			
