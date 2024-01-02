package com.collection.treemap;

import java.util.TreeMap;

public class FirstKeyLastKey {
	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(42, "Pune");
		tm.put(43, "Patna");
		tm.put(23, "Paris");
		tm.put(10, "Mumbai");
		tm.put(98, "Surat");
		tm.put(78, "Chennai");

		System.out.println("First key : " + tm.firstKey());
		System.out.println("Last Key : " + tm.lastKey());
		
		
	}
}
