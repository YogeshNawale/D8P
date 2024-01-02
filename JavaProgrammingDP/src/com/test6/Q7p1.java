package com.test6;

import java.util.LinkedList;
import java.util.List;

public class Q7p1 {
// predict output

	private static int incrementCounter(int i) {
		return ++i;
	}

	public static void foo(Book b1) {
		b1.price = 150;
		b1 = null;
	}

	public static void main(String[] args) {

		List<String> list1 = new LinkedList<>();
		list1.add("Me");
		list1.add("You");
		list1.add("He");
		list1.add("She");
		list1.add("It");
		List<String> list2 = new LinkedList<String>();
		list2.add("You");
		list1.retainAll(list2);
		for (String temp : list1) {
			System.out.printf(temp + " ");
			System.out.println();
		}

		System.out.println("Predict Output Q2");

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < arr.length; i = incrementCounter(i)) {
			System.out.println(i);
		}

		Book b1 = new Book();
		b1.price = 500;
		Book b2;
		foo(b1);
		b2 = b1;
		System.out.println(b2.price);

	}

}

class Book {
	String name;
	int price = 250;

}
