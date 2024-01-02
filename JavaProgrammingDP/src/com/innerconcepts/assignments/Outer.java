package com.innerconcepts.assignments;

/*
 * 1. Create class Outer in which you will have private , public , static and static final 
 * variables. Create static and non static inner class in ‘Outer’ class. Try to access all 
 * variables in both inner classes and check which are not accessible.
 * 
 * 2. Create objects on static and non static inner classes in main method. Access methods ,
 * variable of these classes in main method.
 * 
 * 3. Create static and non static variables in both above inner classes.
 * 
 * 4. Try to create static method in non-static inner class.
 */
public class Outer {
	public int a = 10;
	private int b = 20;
	static int c = 30;
	static final int d = 40;

	public  static  void show() {
		System.out.println("In Outer Class");
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}

	static class Inner {
		Outer obj = new Outer();
		int e=11;
		static int f=12;
		
//		Outer.Inner obj1 = new Outer.Inner();
		

		public Inner() {

			System.out.println("In Constructor static Inner Class");
			// System.out.println("a : " + a);
			// System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
		}

		public  void display() {
			show();
		}
		// @Override
//		public void show() {
//
//			System.out.println("In static Inner Class");
//			// System.out.println("a : " + a);
//			// System.out.println("b : " + b);
//			System.out.println("c : " + c);
//			System.out.println("d : " + d);
//		}
	}

	class Inner1 {
		
		int e=11;
		static int f=12;
		
		public Inner1() {
			System.out.println("In constructor non-Static inner Class");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
		}

	
		public void show() {
			System.out.println("In non-Static inner Class");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
		}
		public static void sum() {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {

		Outer.Inner obj = new Outer.Inner();
		//obj.show();
		
		
		System.out.println("e in  static inner class "+ obj.e);
		System.out.println("f in  static inner class "+  Outer.Inner.f);
		
		System.out.println();

		Outer o = new Outer();
		Outer.Inner1 obj1 = o.new Inner1();
		obj1.show();
		System.out.println("e in nonstatic inner class "+ obj1.e);
		System.out.println("f in nonstatic inner class "+ Outer.Inner1.f);
		
		
		//4. Try to create static method in non-static inner class.
		Inner1.sum();
		
		
	}

}
