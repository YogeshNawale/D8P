package com.collection.treemap;

import java.util.Collections;
import java.util.TreeMap;

public class ReverseOrderView {

	public static void main(String[] args) {
		TreeMap <Integer,String> tm=new TreeMap<>(Collections.reverseOrder());
		tm.put(42, "Pune");
		tm.put(43, "Patna");
		tm.put(23, "Paris");
		tm.put(10, "Mumbai");
		tm.put(98, "Surat");
		tm.put(78, "Chennai");
		
		System.out.println(tm);
		

	}

}