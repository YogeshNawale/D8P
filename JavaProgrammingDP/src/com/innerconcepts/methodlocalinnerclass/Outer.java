package com.innerconcepts.methodlocalinnerclass;
//  Method local inner Class

public class Outer {

	int outer_n = 20;

	public Outer() {

	}

	public void show() {

		 class Inner {
			int inner_n = 10;

			public Inner() {

			}

			public void show() {
				System.out.println(outer_n);
				System.out.println(inner_n);
			}

		}
		Inner in = new Inner();
		in.show();

	}

	public static void main(String[] args) {

		Outer o = new Outer();
		o.show();
	}
}