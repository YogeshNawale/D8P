package com.collection.treemap;

import java.util.TreeMap;

public class CeilingKeyfloorKey {

	public static void main(String[] args) {
		TreeMap <Integer,String> tm=new TreeMap<>();
		tm.put(42, "Pune");
		tm.put(43, "Patna");
		tm.put(23, "Paris");
		tm.put(10, "Mumbai");
		tm.put(98, "Surat");
		tm.put(78, "Chennai");
		
		System.out.println("Ceiling Key :"+tm.ceilingKey(24));
		
		System.out.println("The floor key : "+tm.floorKey(24));
		
//		System.out.println(tm);
//		tm.clear();
//		System.out.println("After deleting all value");
//		System.out.println(tm);
	}

}