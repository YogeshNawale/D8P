package com.collection.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
//5. WAP to copy all of the mappings from the specified HashMap to another map
public class CopyHashMap {

	public static void main(String[] args) {
	
		HashMap<String,Integer> hm1= new HashMap<>();
		hm1.put("Yogesh", 101);
		hm1.put("Amit", 102);
		hm1.put("Suraj", 103);
		System.out.println(hm1);
		
		HashMap<String,Integer> hm2= new HashMap<>(hm1);
		hm2.put("Adarsh", 104);
		hm2.put("Sudarshan", 105);
		System.out.println(hm2);
		
		
		//6. WAP to search for an element from HashMap using key
		
		Set<String> keys = hm2.keySet();
		for(String k :keys)
		{
			if(k.equals("Adarsh"))
			System.out.println("Value = " + hm2.get(k));
		}
		
		//7.   WAP to test if a HashMap contains a mapping for the specified value
		
		
		System.out.println(hm2.containsValue(102));
		 
		Set<Entry<String,Integer>> s = hm2.entrySet();
		for( Entry<String,Integer> e : s)
		{
			if(e.getValue().equals(105))
			System.out.println(e);
		}
		
		

	}

}
