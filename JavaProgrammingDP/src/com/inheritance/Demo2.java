package com.inheritance;

public class Demo2 extends Demo1 {
	int n;
	Demo2(){
		System.out.println("Demo 2 constructor");
		n=10;
	}
	public void displayN() {
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 obj1= new Demo2();
		obj1.displayN();
	}

}
