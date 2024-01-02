package com.arraybasics.assignments;

import java.util.Scanner;

/*
 * 6.	Write two methods that return the average of an array with following headers.
		a.	public static int average(int[] array)
		b.	public static double average(double[] array).
		c.	Write main and invoke the 2 methods.

 */
public class AverageArray {

	public static double[] createArray() {
		double num[];
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		num= new double[size];
		
		for (int i=0; i<num.length; i++) {
			System.out.println(" Enter "+ (i+1) + " ELement");
			num[i]= sc.nextDouble();
		}
		
		return num;
	}
	public static void printArray(double num[]) {
		System.out.println(" Given Array is : ");
		for (double a: num)
			System.out.print(a+"  ");
		System.out.println();
	}
	public static int average(int[] array) {
		int sum=0;
		for (int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		int avg=sum/array.length;
		return avg;
	}
	public static double average(double[] array) {
		double sum=0;
		for (int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		double avg=(double)sum/array.length;
		return avg;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=Array1.createArray();
		Array1.printArray(arr);
	
		int avg=average(arr);
		System.out.println("Average of Array = "+ avg);
		
		double arr1[]=createArray();
		printArray(arr1);
		
		double avg1=average(arr1);
		System.out.println("Average of Array = "+ avg1);
	
	}

}
