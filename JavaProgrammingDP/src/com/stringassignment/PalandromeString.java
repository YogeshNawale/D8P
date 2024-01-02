package com.stringassignment;
//Check whether String is palindrome
public class PalandromeString {

	public static void main(String[] args) {
		
		String str= "nitin";
		
		char ch[]= str.toCharArray();
		char ch1[]= new char[ch.length];
		
		int j=ch.length-1;
		for (int i=0; i<ch.length; i++) {
			ch1[j]=ch[i];
			j--;
		}

		System.out.println(ch);
		System.out.println(ch1);
		
		// note= equals method is overridden in string class and not in arrays
		int count=0;
		for(int i=0 ; i<ch.length; i++) {
			if(ch[i]!=ch1[i])
				count++;
		}
		if(count==0)
		System.out.println("String is Plaindrome");
		else
			System.out.println("String is Not Plaindrome");
	}

}
