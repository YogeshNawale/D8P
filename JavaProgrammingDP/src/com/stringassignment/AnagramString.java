package com.stringassignment;

import java.util.Arrays;
//Check whether String is Anagram.

public class AnagramString {

	public static char[] sortAccending(char ch[]) {
		
		for (int i = 0; i < ch.length - 1; i++) {

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}
	public static void main(String[] args) {
		String s1 = "care";
		String s2 = "race";

		System.out.println(s1);
		System.out.println(s2);
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		ch1=sortAccending(ch1);
		System.out.println(Arrays.toString(ch1));

		ch2=sortAccending(ch2);
		System.out.println(Arrays.toString(ch2));

		String s3 = new String(ch1);
		String s4 = new String(ch2);
		
		if(s3.equals(s4))
			System.out.println("Strings are Anagram");
			else
				System.out.println("Strings are Not Anagram");

	}

}
