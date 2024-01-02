package com.collection.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();

		al.add(new Student(1, "Sapana", 80, 45));
		al.add(new Student(2, "Komal", 70, 75));

		System.out.println("******" + al.get(1) + "\n");

		// same method will work with Linked list
		// difference internally uses doubly linked list as data structure

		LinkedList<Student> ll = new LinkedList<>();

		ll.add(new Student(1, "Pushkar", 60, 76));
		ll.add(new Student(2, "Ajay", 70, 35));
		ll.add(new Student(3, "Amit", 78, 65));
		ll.add(new Student(4, "Ram", 56, 30));
		ll.add(2, new Student(5, "Pranav", 55, 50));

		System.out.println(ll);
		System.out.println(ll.get(3));

		ll.set(0, new Student(6, "Abhijeet", 101, 87));

		System.out.println("*************************************************************************");
		for (Student s1 : ll)
			System.out.println(s1);
		Collections.sort(ll);

		System.out.println("*************************************************************************");
		for (Student s1 : ll)
			System.out.println(s1);

		/*
		 * Iterator<Student> iter=ll.iterator(); while(iter.hasNext()) {
		 * System.out.println(iter.next()); }
		 */

		LinkedList<String> ll1 = new LinkedList();
		ll1.add("Shubhangi");
		ll1.add("Triveni");
		ll1.add("Madhav");
		ll1.add("Ajay");
		ll1.add("Ram");
		ll1.add(0, "Paritosh");

		for (String s : ll1)
			System.out.print(s + "\t");

		System.out.println();

		ll1.addFirst("Hrishi");

		for (String s : ll1)
			System.out.print(s + "\t");

		System.out.println();
		System.out.println("*******************************************************************");

		ll1.addLast("Jayshree");

		for (String s : ll1)
			System.out.print(s + "\t");
		ll1.removeFirst();

		ll1.removeLast();

		//Collections.sort(ll1);

		System.out.println();
		System.out.println("*******************************************************************");
		for (String s : ll1)
			System.out.print(s+"\t");

		LinkedList<String> languages = new LinkedList<>();

		System.out.println();
		System.out.println("*******************************************************************");
		// add elements in the linked list
		languages.add("Python");
		languages.add("Java");
		languages.add("JavaScript");
		System.out.println("LinkedList: " + languages);

		// get the element from the linked list
		String str = languages.get(1);
		System.out.print("Element at index 1: " + str);
	}

}
