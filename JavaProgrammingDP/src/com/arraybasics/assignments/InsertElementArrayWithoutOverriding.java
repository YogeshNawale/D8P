package com.arraybasics.assignments;

import java.util.Scanner;

//7.	WAP to insert an element in a specific position into an array.without overriding
public class InsertElementArrayWithoutOverriding {

	public static int[] insertElement(int num[]) {
		Scanner sc= new Scanner(System.in);
		int newarr[]=new int[num.length+1];
		
		System.out.println("Enter position of Array");
		int pos= sc.nextInt();
		
		for(int i=0; i<pos; i++) {
			newarr[i]=num[i];
		}
		
		if ((pos-1)<num.length) {
			System.out.println("Enter Element to be inserted");
			newarr[pos-1]=sc.nextInt();
		}
		else
			System.out.println("Index out of bound");
		
	
		for (int j=pos; j<newarr.length; j++) {
				newarr[j]=num[j-1];
		}
		return newarr;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=Array1.createArray();
		Array1.printArray(arr);
		
		int a[]= insertElement(arr);
		Array1.printArray(a);
		
	}

}
