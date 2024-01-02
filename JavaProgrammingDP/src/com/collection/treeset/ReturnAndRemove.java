package com.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class ReturnAndRemove {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		t.add("Blue");
		t.add("Red");
		t.add("Purple");
		t.add("Brown");
		t.add("White");
		t.add("Yellow");
		System.out.println(t);
		// 1 way pollFirst() method
		System.out.println("the remove first element : " + t.pollFirst());

		for (String x : t)
			System.out.print(x + " ");
		System.out.println();

		// 2 way remove(obj.first)
		System.out.println("Remove first element : " + t.remove(t.first()));
		for (String x : t)
			System.out.print(x + " ");
		System.out.println();

		// 3 way
		Iterator<String> i = t.iterator();
		String y = t.first();
		while (i.hasNext()) {
			String x = i.next();
			if (y.equals(x)) {
				i.remove();
			}
		}
		System.out.println("Using iterator....");
		for (String x : t)
			System.out.print(x + " ");

		System.out.println("************************************************************************");

		System.out.println("************************************************************************");
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Blue");
		t1.add("Red");
		t1.add("Purple");
		t1.add("Brown");
		t1.add("White");
		t1.add("Yellow");
		System.out.println(t1);
		
		// 1 way pollLast()
		System.out.println("the remove Last element : " + t1.pollLast());

		for (String x : t1)
			System.out.print(x + " ");
		System.out.println();
		// 2 way
		System.out.println("Remove Last element : " + t1.remove(t1.last()));
		for (String x : t1)
			System.out.print(x + " ");
		System.out.println();
		// 3 way
		Iterator<String> itr = t1.iterator();
		String z = t1.last();
		while (itr.hasNext()) {
			String x = itr.next();
			if (z.equals(x)) {
				itr.remove();
			}
		}
		System.out.println("Using iterator....");
		for (String x : t1)
			System.out.print(x + " ");

	}
}