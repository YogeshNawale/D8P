package com.test4;

import java.util.Scanner;

/*Given sentence and a word, find if the word can be formed from given characters in sentence.   [2M]
For example, 
s1=”THE SKY IS THE LIMIT”
word = "AXE", -> No 
word = "SIT", -> Yes can be formed
*/
public class Quo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="THE SKY IS THE LIMIT";
		char [] ch1= s1.toCharArray();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Word to be found");
		String s2= sc.next();
		char[] ch2=s2.toCharArray();
		int count=0;
		for (int i=0; i<ch2.length;i++) {
			count =0;
			for (int j=0; j<ch1.length;j++) {
				if(ch2[i]==ch1[j]) {
					count++;
					
				}
			}
		}
		
		if(count==ch2.length)
			System.out.println("Yes Word can be found");
		else
			System.out.println("No");
	}

}
