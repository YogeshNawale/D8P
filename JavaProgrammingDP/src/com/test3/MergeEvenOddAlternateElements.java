package com.test3;

import java.util.Arrays;

/*	6)	Take an array of integers as input. Print the odd number and even number alternate. 
	Remaining numbers should appear at the last. [2M]

		Ex: I/P=[1,5,9,7,3,6,8,13,2,4] 
			O/P=[6,1,8,5,2,9,4,7,3,13]

	 */
public class MergeEvenOddAlternateElements {

	public void mergeArray(int arrf[], int e[], int o[] ) {
		int cEven=e.length;
		int cOdd=o.length;
		int cnt=0;
		int max=0;
		
		if(cEven>cOdd)
			max=cEven;
		else
			max=cOdd;
		
		for(int i=0; i<max; i++) {
			if(i<cEven) {
				arrf[cnt]=e[i];
				cnt++;
			}
			if(i<cOdd) {
				arrf[cnt]=o[i];
				cnt++;
			}
		}
	}
	public static void main(String[] args) {

		int arr[] = { 1, 5, 9, 7, 3, 6, 8, 13, 2, 4 };
		
		int countEven = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				countEven++;
		}

		int arrEven[] = new int[countEven];
		int arrOdd[] = new int[arr.length - countEven];

		int j = 0, k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				arrEven[j++] = arr[i];

			else
				arrOdd[k++] = arr[i];
		}

		int arrfinal[] = new int[arr.length];
		MergeEvenOddAlternateElements obj= new MergeEvenOddAlternateElements();
		obj.mergeArray(arrfinal, arrEven, arrOdd);
		
		System.out.println(Arrays.toString(arrfinal));
	
	}

}
