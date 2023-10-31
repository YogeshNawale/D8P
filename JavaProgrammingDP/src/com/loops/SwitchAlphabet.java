package com.loops;
import java.util.*;
public class SwitchAlphabet {

	public static void main(String[] args) {
		// Write a Java program to input any alphabet and check whether it is vowel or consonant using switch

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char alphabet=sc.next().charAt(0);
		
		switch(alphabet)
		{
		case ('a'):
		case ('e'):
		case ('i'):
		case ('o'):
		case ('u'):
		case ('A'):
		case ('E'):
		case ('I'):
		case ('O'):
		case ('U'):System.out.println("Alphabet is a vowel");
					break;
		default:System.out.println("Alphabet is a Consonent");
		}
		
	}

}
