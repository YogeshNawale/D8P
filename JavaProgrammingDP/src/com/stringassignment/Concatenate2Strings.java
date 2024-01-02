package com.stringassignment;

import java.util.Arrays;

//6.  Write a Java program to concatenate two strings.
public class Concatenate2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Yogesh";
		String str2=" Nawale";
		
		// Using concat method
		
		String str3= str1.concat(str2);
		System.out.println(str3);
		
		// Using + 
		
		String str4=str1 + str2;
		System.out.println(str4);
		
		// using arraysCopy method
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		char ch3[]=new char[(ch1.length+ch2.length)];
		
		System.arraycopy(ch1, 0, ch3, 0, ch1.length);
		System.arraycopy(ch2, 0, ch3, ch1.length, ch2.length);
		
		System.out.println(Arrays.toString(ch3));
		
		String str5= new String(ch3);
		System.out.println(str5);
		
		
		// using for loop
		
		for(int i=0; i<ch1.length; i++) {
			ch3[i]=ch1[i];
		}
		int j =ch1.length;
		for(int i=0; i<ch2.length; i++) {
			ch3[j]=ch2[i];
			j++;
		}
		System.out.println(Arrays.toString(ch3));
		
		String str6=new String (ch3);
		System.out.println(str6);
		
	}

}
