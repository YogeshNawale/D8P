package com.arraybasics.assignments;
//12.	WAP to shuffle array. Means e.g. arr[] = [5, 6, 23, 67, 39, 10, 2]
//		So output array is [6, 23, 67, 39, 10, 2, 5]

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5, 6, 23, 67, 39, 10, 2};
		
		for (int i=0; i<arr.length-1; i++) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	
		for (int a: arr)
			System.out.print(a+ "  ");
	}
	

}
