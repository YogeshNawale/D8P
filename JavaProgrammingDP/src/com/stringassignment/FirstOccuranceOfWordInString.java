package com.stringassignment;

import java.util.Scanner;

//15.Write a Java program to find first occurrence of a word in a given string.

public class FirstOccuranceOfWordInString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str=" I am Learning Java Programming";
		System.out.println(str);
		System.out.println("Enter a word to find");
		String word= sc.next();
		
		for(int i=0; i<str.length(); i++) {
			String temp="";
			int j;
			for(j=i; j<str.length() && str.charAt(j)!=32; j++) {
				temp= temp+str.charAt(j);
			}
			if(temp.equals(word)) {
				System.out.println("The index of word is : "+(j-temp.length()));
				break;
			}
		}
		

	}

}
