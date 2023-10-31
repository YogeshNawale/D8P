package com.Oops;
	//Write a method multiply() in a class Arithmetic. Overload multiply() 4 times by 
	// passing parameters of different types. Write another class Calculator which has main() method and
	// call each multiply() method by creating object of arithmetic class.  

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj= new Arithmetic();
		obj.multiply(5, 7);
		obj.multiply(5.2f, 2.8f);
		obj.multiply(5.5, 2.4);
		obj.multiply(5, 2.5f);
		
	}

}
