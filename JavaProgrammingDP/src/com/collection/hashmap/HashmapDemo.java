package com.collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Jayshree");
		map.put(2, "Priyanka");
		map.put(3, "Rajashree");
		map.put(4, "Yash");
		map.put(5, "Yogesh");

		System.out.println("Map Size " + map.size());
		System.out.println("_______________Using keySet_____________________");
		
		// Using keySet
		for (Integer s: map.keySet() )
			System.out.println(s+" "+ map.get(s));
		

		
		System.out.println("_____________ using Iterator_______________________");
		// using Iterator
		Set<Entry<Integer,String>> s= map.entrySet();
		Iterator<Entry<Integer,String>> set= s.iterator();

		while (set.hasNext()) {
			System.out.println(set.next());
		}
		System.out.println("_________________using forEach()_________________________________");
		// using forEach()
		for(Entry<Integer,String> e: s) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}


		
		System.out.println("_________________using values()______________________");
		// using values()
		Collection<String> list= map.values();
		
		for (String str : list) {
			System.out.println(str);
		}

	}

}