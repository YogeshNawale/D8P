package com.collection.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHAshMapDemo {

	public static void main(String[] args) {
		
		HashMap <String,Integer> hm= new HashMap<>();
		hm.put("abc", 43);
		hm.put("def", 34);
		hm.put("hij", 54);
		hm.put("aaa", 43);
		
		System.out.println(hm);
		
		LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();
		lhm.put("abc", 43);
		lhm.put("def", 34);
		lhm.put("hij", 54);
		lhm.put("aaa", 43);
		
		System.out.println(lhm);
		
		

	}

}
