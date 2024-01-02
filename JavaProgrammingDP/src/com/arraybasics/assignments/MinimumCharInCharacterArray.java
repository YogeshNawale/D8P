package com.arraybasics.assignments;
//10.	WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], 
//		so min character is ‘A’.
public class MinimumCharInCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[] = { 'a', 'D', 'E', 'x', 'z', 'R' } ;
		
		int min=(int)arr[0];
		for(int i=0; i<arr.length; i++){
			if ((int)arr[i]<min)
				min=(int)arr[i];
		}
		System.out.println("Minimum char in array is : "+ (char)min);
		
	}

}
