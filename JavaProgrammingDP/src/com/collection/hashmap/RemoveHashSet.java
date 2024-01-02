package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RemoveHashSet {

	public static void main(String[] args) {
		// 8.   WAP to remove an element from HashMap using key

		HashMap<String,Integer> hm1= new HashMap<>();
		hm1.put("Yogesh", 101);
		hm1.put("Amit", 102);
		hm1.put("Suraj", 103);
		hm1.put("Adarsh", 104);
		hm1.put("Sudarshan", 105);
		
		hm1.remove("Yogesh");	// using key
		System.out.println(hm1);
		System.out.println(hm1.remove("Amit", 103)); // returns boolean and if true delete the entry
		System.out.println(hm1);
		
		//9. WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
		
		HashMap<String,Integer> hm2= new HashMap<>();
		hm2.put("Yogesh", 101);
		hm2.put("Amit", 102);
		hm2.put("Suraj", 103);
		System.out.println(hm2);
		
		Set<String> s= hm2.keySet();
		Iterator<String> key=s.iterator();
		
		while (key.hasNext())
		{
			key.next();
			key.remove();
			}
		System.out.println(hm2);
	
	
	}

}
