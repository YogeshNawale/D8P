package com.loops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// to guess a number at randon
		int magicnum=66;
		Scanner sc= new Scanner(System.in);
		
		for(int i=1; ; i++) {
			System.out.println("Enter the number for gussing");
			int num=sc.nextInt();
		
			if (num>magicnum) {
				System.out.println("Number is greater pls try again....");
				continue;
			}
			else if (num<magicnum) {
				System.out.println("Number is lesser pls try again....");
				continue;
			}
			else {
				System.out.println("Number match with magicnum....");
				break;
			}
		
		}
	}

}
