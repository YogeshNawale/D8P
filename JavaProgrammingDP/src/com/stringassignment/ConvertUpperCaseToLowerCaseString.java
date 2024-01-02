package com.stringassignment;

import java.util.Arrays;

//.17.  Write a Java program to convert uppercase string to lowercase.

public class ConvertUpperCaseToLowerCaseString {

	public static void main(String[] args) {
		String str= "YoGeSh NaWaLe";
		
		char ch[]= str.toCharArray();
		
		for (int i=0 ; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]= (char)(ch[i]+32);
		}
		System.out.println(Arrays.toString(ch));
	
		String str1= new String(ch);
		System.out.println(str1);
	}

}
