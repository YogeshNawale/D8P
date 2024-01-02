package com.arraybasics.assignments;
// Merge two arrays using alternative elements into third array
//eg.   int a[]= {1,2,3,4,5};
//		int b[]= {11,22,33};
//   int arr[]= {1,11,2,22,3,33,4,5};
import java.util.Arrays;

public class MergeArray1 {

	public static void mergeArray(int a[], int b[]) {
//		int a[]= {1,2,3,4,5};
//		int b[]= {11,22,33};
		
		int s= (a.length+b.length);
		int arr[]=new int[s];
		
		int i = 0, j = 0, k = 0;
		
		while (i < a.length && j < b.length) {
            arr[k++] = a[i++];
            arr[k++] = b[j++];
        }
 
        // Store remaining elements of first array
        while (i < a.length)
            arr[k++] = a[i++];
 
        // Store remaining elements of second array
        while (j < b.length)
            arr[k++] = b[j++];
        
        System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]=Array1.createArray();
		int arr2[]=Array1.createArray();
		
		mergeArray(arr1,arr2);
	}

}
