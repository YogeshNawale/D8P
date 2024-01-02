package com.stringassignment;

import java.util.Arrays;

//.  WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class SplitStringInto2Tokens {

	public static void main(String[] args) {
		// using str.split

		String str = new String("HELLO$WORLD");
		String str1[] = str.split("\\$", 2);
		System.out.println(Arrays.toString(str1));

		// using logic
		
		char ch[] = str.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='$') {
				count++;
			}
			else
				break;
		}
		System.out.println(count);
		char ch1[] = new char[count];
		for (int i = 0; i < count; i++) {
				ch1[i] = ch[i];
		}
		
		char ch2[]= new char[ch.length-(count+1)];
		int i=0;
		for(int j=count+1; j<ch.length; j++) {
			ch2[i]=ch[j];
			i++;
		}
		
		String str2[]= new String[2];
		str2[0]=new String(ch1);
		str2[1]=new String(ch2);
		
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));

		System.out.println(Arrays.toString(str2));

		// Using substring
		
		String str3= str.substring(0,5);
		String str4= str.substring(6, str.length());
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
