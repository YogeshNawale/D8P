package com.inheritance;

public class Demo1 {
	int n;
	
	Demo1(){
		System.out.println("Demo1 Constructor");
		n=5;
	}
	public void displayN() {
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 obj= new Demo1();
		obj.displayN();
	}

}
