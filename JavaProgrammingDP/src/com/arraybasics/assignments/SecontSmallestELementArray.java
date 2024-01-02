package com.arraybasics.assignments;

import java.util.Arrays;

//13.	WAP to find the second smallest element in an array. using sorting array
public class SecontSmallestELementArray {
	
	
	public static void printSmallestElem(int num[]) {
		for (int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1-i; j++) {
				if (num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					
				}
			}
		}
		
		int k=1;
		while(num[0]==num[k]) {
			k++;
		}
		System.out.println(" Second Smallest Element is "+ num[k] );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=Array1.createArray();
		System.out.println(Arrays.toString(a));
		
		printSmallestElem(a);
		System.out.println(Arrays.toString(a));
		
	}

}
