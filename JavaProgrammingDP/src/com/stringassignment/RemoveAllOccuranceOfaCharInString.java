package com.stringassignment;

import java.util.Scanner;

//18.  Write a Java program to remove all occurrences of a character from string.
public class RemoveAllOccuranceOfaCharInString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str= " I am a Java Programmer";
		System.out.println(str);
		System.out.println("Enter the character to be Removed ");
		char ch= sc.next().charAt(0);
		String temp="";
		for (int i = 0; i < str.length(); i++) {
			if (ch != str.charAt(i)) {
				temp=temp+str.charAt(i);
			}
		}
		str=temp;
		System.out.println(str);
		
		
	

	}

}
