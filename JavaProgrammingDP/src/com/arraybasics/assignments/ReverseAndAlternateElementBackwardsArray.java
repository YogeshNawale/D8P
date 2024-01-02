package com.arraybasics.assignments;
//WAP to print reverse of an array. Also print every alternate element backwards.
public class ReverseAndAlternateElementBackwardsArray {

	public static void printReverse(int num[]) {
		System.out.println("Reverse Elements of array");
		for (int i=num.length-1; i>=0; i--) {
			System.out.print(num[i]+ "  ");
		}
		System.out.println();
	}
	public static void printAlternate(int num[]) {
		
		System.out.println("Alternate Reverse Elements of array");
		for (int i=num.length-1; i>=0; i=i-2) {
			System.out.print(num[i]+ "  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=Array1.createArray();
		Array1.printArray(arr);
		printReverse(arr);
		printAlternate(arr);
	}

}
