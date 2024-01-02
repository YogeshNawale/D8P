package com.stringassignment;
//19.  Write a Java program to trim trailing white space characters in a string.
public class TrimTrailingWhiteSpacesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= " Java Prog  ";
		System.out.println(str);
		int j=str.length()-1;
		while(j>0 && str.charAt(j)==32) {		// 32 ASCII value of space
			j--;
		}
		 
		str=str.substring(0,j+1);
		System.out.println(str);
	
		
		// using stripTrailing
		String str1= " Java Prog  ";
		str1=str1.stripTrailing();
		System.out.println(str1);
	}
	

}
