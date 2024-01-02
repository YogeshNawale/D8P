package com.arraybasics.assignments;

import java.util.Arrays;

//15.	WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.
//int a[]= {1,2,3,4,5};
//int b[]= {11,2,3,56,6};
//  intarr[]={};
public class MergeArray4 {

	public static void mergeArray(int a[], int b[]) {

		int s = (a.length + b.length);
		int arr[] = new int[s];

		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
		int k=0;
		for (int i = a.length; i < arr.length; i++) {
			arr[i] = b[k];
			k++;
		}

		System.out.println(Arrays.toString(arr));
	
		
	// sorting Acending order
	
		for (int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	
		// delete repeating elements
		 int[] newArray = new int[arr.length];
		    newArray[0] = arr[0];
		    int  count = 1;

		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] != arr[i - 1]) {
		           newArray[count] = arr[i];
		            count++;
		        }
		    }
		    System.out.println(Arrays.toString(newArray));
		    
			 int arr1[]	= new int [count];
			 for (int i = 0; i < arr1.length; i++) {
				 arr1[i]=newArray[i];
			 }
			 
		
		System.out.println(Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr1[] = Array1.createArray();
//		int arr2[] = Array1.createArray();
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 11, 1, 2, 34, 12 };
		mergeArray(arr1, arr2);
	}
}
