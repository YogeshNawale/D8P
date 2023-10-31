package com.modularapproach;

import java.util.*;

public class DoWhileClaculator {

	public void calculateBasicOperations(int num1, int num2) {

		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add\n 2.Sub\n 3.Multi\n 4.Div\n 5.Mod");
			System.out.println("Enter the choice from Menu");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Add= " + (num1 + num2));
				break;
			case 2:
				System.out.println("Sub= " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multi= " + (num1 * num2));
				break;
			case 4:
				System.out.println("Div= " + (num1 / num2));
				break;
			case 5:
				System.out.println("Mod= " + (num1 % num2));
				break;
			default:
				System.out.println("Invalid choice");
			}

			System.out.println("Do you want to continue.....");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

	public static void main(String[] args) {
		// Write a Menu Driven Program for a calculator using do while loop

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		
		DoWhileClaculator obj=new DoWhileClaculator();
		obj.calculateBasicOperations(num1, num2);
		
	}

}
