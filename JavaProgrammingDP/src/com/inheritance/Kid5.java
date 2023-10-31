package com.inheritance;
/*
 * WAJP2 create a class Kid with method readBook() and another method
	readBook () with 2 parameters. The method readBook here is over-loaded (same
	method name but different parameters)
 */
public class Kid5 {
	String a ; 
	String b;
	public void readBook() {
		System.out.println("In Kid5  readBook()");
	}

	public void readBook (String a , String b) {
		System.out.println("In Kid5  readBook((String a , String b))");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
