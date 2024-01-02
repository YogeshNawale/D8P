package com.stringassignment;

import java.util.Arrays;
import java.util.Scanner;

//Replace the particular word from string by another string.
public class ReplaceParticularWordinStringByAnotherString {

	public static void main(String[] args) {
		String str1 = " I am Java Programmer";
		System.out.println(str1);
		String str2 = "Not a Python";
		Scanner sc = new Scanner(System.in);

		String s1[] = str1.split(" ");
		System.out.println("Enter the String to be replaced");
		String replace = sc.next();

		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equals(replace)) {
				s1[i] = str2;
			}

//			String s3 = "";
//			for (String s : s1)
//				s3 = s3 + s+" ";

			System.out.println(Arrays.toString(s1));
			//System.out.println(s3);
		}

	}
}
