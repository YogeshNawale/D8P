package com.arraybasics.assignments;

import java.util.Arrays;

//11.	WAP to find and count total number of duplicate elements in an array. (note : fails if element 
//		Ascii value is $)
public class DuplicateElementArray1 {

	public static void printDuplicate(int num[]) {

		for (int i = 0; i < num.length; i++) {
			if (num[i] == '$')
				continue;
			int count = 1;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
					num[j] = '$';
				}
			}
			if(count==1)
				System.out.println(num[i]+ " ");
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int a[]= Array1.createArray();
		System.out.println(Arrays.toString(a));
		
		printDuplicate(a);
	}

}
