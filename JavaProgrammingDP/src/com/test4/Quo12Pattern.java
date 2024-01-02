package com.test4;

public class Quo12Pattern {

	public static void main(String[] args) {
		String str="JAVA";
		
		for (int i=0; i<str.length();i++) {
			for (int j=0; j<=i;j++)
				System.out.print(str.charAt(j));
			System.out.println();
		}
		
		for (int i=str.length()-2; i>=0;i--) {
			for (int j=0; j<=i;j++)
				System.out.print(str.charAt(j));
			System.out.println();
		}
	}

}
