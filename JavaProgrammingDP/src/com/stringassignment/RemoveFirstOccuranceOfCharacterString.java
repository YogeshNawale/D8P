package com.stringassignment;

import java.util.Arrays;
import java.util.Scanner;

//30.  Write a Java program to remove first occurrence of a character from string.
public class RemoveFirstOccuranceOfCharacterString {

	public static void main(String[] args) {
		String str=" Java Programming";
		System.out.println(str);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		char c[]=str.toCharArray();
		
		int k=0;
		for(int i=0; i<str.length(); i++) {
			if(ch==c[i]) { 
				k=i;
				break;
			}
		}
		
		char[] c1= new char [str.length()-1];
		int j=0;
		for(int i=0; i<c.length; i++) {
			if(i!=k)
				c1[j++]=c[i];
			
		}
		 
		String str2=new String(c1);
		System.out.println(str2);
	}

}
