package com.designpattern.singleton;

public class MySingleton {

	public static void main(String args[]) {
		
		// instantiating Singleton class with variable x
		// SingletonDemo x1 = new SingletonDemo();
		SingletonDemoLazyInitialization x = SingletonDemoLazyInitialization.getInstance();
		System.out.println(x.hashCode());
		
		// instantiating Singleton class with variable y
		SingletonDemoLazyInitialization y = SingletonDemoLazyInitialization.getInstance();
		System.out.println(y.hashCode());
		
		// instantiating Singleton class with variable z
		SingletonDemoLazyInitialization z = SingletonDemoLazyInitialization.getInstance();
		System.out.println(z.hashCode());
		// changing variable of instance x

		x.s = " I am from x";
		y.s = "I am from Y";

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		/*
		 * // changing variable of instance z //z.s = (z.s).toLowerCase(); z.s =
		 * " I am from z" ;
		 * 
		 * System.out.println("String from x is " + x.s);
		 * System.out.println("String from y is " + y.s);
		 * System.out.println("String from z is " + z.s); System.gc();
		 */
	}

}
