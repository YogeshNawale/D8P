package com.test5;

import java.util.ArrayList;
import java.util.Arrays;

/*	WAP to convert array to arraylist and vice versa
 * 
 */
public class Q2 {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		
		ArrayList<Integer> al= new ArrayList<>();
		
		for(int i=0; i<arr.length;i++)
			al.add(arr[i]);

		System.out.println(al);
		
//		Object[] arr1=al.toArray();
//		System.out.println(Arrays.toString(arr1));
		
		ArrayList<Integer> al1= new ArrayList<>(Arrays.asList(6,7,8,9,10));
		int arr1[]= new int [al1.size()];
		int i=0;
		for(int a:al1) {
			arr1[i]=a;
			i++;
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}
