package com.stringassignment;

//23.  Write a Java program to count total number of vowels and consonants in a string.
public class CountVowelsConsonantsString {

	public static void main(String[] args) {

		String str = " I am Java Developer";
		char ch[] = str.toCharArray();
		int cvol = 0;
		int ccons = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
					ch[i] == 'A'|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				cvol++;
			}
			else if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
				ccons++;
			}
		}

		System.out.println("Count of Vowels : " + cvol);
		System.out.println("Count of Consonants : " + ccons);

	}

}
