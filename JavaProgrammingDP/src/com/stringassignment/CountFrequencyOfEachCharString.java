package com.stringassignment;

public class CountFrequencyOfEachCharString {

	public static void main(String[] args) {

		String str = "Hello World";

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int flag = 0;
			int count = 0;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				continue;

			for (int j = 0; j <= i; j++) {
				if (ch[i] == ch[j])
					count++;
			}
			System.out.println(" Frequency of Element "+ ch[i] + " is = " + count);
		}

	}

}
