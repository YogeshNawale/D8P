package com.stringassignment;
//9.  Write a Java program to copy one string to another string.
public class Copy1StringToAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= new String("Yogesh");
		
		char ch[]= str.toCharArray();
		
		String str1= new String(ch);
		System.out.println(str1);
		
	
	
		String str2=str.copyValueOf(ch);
		System.out.println(str2);
	}

}
