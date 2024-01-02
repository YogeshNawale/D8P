package com.stringassignment;
//20.  Write a Java program to trim both leading and trailing white space characters in a string.
public class TrimBothLeadingAndTrailingWhiteSpacesString {

	public static void main(String[] args) {
		String str= " Java Programming  ";
		System.out.println(str);
		
		
		int j=0;
		while(j<str.length() && str.charAt(j)==32) {		// 32 ASCII value of space
			j++;
		}
		str=str.substring(j,str.length());
		System.out.println(str);
		
		int k=str.length()-1;
		while(k>0 && str.charAt(k)==32) {		// 32 ASCII value of space
			k--;
		}
		 
		str=str.substring(0,k+1);
		System.out.println(str);
		
		// using trim function
		String s= " Hello World  ";
		System.out.println(s);
		String s1=s.trim();
		System.out.println(s1);
	
	}

}
