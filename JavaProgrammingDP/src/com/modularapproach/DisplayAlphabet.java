package com.modularapproach;
import java.util.*;
public class DisplayAlphabet {

	public char displayAlpha(char z)
	{
		char i;
		for(i='a'; i<='z'; i++)
		{
			System.out.println(i);
		}return i;
	}
	public static void main(String[] args) {
		// WAP to print all alphabets from a to z using for loop
		
		
		DisplayAlphabet obj=new DisplayAlphabet();
		int res=obj.displayAlpha( 'z');
		

	}

}
