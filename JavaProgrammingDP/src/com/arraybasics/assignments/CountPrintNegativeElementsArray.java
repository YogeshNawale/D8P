package com.arraybasics.assignments;
//8.WAP to print all negative elements in an array and also count total number of negative elements in an array.
public class CountPrintNegativeElementsArray {

	public static void countNegative(int num[]) {
		int count=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]<0)
				count++;
		}
		System.out.println("Count of Negative Elements is : "+ count);
		
	}
	
	public static void printNegative(int num[]) {
		for(int i=0; i<num.length; i++) {
			if(num[i]<0)
				System.out.print (num[i]+ "  ");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= Array1.createArray();
		Array1.printArray(arr);
		
		countNegative(arr);
		printNegative(arr);
		
	}

}
