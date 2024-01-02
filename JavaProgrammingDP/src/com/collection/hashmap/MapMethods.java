package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1, "10th");
		hMap.put(2, "12th");
		System.out.println(hMap.put(1, "B.E."));
		System.out.println("using toString()");
		System.out.println(hMap);
		// entrySet()
		Set<Entry<Integer, String>> set = hMap.entrySet();
		//using enhance forLoop
		System.out.println("Display using Enhance for Loop using entrySet()");
		for(Entry<Integer, String> ob :set)
			System.out.println(ob.getKey() +"--->"+ob.getValue());
		
		System.out.println("Display using iterator() using entrySet()");
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey() +"--->"+e.getValue());
		}
		
		//Demo keySet() Method
		System.out.println("using ketSet()  and iterator");
		Set<Integer> keys = hMap.keySet();
		
		Iterator<Integer> kitr = keys.iterator();
		while (kitr.hasNext())
		{
			int key = kitr.next();
			System.out.println("keys: "+key+" value: "+hMap.get(key));
		}
		
		System.out.println("using ketSet()  and enhance for Loop");
		for(Integer k :keys)
		{
			System.out.println("Key = " + k);
			System.out.println("Value = " + hMap.get(k));
		}
	}
}