package com.stringassignment;

import java.util.Scanner;

//11.  Write a Java program to find first occurrence of a character in a given string.
public class FirstOccuranceOfCharacter {

	public static void main(String[] args) {

		String str = "Hello World";
		int flag = 0;
		int i;

		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter the Character to Find =  ");
		char ch = sc.next().charAt(0);

		char ch1[]=str.toCharArray();
		
		for (i = 0; i < ch1.length; i++) {
			if (ch1[i] == ch) {
				flag++;
				break;
			}
		}
		
		if (flag == 0) {
			System.out.println(" Character  not found");
		} 
		else {
			System.out.println(" The First Character Occurrence of "+ch+" at "+i+" Index");
		}
		
		// using indexof
		int k=str.indexOf('l');
		System.out.println(" The First Character Occurrence at Index "+k);
	}

}
