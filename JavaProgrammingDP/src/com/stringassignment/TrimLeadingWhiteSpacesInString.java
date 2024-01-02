package com.stringassignment;
//13.  Write a Java program to trim leading white space characters in a string.
public class TrimLeadingWhiteSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "  Yogesh Nawale ";
		char ch[]= str.toCharArray();
		
		int count=0;
		for (int i=0; i<ch.length; i++) {
			if(ch[i]==' ')
				count++;
			else
				break;
		}
		
		char ch1[]= new char[ch.length-count];
		
		int k=0;
		for (int i=count ; i<ch.length; i++) {
				ch1[k]=ch[i];
				k++;
		}
		String str1= new String(ch1); 
		System.out.println(str1);
		
		// another logic
		
		String s= "  Hello  ";
		int j=0;
		while(j<str.length() && str.charAt(j)==32) {		// 32 ASCII value of space
			j++;
		}
		System.out.println("J = "+ j);
		s=s.substring(j,s.length());
		System.out.println(s);
		
		String a= "  Hello  java  ";
		String b=a.stripLeading();
		String c=a.trim();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
