package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class AddElementsHashMap {

	public static void main(String[] args) {
		/*WAP to add elements to a HashMap without using generics (ie do not use <>) and
		 *  print content of it. Use Integer as Key and String as Value. In second HashMap
		 *   add elements of String type as Key and Integer as Value.
		 */

		HashMap  hm1= new HashMap ();
		hm1.put(1, "Yogesh");
		hm1.put("Two", "Suraj");
		hm1.put(3, "Adarsh");
		System.out.println(hm1);
		
		HashMap<String,Integer> hm2= new HashMap<>();
		hm2.put("Yogesh", 101);
		hm2.put("Amit", 102);
		hm2.put("Suraj", 103);
		System.out.println(hm2);
		
		//2.  WAP to get all the entries from a HashMap. Iterate the entries and
		//		print the Key & Value values
		
		Set<Entry<String,Integer>> s= hm2.entrySet();
		System.out.println();
		System.out.println("Display using Enhance for Loop using entrySet()");
		for(Entry<String,Integer> ob :s)
			System.out.println(ob.getKey() +"--->"+ob.getValue());
		
		// 3.  WAP to get only the Keys from a HashMap
		System.out.println();
		System.out.println("WAP to get only the Keys from a HashMap");
		
		Set<String> keys = hm2.keySet();
		Iterator<String> kitr = keys.iterator();
		while (kitr.hasNext())
		{
			String key = kitr.next();
			System.out.println("keys: "+key+" value: "+hm2.get(key));
		}
		
		//4.  WAP to get only the Values from a HashMap
		System.out.println();
		System.out.println("WAP to get only the Values from a HashMap");
//		for(String k : keys)
//		{
//			//System.out.println("Key = " + k);
//			System.out.println("Value = " + hm2.get(k));
//		}
		System.out.println(hm2.values());
		
		
		
	}

}
