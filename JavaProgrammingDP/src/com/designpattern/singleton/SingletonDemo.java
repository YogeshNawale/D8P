package com.designpattern.singleton;

public class SingletonDemo {

	private static SingletonDemo obj = new SingletonDemo();
	static int a=0;
	
	private SingletonDemo() {
		
		System.out.println("IN Default constructor");
		a++;
		System.out.println(a);
	}

	public static SingletonDemo getSingletonDemo() {
		return obj;
	}
	
	public void doSomething(){  
		 System.out.println("I am in doSomething"); 
		 }  

	public static void main(String[] args) {

		SingletonDemo obj1= new SingletonDemo();
		System.out.println(obj1.hashCode());
		SingletonDemo obj2= new SingletonDemo();
		System.out.println(obj2.hashCode());
		System.out.println("*****************************");
		System.out.println(obj1.obj.hashCode());
		System.out.println(obj2.obj.hashCode());
		System.out.println(SingletonDemo.obj.hashCode());
		
	}

}
