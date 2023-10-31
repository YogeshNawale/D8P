package com.abstraction;
/*
 * Create an abstract class Machine with an implemented / concrete method rotate and an abstract method crush.
 *  Create a class Juicer which extends this abstract class Machine and implements method crush.
 *   Now, add another method filter in the class Juicer. In main method,
	a. Create an object of type Juicer and calls its crush, rotate and filter methods.
	b. Create an object of type Juicer with reference variable of Machine
	(Machine m = new Juicer). Check the methods available to m.
	
	
 */
 abstract class Machine {
	
	public void rotate() {
		System.out.println("In rotate in Machine");
	}
	public abstract void crush();

}

 class Juicer extends Machine{

	@Override
	public void crush() {
		System.out.println("In Crush in Juicer");
		
	}
	public void filter() {
		System.out.println("In filter in Juicer");
	}
	 
	public static void main(String[] args) {
		Juicer obj= new Juicer();
		obj.crush();
		obj.rotate();
		obj.filter();
		
		System.out.println("______________________________");
		Machine obj1= new Juicer();
		obj1.crush();
		obj1.rotate();
		// note filter cannot be used as ref type is Machine and filter method is not present in Machine class.
	

	}
 }
 
