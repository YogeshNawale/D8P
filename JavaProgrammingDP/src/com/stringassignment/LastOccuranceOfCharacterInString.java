package com.stringassignment;

import java.util.Scanner;

//26.  Write a Java program to find last occurrence of a character in a given string.
public class LastOccuranceOfCharacterInString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= "How are you";
		System.out.println("Enter the character ");
		char ch=sc.next().charAt(0);
		
		char c[]= str.toCharArray();
		int k=0;
		for (int i=0; i<c.length; i++) {
			if(ch==c[i] )
				k=i;
		}
		System.out.println("Last  occurrence of a character at index "+ k);
	}

}
