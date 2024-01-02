package com.test3;
//Write a java program to find numbers between 100 and 400 (both included) 

//	where each digit of a number is an even number.  [1M]

public class EvenDigitOfElementsBetn100To400 {

	public static void main(String[] args) {

		for (int i = 100; i <= 400; i++) {
			int num = i, count = 0;
			while (num > 0) {
				int digit = num % 10;
				if (digit % 2 != 0)
					count++;
				num = num / 10;
			}
			if (count == 0)
				System.out.print (i+"  ");
		}
	}

}
