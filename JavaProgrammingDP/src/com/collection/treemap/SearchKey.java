package com.collection.treemap;

import java.util.NavigableSet;
import java.util.TreeMap;

public class SearchKey {

	public static void main(String[] args) {
		TreeMap <Integer,String> tm=new TreeMap<>();
		tm.put(42, "Pune");
		tm.put(43, "Patna");
		tm.put(23, "Paris");
		tm.put(10, "Mumbai");
		tm.put(98, "Surat");
		tm.put(78, "Chennai");
		
		NavigableSet<Integer> kset=tm.navigableKeySet();
		for(Integer s: kset)
			if(s==23)
			System.out.println(s+" => "+tm.get(s));

	}

}
