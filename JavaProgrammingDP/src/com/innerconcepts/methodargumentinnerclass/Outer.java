package com.innerconcepts.methodargumentinnerclass;
// Method argument Inner Class
public class Outer {

	int data_n = 10;

	public Outer() {
		 
	}

	public void showData(Demo obj) {
		obj.show();
	}

	public static void main(String[] args) {
		 

		Outer obj = new Outer();
		Demo d = new Demo();
		// obj.showData(d);

		obj.showData(new Demo() {

			// A.I.C sub class Demo

		});

	}

}

class Demo {
	int data = 10;

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public void show() {
		System.out.println("In show() of Demo class");
	}
}
