package com.collection.linkedhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CreateLinkedHashMapUSingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CreateLinkedHashMapUSingHashMap

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(11, "Red");
		hm.put(32, "Blue");
		hm.put(23, "Indigo");
		hm.put(55, "VOilet");

		System.out.println(hm);

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(hm);
		lhm.put(93, "Orange");
		lhm.put(74, "Black");
		lhm.put(63, "Yellow");

		System.out.println(lhm);
		System.out.println("************************************************");

		Set<Entry<Integer, String>> s = lhm.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		// to delete all elements in linkedHashMap
//		
//		lhm.clear();
//		System.out.println(lhm);
//		
//		// to check if linkedHashMap is empty
//		
//		System.out.println(lhm.isEmpty());

		// to remove a specific key value pair

		System.out.println("to remove a specific key value pair");
		lhm.remove(93);

		itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// to find maximum key
		
		itr = s.iterator();
		int max=0;
		while (itr.hasNext()) {
			Entry<Integer, String> w= itr.next();
			 
			Integer a= w.getKey();
			
			if(a>max) {
				max=a;
			}
		}
		System.out.println("Maximum key : "+ max +"\t Value :"+ lhm.get(max) );

	}

}
