package com.collection.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SubMap {

	public static void main(String[] args) {
		TreeMap <Integer,String> tm=new TreeMap<>();
		tm.put(42, "Pune");
		tm.put(43, "Patna");
		tm.put(23, "Paris");
		tm.put(10, "Mumbai");
		tm.put(98, "Surat");
		tm.put(78, "Chennai");
		
		SortedMap <Integer,String> sm=tm.subMap(23, 78);
		System.out.println(sm);

	}

}
