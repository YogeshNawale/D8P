package com.arraybasics;

import java.util.Scanner;

// Create marks integer(out of 100) array and find total percentage and grade
public class PercentageGradeArray {

	public static int[] createArray() {
		int num[];
		System.out.println("Enter Size of Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter " + (i + 1) + " Element");
			num[i] = sc.nextInt();
		}
		sc.close();
		return num;
	}

	public static void printArray(int num[]) {
		System.out.println();
		for (int a : num)
			System.out.print(a + "  ");
	}

	public static double calculatePercentage(int num[]) {
		System.out.println();
		int sum = 0;
		for (int a : num) {
			sum = sum + a;
		}
		double perc =  ((double)sum / num.length);
		System.out.println("Percentage of Elements of Array is : " + perc);
		return perc;
	}
		
	public static void calculateGrade(double perc) {		
		 
		if (perc > 80)
			System.out.println("Grade A");
		else if (perc > 60)
			System.out.println("Grade B");
		else if (perc > 40)
			System.out.println("Grade C");
		else
			System.out.println("Grade D");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = createArray();
		printArray(arr);
		double p= calculatePercentage(arr);
		calculateGrade(p);

	}

}
