package com.test3;

import java.util.Arrays;

/*4)	Array  is a two dimensional array as   follows. 
	Arr = { { 1,2,3,4} , {5,6,7,8}}
	Create   a  new  array  ArrCopy  which  should  be  as  follows
	ArrCopy = {{4,3,2,1} , { 8,7,6,5}
*/
public class ReverseCopyArray {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,6,7,8}};
		
		int arrCopy[][]=new int[2][4];
		
		for(int i=0; i<arr.length; i++) {
			int k=arr[i].length-1;
			for(int j=0; j<(arr[i].length); j++) {
				 arrCopy[i][j]=arr[i][k];
				 k--;
			}
		}

		for(int a[]:arrCopy)
			for(int ele: a)
				System.out.print(ele+"  ");
	}

}
