package com.collection.treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetFromHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(14);
		hs.add(56);
		hs.add(40);
		hs.add(78);

		// 1 way passing to constructor
		TreeSet<Integer> ts1 = new TreeSet<>(hs);
		for (Integer x : ts1)
			System.out.print(x + " ");
		// 2 way
		TreeSet<Integer> ts2 = new TreeSet<>();
		System.out.println();
		for (Integer x : hs)
			ts2.add(x);
		for (Integer x : ts2)
			System.out.print(x + " ");

	}

}
