package com.arraybasics.assignments;
//9.	WAP to arrange the elements of an given array of integers 
//		where all Even integers appear before all the Odd integers.
public class ArrangeEvenIntegerBeforeOddIntegerArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12, 3, -19, 29, 5, -60, 44, 7, -9 };
		
		for (int i=0; i<arr.length; i++) {
			int j=i;
			
			while(j>0 && arr[j]%2==0 && arr[j-1]%2!=0) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
		
		for (int a: arr)
			System.out.print(a+ "  ");
	}

}
