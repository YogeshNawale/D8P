package com.Oops;
	//Write a method multiply() in a class Arithmetic. Overload multiply() 4 times by 
	// passing parameters of different types. Write another class Calculator which has main() method and
	// call each multiply() method by creating object of arithmetic class.  

public class Arithmetic {

	public void multiply(int a, int b) {
		System.out.println("The Multipication (int, int) is :" + (a*b));
	}
	public void multiply(float f1, float f2) {
		System.out.println("The Multipication (float, float) is :" + (f1*f2));
	}
	public void multiply(double d1, double d2) {
		System.out.println("The Multipication (double, double) is :" + (d1*d2));
	}
	public void multiply(int a1, float b1) {
		System.out.println("The Multipication (int, float) is :" + (a1*b1));
	}
	public static void main(String[] args) {
		
		
		Arithmetic obj= new Arithmetic();
		obj.multiply(5.5f, 10 );
	}

}
