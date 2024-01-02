package com.stringassignment;

import java.util.Scanner;

//16.  Write a Java program to search all occurrences of a character in given string.
public class SearchAllOccuranceOfaCharacterInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = " I Am a Java Programmer";
		System.out.println(str);
		System.out.println("Enter a character to find");
		char ch = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
				System.out.println("character at index  "+ i);
			}
		}
		System.out.println("Count of all occurance of character "+ ch+ " is "+ count);

	}

}
