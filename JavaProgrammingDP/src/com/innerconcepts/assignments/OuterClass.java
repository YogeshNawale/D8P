package com.innerconcepts.assignments;

import java.io.Serializable;

/*
 *  6. Create anonymous class by implementing interface.
	7. Create anonymous class by extending abstract class.
	8. Create anonymous class by extending concrete class.
 */
public class OuterClass  {
	
	//  anonymous class by implementing interface.
	MyInterface mi= new MyInterface() {
		
		@Override
		public void test() {
			 
			System.out.println("I am in MyInterface Anonymous Class");
		}
	};
	
	// anonymous class by extending abstract class.
	
	DemoAbs da= new DemoAbs() {
		
		@Override
		public void show() {
			
			
		}
	};
	
	// anonymous class by extending concrete class.
	
	DemoCc dc= new DemoCc() {
		
	};
	
	public static void main(String[] args) {
		

	}

	

	

	

}


// interface
interface MyInterface {
	
	public void test() ;
	
}

// abstract class
 abstract  class DemoAbs{
	 
	 public void test() {
		 
	 }
	public abstract void show() ;
}
 
 // concrete class
 
 class DemoCc {
 
	 public void test() {
		 
	 }
	
 }