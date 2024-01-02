package com.innerconcepts.simpleinnerclass;

public class Outer1 {
	
	static int data = 30;
	int aa=10;
	static class Inner {
		
		void msg() {
		
			System.out.println(" msg data is " + data);
		}
		public void showData() {
			System.out.println("In Inner Class "+ data);
		}
	}

	public void showData() {
		System.out.println("In Outer1 class  "+data);
	}
	public static void main(String args[]) {
		
		Outer1.Inner obj = new Outer1.Inner();
		obj.msg();
		obj.showData();
	
	}
}