package com.stringassignment;

import java.util.Arrays;

//24.  Write a Java program to find reverse of a string.
public class ReverseOfAString {

	public static void main(String[] args) {
		
		String str=" Java Programming";
		char ch[]=str.toCharArray();
		char ch1[]=new char[ch.length];

		int j=0;
		for (int i=ch.length-1; i>=0; i--) {
			ch1[i]=ch[j];
			j++;
		}

		System.out.println(Arrays.toString(ch1));
	}

}
