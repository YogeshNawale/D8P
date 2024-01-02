package com.stringassignment;

import java.util.Arrays;

//22.  Write a Java program to toggle case of each character of a string.
public class ToggleCaseString {

	public static void toggleCase(char[] ch) {
		
		for (int i=0; i<ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
			else if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
	}
	
	public static void main(String[] args) {
		
		String str= " YoGeSh NaWaLe";
		char ch[]=str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		toggleCase(ch);
		System.out.println(Arrays.toString(ch));

	}

}
