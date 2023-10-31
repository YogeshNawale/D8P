package com.test2;

class A9 {
	static int i = 6;
	static {
		i = i-- - --i;
	}
}

class B extends A9{
	static {
		i = --i - i--;
	}

}

public class MainClass9 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.i);
	}
}
