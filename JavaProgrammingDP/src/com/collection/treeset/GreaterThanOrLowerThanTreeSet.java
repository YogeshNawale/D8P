package com.collection.treeset;

import java.util.TreeSet;

public class GreaterThanOrLowerThanTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(8);
		t.add(9);
		t.add(10);

		System.out.println(t);
		
		System.out.println("Higher then 7 : " + t.higher(7));
		System.out.println("Less then 7 : "+t.lower(7));
		
		System.out.println("Higher then 10 : " + t.higher(10));
		System.out.println("Less then 1 : "+t.lower(1));
		


	}

}