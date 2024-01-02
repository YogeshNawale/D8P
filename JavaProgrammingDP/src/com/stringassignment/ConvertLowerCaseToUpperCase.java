package com.stringassignment;
//8.  Write a Java program to convert lowercase string to uppercase.
import java.util.Arrays;

public class ConvertLowerCaseToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= new String("Yogesh Nawale");
		
		char ch[]= str.toCharArray();
		
		for (int i=0 ; i<ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z')
				ch[i]= (char)(ch[i]-32);
		}
		System.out.println(Arrays.toString(ch));
	
		String str1= new String(ch);
		System.out.println(str1);
	}


}
