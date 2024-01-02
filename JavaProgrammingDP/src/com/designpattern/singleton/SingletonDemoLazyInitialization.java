package com.designpattern.singleton;

public class SingletonDemoLazyInitialization {

	

	// Java program implementing Singleton class
	// with getInstance() method

	// static variable single_instance of type Singleton
	private static SingletonDemoLazyInitialization single_instance; // early

	// variable of type String
	public String s;

	// private constructor restricted to this class itself
	private SingletonDemoLazyInitialization() {
		s = "Hello I am a string part of Singleton class";
	}

	// static method to create instance of Singleton class
	public static SingletonDemoLazyInitialization getInstance() 
		{
			if (single_instance == null)
				single_instance = new SingletonDemoLazyInitialization();   ///lazy initialization
			return single_instance;
		}
		
}
