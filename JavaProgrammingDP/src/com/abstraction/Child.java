package com.abstraction;
/*
 * WAJP2 create an abstract class Parent. Add an abstract method cook() in it which has only definition and
 *  one method wash() which also has implementation. Create class Child which extends Parent and add the missing
method implementation. In main, use both the methods by creating instance of the concrete class
 */

abstract class Parent{
	public abstract  void cook();
	
	public void wash() {
		System.out.println("Wash in Parent");
	}
	
	
}
public class Child extends Parent {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj= new Child();
		obj.wash();
		obj.cook();
	}

	@Override
	public void cook() {
		System.out.println("Cook in Child");		
	}

}
