package com.innerconcepts.assignments;

import com.exceptionhandling.Main;

/*
 * 5. Show one example of method local inner class. Try to call method of inner class from 
 * 		main method.
 */
public class Outer1 {

	int a = 10;
	int b = 20;

	public Outer1() {

	}

	public void show() {
		class Inner {
			public void sum() {

				System.out.println("Sum = "+ (a + b));
			}
		}
		
		Inner in= new Inner();
		in.sum();
	}

	public static void main(String[] args) {
		
		Outer1  obj= new Outer1();
		obj.show();
		
	}
}
