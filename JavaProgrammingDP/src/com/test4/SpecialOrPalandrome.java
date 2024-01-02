package com.test4;

import java.util.Arrays;

/*Special words are those words which starts and ends with the same letter.
 * Examples: EXISTENCE, COMIC, WINDOW.Palindrome words are those words which read the same
 *  from left to right and vice-versa. Examples: MALAYALAM, MADAM, LEVEL, ROTATOR, CIVIC. 
 *  All palindromes are special words, but all special words are not palindromes.
 *  Write a program to accept a word, check and print whether the word is a palindrome 
 *  or only special.[
 *  
 *   */
public class SpecialOrPalandrome {
	boolean isSpecial;
	boolean isPalandrone;

	public boolean checkSpecial(char arr[]) {

		if (arr[0] == arr[arr.length - 1])
			return isSpecial = true;
		else
			return isSpecial = false;
	}

	public boolean checkPalandrome(char arr[]) {

		char a[] = new char[arr.length];
		int k = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {

			a[i] = arr[k];
			k--;

		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(a));
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != a[i])
				cnt++;
		}
		if (cnt == 0)
			return isPalandrone = true;
		else
			return isPalandrone = false;

	}

	public void result() {

		if (isPalandrone && isSpecial) {
			System.out.println("Word is Palandrome");
		} else if (isSpecial) {
			System.out.println("Word is only Special and not Palandrome");

		} else
			System.out.println("Word is neither Special nor Palandrome");
	}

	public static void main(String[] args) {
		String str = "EXAMPLE";
		char ch[] = str.toCharArray();
		SpecialOrPalandrome obj = new SpecialOrPalandrome();
		obj.checkSpecial(ch);
		obj.checkPalandrome(ch);
		obj.result();

	}

}
