package com.statements;
import java.util.Scanner;
public class AlphabetDigitlogical {

	public static void main(String[] args) {
		// prog to enter any character and check weather it is alphabet,digit or special character
		
				char ch;
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the Character");
				ch=sc.next().charAt(0);
				
				if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				{
					System.out.println("Character is Alphabet");
				}
				else if (ch>='0' && ch<='9')
				{
					System.out.println("Character is Digit");
				}
				else 
				{
					System.out.println("Character is Special Character");
				}
	}

}
