package com.stringassignment;
//5.Write a Java program to find length of a string.
public class FindLengthOfString {

	private static void toCharArrays(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++)
			count++;
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		String str= new String("Yogesh");
		toCharArrays(str);
		
		// Using str.length
		
		System.out.println(str.length());
		
		// Using toCharArrays(String s);
		
		char ch[]=str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			System.out.print (ch[i]+"  ");
		}
		System.out.println(ch.length);
	}

	

}
