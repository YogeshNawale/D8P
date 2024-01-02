package com.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AddElementsToHashMap {
	public static void main(String args[]) {
		// No need to mention the
		// Generic type twice
		Map<Integer, String> hm1 = new HashMap<>();

		// Add Elements using put method
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");
		System.out.println(hm1);

		// Initialization of a HashMap
		// using Generics
		
		/*HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1);

		System.out.println("Mappings of HashMap hm1 are : " + hm1);

		System.out.println("Mapping of HashMap hm2 are : " + hm2);
		
		// Change elements of HashMap

		hm1.put(2, "For");

		System.out.println(hm1.put(2, "For"));
		System.out.println("Updated Map " + hm1);*/
	}
}
