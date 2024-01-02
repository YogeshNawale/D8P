package com.stringassignment;

import java.util.Arrays;

//25.  Write a Java program to reverse order of words in a given string.
public class ReverseOrderOfWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "How are you";

		String s1[] = str.split(" ");
		System.out.println(Arrays.toString(s1));

		String[] str2 = new String [s1.length];
		int j= s1.length-1;
		for (int i = 0; i < s1.length; i++) {
				str2[j] =s1[i];
				j--;
		}
		System.out.println(Arrays.toString(str2));
	
		//another logic reverse each word in string o/p= woh  era uoy
		String str3="How are you"; 
		
		String str4[]= str3.split(" ");
		String output=" ";
		
		for (int i=0; i<str4.length; i++) {
			for(int k=str4[i].length()-1; k>=0; k--) {
				output+=str4[i].charAt(k);
			}
			output+=' ';
		}
		System.out.println(output);
		
		
		// Without using split method // output uoy rea woh
		String str5="How are you";
		System.out.println(str5);
		//System.out.println(str5.length());
		int count=0;
		String str6="";
		for(int i=str5.length()-1; i>=0; i--) {
			if(str5.charAt(i)!=' '){
				count=0;
				str6+=str5.charAt(i);
			}
			if(str5.charAt(i)==' '){
				count++;
			}
			if(count==1)
				str6+=' ';
		}
		System.out.println(str6);
		
	}

}
