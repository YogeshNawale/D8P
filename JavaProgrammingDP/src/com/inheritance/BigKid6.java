package com.inheritance;
/*
 * Create a class BigKid which extends Kid created above. Implement readBook()
differently in BigKid class. Here the method readBook() has been over-ridden in
the child class BigKid()
 */
public class BigKid6 extends Kid5 {
	
	public void readBook() {
		System.out.println("In BigKid6  readBook()");
	}

	public void readBook (String a , String b) {
		System.out.println("In BigKid6  readBook(String a , String b)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigKid6 obj= new BigKid6();
		obj.readBook();
		obj.readBook("a", "B");
	}

}
