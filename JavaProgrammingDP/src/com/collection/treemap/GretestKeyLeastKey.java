package com.collection.treemap;

import java.util.TreeMap;

public class GretestKeyLeastKey {

	public static void main(String[] args) {
		TreeMap <Integer,String> tm=new TreeMap<>();
		tm.put(42, "Pune");
		tm.put(43, "Patna");
		tm.put(23, "Paris");
		tm.put(10, "Mumbai");
		tm.put(98, "Surat");
		tm.put(78, "Chennai");
		
		System.out.println("Greatest key value pair : "+tm.lastEntry());
		System.out.println("Lowest key value pair : "+tm.firstEntry());
		
		

	}

}