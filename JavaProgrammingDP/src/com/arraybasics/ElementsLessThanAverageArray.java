package com.arraybasics;
// Find all the elements of array which is less than its average
import java.util.Scanner;

public class ElementsLessThanAverageArray {

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
	public static double calculateAverage(int num[]) {
		System.out.println();
		int sum=0;
		for(int a: num)
			sum=sum+a;
		double avg= sum/num.length;
		System.out.println("Average of Elements of Array is : "+ avg);
		return avg;
	}
	public static void printElementsLessThanAverage(int num[],double avg) {
	 
		for (int i=0; i<num.length; i++) {
			if(num[i]<avg)
				System.out.print(num[i] + "  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=createArray();
		printArray(arr);
		double avg = calculateAverage(arr);
		printElementsLessThanAverage(arr,avg);
		
	}

}
