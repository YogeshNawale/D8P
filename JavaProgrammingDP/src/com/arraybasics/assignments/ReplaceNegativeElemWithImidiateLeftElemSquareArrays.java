package com.arraybasics.assignments;
//7.	WAP to replace all negative value with its immediate left elements square. 
// 		Means arr[] = [12, 3,-19, 29, 5, -61, 44, 7, -9] Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].

public class ReplaceNegativeElemWithImidiateLeftElemSquareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 3,-19, 29, 5, -61, 44, 7, -9};
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				arr[i]=(arr[i-1] * arr[i-1]);
			}
		}
		
		for (int a : arr)
			System.out.print(a+ "  ");
	}

}
