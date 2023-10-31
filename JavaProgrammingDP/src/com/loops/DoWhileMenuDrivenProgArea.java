package com.loops;
import java.util.Scanner;
public class DoWhileMenuDrivenProgArea {

	public static void main(String[] args) {
		// WAP to perform Menu Driven Prog Using Do while and switch to calculate area of rectangle, circle
		// traingle, square as per the user choice
		
		double length, breadth, side, radius, base, height, area;
		char ch;
		Scanner sc=new Scanner(System.in);
		
		do
			{
			System.out.println("1.Area of Rectangle\n 2.Area of Circle\n 3.Area of Traingle\n 4.Area of Square");
			System.out.println("Enter your choice from above menu");
			int choice=sc.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter length of Rectangle");
				length=sc.nextDouble();
				System.out.println("Enter Breadth of Rectangle");
				breadth=sc.nextDouble();
				area=length*breadth;
				System.out.println(area);
				break;
			case 2:
				System.out.println("Enter Radius of Circle");
				radius=sc.nextDouble();
				area=3.14*radius*radius;
				System.out.println(area);
				break;
			case 3:
				System.out.println("Enter base of traingle");
				base=sc.nextDouble();
				System.out.println("Enter height of Traingle");
				height=sc.nextDouble();
				area=(base*height)/2;
				System.out.println(area);
				break;
			case 4:
				System.out.println("Enter the side of Square");
				side=sc.nextDouble();
				area=side*side;
				System.out.println(area);
				break;
			default :
				System.out.println("Invalid choice");
			
			}
			System.out.println("Do you want to continue.....");
			ch=sc.next().charAt(0);
			
			}while(ch=='y'||ch=='Y');
		 
		 
	}

}
