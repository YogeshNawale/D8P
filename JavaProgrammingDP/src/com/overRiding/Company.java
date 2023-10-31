package com.overRiding;

/*
 * 2) WAP to create class company with method address. create class eBay which extends company implement address() differently in eBay class.
 * 	Here the method address ()has been overridden in child class.
 */
class Company {
	public void address() {
		System.out.println("Company");
	}
	
}

class eBay extends Company{
	public void address() {
		System.out.println("eBay");
	}
	
}


