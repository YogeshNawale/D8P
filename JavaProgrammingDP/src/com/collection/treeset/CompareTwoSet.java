package com.collection.treeset;

import java.util.TreeSet;

public class CompareTwoSet {
	public void compare(TreeSet<String> t, TreeSet<String> t2) {
		if (t.size() == t2.size()) {
			int count = 0;
			for (String x : t) {
				for (String y : t2) {
					if (x.equals(y)) {
						count++;
					}
				}
			}
			if (count == t.size())
				System.out.println("Two set are equal");
			else
				System.out.println("Two set are different");
		} else
			System.out.println("Two set are different");
	}

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		t.add("Blue");
		t.add("Red");
		t.add("Purple");
		t.add("Brown");
		t.add("White");
		t.add("Yellow");

		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Blue");
		t1.add("Red");
		t1.add("Purple");
		t1.add("Brown");
		t1.add("White");
		t1.add("Yellow");
		t1.add("Yellow");
		//t1.add("Yelloww");

		System.out.println("The two set equals : " + t.equals(t1));
		CompareTwoSet c = new CompareTwoSet();
		c.compare(t, t1);

	}

}
