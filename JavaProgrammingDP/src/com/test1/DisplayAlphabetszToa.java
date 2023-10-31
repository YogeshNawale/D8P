package com.test1;
/*
 * Q11. Write a code in java to display small alphabets in reverse order ie. from z,y,x…..b,a.        
 */
public class DisplayAlphabetszToa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch='z';
		do {
			System.out.print (ch + ",");
			ch--;
		}while(ch>='a');
		
	}

}
