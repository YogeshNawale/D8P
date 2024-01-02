package com.arraybasics.assignments;
//5.	Write a Java program to find a missing number in an array. Means e.g. array has 1 to n element
//		in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5.
public class MissingElementInSequenceArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,11,12,13,15,16,17,18,19,20};
		
		for (int i=0; i<a.length; i++) {
			if(a[i]!=a[i+1]-1) {
				System.out.println("The Missing number is : "+ (a[i]+1));
				break;
			}
		}
		
	}

}
