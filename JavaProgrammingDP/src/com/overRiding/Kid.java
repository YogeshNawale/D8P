package com.overRiding;
/*
 * 1) WAP to create a class Kid with method readBook() and another method readBook () with 2
parameters. The method readBook here is over-loaded (same method name but different
parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()

 */
 class Kid {

	public void readBook() {
		System.out.println("readBook()");
	}
	public void readBook(int a, int b) {
		System.out.println("readBook(a,b)");
	}
}

 class BigKid extends Kid{
	 public void readBook() {
		 System.out.println("BigKid readBook()");
	 }
	 public void readBook(int a, int b) {
			System.out.println("BgKid readBook(a,b)");
		}
 }